
package db_util;

import java.sql.*;

public class ConexaoBD {
    
    public static Connection ligarBD(){
        
        String URL_DB = "jdbc:mysql://localhost:3306/gestao_rh?useSSL=false&serverTimezone=UTC";
        String DRIVER8 ="com.mysql.cj.jdbc.Driver";
         String DRIVER5 ="com.mysql.jdbc.Driver";
         String USER = "root1";
         String PASSWORD = "1234";
         
         Connection conn;
         
         try {
            Class.forName(DRIVER5);
            return conn=DriverManager.getConnection(URL_DB, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
             System.err.println("Erro de controlo" +ex.getLocalizedMessage());
              return null;
        }
         
        
         
    }
    
}
