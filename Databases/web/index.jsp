<%-- 
    Document   : index
    Created on : Dec 17, 2016, 2:09:50 PM
    Author     : mannyperez
--%>
<%@page import = "java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>
        <ul>
            <%
              Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/example_db", "mperez", "admin012@");
              Statement s = c.createStatement();
              String query = "SELECT * FROM PEOPLE";
              ResultSet result = s.executeQuery(query);
              while (result.next()){
                  %>
                  <li><%= result.getString("name") %></li>
                  <%
              }
              c.close();
            %>
        </ul>
            
        
        </p>
    </body>
</html>
