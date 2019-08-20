/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probando.algo;

import java.sql.*;

/**
 *
 * @author diogenes
 */
public class ProbandoAlgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost/productos", "diogenes","");
            
            Statement s = conexion.createStatement();
            
             ResultSet rs = s.executeQuery ("select * from productos");
             
              while (rs.next())
            {
                System.out.println (rs.getString(1) + " " + rs.getInt (2)+ 
                    " " + rs.getString(3));
            }
            conexion.close();  
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
