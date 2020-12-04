/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Novella.YMain;

//import Novella.JFrames.MainView;


import Novella.Database.DatabaseManager.ActivationProvider;
import Novella.Database.DatabaseManager.ConnectionProvider;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Koka
 */
public class NovellaX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException  {
        // TODO code application logic here
        MainView b = new MainView();
         
         LoginPage c = new LoginPage();
         Startup d = new Startup();
         SplashScreen a = new SplashScreen();
                      a.setVisible(true);
                  
          try {
              Connection con = ConnectionProvider.getCon();
              Statement st = con.createStatement();
              
              ResultSet rs = st.executeQuery("select *from activationcodes");
              
                          
                         
           
           for ( int i = 0; i <= 100; i++) {
               
                   Thread.sleep(10);
                   
                   
                  a.jLabel2.setText(Integer.toString(i)+"%"); 
                   if(i==100) 
                   {
                     
                     b.StudentDirectoryBarSelection.setVisible(false);
                     b.BookDirectoryBarSelection.setVisible(false);
                     b.Teachersslect.setVisible(false);
                     b.IssueBookUnselected.setVisible(false);
                     b.IssueBooksSelected.setVisible(true);
                     b.Profileslect.setVisible(false);
                     b.Dataslect.setVisible(false);
                     
                     
                     if (rs.next())
                     {
                     a.setVisible(false);
                     c.setVisible(true);
                     }
                     else
                     {
                         a.setVisible(false);
                         d.setVisible(true);
                     }
                     
                    }
                   
               }
           
           
               } catch (Exception e)              
               {
                   JOptionPane.showMessageDialog(null, "Open Xampp Control Panel and Start MySQL and Apache");
                   JOptionPane.showMessageDialog(null, "Novella Will Close now!");
                   System.exit(0);
               }
                 
         }
         
}
