/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco_de_dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Bergson
 */
public class Conexao {

    // Conectar ao banco
    //Teste Claudio
    //Teste Claudio 2
    public static Connection abrir() throws Exception {
 
        Class.forName("com.mysql.jdbc.Driver");
          
        //Connection con = DriverManager.getConnection("jdbc:mysql://localhost/id4374809_lgh", "id4374809_lgh", "12345");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pluslife", "root", "");
        
        return con;
    }

}
