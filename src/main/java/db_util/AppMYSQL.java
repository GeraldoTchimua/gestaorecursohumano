
package db_util;

/**
 *
 * @author GENATCHI
 */

import java.sql.*;

public class AppMYSQL {
    
    public static void main(String[] args) {
        String LISTA_DEPARTAMENTO = "SELECT * FROM departamento";
        
        try {
            Connection conn = ConexaoBD.ligarBD();
            
            PreparedStatement ps = conn.prepareStatement(LISTA_DEPARTAMENTO);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+ rs.getString(2));
            }
            conn.close();
        } catch (Exception ex) {
            System.err.println("Erro na leituras dos dados"+ex);
        }
    }
    
}
