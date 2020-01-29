<%-- 
    Document   : index
    Created on : 29 ene. 2020, 9:50:58
    Author     : japa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de Usuario</h1>
        
    <form action="recibir.do" method="post" > 
        
        ID:<input type="text" name="txtID" value="" /><br>
        nombre:<input type="text" name="txtNombre" value="" /><br>
        password:<input type="text" name="txtPass" value="" /><br>
        correo:<input type="text" name="txtCorreo" value="" /><br>
        tipo:<input type="text" name="txtTipo" value="" />
        <input type="submit" value="Registrar" />
        
        
        
    </form>
    </body>
</html>
