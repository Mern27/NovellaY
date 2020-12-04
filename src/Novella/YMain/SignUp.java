/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Novella.YMain;

import Novella.Database.DatabaseManager.ConnectionProvider;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Koka
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FirstNameget = new javax.swing.JTextField();
        LastNameget = new javax.swing.JTextField();
        Usernameget = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Passwordget = new javax.swing.JPasswordField();
        ConfirmPasswordget = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        RegisterIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FirstNameget.setBackground(new java.awt.Color(255, 255, 255));
        FirstNameget.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        FirstNameget.setForeground(new java.awt.Color(204, 204, 204));
        FirstNameget.setText("First Name");
        FirstNameget.setBorder(null);
        FirstNameget.setFocusable(false);
        FirstNameget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FirstNamegetMouseClicked(evt);
            }
        });
        getContentPane().add(FirstNameget, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 188, 250, 25));

        LastNameget.setBackground(new java.awt.Color(255, 255, 255));
        LastNameget.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        LastNameget.setForeground(new java.awt.Color(204, 204, 204));
        LastNameget.setText("Last Name");
        LastNameget.setBorder(null);
        LastNameget.setFocusable(false);
        LastNameget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LastNamegetMouseClicked(evt);
            }
        });
        getContentPane().add(LastNameget, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 240, 250, 25));

        Usernameget.setBackground(new java.awt.Color(255, 255, 255));
        Usernameget.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Usernameget.setForeground(new java.awt.Color(204, 204, 204));
        Usernameget.setText("Username");
        Usernameget.setBorder(null);
        Usernameget.setFocusable(false);
        Usernameget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsernamegetMouseClicked(evt);
            }
        });
        getContentPane().add(Usernameget, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 288, 250, 25));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Password");
        jLabel1.setFocusable(false);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 332, 170, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Confirm Password");
        jLabel3.setFocusable(false);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jLabel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel3KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 380, 170, 30));

        Passwordget.setBackground(new java.awt.Color(255, 255, 255));
        Passwordget.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Passwordget.setForeground(new java.awt.Color(0, 0, 0));
        Passwordget.setBorder(null);
        Passwordget.setFocusable(false);
        Passwordget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordgetMouseClicked(evt);
            }
        });
        getContentPane().add(Passwordget, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 338, 250, 22));

        ConfirmPasswordget.setBackground(new java.awt.Color(255, 255, 255));
        ConfirmPasswordget.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ConfirmPasswordget.setForeground(new java.awt.Color(204, 204, 204));
        ConfirmPasswordget.setBorder(null);
        ConfirmPasswordget.setFocusable(false);
        ConfirmPasswordget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmPasswordgetMouseClicked(evt);
            }
        });
        ConfirmPasswordget.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ConfirmPasswordgetKeyPressed(evt);
            }
        });
        getContentPane().add(ConfirmPasswordget, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 387, 250, 22));

        LoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Login.png"))); // NOI18N
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, -1, -1));

        RegisterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Register.png"))); // NOI18N
        RegisterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterButtonMouseClicked(evt);
            }
        });
        getContentPane().add(RegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 94, -1));

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/close but-01.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1056, 0, 20, 30));

        RegisterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/register page. updated-01.png"))); // NOI18N
        getContentPane().add(RegisterIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, -1, -1));

        setSize(new java.awt.Dimension(1078, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsernamegetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsernamegetMouseClicked
        // TODO add your handling code here:
        String lastname = LastNameget.getText();
        String firstname = FirstNameget.getText();
        String username = Usernameget.getText();
        String password = Passwordget.getText();
        String confirmpassword = ConfirmPasswordget.getText();
       
        
        LastNameget.setFocusable(false);
        FirstNameget.setFocusable(false);
        Passwordget.setFocusable(false);
        ConfirmPasswordget.setFocusable(false);
        
        if(lastname.matches(""))
        {
            LastNameget.setText("Last Name");
            LastNameget.setForeground(new java.awt.Color (204,204,204));
        }
        
        if(firstname.matches(""))
        {
            FirstNameget.setText("First Name");
            FirstNameget.setForeground(new java.awt.Color (204,204,204));
        }
        if(password.matches(""))
        {
            jLabel1.setVisible(true);
        }
        if(confirmpassword.matches(""))
        {
            jLabel3.setVisible(true);
        }
        if(username.matches("Username"))
        {
        Usernameget.setText(null);
        Usernameget.setFocusable(true);
        Usernameget.setForeground(Color.BLACK);
        }
         Usernameget.setFocusable(true);
    }//GEN-LAST:event_UsernamegetMouseClicked

    private void FirstNamegetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstNamegetMouseClicked
        // TODO add your handling code here:
        
        
        String lastname = LastNameget.getText();
        String username = Usernameget.getText();
        String firstname = FirstNameget.getText();
        String password = Passwordget.getText();
         String confirmpassword = ConfirmPasswordget.getText();
         
        LastNameget.setFocusable(false);
        Usernameget.setFocusable(false);
        Passwordget.setFocusable(false);
        ConfirmPasswordget.setFocusable(false);
        
        if(lastname.matches(""))
        {
            LastNameget.setText("Last Name");
            LastNameget.setForeground(new java.awt.Color (204,204,204));
        }
        if(username.matches(""))
        {
            Usernameget.setText("Username");
            Usernameget.setForeground(new java.awt.Color (204,204,204));
        }
        if(password.matches(""))
        {
            jLabel1.setVisible(true);
        }
        if(confirmpassword.matches(""))
        {
            jLabel3.setVisible(true);
        }
        if(firstname.matches("First Name"))
        {
        FirstNameget.setText(null);
        FirstNameget.setFocusable(true);
        FirstNameget.setForeground(Color.BLACK);
        }
        FirstNameget.setFocusable(true);
    }//GEN-LAST:event_FirstNamegetMouseClicked

    private void LastNamegetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LastNamegetMouseClicked
        // TODO add your handling code here:
        String username = Usernameget.getText();
        String firstname = FirstNameget.getText();
        String lastname = LastNameget.getText();
        String password = Passwordget.getText();
        String confirmpassword = ConfirmPasswordget.getText();
        
        Usernameget.setFocusable(false);
        FirstNameget.setFocusable(false);
        Passwordget.setFocusable(false);
        ConfirmPasswordget.setFocusable(false);
        
        if(username.matches(""))
        {
            Usernameget.setText("Username");
            Usernameget.setForeground(new java.awt.Color (204,204,204));
        }
        if(firstname.matches(""))
        {
            FirstNameget.setText("First Name");
            FirstNameget.setForeground(new java.awt.Color (204,204,204));
        }
        if(password.matches(""))
        {
            jLabel1.setVisible(true);
        }
        if(confirmpassword.matches(""))
        {
            jLabel3.setVisible(true);
        }
        if(lastname.matches("Last Name"))
        {
        LastNameget.setText(null);
        LastNameget.setFocusable(true);
        LastNameget.setForeground(Color.BLACK);
        }
        LastNameget.setFocusable(true);
    }//GEN-LAST:event_LastNamegetMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        String password = Passwordget.getText();
        String username = Usernameget.getText();
        String firstname = FirstNameget.getText();
        String lastname = LastNameget.getText();
        String confirmpassword = ConfirmPasswordget.getText();
        
        LastNameget.setFocusable(false);
        FirstNameget.setFocusable(false);
        Usernameget.setFocusable(false);
        ConfirmPasswordget.setFocusable(false);
        
        if(username.matches(""))
        {
            Usernameget.setText("Username");
            Usernameget.setForeground(new java.awt.Color (204,204,204));
        }
        if(firstname.matches(""))
        {
            FirstNameget.setText("First Name");
            FirstNameget.setForeground(new java.awt.Color (204,204,204));
        }
        if(lastname.matches(""))
        {
            LastNameget.setText("Last Name");
            LastNameget.setForeground(new java.awt.Color (204,204,204));
        }
        if(confirmpassword.matches(""))
        {
            jLabel3.setVisible(true);
        }
        if(password.matches(""))
        {
            jLabel1.setVisible(true);
            Passwordget.setForeground(Color.BLACK);
            Passwordget.setFocusable(true);
        }
        Passwordget.setFocusable(true);
        jLabel1.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        String password = Passwordget.getText();
        String username = Usernameget.getText();
        String firstname = FirstNameget.getText();
        String lastname = LastNameget.getText();
        String confirmpassword = ConfirmPasswordget.getText();
        
        LastNameget.setFocusable(false);
        FirstNameget.setFocusable(false);
        Usernameget.setFocusable(false);
        Passwordget.setFocusable(false);
        
        if(username.matches(""))
        {
            Usernameget.setText("Username");
            Usernameget.setForeground(new java.awt.Color (204,204,204));
        }
        if(firstname.matches(""))
        {
            FirstNameget.setText("First Name");
            FirstNameget.setForeground(new java.awt.Color (204,204,204));
        }
        if(lastname.matches(""))
        {
            LastNameget.setText("Last Name");
            LastNameget.setForeground(new java.awt.Color (204,204,204));
        }
        if(password.matches(""))
        {
            jLabel1.setVisible(true);
        }
        if(confirmpassword.matches(""))
        {
            jLabel3.setVisible(true);
            ConfirmPasswordget.setForeground(Color.BLACK);
            ConfirmPasswordget.setFocusable(true);
        }
        ConfirmPasswordget.setFocusable(true);
        jLabel3.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void RegisterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterButtonMouseClicked
        // TODO add your handling code here:
        String firstName = FirstNameget.getText();
        String lastName = LastNameget.getText();
        String username = Usernameget.getText();
        String password = Passwordget.getText();
        String confirmpassword = ConfirmPasswordget.getText();
        
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
          
            if(password.matches(""))
            {
                JOptionPane.showMessageDialog(null, "Enter Password");
            }
            else if(confirmpassword.matches(""))
            {
                JOptionPane.showMessageDialog(null, "Confirm your Password");
            }
            else if(firstName.matches("First Name")&&(lastName.matches("Last Name")&&(username.matches("Username"))))
            {
                
            } else if (password.matches(confirmpassword))
            {
                st.executeUpdate("insert into admin values('"+firstName+"','"+lastName+"','"+username+"','"+password+"','"+confirmpassword+"')");
                new Success().setVisible(true);
                setVisible(false);
                new LoginPage().setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Passwords doest Match");
            }
                  
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            //ResultSet rsl = st.executeQuery("select *from admin where username = '"+username+"' && password = '"+password+"'");
            
            /*if(firstName.matches("")&&(lastName.matches("")&&username.matches("")&&(password.matches("")&&confirmPassword.matches(""))))
            {
                JOptionPane.showMessageDialog(null, "Fill everything before ");
            }
            
            if(password.matches(confirmPassword))
            {
                st.executeUpdate("insert into admin values('"+firstName+"','"+lastName+"','"+username+"','"+password+"','"+confirmPassword+"')");
                new Success().setVisible(true);
                setVisible(false);
                new LoginPage().setVisible(true);
            }
            /*
            else if(confirmPassword.matches(""))
            {
                JOptionPane.showMessageDialog(null,"Confirm Your Password");
            }
            else if(password.matches(""))
            {
                JOptionPane.showMessageDialog(null,"Enter a Password");
            }
            else if(username.matches(""))
            {
                JOptionPane.showMessageDialog(null,"Enter a Username");
            }
            else if(lastName.matches(""))
            {
                JOptionPane.showMessageDialog(null,"Enter your Lastname");
            }   
            else if(firstName.matches(""))
            {
                JOptionPane.showMessageDialog(null,"Enter your FirstName");
            }    
            */
            
            
            
            
            
            
            
            
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_RegisterButtonMouseClicked

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        // TODO add your handling code here:
        
        this.setVisible(false);
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void PasswordgetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordgetMouseClicked
        // TODO add your handling code here:
        Passwordget.setFocusable(true);
        
    }//GEN-LAST:event_PasswordgetMouseClicked

    private void ConfirmPasswordgetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmPasswordgetMouseClicked
        // TODO add your handling code here:
        ConfirmPasswordget.setFocusable(true);
    }//GEN-LAST:event_ConfirmPasswordgetMouseClicked

    private void jLabel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel3KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            
        }
    }//GEN-LAST:event_jLabel3KeyPressed

    private void ConfirmPasswordgetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConfirmPasswordgetKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
        String firstName = FirstNameget.getText();
        String lastName = LastNameget.getText();
        String username = Usernameget.getText();
        String password = Passwordget.getText();
        String confirmpassword = ConfirmPasswordget.getText();
        
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
          
            if(password.matches(""))
            {
                JOptionPane.showMessageDialog(null, "Enter Password");
            }
            else if(confirmpassword.matches(""))
            {
                JOptionPane.showMessageDialog(null, "Confirm your Password");
            }
            else if(firstName.matches("First Name")&&(lastName.matches("Last Name")&&(username.matches("Username"))))
            {
                
            } else if (password.matches(confirmpassword))
            {
                st.executeUpdate("insert into admin values('"+firstName+"','"+lastName+"','"+username+"','"+password+"','"+confirmpassword+"')");
                new Success().setVisible(true);
                setVisible(false);
                new LoginPage().setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Passwords doest Match");
            }
        }   
        catch (Exception e) 
        {
                
            }
        }
    }//GEN-LAST:event_ConfirmPasswordgetKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmPasswordget;
    private javax.swing.JLabel Exit;
    private javax.swing.JTextField FirstNameget;
    private javax.swing.JTextField LastNameget;
    private javax.swing.JLabel LoginButton;
    private javax.swing.JPasswordField Passwordget;
    private javax.swing.JLabel RegisterButton;
    private javax.swing.JLabel RegisterIcon;
    private javax.swing.JTextField Usernameget;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}