/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Novella.YMain;


import java.sql.*;
import Novella.Database.DatabaseManager.ConnectionProvider;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Koka
 */
public class AddNewStudentJframe extends javax.swing.JFrame {

    /**
     * Creates new form AddNewStudentJframe
     */
    public AddNewStudentJframe() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        studentIndexjField = new javax.swing.JTextField();
        studentNamejField = new javax.swing.JTextField();
        studentAddressjField = new javax.swing.JTextField();
        studentIslandjField = new javax.swing.JTextField();
        studentPhonejField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Student Index:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Student Name:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Student Class:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Student Address:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Student Island:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Student Phone:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        studentIndexjField.setBackground(new java.awt.Color(255, 255, 255));
        studentIndexjField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        studentIndexjField.setForeground(new java.awt.Color(0, 0, 0));
        studentIndexjField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIndexjFieldActionPerformed(evt);
            }
        });
        jPanel1.add(studentIndexjField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 180, -1));

        studentNamejField.setBackground(new java.awt.Color(255, 255, 255));
        studentNamejField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        studentNamejField.setForeground(new java.awt.Color(0, 0, 0));
        studentNamejField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNamejFieldActionPerformed(evt);
            }
        });
        jPanel1.add(studentNamejField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 180, -1));

        studentAddressjField.setBackground(new java.awt.Color(255, 255, 255));
        studentAddressjField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        studentAddressjField.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(studentAddressjField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 180, -1));

        studentIslandjField.setBackground(new java.awt.Color(255, 255, 255));
        studentIslandjField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        studentIslandjField.setForeground(new java.awt.Color(0, 0, 0));
        studentIslandjField.setText("R.Meedhoo");
        jPanel1.add(studentIslandjField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 180, -1));

        studentPhonejField.setBackground(new java.awt.Color(255, 255, 255));
        studentPhonejField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        studentPhonejField.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(studentPhonejField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 180, -1));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setText("Save");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton3.setText("Save & Add New");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "L.K.G", "U.K.G", "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5", "Grade 6", "Grade 6", "Grade 7", "Grade 8", "Grade 9", "Grade 9", "Grade 10", "Grade 11", "Grade 12" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 180, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add New Student");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/ISSUE BOOK PAGE.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 380));

        setSize(new java.awt.Dimension(372, 373));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void studentIndexjFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIndexjFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIndexjFieldActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        MainView b = new MainView();
        
        this.dispose();
        b.setVisible(true);   
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String studentIndex = studentIndexjField.getText();
        String studentName = studentNamejField.getText();
        String studentClass = (String)jComboBox1.getSelectedItem();
        String studentAddress = studentAddressjField.getText();
        String studentIsland = studentIslandjField.getText();
        String studentPhone = studentPhonejField.getText();
        MainView b = new MainView();
        
        try
        { 
        Connection con = ConnectionProvider.getCon();
        Statement st = con.createStatement();
        st.executeUpdate("insert into student values('"+studentIndex+"','"+studentName+"','"+studentAddress+"','"+studentIsland+"','"+studentClass+"','"+studentPhone+"')");
            JOptionPane.showMessageDialog(null , "Successfully Updated");
            
            con.close();
            
            this.dispose();
            b.setVisible(true);
            
        }
        catch(Exception e)
                {
                System.out.println(e);
                }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        MainView b = new MainView();
        
        this.dispose();
        b.setVisible(true);  
    }//GEN-LAST:event_jButton2MouseClicked

    private void studentNamejFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNamejFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentNamejFieldActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        String studentIndex = studentIndexjField.getText();
        String studentName = studentNamejField.getText();
        String studentClass = (String)jComboBox1.getSelectedItem();
        String studentAddress = studentAddressjField.getText();
        String studentIsland = studentIslandjField.getText();
        String studentPhone = studentPhonejField.getText();
        AddNewStudentJframe b = new AddNewStudentJframe();
        
        try
        { 
        Connection con = ConnectionProvider.getCon();
        Statement st = con.createStatement();
        st.executeUpdate("insert into student values('"+studentIndex+"','"+studentName+"','"+studentAddress+"','"+studentIsland+"','"+studentClass+"','"+studentPhone+"')");
            JOptionPane.showMessageDialog(null , "Successfull");
            this.dispose();
            b.setVisible(true);
        
        }
        catch(Exception e)
                {
                System.out.println("Cannot");
                }
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(AddNewStudentJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewStudentJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewStudentJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewStudentJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewStudentJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField studentAddressjField;
    private javax.swing.JTextField studentIndexjField;
    private javax.swing.JTextField studentIslandjField;
    private javax.swing.JTextField studentNamejField;
    private javax.swing.JTextField studentPhonejField;
    // End of variables declaration//GEN-END:variables
}
