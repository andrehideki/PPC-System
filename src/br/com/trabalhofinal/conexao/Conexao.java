package br.com.trabalhofinal.conexao;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

    public Connection createDB() {
        //Usada toda vez que o sistema abre pela primeira vez em uma 
        //Máquina diferente

        Connection conn;
        String barra = File.separator;
        String projeto = System.getProperty("user.dir") + barra + "BancoDeDados";
        File url = new File("BancoDeDados");
        Statement stm;

        if (url.exists()) {
            System.out.println("A banco de dados já foi criado anteriormente...");
        } else {
            try {
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                String bd = "jdbc:derby:" + projeto + ";create=true";
                conn = DriverManager.getConnection(bd);
                PreparedStatement ps;

                String criarTabelaClientes = "CREATE TABLE tb_clientes("
                        + "id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                        + "qtdeProdutos INT,"
                        + "nome VARCHAR(50) NOT NULL,"
                        + "sobrenome VARCHAR(50) NOT NULL,"
                        + "cpf CHAR(15) NOT NULL,"
                        + "sexo char(1) NOT NULL,"
                        + "valorGasto DOUBLE)";
                ps = conn.prepareStatement(criarTabelaClientes);
                ps.execute();
                ps.close();
                System.out.println("Tabela clientes gerada");

                String criarTabelaProdutos = "CREATE TABLE tb_produtos("
                        + "id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                        + "qtdeVendida INT,"
                        + "descricao VARCHAR(100),"
                        + "precoCusto DOUBLE,"
                        + "precoVenda DOUBLE,"
                        + "margem INT)";
                stm = conn.createStatement();

                stm.executeUpdate(criarTabelaProdutos);
                System.out.println("Tabela produtos gerada");
                stm.close();

                String criarTabelaPedidos = "CREATE TABLE tb_pedidos("
                        + "id INT PRIMARY KEY,"
                        + "valotTotal DOUBLE,"
                        + "idCliente INT REFERENCES tb_clientes(id),"
                        + "data DATE)";
                stm = conn.createStatement();
                stm.executeUpdate(criarTabelaPedidos);
                stm.close();
                System.out.println("Tabela pedidos gerada");

                String criarTabelaPedidosProdutos = "CREATE TABLE tb_pedidosProdutos("
                        + "idProduto INT,"
                        + "idPedido INT,"
                        + "qtdeSelecionada INT,"
                        + "CONSTRAINT pkPedProd PRIMARY KEY(idProduto,idPedido),"
                        + "CONSTRAINT fkProdutoId FOREIGN KEY (idProduto) REFERENCES tb_produtos,"
                        + "CONSTRAINT fkPedidoId FOREIGN KEY (idPedido) REFERENCES tb_pedidos)";
                stm = conn.createStatement();
                stm.executeUpdate(criarTabelaPedidosProdutos);
                stm.close();
                
      

                System.out.println("Tabela pedidos-produtos gerada");
                System.out.println("Banco de dados criado com sucesso!");

            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        return null;
    }

    public Connection loadDB() {
        Connection conn;
        String barra = File.separator;
        String projeto = System.getProperty("user.dir") + barra + "BancoDeDados";
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            String db = "jdbc:derby:" + projeto;
            conn = DriverManager.getConnection(db);
            System.out.println("Base de dados carregada!");

            return conn;

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }

        return null;
    }


}
