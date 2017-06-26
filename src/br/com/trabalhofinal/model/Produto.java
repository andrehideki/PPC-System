package br.com.trabalhofinal.model;

import br.com.trabalhofinal.conexao.ConnectionFactory;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Produto implements Serializable {

    private int id;
    private int qtdeVendida;	//Para saber qual + vendido
    private String descricao;
    private double precoVenda;
    private double precoCusto;
    private int margem;

    private int qtdSelecionada;
    private int codigo;

    //CRUD
    private static Connection conn = null;

    public Produto() {
    }

    public Produto(double precoCusto, int margem) {
        this.precoCusto = precoCusto;
        this.margem = margem;
    }

    public Produto(int margem, double precoVenda) {
        this.precoVenda = precoVenda;
        this.margem = margem;
    }

    public Produto(int id, int qtdeVendida, String descricao, double precoVenda, double precoCusto, int margem) {
        this.id = id;
        this.qtdeVendida = qtdeVendida;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
        this.margem = margem;
    }

    public int getQtdSelecionada() {
        return qtdSelecionada;
    }

    public void setQtdSelecionada(int qtdSelecionada) {
        this.qtdSelecionada = qtdSelecionada;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public int getMargem() {
        return margem;
    }

    public void setMargem(int margem) {
        this.margem = margem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtdeVendida() {
        return qtdeVendida;
    }

    public void setQtdeVendida(int qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", qtdeVendida=" + qtdeVendida + ", descricao=" + descricao + ", precoVenda=" + precoVenda + ", precoCusto=" + precoCusto + ", margem=" + margem + '}';
    }

    //--------------------------------------------------------------------------
    public double calcularPrecoVenda() {

        return this.precoCusto + (this.precoCusto * (margem) / 100);
    }

    public double calcularPrecoCusto() {
        return this.precoVenda - (this.precoVenda * (margem) / 100);
    }

    //--------------------------------------------------------------------------
    public static boolean insert(Produto p) {

        String sql = "INSERT INTO tb_produtos(descricao,precoCusto,precoVenda,margem) "
                + "VALUES (?,?,?,?)";

        conn = ConnectionFactory.getConnection();
        PreparedStatement stm = null;

        try {
            stm = conn.prepareStatement(sql);

            stm.setString(1, p.getDescricao());
            stm.setDouble(2, p.getPrecoCusto());
            stm.setDouble(3, p.getPrecoVenda());
            stm.setInt(4, p.getMargem());
            stm.executeUpdate();

            return true;
        } catch (SQLException ex) {
            System.err.println("Erro " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(conn, stm);
        }
    }

    public static boolean delete(Produto p) {
        String sql = "DELETE FROM tb_produtos WHERE id=" + p.getId();
        conn = ConnectionFactory.getConnection();
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sql);
            stm.executeUpdate();

            return true;
        } catch (SQLException ex) {
            System.err.println("Erro " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(conn, stm);
        }
    }

    public static boolean update(Produto p) {
        String sql = "UPDATE tb_produtos SET "
                + "qtdeVendida = ?, descricao = ?, precoCusto = ?, precoVenda = ?, margem = ? "
                + "WHERE id = ?";

        conn = ConnectionFactory.getConnection();
        PreparedStatement stm = null;

        try {
            stm = conn.prepareStatement(sql);

            stm.setInt(1, p.getQtdeVendida());
            stm.setString(2, p.getDescricao());
            stm.setDouble(3, p.getPrecoCusto());
            stm.setDouble(4, p.getPrecoVenda());
            stm.setInt(5, p.getMargem());
            stm.setInt(6, p.getId());
            stm.executeUpdate();

            return true;
        } catch (SQLException ex) {
            System.err.println("Erro " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(conn, stm);
        }
    }

    public static List<Produto> findAll() {

        String sql = "SELECT * FROM tb_produtos";
        PreparedStatement stm = null;
        ResultSet rs = null;
        conn = ConnectionFactory.getConnection();

        List<Produto> produtos = new ArrayList<>();
        try {
            stm = conn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                Produto p = new Produto();

                p.setId(Integer.parseInt(rs.getString("id")));
                p.setQtdeVendida(rs.getInt("qtdeVendida"));
                p.setDescricao(rs.getString("descricao"));
                p.setPrecoCusto(rs.getDouble("precoCusto"));
                p.setPrecoVenda(rs.getDouble("precoVenda"));
                p.setMargem(rs.getInt("margem"));
                produtos.add(p);
            }
        } catch (SQLException ex) {
            System.err.println("Erro " + ex);
        } finally {
        System.out.println("Entrou na função");
            ConnectionFactory.closeConnection(conn, stm, rs);
            return produtos;
        }

        
    }

    public static List<Produto> findByInformacao(String informacao) {

        String infos[] = informacao.split(" ");
        String sql = "SELECT * FROM tb_produtos WHERE "
                + "descricao like ?";
        PreparedStatement stm = null;
        ResultSet rs = null;
        conn = ConnectionFactory.getConnection();

        List<Produto> produtos = new ArrayList<>();

        try {

            stm = conn.prepareStatement(sql);
            for (String s : infos) {
                stm.setString(1, s + "%");
                rs = stm.executeQuery();
            }
            while (rs.next()) {
                Produto p = new Produto();

                p.setId(Integer.parseInt(rs.getString("id")));
                p.setQtdeVendida(rs.getInt("qtdeVendida"));
                p.setDescricao(rs.getString("descricao"));
                p.setPrecoCusto(rs.getDouble("precoCusto"));
                p.setPrecoVenda(rs.getDouble("precoVenda"));
                p.setMargem(rs.getInt("margem"));

                produtos.add(p);
            }
        } catch (SQLException ex) {
            System.err.println("Erro " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stm, rs);
        }
        for (Produto pr : produtos) {
            System.out.println(pr);
        }
        return produtos;
    }
    
    public static List<Produto> findByQtdeVendia() {

       
        String sql = "SELECT * FROM tb_produtos "
                + "ORDER BY qtdeVendida DESC";
        PreparedStatement stm = null;
        ResultSet rs = null;
        conn = ConnectionFactory.getConnection();

        List<Produto> produtos = new ArrayList<>();

        try {
            
            stm = conn.prepareStatement(sql);
            rs = stm.executeQuery();
            
            while (rs.next()) {
                Produto p = new Produto();

                p.setId(Integer.parseInt(rs.getString("id")));
                p.setQtdeVendida(rs.getInt("qtdeVendida"));
                p.setDescricao(rs.getString("descricao"));
                p.setPrecoCusto(rs.getDouble("precoCusto"));
                p.setPrecoVenda(rs.getDouble("precoVenda"));
                p.setMargem(rs.getInt("margem"));

                produtos.add(p);
            }
        } catch (SQLException ex) {
            System.err.println("Erro " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stm, rs);
        }
        for (Produto pr : produtos) {
            System.out.println(pr);
        }
        return produtos;
    }

}
