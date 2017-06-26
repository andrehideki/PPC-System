package br.com.trabalhofinal.model;

import br.com.trabalhofinal.conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private int id;
    private int qtdeProdutos;	//Para saber qual o cliente compra mais produtos pelo criterio qtde
    private String nome;
    private String sobrenome;
    private String cpf;
    private char sexo;
    private double valorGasto;// Questão 2.d

    //CRUD
    private static Connection conn = null;

    public Cliente() {
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente(int id, String nome, String sobrenome, String cpf, char sexo) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getQtdeProdutos() {
        return qtdeProdutos;
    }

    public void setQtdeProdutos(int qtdeProdutos) {
        this.qtdeProdutos = qtdeProdutos;
    }

    public double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(double valorGasto) {
        this.valorGasto = valorGasto;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String mostrarInformacoes() {
        String info = "Nome:\t\t" + this.nome + "\n"
                + "CPF:\t\t" + this.cpf + "\n"
                + "QtdeProdutos:\t\t" + this.qtdeProdutos + "\n"
                + "Valor gasto:\t\t" + this.valorGasto;

        return info;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + ", sexo=" + sexo + '}';
    }

    //-------------------------------------------------------------------------
    public static boolean insert(Cliente c) {

        String sql = "INSERT INTO tb_clientes(nome,sobrenome,cpf,sexo) VALUES (?,?,?,?)";

        conn = ConnectionFactory.getConnection();
        PreparedStatement stm = null;

        try {
            stm = conn.prepareStatement(sql);

            stm.setString(1, c.getNome());
            stm.setString(2, c.getSobrenome());
            stm.setString(3, c.getCpf());
            stm.setString(4, "" + c.getSexo());//Gambiarra!!!
            stm.executeUpdate();

            return true;
        } catch (SQLException ex) {
            System.err.println("Erro " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(conn, stm);
        }
    }

    public static boolean delete(Cliente c) {
        String sql = "DELETE FROM tb_clientes WHERE id=" + c.getId();
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

    public static boolean update(Cliente c) {
        String sql = "UPDATE tb_clientes SET "
                + "nome = ?, sobrenome = ?, cpf = ?, sexo = ? "
                + "WHERE id = ?";

        conn = ConnectionFactory.getConnection();
        PreparedStatement stm = null;

        try {
            stm = conn.prepareStatement(sql);

            stm.setString(1, c.getNome());
            stm.setString(2, c.getSobrenome());
            stm.setString(3, c.getCpf());
            stm.setString(4, "" + c.getSexo());//Gambiarra!!!
            stm.setInt(5, c.getId());
            stm.executeUpdate();

            return true;
        } catch (SQLException ex) {
            System.err.println("Erro " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(conn, stm);
        }
    }

    public static boolean updateClienteCompra(Cliente c) {
        String sql = "UPDATE tb_clientes SET "
                + "qtdeProdutos = ?,valorGasto = ?"
                + "WHERE id = ?";

        conn = ConnectionFactory.getConnection();
        PreparedStatement stm = null;

        try {
            stm = conn.prepareStatement(sql);

            stm.setInt(1, c.getQtdeProdutos());
            stm.setDouble(2, c.getValorGasto());
            stm.setInt(3, c.getId());

            stm.executeUpdate();

            return true;
        } catch (SQLException ex) {
            System.err.println("Erro " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(conn, stm);
        }
    }

    public static List<Cliente> findAll() {

        String sql = "SELECT * FROM tb_clientes";
        PreparedStatement stm = null;
        ResultSet rs = null;
        conn = ConnectionFactory.getConnection();

        List<Cliente> clientes = new ArrayList<>();

        try {
            stm = conn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();

                c.setId(Integer.parseInt(rs.getString("id")));
                c.setNome(rs.getString("nome"));
                c.setSobrenome(rs.getString("sobrenome"));
                c.setCpf(rs.getString("cpf"));
                c.setSexo(rs.getString("sexo").charAt(0));
                c.setQtdeProdutos(rs.getInt("qtdeProdutos"));
                c.setValorGasto(rs.getDouble("valorGasto"));

                clientes.add(c);
            }
        } catch (SQLException ex) {
            System.err.println("Erro " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stm, rs);
        }

        return clientes;
    }

    public static List<Cliente> findByInformacao(String informacao) {

        String infos[] = informacao.split(" ");
        String sql = "SELECT * FROM tb_clientes WHERE "
                + "nome like ? or sobrenome like ?";
        PreparedStatement stm = null;
        ResultSet rs = null;
        conn = ConnectionFactory.getConnection();

        List<Cliente> clientes = new ArrayList<>();

        try {

            stm = conn.prepareStatement(sql);
            for (String s : infos) {
                stm.setString(1, s+"%");
                stm.setString(2, s+"%");
                rs = stm.executeQuery();
            }
            while (rs.next()) {
                Cliente c = new Cliente();

                c.setId(Integer.parseInt(rs.getString("id")));
                c.setNome(rs.getString("nome"));
                c.setSobrenome(rs.getString("sobrenome"));
                c.setCpf(rs.getString("cpf"));
                c.setSexo(rs.getString("sexo").charAt(0));
                c.setQtdeProdutos(rs.getInt("qtdeProdutos"));
                c.setValorGasto(rs.getDouble("valorGasto"));

                clientes.add(c);
            }
        } catch (SQLException ex) {
            System.err.println("Erro " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stm, rs);
        }

        return clientes;
    }
    
    public static List<Cliente> findByValorGasto() {

        String sql = "SELECT * FROM tb_clientes "
                + "ORDER BY valorGasto DESC";
        PreparedStatement stm = null;
        ResultSet rs = null;
        conn = ConnectionFactory.getConnection();

        List<Cliente> clientes = new ArrayList<>();

        try {
            stm = conn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();

                c.setId(Integer.parseInt(rs.getString("id")));
                c.setNome(rs.getString("nome"));
                c.setSobrenome(rs.getString("sobrenome"));
                c.setCpf(rs.getString("cpf"));
                c.setSexo(rs.getString("sexo").charAt(0));
                c.setQtdeProdutos(rs.getInt("qtdeProdutos"));
                c.setValorGasto(rs.getDouble("valorGasto"));

                clientes.add(c);
            }
        } catch (SQLException ex) {
            System.err.println("Erro " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stm, rs);
        }

        return clientes;
    }
    
    public static List<Cliente> findByQtdeProdutos() {

        String sql = "SELECT * FROM tb_clientes "
                + "ORDER BY qtdeProdutos DESC";
        PreparedStatement stm = null;
        ResultSet rs = null;
        conn = ConnectionFactory.getConnection();

        List<Cliente> clientes = new ArrayList<>();

        try {
            stm = conn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();

                c.setId(Integer.parseInt(rs.getString("id")));
                c.setNome(rs.getString("nome"));
                c.setSobrenome(rs.getString("sobrenome"));
                c.setCpf(rs.getString("cpf"));
                c.setSexo(rs.getString("sexo").charAt(0));
                c.setQtdeProdutos(rs.getInt("qtdeProdutos"));
                c.setValorGasto(rs.getDouble("valorGasto"));

                clientes.add(c);
            }
        } catch (SQLException ex) {
            System.err.println("Erro " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stm, rs);
        }

        return clientes;
    }

}
