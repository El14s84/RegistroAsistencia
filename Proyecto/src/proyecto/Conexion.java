/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elias
 */
public class Conexion {
    static String url="jdbc:mysql://localhost:3306/Proyecto_Empresa";
    static String user="root",pass="Elias098765432112";
    
    public static Connection getConnection(){
        Connection conn = null;
        try{
           conn = DriverManager.getConnection(url,user,pass);
        }catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
