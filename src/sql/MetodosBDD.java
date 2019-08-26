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

            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    public static String buscarNombre(String correo) {

        String busqueda_nombre = null;
        Connection conexion = null;
        try {
            conexion = BaseDeDatos.conectar();
            String sentencia_buscar = ("SELECT nombre,apellido FROM usuarios WHERE correo = '" + correo + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();

            if (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                busqueda_nombre = nombre + " " + apellido;

            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_nombre;
    }

    public static String buscarUsuarioRegistrado(String correo, String pass) {
        String busqueda_usuario = null;
        Connection conexion = null;
        try {
            conexion = BaseDeDatos.conectar();
            String sentecia_buscar_usuario = "SELECT nombre,correo,pass FROM usuario WHERE correo = '" + correo + "' && pass = '" + pass + "'";
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar_usuario);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                busqueda_usuario = "usuario encontrado";
            } else {
                busqueda_usuario = "usuario no encontrado";
            }
            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_usuario;
    }
}
