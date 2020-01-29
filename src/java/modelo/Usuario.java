/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author japa
 */
public class Usuario {
    
    int id_usuario;
    String nombre_usuario;
    String password;
    String correo;
    String id_tipo_usuario;
    
    
    Connection cnn;            
    Statement state;
    ResultSet res;
    
    
    public Usuario(){
        
        try {
            Class.forName("MySQL");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdbacklog?zeroDateTimeBehavior=convertToNull","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public boolean insertar(){
        try {
            String query = "insert into usuario values('"+id_usuario+"','"+nombre_usuario+"','"+password+"','"+correo+"','"+id_tipo_usuario+"')";
            int saber = 0;
            state = cnn.createStatement();
            saber = state.executeUpdate(query);
            
            if (saber == 1) {
            
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getId_tipo_usuario() {
        return id_tipo_usuario;
    }

    public void setId_tipo_usuario(String id_tipo_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
    }
    
    
    
    
    
}
