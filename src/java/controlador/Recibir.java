/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;

/**
 *
 * @author japa
 */
public class Recibir extends HttpServlet {

    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id_usuario = Integer.parseInt(request.getParameter("txtID"));
        String nombre_usuario = request.getParameter("txtNombre");
        String password = request.getParameter("txtPass");
        String correo = request.getParameter("txtCorreo");
        String id_tipo_usuario = request.getParameter("txtTipo");
        
        Usuario u = new Usuario();
        u.setId_usuario(id_usuario);
        u.setNombre_usuario(nombre_usuario);
        u.setPassword(password);
        u.setCorreo(correo);
        u.setId_tipo_usuario(id_tipo_usuario);
        
        if(u.insertar() == true){
            request.getRequestDispatcher("exito.jsp").forward(request, response);
        }
        else {
            request.getRequestDispatcher("index.jsp").forward(request, response);
               
        }
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
