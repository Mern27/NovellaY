/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Novella.Database.DatabaseManager;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Yamaan Ahmed Naseem for Raa Atoll Education Centre for the wonderful 
 *   memories the place gave me and made the person the i am today. Thanks RAEC
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
    
    
   
       try {
           
           Class.forName("com.mysql.jdbc.Driver");
           
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/novelladatabase", "root" , "");
           
           //System.out.println("Connected");
           return con;
    
           
       } catch (Exception e) {
           
           System.out.println(e);
           return null;
       }
        
    
    
      
    
}
}
