package br.com.trabalhofinal.conexao;


import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {

    public static final String PATHBD   = System.getProperty("user.dir") + File.separator + "BancoDeDados";
    public static final String DRIVER   = "org.apache.derby.jdbc.EmbeddedDriver";
    public static final String URL      = "jdbc:derby:" + PATHBD;
    public static final String USER     = "root";
    public static final String PASS     = "";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
    }

    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.err.println("Erro:" + ex);
            }
        }
    }

    public static void closeConnection(Connection conn, PreparedStatement stm) {
        if (stm != null) {
            try {
                stm.close();
            } catch (SQLException ex) {
                System.err.println("Erro:" + ex);
            }
        }
        closeConnection(conn);
    }

    public static void closeConnection(Connection conn, PreparedStatement stm, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
               System.err.println("Erro:" + ex);
            }
        }
        closeConnection(conn, stm);
    }

}
