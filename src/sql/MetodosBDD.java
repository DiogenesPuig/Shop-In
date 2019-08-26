/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author diogenes
 */
public class MetodosBDD {

    public static BaseDeDatos conexion = new BaseDeDatos();

    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;

    public int guardar(String nombre, String apellido, String correo, String pass) {

        int resultado = 0;
        Connection conexion = null;

        String sentencia_guardar = ("INSERT INTO usuarios (nombre,apellido,correo,pass) VALUES (?,?,?,?)");

        try {
            conexion = BaseDeDatos.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellido);
            sentencia_preparada.setString(3, correo);
            sentencia_preparada.setString(4, pass);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

}
