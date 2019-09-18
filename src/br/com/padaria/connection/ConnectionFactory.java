package br.com.padaria.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ltavares
 */
public class ConnectionFactory {
    
    private static final String DRIVER = "org.h2.Driver";
    private static final String URL = "jdbc:h2:~/padaria.mv";
    private static final String USER = "padaria";
    private static final String PASSWORD = "p@d@ri@";

//    private static final String DRIVER = "org.mysql.jdbc.Driver";
//    private static final String URL = "jdbc:mysql://localhost:3306/padaria";
//    private static final String USER = "root";
//    private static final String PASSWORD = "root";
    
    public static Connection getConnetion() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
            
        } catch (ClassNotFoundException | SQLException  ex){
            throw new RuntimeException("Erro na Conexao", ex);
        }      
    }
    
    public static void closeConnetion(Connection con) {
        try {
           con.close();
        } catch (SQLException  ex){
            System.err.println("Erro: "+ ex);
        }      
    }
    
    public static void closeConnetion(Connection con, PreparedStatement stmt) {
        try {
           stmt.close();
        } catch (SQLException  ex){
          System.err.println("Erro: "+ ex);
        }
        closeConnetion(con);
    }
    
    public static void closeConnetion(Connection con, PreparedStatement stmt, ResultSet rs) {
        try {
           rs.close();
        } catch (SQLException  ex){
           System.err.println("Erro: "+ ex);
        }
        closeConnetion(con, stmt);
    }
}
