package br.com.trabalhofinal.model;

import br.com.trabalhofinal.conexao.ConnectionFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido implements Serializable {

    private int totalPedidosFeitos;

    private int codPedido;
    private transient Cliente cliente;
    private transient ArrayList<Produto> produtos;
    private transient Date data;
    private transient double total;

    private transient static Connection conn = null;

    {
        System.out.println("Teste pra ver se entrou aqui");
        this.produtos = new ArrayList<>();
    
        this.codPedido = totalPedidosFeitos;
        System.out.println("O código do pedido é " + this.codPedido);
    }
    public Pedido() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public int getTotalPedidosFeitos() {
        return this.totalPedidosFeitos;
    }

    public  void setTotalPedidosFeitos(int totalPedidosFeitos) {
        this.totalPedidosFeitos = totalPedidosFeitos;
    }

    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    private Pedido getPedido() {
        return this;
    }


    public void adicionarProduto(Produto p) {
        this.produtos.add(p);
        this.total += p.getPrecoVenda() * p.getQtdSelecionada();
    }

    public void removerProduto(Produto p) {
        this.total -= p.getPrecoVenda() * p.getQtdSelecionada();
        produtos.remove(p);
    }


    public void colocarDataAtual() {
        this.data = new Date();
    }

    public String mostrarPedido() {
        String s = "+-------------------------------+\n"
                + "|Cliente:" + cliente.getNome() + "\t\t|\n"
                + "|CPF:" + cliente.getCpf() + "\t|\n"
                + "Data:"
                + "|Cod:" + this.codPedido + "\t\t\t\t|\n"
                + "+-------------------------------+\n"
                + "|Descr.\t\t\t|Valor\t|\n"
                + "|_______________________________|\n";
        for (Produto p : produtos) {
            s += "|" + p.getDescricao() + "\t\t\t " + p.getPrecoVenda() + "\t|\n";
        }
        s += "+-------------------------------+\n"
                + "|TOTAL:\tR$:\t\t" + this.total + "\t|\n"
                + "+-------------------------------+\n";
        return s;
    }

    public void incrementarPedidosFeitos() {
        this.codPedido++;
        this.totalPedidosFeitos++;
    }
    
    //CRUD
    public static boolean insertPedido(Pedido p) {

        String sql1 = "INSERT INTO tb_pedidos(id,valotTotal,idCliente,data) VALUES (?,?,?,?)";
        conn = ConnectionFactory.getConnection();
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");
        String data = formatador.format(p.getData());
        PreparedStatement stm = null;

        try {
            stm = conn.prepareStatement(sql1);
            stm.setInt(1, p.getCodPedido());
            stm.setDouble(2, p.getTotal());
            stm.setInt(3, p.getCliente().getId());
            stm.setString(4, data);
            stm.executeUpdate();

            return true;
        } catch (SQLException ex) {
            System.err.println("Erro " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(conn, stm);
        }
    }

    public static void insertItems(Pedido p) {
        String sql = "INSERT INTO tb_pedidosProdutos (idPedido,idProduto,qtdeSelecionada) VALUES (?,?,?)";
        conn = ConnectionFactory.getConnection();
        PreparedStatement stm = null;

        try {
            for (Produto produto : p.getProdutos()) {
                System.out.println("Teste: " + produto);
                stm = conn.prepareStatement(sql);
                
                stm.setInt(1, p.getCodPedido());
                stm.setInt(2, produto.getId());
                stm.setInt(3, produto.getQtdSelecionada());
                
                stm.executeUpdate();
            }

        } catch (SQLException ex) {
            System.err.println("Erro " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stm);
        }

    }

    public static List<Pedido> findByIdCliente(Cliente c) {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM tb_pedidos WHERE idCliente=?";
        conn = ConnectionFactory.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = conn.prepareStatement(sql);
            stm.setInt(1, c.getId());

            rs = stm.executeQuery();

            while (rs.next()) {
                Pedido p = new Pedido();
                p.setCodPedido(rs.getInt(1));
                p.setTotal(rs.getDouble(2));
                p.setData((Date) rs.getDate("data"));
                System.out.println("");
                pedidos.add(p);
            }

            return pedidos;
        } catch (SQLException ex) {
            System.out.println("Erro " + ex);
        } finally {
            ConnectionFactory.closeConnection(conn, stm, rs);
        }

        return pedidos;
    }

    public static List<Produto> findByIdPedido(Pedido p) {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT qtdeSelecionada, idProduto, tb_produtos.descricao "
                + "FROM tb_pedidosProdutos "
                + "INNER JOIN tb_produtos ON idPedido = ?"
                + "WHERE idProduto = tb_produtos.id";
        conn = ConnectionFactory.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            stm = conn.prepareStatement(sql);
            stm.setInt(1, p.getCodPedido());
            rs = stm.executeQuery();
            while (rs.next()) {
                Produto pro = new Produto();
                pro.setQtdSelecionada(rs.getInt("qtdeSelecionada"));
                pro.setId(rs.getInt("idProduto"));
                pro.setDescricao(rs.getString("descricao"));
                System.out.println(pro);
                produtos.add(pro);
            }

            return produtos;
        } catch (SQLException ex) {
            System.out.println("Erro " + ex);
        }

        return produtos;
    }

    public static void gravarSerial(Object o) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("Pedido.ser"))) {
            oos.writeObject(o);
        } catch (FileNotFoundException ex) {
            System.out.println("Erro " + ex);
        } catch (IOException ex) {
            System.out.println("Erro " + ex);
        }
    }

    public static Object lerSerial() {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("Pedido.ser"))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Erro " + ex);
        }
        return null;

    }
    
    
}
