/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Novella.Refresh;

import Novella.Database.DatabaseManager.ConnectionProvider;
import Novella.YMain.MainView;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Koka
 */
public class Refresh {
    public static Refresh getRefresh(){
        
        MainView b = new MainView();
    
    try
       {
        Connection con = ConnectionProvider.getCon();
        Statement stmt = con.createStatement();
        
        String query = "select count(*) from books";
            
        
         ResultSet rs = stmt.executeQuery(query);
         
           if (rs.next())
            {
                String p = rs.getString(1);
               
                b.NumberOfBooksjLabel.setText(p);
                
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Students");
                
                new MainView().setVisible(true);
            }
           
       }
       catch(Exception e)
       {
           System.out.println("Unable to do so");
       }
        return null;
    
}
}