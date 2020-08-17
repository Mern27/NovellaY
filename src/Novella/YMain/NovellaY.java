/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Novella.YMain;

//import Novella.JFrames.MainView;


import javax.swing.JOptionPane;

/**
 *
 * @author Koka
 */
public class NovellaY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException  {
        // TODO code application logic here
         
         MainView b = new MainView();
         LoginPage c = new LoginPage();
         
         SplashScreen a = new SplashScreen();
         a.setVisible(true);
        
              
       try {
           for ( int i = 0; i <= 100; i++) {
               
                   Thread.sleep(10);
                   
                   
                  a.jLabel2.setText(Integer.toString(i)+"%"); 
                   if(i==100) 
                   {
                     a.setVisible(false);
                     b.setVisible(true);
                    }
          
               }
           
               } catch (Exception e)              
               {
                   JOptionPane.showMessageDialog(null, e);
               }
        
    }
    
}
