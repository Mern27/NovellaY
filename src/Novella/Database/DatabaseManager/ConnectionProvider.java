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
    
    public static void main (String[]args){
    
    
   
       try {
           Class.forName("org.h2.Driver");
           Connection con = DriverManager.getConnection("jdbc:h2:~/NovellaDatabase" , "NovellaDatabase" , "");
           Statement st = con.createStatement();
           System.out.println("Connected");
           // return con;
    
           
       } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "Class Not Found");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Unable to Connect");
       }
    
    
        }
    
}
