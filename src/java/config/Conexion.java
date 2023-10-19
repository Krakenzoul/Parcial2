/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author AJ-Barreto
 */
public class Conexion {
    Connection con;
    
    String usuario = "root";
    String contrasena = "123";
    String bd = "ava1";
    String ip = "localhost";
    String puerto = "3307";
      
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(cadena,usuario,contrasena);
              System.out.println("Conexión exitosa a la base de datos");
        } catch (ClassNotFoundException | SQLException e) {
             System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return con;
    }
}
