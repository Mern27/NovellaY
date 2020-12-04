/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Novella.YMain;


import Novella.Database.DatabaseManager.ActivationProvider;
import Novella.Database.DatabaseManager.ConnectionProvider;
import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import Novella.MessageBoxes.ErrorBoxInsertStudentIndex;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Yamaan Ahmed Naseem
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel94 = new javax.swing.JLabel();
        Hidebar1 = new javax.swing.JPanel();
        Hidebar4 = new javax.swing.JPanel();
        Hidebar2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        IssueBookjPanel = new javax.swing.JPanel();
        HeadingIssue = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        IndexSearchField = new javax.swing.JTextField();
        StudentGradeget = new javax.swing.JTextField();
        StudentNameget = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ISBNSearchField = new javax.swing.JTextField();
        BookTitleget = new javax.swing.JTextField();
        BookAuthorget = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        issueBookDateget = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        expireBookDateget = new com.toedter.calendar.JDateChooser();
        RecievejPanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        returnISBNget = new javax.swing.JTextField();
        returnIndexget = new javax.swing.JTextField();
        returnBookget = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        returnAuthorget = new javax.swing.JTextField();
        returnGradeget = new javax.swing.JTextField();
        returnNameget = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        returnDateget = new com.toedter.calendar.JDateChooser();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        History = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        BookDirectory = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BooksListTable = new javax.swing.JTable();
        jLabel73 = new javax.swing.JLabel();
        bookNameget = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        CurrentlySelected1 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        StudentTables = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        indexNameget = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        StudentListTable = new javax.swing.JTable();
        jLabel101 = new javax.swing.JLabel();
        CurrentlySelected = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        AddNewStudentjPanel = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        studentIndexjField = new javax.swing.JTextField();
        studentNamejField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        studentAddressjField = new javax.swing.JTextField();
        studentIslandjField = new javax.swing.JTextField();
        studentPhonejField = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        AddNewBookjPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jISBN = new javax.swing.JTextField();
        jTitle = new javax.swing.JTextField();
        jDDC = new javax.swing.JTextField();
        jPublisher = new javax.swing.JTextField();
        jSubject = new javax.swing.JTextField();
        jAuthor = new javax.swing.JTextField();
        jYear = new javax.swing.JTextField();
        jPages = new javax.swing.JTextField();
        jBookNumber = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Teachers = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        IssuedBooksList = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        Profile = new javax.swing.JPanel();
        ActivationYes = new javax.swing.JLabel();
        ActivationNo = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        ActivationCode = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        ActivationNotComplete = new javax.swing.JLabel();
        ActivationCompleted = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        Dashboard = new javax.swing.JPanel();
        DashboardTitle = new javax.swing.JLabel();
        StudentDashboardTitle = new javax.swing.JLabel();
        HistoryDashboardTitle = new javax.swing.JLabel();
        HistroryLabel = new javax.swing.JLabel();
        HistoryBox = new javax.swing.JLabel();
        DashboardHistoryCount = new javax.swing.JLabel();
        IssuedListDashboardTitle = new javax.swing.JLabel();
        DashboardIssuedListCount = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        DashboardStudentsCount = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        UsernameTab = new javax.swing.JPanel();
        Hide = new javax.swing.JLabel();
        Visible = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        NewUsername = new javax.swing.JTextField();
        CurrentUsername = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        PasswordTab = new javax.swing.JPanel();
        Hide5 = new javax.swing.JLabel();
        Visible5 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        CurrentPassword = new javax.swing.JTextField();
        NewPassword = new javax.swing.JTextField();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Hide1 = new javax.swing.JLabel();
        Visible1 = new javax.swing.JLabel();
        CurrentUsername1 = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        CurrentUsername2 = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        Hide2 = new javax.swing.JLabel();
        Visible2 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        CurrentUsername3 = new javax.swing.JTextField();
        jLabel143 = new javax.swing.JLabel();
        Hide3 = new javax.swing.JLabel();
        Visible3 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        CurrentUsername4 = new javax.swing.JTextField();
        jLabel150 = new javax.swing.JLabel();
        Hide4 = new javax.swing.JLabel();
        Visible4 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        IssueBooksGrey_Out = new javax.swing.JLabel();
        ReceiveBooksGrey_Out = new javax.swing.JLabel();
        AddNewBookGrey_Out = new javax.swing.JLabel();
        AddNewStudentGrey_Out = new javax.swing.JLabel();
        IssuedListGrey_Out = new javax.swing.JLabel();
        HistoryGrey_Out = new javax.swing.JLabel();
        IssuedListUnselected = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        AddNewStudentUnselected = new javax.swing.JLabel();
        AddNewBookUnselected = new javax.swing.JLabel();
        ReceiveBooksUnselected = new javax.swing.JLabel();
        HistoryUnselected = new javax.swing.JLabel();
        IssueBookUnselected = new javax.swing.JLabel();
        AddNewBook = new javax.swing.JLabel();
        NumberOfBooksjLabel = new javax.swing.JLabel();
        UnreturnedBooksLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        StudentTablesLabel = new javax.swing.JLabel();
        NumberOfStudentjLabel = new javax.swing.JLabel();
        TeachersIcon = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        IssueBooksSelected = new javax.swing.JLabel();
        CloseButtonX = new javax.swing.JLabel();
        MinimiseButton = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        BookDirectoryBarSelection = new javax.swing.JLabel();
        ReceiveBooksSelected = new javax.swing.JLabel();
        StudentDirectoryBarSelection = new javax.swing.JLabel();
        Profileslect = new javax.swing.JLabel();
        Dataslect = new javax.swing.JLabel();
        Teachersslect = new javax.swing.JLabel();
        AddNewBookSelected = new javax.swing.JLabel();
        AddNewStudentSelected = new javax.swing.JLabel();
        IssuedListSelected = new javax.swing.JLabel();
        HistorySelected = new javax.swing.JLabel();
        MainJFrameCover = new javax.swing.JLabel();
        Hidebar7 = new javax.swing.JPanel();
        Hidebar5 = new javax.swing.JPanel();
        Hidebar6 = new javax.swing.JPanel();
        Hidebar8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Novella LMS RAEC");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel94.setBackground(new java.awt.Color(255, 255, 255));
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/plp.png"))); // NOI18N
        jLabel94.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel94MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, 30));

        Hidebar1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Hidebar1Layout = new javax.swing.GroupLayout(Hidebar1);
        Hidebar1.setLayout(Hidebar1Layout);
        Hidebar1Layout.setHorizontalGroup(
            Hidebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        Hidebar1Layout.setVerticalGroup(
            Hidebar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        getContentPane().add(Hidebar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 20, 460));

        Hidebar4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Hidebar4Layout = new javax.swing.GroupLayout(Hidebar4);
        Hidebar4.setLayout(Hidebar4Layout);
        Hidebar4Layout.setHorizontalGroup(
            Hidebar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        Hidebar4Layout.setVerticalGroup(
            Hidebar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(Hidebar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 860, 20));

        Hidebar2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Hidebar2Layout = new javax.swing.GroupLayout(Hidebar2);
        Hidebar2.setLayout(Hidebar2Layout);
        Hidebar2Layout.setHorizontalGroup(
            Hidebar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        Hidebar2Layout.setVerticalGroup(
            Hidebar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        getContentPane().add(Hidebar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 70, 20, 460));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        IssueBookjPanel.setBackground(new java.awt.Color(255, 255, 255));
        IssueBookjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeadingIssue.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        HeadingIssue.setForeground(new java.awt.Color(0, 0, 0));
        HeadingIssue.setText("Issue Books to Students");
        IssueBookjPanel.add(HeadingIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Student Index:");
        IssueBookjPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, 40));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Due Date:");
        IssueBookjPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, 40));

        IndexSearchField.setBackground(new java.awt.Color(255, 255, 255));
        IndexSearchField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        IndexSearchField.setForeground(new java.awt.Color(0, 0, 0));
        IndexSearchField.setAutoscrolls(false);
        IndexSearchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        IndexSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndexSearchFieldActionPerformed(evt);
            }
        });
        IssueBookjPanel.add(IndexSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 150, 20));

        StudentGradeget.setBackground(new java.awt.Color(255, 255, 255));
        StudentGradeget.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        StudentGradeget.setForeground(new java.awt.Color(0, 0, 0));
        StudentGradeget.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        StudentGradeget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentGradegetActionPerformed(evt);
            }
        });
        IssueBookjPanel.add(StudentGradeget, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 200, 20));

        StudentNameget.setBackground(new java.awt.Color(255, 255, 255));
        StudentNameget.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        StudentNameget.setForeground(new java.awt.Color(0, 0, 0));
        StudentNameget.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        StudentNameget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentNamegetActionPerformed(evt);
            }
        });
        IssueBookjPanel.add(StudentNameget, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 200, 20));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Student Name:");
        IssueBookjPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Book ID:");
        IssueBookjPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 70, 20));

        ISBNSearchField.setBackground(new java.awt.Color(255, 255, 255));
        ISBNSearchField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ISBNSearchField.setForeground(new java.awt.Color(0, 0, 0));
        ISBNSearchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ISBNSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISBNSearchFieldActionPerformed(evt);
            }
        });
        ISBNSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ISBNSearchFieldKeyPressed(evt);
            }
        });
        IssueBookjPanel.add(ISBNSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 150, 20));

        BookTitleget.setBackground(new java.awt.Color(255, 255, 255));
        BookTitleget.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        BookTitleget.setForeground(new java.awt.Color(0, 0, 0));
        BookTitleget.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BookTitleget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookTitlegetActionPerformed(evt);
            }
        });
        IssueBookjPanel.add(BookTitleget, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 200, 20));

        BookAuthorget.setBackground(new java.awt.Color(255, 255, 255));
        BookAuthorget.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        BookAuthorget.setForeground(new java.awt.Color(0, 0, 0));
        BookAuthorget.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BookAuthorget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookAuthorgetActionPerformed(evt);
            }
        });
        IssueBookjPanel.add(BookAuthorget, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 210, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/searchpng-01.png"))); // NOI18N
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        IssueBookjPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, -1, 80));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Book Author:");
        IssueBookjPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Book Title:");
        IssueBookjPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        jLabel81.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(0, 0, 0));
        jLabel81.setText("Issue Date:");
        IssueBookjPanel.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, 40));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Book Details");
        IssueBookjPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, -1, 20));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Student Details");
        IssueBookjPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, 20));

        issueBookDateget.setBackground(new java.awt.Color(255, 255, 255));
        issueBookDateget.setForeground(new java.awt.Color(0, 0, 0));
        IssueBookjPanel.add(issueBookDateget, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 140, 20));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Student Grade:");
        IssueBookjPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/searchpng-01.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        IssueBookjPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, 60));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student ind-01-01.png"))); // NOI18N
        IssueBookjPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, 40));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student ind-01-01.png"))); // NOI18N
        IssueBookjPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, 60));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        IssueBookjPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, 60));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        IssueBookjPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, 60));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        IssueBookjPanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, 60));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        IssueBookjPanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, 60));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Issuebookpng-01-01.png"))); // NOI18N
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });
        IssueBookjPanel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 100, 50));
        IssueBookjPanel.add(expireBookDateget, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 140, 20));

        jTabbedPane1.addTab("tab1", IssueBookjPanel);

        RecievejPanel.setBackground(new java.awt.Color(255, 255, 255));
        RecievejPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Recieve Book");
        RecievejPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        jTable5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable5.setGridColor(new java.awt.Color(0, 0, 0));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jTable5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable5KeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        RecievejPanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 810, 80));

        returnISBNget.setBackground(new java.awt.Color(255, 255, 255));
        returnISBNget.setForeground(new java.awt.Color(0, 0, 0));
        returnISBNget.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        RecievejPanel.add(returnISBNget, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 210, 20));

        returnIndexget.setBackground(new java.awt.Color(255, 255, 255));
        returnIndexget.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        returnIndexget.setForeground(new java.awt.Color(0, 0, 0));
        returnIndexget.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        RecievejPanel.add(returnIndexget, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 150, 20));

        returnBookget.setBackground(new java.awt.Color(255, 255, 255));
        returnBookget.setForeground(new java.awt.Color(0, 0, 0));
        returnBookget.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        RecievejPanel.add(returnBookget, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 210, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Return Book");
        RecievejPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Seach by index:");
        RecievejPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, 40));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Book ISBN:");
        RecievejPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, 40));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Book Author:");
        RecievejPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, 40));

        returnAuthorget.setBackground(new java.awt.Color(255, 255, 255));
        returnAuthorget.setForeground(new java.awt.Color(0, 0, 0));
        returnAuthorget.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        RecievejPanel.add(returnAuthorget, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 210, -1));

        returnGradeget.setBackground(new java.awt.Color(255, 255, 255));
        returnGradeget.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        returnGradeget.setForeground(new java.awt.Color(0, 0, 0));
        returnGradeget.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        RecievejPanel.add(returnGradeget, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 210, 20));

        returnNameget.setBackground(new java.awt.Color(255, 255, 255));
        returnNameget.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        returnNameget.setForeground(new java.awt.Color(0, 0, 0));
        returnNameget.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        RecievejPanel.add(returnNameget, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 210, 20));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Student Name:");
        RecievejPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 40));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Book Title:");
        RecievejPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, 40));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Returned Date:");
        RecievejPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, 30));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Student Grade:");
        RecievejPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 40));
        RecievejPanel.add(returnDateget, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 369, 210, 20));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/searchpng-01.png"))); // NOI18N
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });
        RecievejPanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, 40));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student ind-01-01.png"))); // NOI18N
        RecievejPanel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, 40));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        RecievejPanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, 60));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        RecievejPanel.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, 40));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        RecievejPanel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, 40));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        RecievejPanel.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, -1, 40));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        RecievejPanel.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, -1, 40));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/return book button-01.png"))); // NOI18N
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });
        RecievejPanel.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));

        jTabbedPane1.addTab("tab2", RecievejPanel);

        History.setBackground(new java.awt.Color(255, 255, 255));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("History");

        javax.swing.GroupLayout HistoryLayout = new javax.swing.GroupLayout(History);
        History.setLayout(HistoryLayout);
        HistoryLayout.setHorizontalGroup(
            HistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(388, 388, 388))
        );
        HistoryLayout.setVerticalGroup(
            HistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryLayout.createSequentialGroup()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab4", History);

        BookDirectory.setBackground(new java.awt.Color(255, 255, 255));
        BookDirectory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BooksListTable.setBackground(new java.awt.Color(255, 255, 255));
        BooksListTable.setForeground(new java.awt.Color(0, 0, 0));
        BooksListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        BooksListTable.setSelectionBackground(new java.awt.Color(0, 153, 255));
        BooksListTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        BooksListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BooksListTableMouseClicked(evt);
            }
        });
        BooksListTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                BooksListTableComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(BooksListTable);

        BookDirectory.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 820, 350));

        jLabel73.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 0, 0));
        jLabel73.setText("Book List");
        BookDirectory.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, -1));

        bookNameget.setBackground(new java.awt.Color(255, 255, 255));
        bookNameget.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        bookNameget.setForeground(new java.awt.Color(204, 204, 204));
        bookNameget.setText("Search by Title...");
        bookNameget.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        bookNameget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookNamegetMouseClicked(evt);
            }
        });
        BookDirectory.add(bookNameget, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 140, 20));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student ind-01-01.png"))); // NOI18N
        BookDirectory.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, 40));

        jLabel90.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(0, 0, 0));
        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/searchpng-01.png"))); // NOI18N
        jLabel90.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel90MouseClicked(evt);
            }
        });
        BookDirectory.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 0, -1, 40));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Refresh.png"))); // NOI18N
        jLabel91.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel91MouseClicked(evt);
            }
        });
        BookDirectory.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, -1, 40));

        jLabel105.setBackground(new java.awt.Color(255, 255, 255));
        jLabel105.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(0, 0, 0));
        jLabel105.setText("Currently Selected:");
        BookDirectory.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, 35));

        CurrentlySelected1.setBackground(new java.awt.Color(255, 255, 255));
        CurrentlySelected1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CurrentlySelected1.setForeground(new java.awt.Color(0, 0, 0));
        CurrentlySelected1.setBorder(null);
        BookDirectory.add(CurrentlySelected1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 190, 20));

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        BookDirectory.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 405, -1, 30));

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Delete.png"))); // NOI18N
        jLabel107.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel107MouseClicked(evt);
            }
        });
        BookDirectory.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 30, 60));

        jLabel86.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(0, 0, 0));
        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Edit Student Info.png"))); // NOI18N
        jLabel86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel86MouseClicked(evt);
            }
        });
        BookDirectory.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 406, 160, 30));

        jTabbedPane1.addTab("tab5", BookDirectory);

        StudentTables.setBackground(new java.awt.Color(255, 255, 255));
        StudentTables.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 0));
        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Edit Student Info.png"))); // NOI18N
        StudentTables.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 406, 160, 30));

        jLabel69.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 0, 0));
        jLabel69.setText("Student List");
        StudentTables.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        indexNameget.setBackground(new java.awt.Color(255, 255, 255));
        indexNameget.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        indexNameget.setForeground(new java.awt.Color(204, 204, 204));
        indexNameget.setText("Search by Index...");
        indexNameget.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        indexNameget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indexNamegetMouseClicked(evt);
            }
        });
        StudentTables.add(indexNameget, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 140, 20));

        jLabel71.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 0));
        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/searchpng-01.png"))); // NOI18N
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
        });
        StudentTables.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 0, -1, 40));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student ind-01-01.png"))); // NOI18N
        StudentTables.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, 40));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Refresh.png"))); // NOI18N
        jLabel87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel87MouseClicked(evt);
            }
        });
        StudentTables.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, -1, 40));

        StudentListTable.setBackground(new java.awt.Color(255, 255, 255));
        StudentListTable.setForeground(new java.awt.Color(0, 0, 0));
        StudentListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        StudentListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentListTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(StudentListTable);

        StudentTables.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 820, 350));

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Delete.png"))); // NOI18N
        jLabel101.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel101MouseClicked(evt);
            }
        });
        StudentTables.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 30, 60));

        CurrentlySelected.setBackground(new java.awt.Color(255, 255, 255));
        CurrentlySelected.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CurrentlySelected.setForeground(new java.awt.Color(0, 0, 0));
        CurrentlySelected.setBorder(null);
        StudentTables.add(CurrentlySelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 190, 20));

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        StudentTables.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 405, -1, 30));

        jLabel103.setBackground(new java.awt.Color(255, 255, 255));
        jLabel103.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(0, 0, 0));
        jLabel103.setText("Currently Selected:");
        StudentTables.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, 35));

        jTabbedPane1.addTab("tab6", StudentTables);

        AddNewStudentjPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddNewStudentjPanel.setForeground(new java.awt.Color(255, 255, 255));
        AddNewStudentjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("Student Index:");
        AddNewStudentjPanel.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 40));

        jLabel61.setBackground(new java.awt.Color(255, 255, 255));
        jLabel61.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 0));
        jLabel61.setText("Student Name:");
        AddNewStudentjPanel.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 113, -1, -1));

        jLabel65.setBackground(new java.awt.Color(255, 255, 255));
        jLabel65.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("Student Class:");
        AddNewStudentjPanel.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 40));

        jLabel66.setBackground(new java.awt.Color(255, 255, 255));
        jLabel66.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 0));
        jLabel66.setText("Student Address:");
        AddNewStudentjPanel.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jLabel67.setBackground(new java.awt.Color(255, 255, 255));
        jLabel67.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setText("Student Island:");
        AddNewStudentjPanel.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        jLabel68.setBackground(new java.awt.Color(255, 255, 255));
        jLabel68.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 0));
        jLabel68.setText("Student Phone:");
        AddNewStudentjPanel.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 120, -1));

        studentIndexjField.setBackground(new java.awt.Color(255, 255, 255));
        studentIndexjField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        studentIndexjField.setForeground(new java.awt.Color(0, 0, 0));
        studentIndexjField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        studentIndexjField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIndexjFieldActionPerformed(evt);
            }
        });
        AddNewStudentjPanel.add(studentIndexjField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 190, -1));

        studentNamejField.setBackground(new java.awt.Color(255, 255, 255));
        studentNamejField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        studentNamejField.setForeground(new java.awt.Color(0, 0, 0));
        studentNamejField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        studentNamejField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNamejFieldActionPerformed(evt);
            }
        });
        AddNewStudentjPanel.add(studentNamejField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 190, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "L.K.G", "U.K.G", "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5", "Grade 6", "Grade 7", "Grade 8", "Grade 9", "Grade 10", "Grade 11", "Grade 12" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddNewStudentjPanel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 210, 22));

        studentAddressjField.setBackground(new java.awt.Color(255, 255, 255));
        studentAddressjField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        studentAddressjField.setForeground(new java.awt.Color(0, 0, 0));
        studentAddressjField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        AddNewStudentjPanel.add(studentAddressjField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 180, -1));

        studentIslandjField.setBackground(new java.awt.Color(255, 255, 255));
        studentIslandjField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        studentIslandjField.setForeground(new java.awt.Color(0, 0, 0));
        studentIslandjField.setText("R.Meedhoo");
        studentIslandjField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        AddNewStudentjPanel.add(studentIslandjField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 180, -1));

        studentPhonejField.setBackground(new java.awt.Color(255, 255, 255));
        studentPhonejField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        studentPhonejField.setForeground(new java.awt.Color(0, 0, 0));
        studentPhonejField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        AddNewStudentjPanel.add(studentPhonejField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 180, -1));

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        AddNewStudentjPanel.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, 40));

        jLabel74.setBackground(new java.awt.Color(0, 0, 0));
        jLabel74.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 0, 0));
        jLabel74.setText("Add New Student");
        AddNewStudentjPanel.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        AddNewStudentjPanel.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, 60));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        AddNewStudentjPanel.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, 40));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        AddNewStudentjPanel.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, 40));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        AddNewStudentjPanel.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, 40));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        AddNewStudentjPanel.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, -1, 40));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/jbutton login.png1111-01.png"))); // NOI18N
        jLabel80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel80MouseClicked(evt);
            }
        });
        AddNewStudentjPanel.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));
        AddNewStudentjPanel.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        jTabbedPane1.addTab("tab7", AddNewStudentjPanel);

        AddNewBookjPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddNewBookjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Book ID:");
        AddNewBookjPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 80, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Book Title:");
        AddNewBookjPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 80, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Book DDC:");
        AddNewBookjPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Publisher:");
        AddNewBookjPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        jLabel48.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setText("Subject:");
        AddNewBookjPanel.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, 40));

        jLabel49.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("Author:");
        AddNewBookjPanel.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

        jLabel50.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("Year:");
        AddNewBookjPanel.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        jLabel51.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Pages:");
        AddNewBookjPanel.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, -1, -1));

        jLabel53.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("Book Number:");
        AddNewBookjPanel.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, -1));

        jISBN.setBackground(new java.awt.Color(255, 255, 255));
        jISBN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jISBN.setForeground(new java.awt.Color(0, 0, 0));
        jISBN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        AddNewBookjPanel.add(jISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 200, -1));

        jTitle.setBackground(new java.awt.Color(255, 255, 255));
        jTitle.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTitle.setForeground(new java.awt.Color(0, 0, 0));
        jTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        AddNewBookjPanel.add(jTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 200, 20));

        jDDC.setBackground(new java.awt.Color(255, 255, 255));
        jDDC.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDDC.setForeground(new java.awt.Color(0, 0, 0));
        jDDC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        AddNewBookjPanel.add(jDDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 200, -1));

        jPublisher.setBackground(new java.awt.Color(255, 255, 255));
        jPublisher.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPublisher.setForeground(new java.awt.Color(0, 0, 0));
        jPublisher.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        AddNewBookjPanel.add(jPublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 200, -1));

        jSubject.setBackground(new java.awt.Color(255, 255, 255));
        jSubject.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jSubject.setForeground(new java.awt.Color(0, 0, 0));
        jSubject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        AddNewBookjPanel.add(jSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 200, 20));

        jAuthor.setBackground(new java.awt.Color(255, 255, 255));
        jAuthor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jAuthor.setForeground(new java.awt.Color(0, 0, 0));
        jAuthor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        AddNewBookjPanel.add(jAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 200, -1));

        jYear.setBackground(new java.awt.Color(255, 255, 255));
        jYear.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jYear.setForeground(new java.awt.Color(0, 0, 0));
        jYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        AddNewBookjPanel.add(jYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 60, -1));

        jPages.setBackground(new java.awt.Color(255, 255, 255));
        jPages.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPages.setForeground(new java.awt.Color(0, 0, 0));
        jPages.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        AddNewBookjPanel.add(jPages, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 60, -1));

        jBookNumber.setBackground(new java.awt.Color(255, 255, 255));
        jBookNumber.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jBookNumber.setForeground(new java.awt.Color(0, 0, 0));
        jBookNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        AddNewBookjPanel.add(jBookNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 190, -1));

        jLabel54.setBackground(new java.awt.Color(0, 0, 0));
        jLabel54.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("Add New Book");
        AddNewBookjPanel.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        AddNewBookjPanel.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, 40));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        AddNewBookjPanel.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, 40));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        AddNewBookjPanel.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, 40));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        AddNewBookjPanel.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, 40));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        AddNewBookjPanel.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, 40));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        AddNewBookjPanel.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, 40));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/searcby index-01.png"))); // NOI18N
        AddNewBookjPanel.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, 40));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/searcby index-01.png"))); // NOI18N
        AddNewBookjPanel.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, -1, 40));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/student name space-01.png"))); // NOI18N
        AddNewBookjPanel.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Add new book-01.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        AddNewBookjPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        jTabbedPane1.addTab("tab3", AddNewBookjPanel);

        Teachers.setBackground(new java.awt.Color(255, 255, 255));
        Teachers.setForeground(new java.awt.Color(255, 255, 255));
        Teachers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel82.setBackground(new java.awt.Color(255, 255, 255));
        jLabel82.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(0, 0, 0));
        jLabel82.setText("Reset History");
        Teachers.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        Teachers.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jTabbedPane1.addTab("tab8", Teachers);

        IssuedBooksList.setBackground(new java.awt.Color(255, 255, 255));
        IssuedBooksList.setForeground(new java.awt.Color(255, 255, 255));
        IssuedBooksList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setBackground(new java.awt.Color(255, 255, 255));
        jTable3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTable3.setForeground(new java.awt.Color(0, 0, 0));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.setSelectionBackground(new java.awt.Color(0, 204, 255));
        jTable3.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(jTable3);

        IssuedBooksList.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 790, 360));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Issued Books");
        IssuedBooksList.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, -1));

        jTabbedPane1.addTab("tab9", IssuedBooksList);

        Profile.setBackground(new java.awt.Color(255, 255, 255));
        Profile.setForeground(new java.awt.Color(255, 255, 255));
        Profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ActivationYes.setBackground(new java.awt.Color(255, 255, 255));
        ActivationYes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ActivationYes.setForeground(new java.awt.Color(0, 0, 0));
        ActivationYes.setText("This Product is Activated");
        Profile.add(ActivationYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, 30));

        ActivationNo.setBackground(new java.awt.Color(255, 255, 255));
        ActivationNo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ActivationNo.setForeground(new java.awt.Color(0, 0, 0));
        ActivationNo.setText(" This Product is not Activated Yet");
        Profile.add(ActivationNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 230, 30));

        jLabel83.setBackground(new java.awt.Color(255, 255, 255));
        jLabel83.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(0, 51, 102));
        jLabel83.setText("Profile");
        Profile.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 57, -1, -1));

        jLabel84.setBackground(new java.awt.Color(255, 255, 255));
        jLabel84.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(0, 0, 0));
        jLabel84.setText("My Proflie Picture");
        Profile.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, -1, -1));

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/R.A.E.C Logo profile.png"))); // NOI18N
        Profile.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, -1, -1));

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/change-01.png"))); // NOI18N
        jLabel95.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel95MouseClicked(evt);
            }
        });
        Profile.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 80, -1));

        ActivationCode.setBackground(new java.awt.Color(255, 255, 255));
        ActivationCode.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ActivationCode.setForeground(new java.awt.Color(0, 0, 0));
        ActivationCode.setBorder(null);
        ActivationCode.setMinimumSize(new java.awt.Dimension(0, 18));
        Profile.add(ActivationCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 365, 200, 20));

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/activation blank-01.png"))); // NOI18N
        Profile.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, 50));

        ActivationNotComplete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/tick initial-01.png"))); // NOI18N
        ActivationNotComplete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActivationNotCompleteMouseClicked(evt);
            }
        });
        Profile.add(ActivationNotComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, -1, 30));

        ActivationCompleted.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/tick blue-01.png"))); // NOI18N
        Profile.add(ActivationCompleted, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, -1, 30));

        jLabel98.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(0, 0, 0));
        jLabel98.setText("Activation Code");
        Profile.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, 30));

        jLabel99.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(0, 0, 0));
        jLabel99.setText("This code is Licensed to: Raa Atoll Education Centre");
        Profile.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 310, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Reset Student LIst.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        Profile.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Reset Book List.png"))); // NOI18N
        jLabel88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel88MouseClicked(evt);
            }
        });
        Profile.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Reset IssuedLIst.png"))); // NOI18N
        jLabel108.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel108MouseClicked(evt);
            }
        });
        Profile.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Reset History.png"))); // NOI18N
        jLabel109.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel109MouseClicked(evt);
            }
        });
        Profile.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Change Username.png"))); // NOI18N
        jLabel110.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel110MouseClicked(evt);
            }
        });
        Profile.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Change Password.png"))); // NOI18N
        jLabel111.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel111MouseClicked(evt);
            }
        });
        Profile.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Profile.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 370, 20));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        Profile.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 10, 230));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        Profile.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 10, 210));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Profile.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 360, 30));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));

        Dashboard.setBackground(new java.awt.Color(255, 255, 255));
        Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DashboardTitle.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        DashboardTitle.setForeground(new java.awt.Color(9, 102, 208));
        DashboardTitle.setText("Dashboard");
        Dashboard.add(DashboardTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        StudentDashboardTitle.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        StudentDashboardTitle.setForeground(new java.awt.Color(255, 255, 255));
        StudentDashboardTitle.setText("Students");
        Dashboard.add(StudentDashboardTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 61, -1, -1));

        HistoryDashboardTitle.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        HistoryDashboardTitle.setForeground(new java.awt.Color(255, 255, 255));
        HistoryDashboardTitle.setText("History");
        Dashboard.add(HistoryDashboardTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 61, -1, -1));

        HistroryLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        HistroryLabel.setForeground(new java.awt.Color(7, 92, 140));
        HistroryLabel.setText("Lines");
        Dashboard.add(HistroryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        HistoryBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Backbones.png"))); // NOI18N
        Dashboard.add(HistoryBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        DashboardHistoryCount.setFont(new java.awt.Font("Century Gothic", 0, 40)); // NOI18N
        DashboardHistoryCount.setForeground(new java.awt.Color(7, 92, 140));
        DashboardHistoryCount.setText("00");
        Dashboard.add(DashboardHistoryCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 89, -1, 40));

        IssuedListDashboardTitle.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        IssuedListDashboardTitle.setForeground(new java.awt.Color(255, 255, 255));
        IssuedListDashboardTitle.setText("Issued List");
        Dashboard.add(IssuedListDashboardTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 61, -1, -1));

        DashboardIssuedListCount.setFont(new java.awt.Font("Century Gothic", 0, 40)); // NOI18N
        DashboardIssuedListCount.setForeground(new java.awt.Color(7, 92, 140));
        DashboardIssuedListCount.setText("00");
        Dashboard.add(DashboardIssuedListCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 89, -1, 40));

        jLabel167.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel167.setForeground(new java.awt.Color(7, 92, 140));
        jLabel167.setText("Lines");
        Dashboard.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel168.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(7, 92, 140));
        jLabel168.setText("Students");
        Dashboard.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 130, -1, -1));

        DashboardStudentsCount.setFont(new java.awt.Font("Century Gothic", 0, 40)); // NOI18N
        DashboardStudentsCount.setForeground(new java.awt.Color(7, 92, 140));
        DashboardStudentsCount.setText("00");
        Dashboard.add(DashboardStudentsCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 89, -1, 40));

        jLabel159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Backbones.png"))); // NOI18N
        Dashboard.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Backbones.png"))); // NOI18N
        Dashboard.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jTabbedPane2.addTab("tab7", Dashboard);

        UsernameTab.setBackground(new java.awt.Color(255, 255, 255));
        UsernameTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Hide.png"))); // NOI18N
        Hide.setToolTipText("Hide Username");
        Hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HideMouseClicked(evt);
            }
        });
        UsernameTab.add(Hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 63, -1, 20));

        Visible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/View.png"))); // NOI18N
        Visible.setToolTipText("View Username");
        Visible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VisibleMouseClicked(evt);
            }
        });
        UsernameTab.add(Visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 63, -1, 20));

        jLabel96.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(0, 0, 0));
        jLabel96.setText("New Username:");
        UsernameTab.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 113, 110, -1));

        NewUsername.setBackground(new java.awt.Color(255, 255, 255));
        NewUsername.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        NewUsername.setForeground(new java.awt.Color(0, 0, 0));
        NewUsername.setBorder(null);
        UsernameTab.add(NewUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 113, 140, 20));

        CurrentUsername.setBackground(new java.awt.Color(255, 255, 255));
        CurrentUsername.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CurrentUsername.setForeground(new java.awt.Color(0, 0, 0));
        CurrentUsername.setBorder(null);
        UsernameTab.add(CurrentUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 63, 130, 20));

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/student ind-01-01.png"))); // NOI18N
        UsernameTab.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 180, -1));

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/student ind-01-01.png"))); // NOI18N
        UsernameTab.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 180, -1));

        jLabel113.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(0, 0, 0));
        jLabel113.setText("Current Username:");
        UsernameTab.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 63, 118, -1));

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Confirm.png"))); // NOI18N
        jLabel116.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel116MouseClicked(evt);
            }
        });
        UsernameTab.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 165, -1, 20));

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Cancel.png"))); // NOI18N
        UsernameTab.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 165, -1, -1));

        jLabel153.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(9, 102, 208));
        jLabel153.setText("Change your Login Username");
        UsernameTab.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jTabbedPane2.addTab("tab1", UsernameTab);

        PasswordTab.setBackground(new java.awt.Color(255, 255, 255));
        PasswordTab.setForeground(new java.awt.Color(255, 255, 255));
        PasswordTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Hide5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Hide.png"))); // NOI18N
        Hide5.setToolTipText("Hide Username");
        Hide5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hide5MouseClicked(evt);
            }
        });
        PasswordTab.add(Hide5, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 63, -1, 20));

        Visible5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/View.png"))); // NOI18N
        Visible5.setToolTipText("View Username");
        Visible5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Visible5MouseClicked(evt);
            }
        });
        PasswordTab.add(Visible5, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 63, -1, 20));

        jLabel120.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(0, 0, 0));
        jLabel120.setText("Current Password:");
        PasswordTab.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 63, 118, -1));

        jLabel121.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(0, 0, 0));
        jLabel121.setText("New Password:");
        PasswordTab.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 113, 110, -1));

        CurrentPassword.setBackground(new java.awt.Color(255, 255, 255));
        CurrentPassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CurrentPassword.setForeground(new java.awt.Color(0, 0, 0));
        CurrentPassword.setBorder(null);
        PasswordTab.add(CurrentPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 63, 130, 20));

        NewPassword.setBackground(new java.awt.Color(255, 255, 255));
        NewPassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        NewPassword.setForeground(new java.awt.Color(0, 0, 0));
        NewPassword.setBorder(null);
        PasswordTab.add(NewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 113, 140, 20));

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/student ind-01-01.png"))); // NOI18N
        PasswordTab.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 180, -1));

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/student ind-01-01.png"))); // NOI18N
        PasswordTab.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 180, -1));

        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Confirm.png"))); // NOI18N
        jLabel124.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel124MouseClicked(evt);
            }
        });
        PasswordTab.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 165, -1, 20));

        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Cancel.png"))); // NOI18N
        PasswordTab.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 165, -1, -1));

        jLabel154.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(9, 102, 208));
        jLabel154.setText("Change your Login Password");
        PasswordTab.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jTabbedPane2.addTab("tab2", PasswordTab);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Hide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Hide.png"))); // NOI18N
        Hide1.setToolTipText("Hide Username");
        Hide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hide1MouseClicked(evt);
            }
        });
        jPanel4.add(Hide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 123, -1, 20));

        Visible1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/View.png"))); // NOI18N
        Visible1.setToolTipText("View Username");
        Visible1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Visible1MouseClicked(evt);
            }
        });
        jPanel4.add(Visible1, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 123, -1, 20));

        CurrentUsername1.setBackground(new java.awt.Color(255, 255, 255));
        CurrentUsername1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CurrentUsername1.setForeground(new java.awt.Color(0, 0, 0));
        CurrentUsername1.setBorder(null);
        jPanel4.add(CurrentUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 123, 130, 20));

        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/student ind-01-01.png"))); // NOI18N
        jPanel4.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 180, -1));

        jLabel127.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(0, 0, 0));
        jLabel127.setText("Enter Password:");
        jPanel4.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 124, 118, -1));

        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Confirm.png"))); // NOI18N
        jLabel128.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel128MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 165, -1, 20));

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Cancel.png"))); // NOI18N
        jPanel4.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 165, -1, -1));

        jLabel131.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(0, 0, 0));
        jLabel131.setText("to reset your Issued Book List. This action is irreversible.");
        jLabel131.setToolTipText("");
        jPanel4.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jLabel130.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(0, 0, 0));
        jLabel130.setText("Enter your login Password and cllick 'Confirm' ");
        jLabel130.setToolTipText("");
        jPanel4.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 46, -1, 20));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(9, 102, 208));
        jLabel2.setText("Warning!");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        jTabbedPane2.addTab("tab3", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel132.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(9, 102, 208));
        jLabel132.setText("Warning!");
        jPanel5.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        jLabel133.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(0, 0, 0));
        jLabel133.setText("Enter your login Password and cllick 'Confirm' ");
        jLabel133.setToolTipText("");
        jPanel5.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 46, -1, 20));

        jLabel134.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(0, 0, 0));
        jLabel134.setText("to reset your Student List. This action is irreversible.");
        jLabel134.setToolTipText("");
        jPanel5.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        jLabel135.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(0, 0, 0));
        jLabel135.setText("Enter Password:");
        jPanel5.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 124, 118, -1));

        CurrentUsername2.setBackground(new java.awt.Color(255, 255, 255));
        CurrentUsername2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CurrentUsername2.setForeground(new java.awt.Color(0, 0, 0));
        CurrentUsername2.setBorder(null);
        jPanel5.add(CurrentUsername2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 123, 130, 20));

        jLabel136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/student ind-01-01.png"))); // NOI18N
        jPanel5.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 180, -1));

        Hide2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Hide.png"))); // NOI18N
        Hide2.setToolTipText("Hide Username");
        Hide2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hide2MouseClicked(evt);
            }
        });
        jPanel5.add(Hide2, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 123, -1, 20));

        Visible2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/View.png"))); // NOI18N
        Visible2.setToolTipText("View Username");
        Visible2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Visible2MouseClicked(evt);
            }
        });
        jPanel5.add(Visible2, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 123, -1, 20));

        jLabel137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Confirm.png"))); // NOI18N
        jLabel137.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel137MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 165, -1, 20));

        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Cancel.png"))); // NOI18N
        jPanel5.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 165, -1, -1));

        jTabbedPane2.addTab("tab4", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel139.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(9, 102, 208));
        jLabel139.setText("Warning!");
        jPanel6.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        jLabel140.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(0, 0, 0));
        jLabel140.setText("Enter your login Password and cllick 'Confirm' ");
        jLabel140.setToolTipText("");
        jPanel6.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 46, -1, 20));

        jLabel141.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(0, 0, 0));
        jLabel141.setText("to reset your Book List. This action is irreversible.");
        jLabel141.setToolTipText("");
        jPanel6.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 70, 280, 20));

        jLabel142.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(0, 0, 0));
        jLabel142.setText("Enter Password:");
        jPanel6.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 124, 118, -1));

        CurrentUsername3.setBackground(new java.awt.Color(255, 255, 255));
        CurrentUsername3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CurrentUsername3.setForeground(new java.awt.Color(0, 0, 0));
        CurrentUsername3.setBorder(null);
        jPanel6.add(CurrentUsername3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 123, 130, 20));

        jLabel143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/student ind-01-01.png"))); // NOI18N
        jPanel6.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 180, -1));

        Hide3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Hide.png"))); // NOI18N
        Hide3.setToolTipText("Hide Username");
        Hide3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hide3MouseClicked(evt);
            }
        });
        jPanel6.add(Hide3, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 123, -1, 20));

        Visible3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/View.png"))); // NOI18N
        Visible3.setToolTipText("View Username");
        Visible3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Visible3MouseClicked(evt);
            }
        });
        jPanel6.add(Visible3, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 123, -1, 20));

        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Confirm.png"))); // NOI18N
        jLabel144.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel144MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 165, -1, 20));

        jLabel145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Cancel.png"))); // NOI18N
        jPanel6.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 165, -1, -1));

        jTabbedPane2.addTab("tab5", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel146.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(9, 102, 208));
        jLabel146.setText("Warning!");
        jPanel7.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        jLabel147.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(0, 0, 0));
        jLabel147.setText("Enter your login Password and cllick 'Confirm' ");
        jLabel147.setToolTipText("");
        jPanel7.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 46, -1, 20));

        jLabel148.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(0, 0, 0));
        jLabel148.setText("to reset your Issued Book History. This action is irreversible.");
        jLabel148.setToolTipText("");
        jPanel7.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jLabel149.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(0, 0, 0));
        jLabel149.setText("Enter Password:");
        jPanel7.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 124, 118, -1));

        CurrentUsername4.setBackground(new java.awt.Color(255, 255, 255));
        CurrentUsername4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        CurrentUsername4.setForeground(new java.awt.Color(0, 0, 0));
        CurrentUsername4.setBorder(null);
        jPanel7.add(CurrentUsername4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 123, 130, 20));

        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/student ind-01-01.png"))); // NOI18N
        jPanel7.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 180, -1));

        Hide4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Hide.png"))); // NOI18N
        Hide4.setToolTipText("Hide Username");
        Hide4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hide4MouseClicked(evt);
            }
        });
        jPanel7.add(Hide4, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 123, -1, 20));

        Visible4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/View.png"))); // NOI18N
        Visible4.setToolTipText("View Username");
        Visible4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Visible4MouseClicked(evt);
            }
        });
        jPanel7.add(Visible4, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 123, -1, 20));

        jLabel151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Confirm.png"))); // NOI18N
        jLabel151.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel151MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 165, -1, 20));

        jLabel152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Cancel.png"))); // NOI18N
        jPanel7.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 165, -1, -1));

        jTabbedPane2.addTab("tab6", jPanel7);

        Profile.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 360, -1));

        jLabel165.setBackground(new java.awt.Color(255, 255, 255));
        jLabel165.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(0, 51, 102));
        jLabel165.setText("Edit your Profile");
        Profile.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 57, -1, -1));

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Outer Border.png"))); // NOI18N
        Profile.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, 270));

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Feedback.png"))); // NOI18N
        Profile.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 70, 80));

        jLabel155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icons/Dashboard.png"))); // NOI18N
        jLabel155.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel155MouseClicked(evt);
            }
        });
        Profile.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jTabbedPane1.addTab("tab10", Profile);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 860, 470));

        IssueBooksGrey_Out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Issue Books Grey'd_Out.png"))); // NOI18N
        IssueBooksGrey_Out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IssueBooksGrey_OutMouseClicked(evt);
            }
        });
        getContentPane().add(IssueBooksGrey_Out, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 150, 22));

        ReceiveBooksGrey_Out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Recieve Books Grey'd_Out.png"))); // NOI18N
        ReceiveBooksGrey_Out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReceiveBooksGrey_OutMouseClicked(evt);
            }
        });
        getContentPane().add(ReceiveBooksGrey_Out, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        AddNewBookGrey_Out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/AddNew Book Grey'd_Out.png"))); // NOI18N
        AddNewBookGrey_Out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddNewBookGrey_OutMouseClicked(evt);
            }
        });
        getContentPane().add(AddNewBookGrey_Out, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        AddNewStudentGrey_Out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Add New Student Grey'd_Out.png"))); // NOI18N
        AddNewStudentGrey_Out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddNewStudentGrey_OutMouseClicked(evt);
            }
        });
        getContentPane().add(AddNewStudentGrey_Out, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        IssuedListGrey_Out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Issued List Grey'd_Out.png"))); // NOI18N
        IssuedListGrey_Out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IssuedListGrey_OutMouseClicked(evt);
            }
        });
        getContentPane().add(IssuedListGrey_Out, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        HistoryGrey_Out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Histroy Grey'd_Out.png"))); // NOI18N
        HistoryGrey_Out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistoryGrey_OutMouseClicked(evt);
            }
        });
        getContentPane().add(HistoryGrey_Out, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 419, -1, -1));

        IssuedListUnselected.setBackground(new java.awt.Color(255, 255, 255));
        IssuedListUnselected.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        IssuedListUnselected.setForeground(new java.awt.Color(255, 255, 255));
        IssuedListUnselected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Issued List TabUnselected.png"))); // NOI18N
        IssuedListUnselected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IssuedListUnselectedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IssuedListUnselectedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IssuedListUnselectedMouseExited(evt);
            }
        });
        getContentPane().add(IssuedListUnselected, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 150, -1));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Number of Unreturned Books");
        jLabel46.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 570, -1, -1));

        AddNewStudentUnselected.setBackground(new java.awt.Color(255, 255, 255));
        AddNewStudentUnselected.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        AddNewStudentUnselected.setForeground(new java.awt.Color(255, 255, 255));
        AddNewStudentUnselected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Add New Student Tab Unselected.png"))); // NOI18N
        AddNewStudentUnselected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddNewStudentUnselectedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddNewStudentUnselectedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddNewStudentUnselectedMouseExited(evt);
            }
        });
        getContentPane().add(AddNewStudentUnselected, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        AddNewBookUnselected.setBackground(new java.awt.Color(255, 255, 255));
        AddNewBookUnselected.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        AddNewBookUnselected.setForeground(new java.awt.Color(255, 255, 255));
        AddNewBookUnselected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Add New Book Tab Unselected.png"))); // NOI18N
        AddNewBookUnselected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddNewBookUnselectedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddNewBookUnselectedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddNewBookUnselectedMouseExited(evt);
            }
        });
        getContentPane().add(AddNewBookUnselected, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        ReceiveBooksUnselected.setBackground(new java.awt.Color(255, 255, 255));
        ReceiveBooksUnselected.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ReceiveBooksUnselected.setForeground(new java.awt.Color(255, 255, 255));
        ReceiveBooksUnselected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Recieve Books Tab unselected.png"))); // NOI18N
        ReceiveBooksUnselected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReceiveBooksUnselectedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReceiveBooksUnselectedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReceiveBooksUnselectedMouseExited(evt);
            }
        });
        getContentPane().add(ReceiveBooksUnselected, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        HistoryUnselected.setBackground(new java.awt.Color(255, 255, 255));
        HistoryUnselected.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        HistoryUnselected.setForeground(new java.awt.Color(255, 255, 255));
        HistoryUnselected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/History Tab unselected.png"))); // NOI18N
        HistoryUnselected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistoryUnselectedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HistoryUnselectedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HistoryUnselectedMouseExited(evt);
            }
        });
        getContentPane().add(HistoryUnselected, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 150, 40));

        IssueBookUnselected.setBackground(new java.awt.Color(255, 255, 255));
        IssueBookUnselected.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        IssueBookUnselected.setForeground(new java.awt.Color(255, 255, 255));
        IssueBookUnselected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Issue Books Tab unselected.png"))); // NOI18N
        IssueBookUnselected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IssueBookUnselectedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IssueBookUnselectedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IssueBookUnselectedMouseExited(evt);
            }
        });
        getContentPane().add(IssueBookUnselected, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 149, -1));

        AddNewBook.setBackground(new java.awt.Color(255, 255, 255));
        AddNewBook.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        AddNewBook.setForeground(new java.awt.Color(255, 255, 255));
        AddNewBook.setText("Book Directory");
        AddNewBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddNewBookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddNewBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddNewBookMouseExited(evt);
            }
        });
        getContentPane().add(AddNewBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 10, 120, 30));

        NumberOfBooksjLabel.setFont(new java.awt.Font("Century Gothic", 0, 32)); // NOI18N
        NumberOfBooksjLabel.setForeground(new java.awt.Color(255, 255, 255));
        NumberOfBooksjLabel.setText("00");
        getContentPane().add(NumberOfBooksjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, -1, 30));

        UnreturnedBooksLabel.setBackground(new java.awt.Color(255, 255, 255));
        UnreturnedBooksLabel.setFont(new java.awt.Font("Century Gothic", 0, 32)); // NOI18N
        UnreturnedBooksLabel.setForeground(new java.awt.Color(255, 255, 255));
        UnreturnedBooksLabel.setText("00");
        getContentPane().add(UnreturnedBooksLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 530, 50, 50));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Number of Books Availiable");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Number of Students");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, -1, 20));

        StudentTablesLabel.setBackground(new java.awt.Color(255, 255, 255));
        StudentTablesLabel.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        StudentTablesLabel.setForeground(new java.awt.Color(255, 255, 255));
        StudentTablesLabel.setText("Student Directory");
        StudentTablesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentTablesLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StudentTablesLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StudentTablesLabelMouseExited(evt);
            }
        });
        getContentPane().add(StudentTablesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 140, 30));

        NumberOfStudentjLabel.setFont(new java.awt.Font("Century Gothic", 0, 32)); // NOI18N
        NumberOfStudentjLabel.setForeground(new java.awt.Color(255, 255, 255));
        NumberOfStudentjLabel.setText("00");
        getContentPane().add(NumberOfStudentjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, -1, 30));

        TeachersIcon.setBackground(new java.awt.Color(255, 255, 255));
        TeachersIcon.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        TeachersIcon.setForeground(new java.awt.Color(255, 255, 255));
        TeachersIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Teachers Icon.png"))); // NOI18N
        TeachersIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TeachersIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TeachersIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TeachersIconMouseExited(evt);
            }
        });
        getContentPane().add(TeachersIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 40, -1));

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Database Icon.png"))); // NOI18N
        jLabel92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel92MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel92MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel92MouseExited(evt);
            }
        });
        getContentPane().add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 40, -1));

        IssueBooksSelected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Issue Books Tab selected.png"))); // NOI18N
        getContentPane().add(IssueBooksSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        CloseButtonX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/close but-01.png"))); // NOI18N
        CloseButtonX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonXMouseClicked(evt);
            }
        });
        getContentPane().add(CloseButtonX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, -1, 30));

        MinimiseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/min-01-01.png"))); // NOI18N
        MinimiseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimiseButtonMouseClicked(evt);
            }
        });
        getContentPane().add(MinimiseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1061, 0, 40, 30));

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Profile Icon.png"))); // NOI18N
        jLabel93.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel93MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel93MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel93MouseExited(evt);
            }
        });
        getContentPane().add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, -1, -1));

        BookDirectoryBarSelection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Bar Selection.png"))); // NOI18N
        getContentPane().add(BookDirectoryBarSelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 200, -1));

        ReceiveBooksSelected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Recieve Books Tab selecetd.png"))); // NOI18N
        getContentPane().add(ReceiveBooksSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        StudentDirectoryBarSelection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Bar Selection.png"))); // NOI18N
        getContentPane().add(StudentDirectoryBarSelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 200, -1));

        Profileslect.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        Profileslect.setForeground(new java.awt.Color(204, 204, 204));
        Profileslect.setText("  Profile");
        getContentPane().add(Profileslect, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 50, 20));

        Dataslect.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        Dataslect.setForeground(new java.awt.Color(204, 204, 204));
        Dataslect.setText("  Data");
        getContentPane().add(Dataslect, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 500, 40, 20));

        Teachersslect.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        Teachersslect.setForeground(new java.awt.Color(204, 204, 204));
        Teachersslect.setText("Teachers");
        getContentPane().add(Teachersslect, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 500, -1, 20));

        AddNewBookSelected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Add New Book Tab selected.png"))); // NOI18N
        getContentPane().add(AddNewBookSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        AddNewStudentSelected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Add New Student Tab Selected.png"))); // NOI18N
        getContentPane().add(AddNewStudentSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        IssuedListSelected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/Issued List Tab selcted.png"))); // NOI18N
        getContentPane().add(IssuedListSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        HistorySelected.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/History Tab Selected.png"))); // NOI18N
        getContentPane().add(HistorySelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, 40));

        MainJFrameCover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Novella/YMain/Images/FINAL JFRAME_MAIN.png"))); // NOI18N
        getContentPane().add(MainJFrameCover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Hidebar7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Hidebar7Layout = new javax.swing.GroupLayout(Hidebar7);
        Hidebar7.setLayout(Hidebar7Layout);
        Hidebar7Layout.setHorizontalGroup(
            Hidebar7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        Hidebar7Layout.setVerticalGroup(
            Hidebar7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(Hidebar7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 880, 40));

        Hidebar5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Hidebar5Layout = new javax.swing.GroupLayout(Hidebar5);
        Hidebar5.setLayout(Hidebar5Layout);
        Hidebar5Layout.setHorizontalGroup(
            Hidebar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        Hidebar5Layout.setVerticalGroup(
            Hidebar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(Hidebar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 50, 500));

        Hidebar6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Hidebar6Layout = new javax.swing.GroupLayout(Hidebar6);
        Hidebar6.setLayout(Hidebar6Layout);
        Hidebar6Layout.setHorizontalGroup(
            Hidebar6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        Hidebar6Layout.setVerticalGroup(
            Hidebar6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(Hidebar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 860, 60));

        Hidebar8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Hidebar8Layout = new javax.swing.GroupLayout(Hidebar8);
        Hidebar8.setLayout(Hidebar8Layout);
        Hidebar8Layout.setHorizontalGroup(
            Hidebar8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        Hidebar8Layout.setVerticalGroup(
            Hidebar8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        getContentPane().add(Hidebar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 80, 20, 450));

        setSize(new java.awt.Dimension(1129, 595));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
            /*StudentDirectoryBarSelection.setVisible(false);
            BookDirectoryBarSelection.setVisible(false);
            jLabel86.setVisible(false);
            IssueBookUnselected.setVisible(false);
            IssueBooksSelected.setVisible(true);
            jLabel94.setVisible(false);
            jLabel88.setVisible(false);*/
       
        try
        {
            //Connection to Novella Database
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            
            //Calling ResultSet to see if there is any products activated.SQL related
            ResultSet rs = st.executeQuery("select *from activationcodes");
            
            if (rs.next())
            {
             ActivationNo.setVisible(false);
             ActivationNotComplete.setVisible(false);
             
             String p = rs.getString(1);
             
             ActivationCode.setText(p);
             
             //Activation
             IssueBooksGrey_Out.setVisible(false);
             ReceiveBooksGrey_Out.setVisible(false);
             AddNewBookGrey_Out.setVisible(false);
             AddNewStudentGrey_Out.setVisible(false);
             IssuedListGrey_Out.setVisible(false);
             HistoryGrey_Out.setVisible(false);
             CurrentUsername.setVisible(false);
             Hide.setVisible(false);
             
             jLabel165.setVisible(false);
             
            }
            else
            {
                ActivationYes.setVisible(false);
                ActivationCompleted.setVisible(false);
                jLabel99.setVisible(false);
                jLabel165.setVisible(false);
                
                
                
                ActivationCode.setText("XXXX XXXX XXXX XXXX XXXX");
                
                //IF Not activated, Make these UnVisivble
                
                IssueBookUnselected.setVisible(false);
                IssueBooksSelected.setVisible(false);
                
                ReceiveBooksUnselected.setVisible(false);
                ReceiveBooksSelected.setVisible(false);
                
                AddNewBookUnselected.setVisible(false);
                AddNewBookSelected.setVisible(false);
                
                AddNewStudentUnselected.setVisible(false);
                AddNewStudentSelected.setVisible(false);
                
                IssuedListUnselected.setVisible(false);
                IssuedListSelected.setVisible(false);
                
                HistoryUnselected.setVisible(false);
                HistorySelected.setVisible(false);
                
                StudentTablesLabel.setVisible(false);
                AddNewBook.setVisible(false);
                 
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            //Refresh Begin
            ResultSet rs8 = st.executeQuery("select student.studentIndex AS 'Student Index',student.studentName AS 'Name',student.studentAddress AS 'Address',student.studentClass AS 'Grade',student.studentIsland AS 'Island',student.studentPhone AS 'Phone No' from student");
            StudentListTable.setModel(DbUtils.resultSetToTableModel(rs8));
            ResultSet bk = st.executeQuery("select books.ISBN,books.Title,books.DDC,books.Publisher,books.Subject,books.Author,books.Year,books.Pages,books.BookNumber AS 'Book No' from books");
            BooksListTable.setModel(DbUtils.resultSetToTableModel(bk));
            ResultSet rs5 = st.executeQuery("select issue.issueIndex,issue.issueName,issue.issueGrade,issue.issueISBN,issue.issueTitle,issue.issueAuthor,issue.issueDate,issue.issueExpire from issue");
            jTable3.setModel(DbUtils.resultSetToTableModel(rs5));
            ResultSet rs9 = st.executeQuery("select bookrs.bookrsIndex,bookrs.bookrsName,bookrs.bookrsGrade,bookrs.bookrsISBN,bookrs.bookrsTitle,bookrs.bookrsAuthor,bookrs.bookrsDate from bookrs");
            jTable4.setModel(DbUtils.resultSetToTableModel(rs9));
            
            //Profile stffs
            
            ResultSet pr = st.executeQuery("select *from admin");
            if(pr.next())
            {
            CurrentUsername.setText(pr.getString(3));
            CurrentPassword.setText(pr.getString(4));
            }
            
            String query = "select count(*) from books";
            ResultSet rs2 = st.executeQuery(query);
            //Refreshing Number of Books Label
            if (rs2.next())
            {
                int countbooks;
                countbooks = rs2.getInt(1);
                
                String p = rs2.getString(1);
                
                if(countbooks <= 9)
                {
                    NumberOfBooksjLabel.setText(0+p);
                }
                else
                {
                    NumberOfBooksjLabel.setText(p);
                }
                
                String quer = "select count(*) from student";
                ResultSet rs3 = st.executeQuery(quer);
                
                
                if (rs3.next())
                {
                    int countstudent;
                    countstudent = rs3.getInt(1);
                    
                    String q = rs3.getString(1);
                    
                    if(countstudent <= 9)
                    {
                       NumberOfStudentjLabel.setText(0+q); 
                       DashboardStudentsCount.setText(0+q);
                    }
                    else
                    {
                        NumberOfStudentjLabel.setText(q); 
                        DashboardStudentsCount.setText(q);
                    }
                    
                    String queri = "select count(*) from issue";
                    ResultSet rs4 = st.executeQuery(queri);
                    
                    if (rs4.next())
                    {
                        int countunreturnedbooks;
                        countunreturnedbooks = rs4.getInt(1);
                        
                        String county = rs4.getString(1);
                       
                        if(countunreturnedbooks <= 9)
                        {
                            UnreturnedBooksLabel.setText(0+county);
                        }
                        else
                        {
                            UnreturnedBooksLabel.setText(county);
                        }
                    }
                else
                {
                    JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Students");
                }  
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Books");
                
                new MainView().setVisible(true);
            } 
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    
    }//GEN-LAST:event_formComponentShown

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formComponentAdded

    private void TeachersIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeachersIconMouseExited
        // TODO add your handling code here:
        Teachersslect.setVisible(false);
    }//GEN-LAST:event_TeachersIconMouseExited

    private void TeachersIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeachersIconMouseEntered
        // TODO add your handling code here:
        try {
           for ( int i = 0; i <= 100; i++) 
               {
                Thread.sleep(1);
                   
                   if(i==100) 
                    {
                     Teachersslect.setVisible(true);
                    }
                }
           
               } catch (Exception e)              
                 {
                   JOptionPane.showMessageDialog(null, e);
                 } 
    }//GEN-LAST:event_TeachersIconMouseEntered

    private void TeachersIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeachersIconMouseClicked
        // TODO add your handling code here:
        IssueBookUnselected.setVisible(true);
        ReceiveBooksUnselected.setVisible(true);
        AddNewBookUnselected.setVisible(true);
        AddNewStudentUnselected.setVisible(true);
        IssuedListUnselected.setVisible(true);
        HistoryUnselected.setVisible(true);
        StudentDirectoryBarSelection.setVisible(false);
        BookDirectoryBarSelection.setVisible(false); 
        
        IssueBooksSelected.setVisible(false);
        ReceiveBooksSelected.setVisible(false);
        AddNewBookSelected.setVisible(false);
        AddNewStudentSelected.setVisible(false);
        IssuedListSelected.setVisible(false);
        HistorySelected.setVisible(false);
        
        
        jTabbedPane1.setSelectedComponent(Teachers);
    }//GEN-LAST:event_TeachersIconMouseClicked

    private void StudentTablesLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentTablesLabelMouseExited
        // TODO add your handling code here:
        StudentTablesLabel.setForeground(new java.awt.Color (255,255,255));
    }//GEN-LAST:event_StudentTablesLabelMouseExited

    private void StudentTablesLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentTablesLabelMouseEntered
        // TODO add your handling code here:
        StudentTablesLabel.setForeground(new java.awt.Color (183,227,234));
    }//GEN-LAST:event_StudentTablesLabelMouseEntered

    private void StudentTablesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentTablesLabelMouseClicked
        // TODO add your handling code here:
        IssueBookUnselected.setVisible(true);
        ReceiveBooksUnselected.setVisible(true);
        AddNewBookUnselected.setVisible(true);
        AddNewStudentUnselected.setVisible(true);
        IssuedListUnselected.setVisible(true);
        HistoryUnselected.setVisible(true);
        StudentDirectoryBarSelection.setVisible(true);
        BookDirectoryBarSelection.setVisible(false); 
        
        IssueBooksSelected.setVisible(false);
        ReceiveBooksSelected.setVisible(false);
        AddNewBookSelected.setVisible(false);
        AddNewStudentSelected.setVisible(false);
        IssuedListSelected.setVisible(false);
        HistorySelected.setVisible(false);
        
        jTabbedPane1.setSelectedComponent(StudentTables);
        
    }//GEN-LAST:event_StudentTablesLabelMouseClicked

    private void AddNewBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddNewBookMouseExited
        // TODO add your handling code here:
        AddNewBook.setForeground(new java.awt.Color (255,255,255));
    }//GEN-LAST:event_AddNewBookMouseExited

    private void AddNewBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddNewBookMouseEntered
        // TODO add your handling code here:
        AddNewBook.setForeground(new java.awt.Color (183,227,234));
    }//GEN-LAST:event_AddNewBookMouseEntered

    private void AddNewBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddNewBookMouseClicked
        // TODO add your handling code here:
        IssueBookUnselected.setVisible(true);
        ReceiveBooksUnselected.setVisible(true);
        AddNewBookUnselected.setVisible(true);
        AddNewStudentUnselected.setVisible(true);
        IssuedListUnselected.setVisible(true);
        HistoryUnselected.setVisible(true);
        StudentDirectoryBarSelection.setVisible(false);
        BookDirectoryBarSelection.setVisible(true); 
        
        IssueBooksSelected.setVisible(false);
        ReceiveBooksSelected.setVisible(false);
        AddNewBookSelected.setVisible(false);
        AddNewStudentSelected.setVisible(false);
        IssuedListSelected.setVisible(false);
        HistorySelected.setVisible(false);
        jTabbedPane1.setSelectedComponent(BookDirectory);
        

    }//GEN-LAST:event_AddNewBookMouseClicked

    private void IssueBookUnselectedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IssueBookUnselectedMouseExited
        // TODO add your handling code here:
        //IssueBooksSelected.setVisible(false);
        //IssueBook1.setVisible(true);
    }//GEN-LAST:event_IssueBookUnselectedMouseExited

    private void IssueBookUnselectedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IssueBookUnselectedMouseEntered
        // TODO add your handling code here:
        //IssueBook1.setVisible(false);
        //IssueBooksSelected.setVisible(true);
    }//GEN-LAST:event_IssueBookUnselectedMouseEntered

    private void IssueBookUnselectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IssueBookUnselectedMouseClicked
        // TODO add your handling code here:
        
        IssueBookUnselected.setVisible(false);
        ReceiveBooksUnselected.setVisible(true);
        AddNewBookUnselected.setVisible(true);
        AddNewStudentUnselected.setVisible(true);
        IssuedListUnselected.setVisible(true);
        HistoryUnselected.setVisible(true);
        StudentDirectoryBarSelection.setVisible(false);
        BookDirectoryBarSelection.setVisible(false); 
        
        IssueBooksSelected.setVisible(true);
        ReceiveBooksSelected.setVisible(false);
        AddNewBookSelected.setVisible(false);
        AddNewStudentSelected.setVisible(false);
        IssuedListSelected.setVisible(false);
        HistorySelected.setVisible(false);
        
        jTabbedPane1.setSelectedComponent(IssueBookjPanel);
    }//GEN-LAST:event_IssueBookUnselectedMouseClicked

    private void HistoryUnselectedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistoryUnselectedMouseExited
        // TODO add your handling code here:
        /*HistoryUnselected.setForeground(new java.awt.Color (255,255,255));
        HistoryEntered.setVisible(false);
        HistoryUnselected.setVisible(true);
        HistorySelected.setVisible(false);*/
        
    }//GEN-LAST:event_HistoryUnselectedMouseExited

    private void HistoryUnselectedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistoryUnselectedMouseEntered
        // TODO add your handling code here:
        /*HistoryUnselected.setForeground(new java.awt.Color (183,227,234));
        HistoryUnselected.setVisible(false);
        HistorySelected.setVisible(false);
        HistoryEntered.setVisible(true);*/
    }//GEN-LAST:event_HistoryUnselectedMouseEntered

    private void HistoryUnselectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistoryUnselectedMouseClicked
        // TODO add your handling code here:
        IssueBookUnselected.setVisible(true);
        ReceiveBooksUnselected.setVisible(true);
        AddNewBookUnselected.setVisible(true);
        AddNewStudentUnselected.setVisible(true);
        IssuedListUnselected.setVisible(true);
        HistoryUnselected.setVisible(false);
        StudentDirectoryBarSelection.setVisible(false);
        BookDirectoryBarSelection.setVisible(false);
        //HistoryEntered.setVisible(false);
        
        IssueBooksSelected.setVisible(false);
        ReceiveBooksSelected.setVisible(false);
        AddNewBookSelected.setVisible(false);
        AddNewStudentSelected.setVisible(false);
        IssuedListSelected.setVisible(false);
        HistorySelected.setVisible(true);
        
        jTabbedPane1.setSelectedComponent(History);
    }//GEN-LAST:event_HistoryUnselectedMouseClicked

    private void ReceiveBooksUnselectedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReceiveBooksUnselectedMouseExited
        // TODO add your handling code here:
        //IssueBook3.setForeground(new java.awt.Color (255,255,255));
        // jLabel98.setVisible(false);
        //IssueBook3.setVisible(true);
    }//GEN-LAST:event_ReceiveBooksUnselectedMouseExited

    private void ReceiveBooksUnselectedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReceiveBooksUnselectedMouseEntered
        // TODO add your handling code here:
        // IssueBook3.setForeground(new java.awt.Color (183,227,234));
        //IssueBook3.setVisible(false);
        // jLabel98.setVisible(true);
    }//GEN-LAST:event_ReceiveBooksUnselectedMouseEntered

    private void ReceiveBooksUnselectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReceiveBooksUnselectedMouseClicked
        // TODO add your handling code here:
        IssueBookUnselected.setVisible(true);
        ReceiveBooksUnselected.setVisible(false);
        AddNewBookUnselected.setVisible(true);
        AddNewStudentUnselected.setVisible(true);
        IssuedListUnselected.setVisible(true);
        HistoryUnselected.setVisible(true); 
        StudentDirectoryBarSelection.setVisible(false);
        BookDirectoryBarSelection.setVisible(false);
        
        IssueBooksSelected.setVisible(false);
        ReceiveBooksSelected.setVisible(true);
        AddNewBookSelected.setVisible(false);
        AddNewStudentSelected.setVisible(false);
        IssuedListSelected.setVisible(false);
        HistorySelected.setVisible(false);
        
        jTabbedPane1.setSelectedComponent(RecievejPanel);
        
        //Canceling everything else
        
    }//GEN-LAST:event_ReceiveBooksUnselectedMouseClicked

    private void AddNewBookUnselectedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddNewBookUnselectedMouseExited
        // TODO add your handling code here:
        //IssueBook4.setForeground(new java.awt.Color (255,255,255));
    }//GEN-LAST:event_AddNewBookUnselectedMouseExited

    private void AddNewBookUnselectedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddNewBookUnselectedMouseEntered
        // TODO add your handling code here:
        //IssueBook4.setForeground(new java.awt.Color (183,227,234));
    }//GEN-LAST:event_AddNewBookUnselectedMouseEntered

    private void AddNewBookUnselectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddNewBookUnselectedMouseClicked
        // TODO add your handling code here:
        //Cancelling Everthing Else
        IssueBookUnselected.setVisible(true);
        ReceiveBooksUnselected.setVisible(true);
        AddNewBookUnselected.setVisible(false);
        AddNewStudentUnselected.setVisible(true);
        IssuedListUnselected.setVisible(true);
        HistoryUnselected.setVisible(true);
        StudentDirectoryBarSelection.setVisible(false);
        BookDirectoryBarSelection.setVisible(false);
        
        IssueBooksSelected.setVisible(false);
        ReceiveBooksSelected.setVisible(false);
        AddNewBookSelected.setVisible(true);
        AddNewStudentSelected.setVisible(false);
        IssuedListSelected.setVisible(false);
        HistorySelected.setVisible(false);
        
        jTabbedPane1.setSelectedComponent(AddNewBookjPanel);
        
    }//GEN-LAST:event_AddNewBookUnselectedMouseClicked

    private void AddNewStudentUnselectedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddNewStudentUnselectedMouseExited
        // TODO add your handling code here:
        AddNewStudentUnselected.setForeground(new java.awt.Color (255,255,255));
    }//GEN-LAST:event_AddNewStudentUnselectedMouseExited

    private void AddNewStudentUnselectedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddNewStudentUnselectedMouseEntered
        // TODO add your handling code here:
        AddNewStudentUnselected.setForeground(new java.awt.Color (183,227,234));
    }//GEN-LAST:event_AddNewStudentUnselectedMouseEntered

    private void AddNewStudentUnselectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddNewStudentUnselectedMouseClicked
        // TODO add your handling code here:
        IssueBookUnselected.setVisible(true);
        ReceiveBooksUnselected.setVisible(true);
        AddNewBookUnselected.setVisible(true);
        AddNewStudentUnselected.setVisible(false);
        IssuedListUnselected.setVisible(true);
        HistoryUnselected.setVisible(true);
        StudentDirectoryBarSelection.setVisible(false);
        BookDirectoryBarSelection.setVisible(false);
        
        IssueBooksSelected.setVisible(false);
        ReceiveBooksSelected.setVisible(false);
        AddNewBookSelected.setVisible(false);
        AddNewStudentSelected.setVisible(true);
        IssuedListSelected.setVisible(false);
        HistorySelected.setVisible(false);
        
        jTabbedPane1.setSelectedComponent(AddNewStudentjPanel);
    }//GEN-LAST:event_AddNewStudentUnselectedMouseClicked

    private void IssuedListUnselectedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IssuedListUnselectedMouseExited
        // TODO add your handling code here:
        IssuedListUnselected.setForeground(new java.awt.Color (255,255,255));
    }//GEN-LAST:event_IssuedListUnselectedMouseExited

    private void IssuedListUnselectedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IssuedListUnselectedMouseEntered
        // TODO add your handling code here:
        IssuedListUnselected.setForeground(new java.awt.Color (183,227,234));
    }//GEN-LAST:event_IssuedListUnselectedMouseEntered

    private void IssuedListUnselectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IssuedListUnselectedMouseClicked
        // TODO add your handling code here:
        IssueBookUnselected.setVisible(true);
        ReceiveBooksUnselected.setVisible(true);
        AddNewBookUnselected.setVisible(true);
        AddNewStudentUnselected.setVisible(true);
        IssuedListUnselected.setVisible(false);
        HistoryUnselected.setVisible(true);
        StudentDirectoryBarSelection.setVisible(false);
        BookDirectoryBarSelection.setVisible(false);
        
        IssueBooksSelected.setVisible(false);
        ReceiveBooksSelected.setVisible(false);
        AddNewBookSelected.setVisible(false);
        AddNewStudentSelected.setVisible(false);
        IssuedListSelected.setVisible(true);
        HistorySelected.setVisible(false);

        jTabbedPane1.setSelectedComponent(IssuedBooksList);
    }//GEN-LAST:event_IssuedListUnselectedMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();

            st.executeUpdate("DELETE from bookrs");
            JOptionPane.showConfirmDialog(null, "Are you sure?");

            //Refresh
            ResultSet rs8 = st.executeQuery("select student.studentIndex AS 'Student Index',student.studentName AS 'Name',student.studentAddress AS 'Address',student.studentClass AS 'Grade',student.studentIsland AS 'Island',student.studentPhone AS 'Phone No' from student");
            StudentListTable.setModel(DbUtils.resultSetToTableModel(rs8));
            ResultSet bk = st.executeQuery("select books.ISBN,books.Title,books.DDC,books.Publisher,books.Subject,books.Author,books.Year,books.Pages,books.BookNumber AS 'Book No' from books");
            BooksListTable.setModel(DbUtils.resultSetToTableModel(bk));
            ResultSet rs5 = st.executeQuery("select issue.issueIndex,issue.issueName,issue.issueGrade,issue.issueISBN,issue.issueTitle,issue.issueAuthor,issue.issueDate,issue.issueExpire from issue");
            jTable3.setModel(DbUtils.resultSetToTableModel(rs5));
            ResultSet rs9 = st.executeQuery("select bookrs.bookrsIndex,bookrs.bookrsName,bookrs.bookrsGrade,bookrs.bookrsISBN,bookrs.bookrsTitle,bookrs.bookrsAuthor,bookrs.bookrsDate from bookrs");
            jTable4.setModel(DbUtils.resultSetToTableModel(rs9));

            String query = "select count(*) from books";
            ResultSet rs2 = st.executeQuery(query);
            //Refreshing Number of Books Label
            if (rs2.next())
            {
                int countbooks;
                countbooks = rs2.getInt(1);

                String p = rs2.getString(1);

                if(countbooks <= 9)
                {
                    NumberOfBooksjLabel.setText(0+p);
                }
                else
                {
                    NumberOfBooksjLabel.setText(p);
                }

                String quer = "select count(*) from student";
                ResultSet rs3 = st.executeQuery(quer);

                if (rs3.next())
                {
                    int countstudent;
                    countstudent = rs3.getInt(1);

                    String q = rs3.getString(1);

                    if(countstudent <= 9)
                    {
                        NumberOfStudentjLabel.setText(0+q);
                    }
                    else
                    {
                        NumberOfStudentjLabel.setText(q);
                    }

                    String queri = "select count(*) from issue";
                    ResultSet rs4 = st.executeQuery(queri);

                    if (rs4.next())
                    {
                        int countunreturnedbooks;
                        countunreturnedbooks = rs4.getInt(1);

                        String county = rs4.getString(1);

                        if(countunreturnedbooks <= 9)
                        {
                            UnreturnedBooksLabel.setText(0+county);
                        }
                        else
                        {
                            UnreturnedBooksLabel.setText(county);
                        }

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Students");
                    }

                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Books");

                    new MainView().setVisible(true);
                }
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        String ISBN = jISBN.getText();
        String Title = jTitle.getText();
        String DDC = jDDC.getText();
        String Publisher = jPublisher.getText();
        String Subject = jSubject.getText();
        //String Date = jDate.getDateFormatString();
        String Author = jAuthor.getText();
        //String Edition = jEdition.getText();
        //String Vol = jVol.getText();
        String Year = jYear.getText();
        String Pages = jPages.getText();
        //String BookAvlAmount = jLocation.getText();
        String BookNumber = jBookNumber.getText();

        //MainView b = new MainView();

        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into books values('"+ISBN+"','"+Title+"','"+DDC+"','"+Publisher+"','"+Subject+"','"+Author+"','"+Year+"','"+Pages+"','"+BookNumber+"')");
            new Success().setVisible(true);
            
            //this.dispose();
            //b.setVisible(true);
            //Refresh Begin
            ResultSet rs8 = st.executeQuery("select student.studentIndex AS 'Student Index',student.studentName AS 'Name',student.studentAddress AS 'Address',student.studentClass AS 'Grade',student.studentIsland AS 'Island',student.studentPhone AS 'Phone No' from student");
            StudentListTable.setModel(DbUtils.resultSetToTableModel(rs8));
            ResultSet bk = st.executeQuery("select books.ISBN,books.Title,books.DDC,books.Publisher,books.Subject,books.Author,books.Year,books.Pages,books.BookNumber AS 'Book No' from books");
            BooksListTable.setModel(DbUtils.resultSetToTableModel(bk));
            ResultSet rs5 = st.executeQuery("select issue.issueIndex,issue.issueName,issue.issueGrade,issue.issueISBN,issue.issueTitle,issue.issueAuthor,issue.issueDate,issue.issueExpire from issue");
            jTable3.setModel(DbUtils.resultSetToTableModel(rs5));
            ResultSet rs9 = st.executeQuery("select bookrs.bookrsIndex,bookrs.bookrsName,bookrs.bookrsGrade,bookrs.bookrsISBN,bookrs.bookrsTitle,bookrs.bookrsAuthor,bookrs.bookrsDate from bookrs");
            jTable4.setModel(DbUtils.resultSetToTableModel(rs9));

            String query = "select count(*) from books";
            ResultSet rs2 = st.executeQuery(query);
            //Refreshing Number of Books Label
            if (rs2.next())
            {
                int countbooks;
                countbooks = rs2.getInt(1);

                String p = rs2.getString(1);

                if(countbooks <= 9)
                {
                    NumberOfBooksjLabel.setText(0+p);
                }
                else
                {
                    NumberOfBooksjLabel.setText(p);
                }

                String quer = "select count(*) from student";
                ResultSet rs3 = st.executeQuery(quer);

                if (rs3.next())
                {
                    int countstudent;
                    countstudent = rs3.getInt(1);

                    String q = rs3.getString(1);

                    if(countstudent <= 9)
                    {
                        NumberOfStudentjLabel.setText(0+q);
                    }
                    else
                    {
                        NumberOfStudentjLabel.setText(q);

                    }

                    String queri = "select count(*) from issue";
                    ResultSet rs4 = st.executeQuery(queri);

                    if (rs4.next())
                    {
                        int countunreturnedbooks;
                        countunreturnedbooks = rs4.getInt(1);

                        String county = rs4.getString(1);

                        if(countunreturnedbooks <= 9)
                        {
                            UnreturnedBooksLabel.setText(0+county);
                        }
                        else
                        {
                            UnreturnedBooksLabel.setText(county);
                        }

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Students");
                    }

                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Books");

                    new MainView().setVisible(true);
                }
            }

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            this.setVisible(false);
            new MainView().setVisible(true);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseClicked
        // TODO add your handling code here:
        String studentIndex = studentIndexjField.getText();
        String studentName = studentNamejField.getText();
        String studentClass = (String)jComboBox1.getSelectedItem();
        String studentAddress = studentAddressjField.getText();
        String studentIsland = studentIslandjField.getText();
        String studentPhone = studentPhonejField.getText();
        //MainView b = new MainView();

        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into student values('"+studentIndex+"','"+studentName+"','"+studentAddress+"','"+studentIsland+"','"+studentClass+"','"+studentPhone+"')");
            new Success().setVisible(true);
            

            //Refresh Begin
            ResultSet rs8 = st.executeQuery("select student.studentIndex AS 'Student Index',student.studentName AS 'Name',student.studentAddress AS 'Address',student.studentClass AS 'Grade',student.studentIsland AS 'Island',student.studentPhone AS 'Phone No' from student");
            StudentListTable.setModel(DbUtils.resultSetToTableModel(rs8));
            ResultSet bk = st.executeQuery("select books.ISBN,books.Title,books.DDC,books.Publisher,books.Subject,books.Author,books.Year,books.Pages,books.BookNumber AS 'Book No' from books");
            BooksListTable.setModel(DbUtils.resultSetToTableModel(bk));
            ResultSet rs5 = st.executeQuery("select issue.issueIndex,issue.issueName,issue.issueGrade,issue.issueISBN,issue.issueTitle,issue.issueAuthor,issue.issueDate,issue.issueExpire from issue");
            jTable3.setModel(DbUtils.resultSetToTableModel(rs5));
            ResultSet rs9 = st.executeQuery("select bookrs.bookrsIndex,bookrs.bookrsName,bookrs.bookrsGrade,bookrs.bookrsISBN,bookrs.bookrsTitle,bookrs.bookrsAuthor,bookrs.bookrsDate from bookrs");
            jTable4.setModel(DbUtils.resultSetToTableModel(rs9));

            String query = "select count(*) from books";
            ResultSet rs2 = st.executeQuery(query);
            //Refreshing Number of Books Label
            if (rs2.next())
            {
                int countbooks;
                countbooks = rs2.getInt(1);

                String p = rs2.getString(1);

                if(countbooks <= 9)
                {
                    NumberOfBooksjLabel.setText(0+p);
                }
                else
                {
                    NumberOfBooksjLabel.setText(p);
                }

                String quer = "select count(*) from student";
                ResultSet rs3 = st.executeQuery(quer);

                if (rs3.next())
                {
                    int countstudent;
                    countstudent = rs3.getInt(1);

                    String q = rs3.getString(1);

                    if(countstudent <= 9)
                    {
                        NumberOfStudentjLabel.setText(0+q);
                    }
                    else
                    {
                        NumberOfStudentjLabel.setText(q);

                    }

                    String queri = "select count(*) from issue";
                    ResultSet rs4 = st.executeQuery(queri);

                    if (rs4.next())
                    {
                        int countunreturnedbooks;
                        countunreturnedbooks = rs4.getInt(1);

                        String county = rs4.getString(1);

                        if(countunreturnedbooks <= 9)
                        {
                            UnreturnedBooksLabel.setText(0+county);
                        }
                        else
                        {
                            UnreturnedBooksLabel.setText(county);
                        }

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Students");
                    }

                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Books");

                    new MainView().setVisible(true);
                }

                //Erasing Current Values
                studentIndexjField.setText(null);
                studentNamejField.setText(null);
                jComboBox1.setSelectedItem(0);
                studentAddressjField.setText(null);
                //studentIslandjField.setText(null);
                studentPhonejField.setText(null);

            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel80MouseClicked

    private void studentNamejFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNamejFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentNamejFieldActionPerformed

    private void studentIndexjFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIndexjFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIndexjFieldActionPerformed

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked
        // TODO add your handling code here:
        String studentIndex = indexNameget.getText();

        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from student where studentIndex='"+studentIndex+"'");
            if(rs.next())
            {
                ResultSet list = st.executeQuery("select student.studentIndex AS 'Student Index',student.studentName AS 'Name',student.studentAddress AS 'Address',student.studentClass AS 'Grade',student.studentIsland AS 'Island',student.studentPhone AS 'Phone No' from student where studentIndex = '"+studentIndex+"'");
                StudentListTable.setModel(DbUtils.resultSetToTableModel(list));
            }
            else
            {

            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel71MouseClicked

    private void BooksListTableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BooksListTableComponentShown
        // TODO add your handling code here:

    }//GEN-LAST:event_BooksListTableComponentShown

    private void BooksListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksListTableMouseClicked
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel)BooksListTable.getModel();
        int selectedRowIndex = BooksListTable.getSelectedRow();

        CurrentlySelected1.setText(model.getValueAt(selectedRowIndex, 1).toString());

    }//GEN-LAST:event_BooksListTableMouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
        // TODO add your handling code here:
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");

        String bookrsName = returnNameget.getText();
        String bookrsTitle = returnBookget.getText();
        String bookrsIndex = returnIndexget.getText();
        String bookrsGrade = returnGradeget.getText();
        String bookrsAuthor = returnAuthorget.getText();
        String bookrsISBN = returnISBNget.getText();
        String bookrsDate = dFormat.format (returnDateget.getDate());

        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            Statement st2 = con.createStatement();

            st2.executeUpdate("insert into bookrs values('"+bookrsIndex+"','"+bookrsName+"','"+bookrsGrade+"','"+bookrsISBN+"','"+bookrsTitle+"','"+bookrsAuthor+"','"+bookrsDate+"')");

            st.executeUpdate("DELETE FROM issue where issueIndex='"+bookrsIndex+"' and issueTitle='"+bookrsTitle+"'");

            //st.executeUpdate("DELETE FROM bookrs where bookrsTitle='"+bookrsTitle+"'");

            Success a = new Success();
            
            a.setVisible(true);
            
            a.jLabel2.setLocation(70, 60);
            
            a.jLabel2.setText("Successfully Returned");
            
            
            //this.setVisible(false);
            //new MainView().setVisible(true);
            returnNameget.setText(null);
            returnBookget.setText(null);
            //returnIndexget.setText(null);
            returnGradeget.setText(null);
            returnAuthorget.setText(null);
            returnISBNget.setText(null);
            //returnDateget.setDate(null);

            //Refresh Begin
            ResultSet rs8 = st.executeQuery("select student.studentIndex AS 'Student Index',student.studentName AS 'Name',student.studentAddress AS 'Address',student.studentClass AS 'Grade',student.studentIsland AS 'Island',student.studentPhone AS 'Phone No' from student");
            StudentListTable.setModel(DbUtils.resultSetToTableModel(rs8));
            ResultSet bk = st.executeQuery("select books.ISBN,books.Title,books.DDC,books.Publisher,books.Subject,books.Author,books.Year,books.Pages,books.BookNumber AS 'Book No' from books");
            BooksListTable.setModel(DbUtils.resultSetToTableModel(bk));
            ResultSet rs5 = st.executeQuery("select issue.issueIndex,issue.issueName,issue.issueGrade,issue.issueISBN,issue.issueTitle,issue.issueAuthor,issue.issueDate,issue.issueExpire from issue");
            jTable3.setModel(DbUtils.resultSetToTableModel(rs5));
            ResultSet rs9 = st.executeQuery("select bookrs.bookrsIndex,bookrs.bookrsName,bookrs.bookrsGrade,bookrs.bookrsISBN,bookrs.bookrsTitle,bookrs.bookrsAuthor,bookrs.bookrsDate from bookrs");
            jTable4.setModel(DbUtils.resultSetToTableModel(rs9));
            ResultSet rs7 =st.executeQuery("select issue.issueIndex AS 'Student Index',issue.issueName AS 'Name',issue.issueGrade AS 'Grade',issue.issueISBN AS 'ISBN',issue.issueTitle AS 'Title',issue.issueAuthor AS 'Author',issue.issueDate AS 'Date Issued' from issue where issueIndex='"+returnIndexget+"'");
            jTable5.setModel(DbUtils.resultSetToTableModel(rs7));

            String query = "select count(*) from books";
            ResultSet rs2 = st.executeQuery(query);
            //Refreshing Number of Books Label
            if (rs2.next())
            {
                int countbooks;
                countbooks = rs2.getInt(1);

                String p = rs2.getString(1);

                if(countbooks <= 9)
                {
                    NumberOfBooksjLabel.setText(0+p);
                }
                else
                {
                    NumberOfBooksjLabel.setText(p);
                }

                String quer = "select count(*) from student";
                ResultSet rs3 = st.executeQuery(quer);

                if (rs3.next())
                {
                    int countstudent;
                    countstudent = rs3.getInt(1);

                    String q = rs3.getString(1);

                    if(countstudent <= 9)
                    {
                        NumberOfStudentjLabel.setText(0+q);
                    }
                    else
                    {
                        NumberOfStudentjLabel.setText(q);

                    }

                    String queri = "select count(*) from issue";
                    ResultSet rs4 = st.executeQuery(queri);

                    if (rs4.next())
                    {
                        int countunreturnedbooks;
                        countunreturnedbooks = rs4.getInt(1);

                        String county = rs4.getString(1);

                        if(countunreturnedbooks <= 9)
                        {
                            UnreturnedBooksLabel.setText(0+county);
                        }
                        else
                        {
                            UnreturnedBooksLabel.setText(county);
                        }

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Students");
                    }

                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Books");

                    new MainView().setVisible(true);
                }
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        // TODO add your handling code here:
        String returnIndex = returnIndexget.getText();

        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from issue where issueIndex='"+returnIndex+"'");
            if(rs.next())
            {
                //ResultSet rs2 =st.executeQuery("select bookrs.bookrsIndex AS 'Student Index',bookrs.bookrsName AS 'Name',bookrs.bookrsGrade AS 'Grade',bookrs.bookrsISBN AS 'ISBN',bookrs.bookrsTitle AS 'Title',bookrs.bookrsAuthor AS 'Author',bookrs.bookrsDate AS 'Date Issued' from bookrs where bookrs.bookrsIndex='"+returnIndex+"'");
                ResultSet rs2 =st.executeQuery("select issue.issueIndex AS 'Student Index',issue.issueName AS 'Name',issue.issueGrade AS 'Grade',issue.issueISBN AS 'ISBN',issue.issueTitle AS 'Title',issue.issueAuthor AS 'Author',issue.issueDate AS 'Date Issued' from issue where issueIndex='"+returnIndex+"'");
                jTable5.setModel(DbUtils.resultSetToTableModel(rs2));
            }
            else
            {

            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jTable5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable5KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable5KeyPressed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable5.getModel();
        int selectedRowIndex = jTable5.getSelectedRow();

        returnNameget.setText(model.getValueAt(selectedRowIndex, 1).toString());
        returnGradeget.setText(model.getValueAt(selectedRowIndex, 2).toString());
        returnISBNget.setText(model.getValueAt(selectedRowIndex, 3).toString());
        returnBookget.setText(model.getValueAt(selectedRowIndex, 4).toString());
        returnAuthorget.setText(model.getValueAt(selectedRowIndex, 5).toString());

    }//GEN-LAST:event_jTable5MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        // TODO add your handling code here:
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        String issueIndex = IndexSearchField.getText();
        String issueName = StudentNameget.getText();
        String issueGrade = StudentGradeget.getText();
        String issueISBN = ISBNSearchField.getText();
        String issueTitle = BookTitleget.getText();
        String issueAuthor = BookAuthorget.getText();
        String issueDate = dFormat.format (issueBookDateget.getDate());
        String issueExpire = dFormat.format (expireBookDateget.getDate());

        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from books where ISBN = '"+issueISBN+"'");
            if(issueIndex.matches(""))
            {
                JOptionPane.showMessageDialog(null, "Enter an Index");
            }
            else if(rs.next())
            {

                ResultSet rsl = st.executeQuery("select *from student where studentIndex = '"+issueIndex+"'");
                if(rsl.next())
                {

                    st.executeUpdate("insert into issue values('"+issueIndex+"','"+issueName+"','"+issueGrade+"','"+issueISBN+"','"+issueTitle+"','"+issueAuthor+"','"+issueDate+"','"+issueExpire+"')");

                    
                   
                    Success b = new Success();
                    b.setVisible(true);
                    b.jLabel2.setText("Successfully Issued");
                    
                    IndexSearchField.setText(null);
                    StudentNameget.setText(null);
                    StudentGradeget.setText(null);
                    ISBNSearchField.setText(null);
                    BookTitleget.setText(null);
                    BookAuthorget.setText(null);
                    issueBookDateget.setDate(null);
                    StudentGradeget.setText(null);

                    //this.setVisible(false);
                    //new MainView().setVisible(true);
                    //Refresh Begin
                    ResultSet rs8 = st.executeQuery("select student.studentIndex AS 'Student Index',student.studentName AS 'Name',student.studentAddress AS 'Address',student.studentClass AS 'Grade',student.studentIsland AS 'Island',student.studentPhone AS 'Phone No' from student");
                    StudentListTable.setModel(DbUtils.resultSetToTableModel(rs8));
                    ResultSet bk = st.executeQuery("select books.ISBN,books.Title,books.DDC,books.Publisher,books.Subject,books.Author,books.Year,books.Pages,books.BookNumber AS 'Book No' from books");
                    BooksListTable.setModel(DbUtils.resultSetToTableModel(bk));
                    ResultSet rs5 = st.executeQuery("select issue.issueIndex,issue.issueName,issue.issueGrade,issue.issueISBN,issue.issueTitle,issue.issueAuthor,issue.issueDate,issue.issueExpire from issue");
                    jTable3.setModel(DbUtils.resultSetToTableModel(rs5));
                    ResultSet rs9 = st.executeQuery("select bookrs.bookrsIndex,bookrs.bookrsName,bookrs.bookrsGrade,bookrs.bookrsISBN,bookrs.bookrsTitle,bookrs.bookrsAuthor,bookrs.bookrsDate from bookrs");
                    jTable4.setModel(DbUtils.resultSetToTableModel(rs9));

                    String query = "select count(*) from books";
                    ResultSet rs2 = st.executeQuery(query);
                    //Refreshing Number of Books Label
                    if (rs2.next())
                    {
                        int countbooks;
                        countbooks = rs2.getInt(1);

                        String p = rs2.getString(1);

                        if(countbooks <= 9)
                        {
                            NumberOfBooksjLabel.setText(0+p);
                        }
                        else
                        {
                            NumberOfBooksjLabel.setText(p);
                        }

                        String quer = "select count(*) from student";
                        ResultSet rs3 = st.executeQuery(quer);

                        if (rs3.next())
                        {
                            int countstudent;
                            countstudent = rs3.getInt(1);

                            String q = rs3.getString(1);

                            if(countstudent <= 9)
                            {
                                NumberOfStudentjLabel.setText(0+q);
                            }
                            else
                            {
                                NumberOfStudentjLabel.setText(q);

                            }

                            String queri = "select count(*) from issue";
                            ResultSet rs4 = st.executeQuery(queri);

                            if (rs4.next())
                            {
                                int countunreturnedbooks;
                                countunreturnedbooks = rs4.getInt(1);

                                String county = rs4.getString(1);

                                if(countunreturnedbooks <= 9)
                                {
                                    UnreturnedBooksLabel.setText(0+county);
                                }
                                else
                                {
                                    UnreturnedBooksLabel.setText(county);
                                }

                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Students");
                            }

                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Books");

                            new MainView().setVisible(true);
                        }
                    }
                }
                else
                JOptionPane.showConfirmDialog(null, "Incorrect Student Index");
            }
            else
            JOptionPane.showConfirmDialog(null, "Incorrect Book ISBN Number");

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        String INDEXSearch = IndexSearchField.getText();

        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select *from student where studentIndex='"+INDEXSearch+"'");

            if(INDEXSearch.matches(""))
            {
                new ErrorBoxInsertStudentIndex().setVisible(true);

            }
            else if (rs.next())
            {
                StudentNameget.setText(rs.getString(2));
                StudentGradeget.setText(rs.getString(5));

            }
            else
            {
                ResultSet rs3 = st.executeQuery("select count(*) from student where studentIndex='"+INDEXSearch+"'");
                if(rs3.next())
                {
                    JOptionPane.showMessageDialog(null, "This Student Index hasn't been saved in the database yet.");
                    IndexSearchField.setText(null);
                }
                //JOptionPane.showMessageDialog(null, "Failed to retrieve student Index form Database");

            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e );
            this.setVisible(false);
            new MainView().setVisible(true);
        }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // TODO add your handling code here:
        String ISBNSearch = ISBNSearchField.getText();

        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select *from books where ISBN='"+ISBNSearch+"'");
            if (ISBNSearch.matches(""))
            {
                JOptionPane.showMessageDialog(null, "Insert an ISBN Number");
            }
            else if (rs.next())
            {
                BookTitleget.setText(rs.getString(2));
                BookAuthorget.setText(rs.getString(6));

            }
            else
            {
                ResultSet rs3 = st.executeQuery("select count(*) from books where ISBN = '"+ISBNSearch+"'");
                //JOptionPane.showMessageDialog(null, "Failed to retrieve book ISBN form Database");
                if (rs3.next())
                {
                    JOptionPane.showMessageDialog(null, "the ISBN hasn't been entered to the databse");
                    ISBNSearchField.setText(null);
                }

            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e );
            this.dispose();
            new MainView().setVisible(true);
        }
    }//GEN-LAST:event_jLabel33MouseClicked

    private void BookAuthorgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookAuthorgetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookAuthorgetActionPerformed

    private void BookTitlegetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookTitlegetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookTitlegetActionPerformed

    private void ISBNSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISBNSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ISBNSearchFieldActionPerformed

    private void StudentNamegetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentNamegetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentNamegetActionPerformed

    private void StudentGradegetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentGradegetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentGradegetActionPerformed

    private void IndexSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndexSearchFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_IndexSearchFieldActionPerformed

    private void CloseButtonXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonXMouseClicked
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_CloseButtonXMouseClicked

    private void jLabel87MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel87MouseClicked
        // TODO add your handling code here:
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs8 = st.executeQuery("select student.studentIndex AS 'Student Index',student.studentName AS 'Name',student.studentAddress AS 'Address',student.studentClass AS 'Grade',student.studentIsland AS 'Island',student.studentPhone AS 'Phone No' from student");
            StudentListTable.setModel(DbUtils.resultSetToTableModel(rs8));
            
            indexNameget.setText("Search by Index...");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
            
               
        
    }//GEN-LAST:event_jLabel87MouseClicked

    private void MinimiseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimiseButtonMouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_MinimiseButtonMouseClicked

    private void jLabel90MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel90MouseClicked
        // TODO add your handling code here:
        String bookTitle = bookNameget.getText();
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("select *from books where Title='"+bookTitle+"'");
            if(rs.next())
            {
                ResultSet list = st.executeQuery("select books.ISBN,books.Title,books.DDC,books.Publisher,books.Subject,books.Author,books.Year,books.Pages,books.BookNumber AS 'Book No' from books where Title = '"+bookTitle+"'");
                BooksListTable.setModel(DbUtils.resultSetToTableModel(list));
            }
            else
            {
               JOptionPane.showMessageDialog(null, "This book has'nt been entered to the database yet");
               bookNameget.setText(null);
            }
              
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel90MouseClicked

    private void jLabel91MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel91MouseClicked
        // TODO add your handling code here:
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            
            ResultSet bk = st.executeQuery("select books.ISBN,books.Title,books.DDC,books.Publisher,books.Subject,books.Author,books.Year,books.Pages,books.BookNumber AS 'Book No' from books");
            BooksListTable.setModel(DbUtils.resultSetToTableModel(bk));
            bookNameget.setText(null);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel91MouseClicked

    private void jLabel93MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel93MouseClicked
        // TODO add your handling code here:
       
        try
        {
            Connection con =ConnectionProvider.getCon();
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("select *from activationcodes");
            
            if (rs.next())
                    {
                IssueBookUnselected.setVisible(true);
        ReceiveBooksUnselected.setVisible(true);
        AddNewBookUnselected.setVisible(true);
        AddNewStudentUnselected.setVisible(true);
        IssuedListUnselected.setVisible(true);
        HistoryUnselected.setVisible(true);
        StudentDirectoryBarSelection.setVisible(false);
        BookDirectoryBarSelection.setVisible(false); 
        
        IssueBooksSelected.setVisible(false);
        ReceiveBooksSelected.setVisible(false);
        AddNewBookSelected.setVisible(false);
        AddNewStudentSelected.setVisible(false);
        IssuedListSelected.setVisible(false);
        HistorySelected.setVisible(false);
        jTabbedPane1.setSelectedComponent(Profile);
                    }
            else
            {
                IssueBookUnselected.setVisible(false);
                IssueBooksSelected.setVisible(false);
                
                ReceiveBooksUnselected.setVisible(false);
                ReceiveBooksSelected.setVisible(false);
                
                AddNewBookUnselected.setVisible(false);
                AddNewBookSelected.setVisible(false);
                
                AddNewStudentUnselected.setVisible(false);
                AddNewStudentSelected.setVisible(false);
                
                IssuedListUnselected.setVisible(false);
                IssuedListSelected.setVisible(false);
                
                HistoryUnselected.setVisible(false);
                HistorySelected.setVisible(false);
                
                StudentTablesLabel.setVisible(false);
                AddNewBook.setVisible(false);
                
                jTabbedPane1.setSelectedComponent(Profile);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        
    }//GEN-LAST:event_jLabel93MouseClicked

    private void jLabel92MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel92MouseEntered
        // TODO add your handling code here:
        try {
           for ( int i = 0; i <= 100; i++) 
               {
                Thread.sleep(1);
                   
                   if(i==100) 
                    {
                     Dataslect.setVisible(true);
                    }
                }
           
               } catch (Exception e)              
                 {
                   JOptionPane.showMessageDialog(null, e);
                 }
    }//GEN-LAST:event_jLabel92MouseEntered

    private void jLabel93MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel93MouseEntered
        // TODO add your handling code here:
        try {
           for ( int i = 0; i <= 100; i++) 
               {
                Thread.sleep(1);
                   
                   if(i==100) 
                    {
                     Profileslect.setVisible(true);
                    }
                }
           
               } catch (Exception e)              
                 {
                   JOptionPane.showMessageDialog(null, e);
                 }
    }//GEN-LAST:event_jLabel93MouseEntered

    private void jLabel92MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel92MouseExited
        // TODO add your handling code here:
        Dataslect.setVisible(false);
    }//GEN-LAST:event_jLabel92MouseExited

    private void jLabel93MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel93MouseExited
        // TODO add your handling code here:
        Profileslect.setVisible(false);
    }//GEN-LAST:event_jLabel93MouseExited

    private void ActivationNotCompleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActivationNotCompleteMouseClicked
        // TODO add your handling code here:
        String code = ActivationCode.getText();
        
        try
        {
            Connection con = ActivationProvider.getCon();
            Statement st = con.createStatement();
            Connection con2 = ConnectionProvider.getCon();
            Statement st2 = con2.createStatement();
            ResultSet rs = st.executeQuery("select *from activationcodes where code='"+code+"'");
            if (rs.next())
            {
               
               
               ActivationNo.setVisible(false);
               ActivationYes.setVisible(true);
               ActivationNotComplete.setVisible(false);
               ActivationCompleted.setVisible(true);
               jLabel99.setVisible(true);
               
               st2.executeUpdate("insert into activationcodes values('"+code+"')");
               
               JOptionPane.showMessageDialog(null, "Thank you for Activating Novella, all the functions are visible now");
               //Activation
             IssueBooksGrey_Out.setVisible(false);
             ReceiveBooksGrey_Out.setVisible(false);
             AddNewBookGrey_Out.setVisible(false);
             AddNewStudentGrey_Out.setVisible(false);
             IssuedListGrey_Out.setVisible(false);
             HistoryGrey_Out.setVisible(false);
             
             IssueBookUnselected.setVisible(true);
                IssueBooksSelected.setVisible(true);
                
                ReceiveBooksUnselected.setVisible(true);
                ReceiveBooksSelected.setVisible(true);
                
                AddNewBookUnselected.setVisible(true);
                AddNewBookSelected.setVisible(true);
                
                AddNewStudentUnselected.setVisible(true);
                AddNewStudentSelected.setVisible(true);
                
                IssuedListUnselected.setVisible(true);
                IssuedListSelected.setVisible(true);
                
                HistoryUnselected.setVisible(true);
                HistorySelected.setVisible(true);
                
                StudentTablesLabel.setVisible(true);
                AddNewBook.setVisible(true);
             
             
            }
            else if (code.matches(""))
            {
                JOptionPane.showMessageDialog(null,"");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_ActivationNotCompleteMouseClicked

    private void jLabel92MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel92MouseClicked
        
        JOptionPane.showConfirmDialog(null, "Altering with the database can cause"
                + "Unexpected Behaviour in the Application");
        
        try {
            Desktop.getDesktop().browse(new URL("http://127.0.0.1/phpmyadmin/db_structure.php?server=1&db=novelladatabase").toURI());
        } catch (MalformedURLException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jLabel92MouseClicked

    private void jLabel95MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel95MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "This Feature will be Availaible soon" );
    }//GEN-LAST:event_jLabel95MouseClicked

    private void StudentListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentListTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)StudentListTable.getModel();
        int selectedRowIndex = StudentListTable.getSelectedRow();

        CurrentlySelected.setText(model.getValueAt(selectedRowIndex, 1).toString());
    }//GEN-LAST:event_StudentListTableMouseClicked

    private void jLabel101MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel101MouseClicked
        // TODO add your handling code here:
        String studentName = CurrentlySelected.getText();
        try
        {
            Connection com = ConnectionProvider.getCon();
            Statement st = com.createStatement();
            
            st.executeUpdate("DELETE from student where studentName = '"+studentName+"'");
            
            JOptionPane.showMessageDialog(null, "Delete Successful");
            
            //Refresh Begin
            ResultSet rs8 = st.executeQuery("select student.studentIndex AS 'Student Index',student.studentName AS 'Name',student.studentAddress AS 'Address',student.studentClass AS 'Grade',student.studentIsland AS 'Island',student.studentPhone AS 'Phone No' from student");
            StudentListTable.setModel(DbUtils.resultSetToTableModel(rs8));
            ResultSet bk = st.executeQuery("select books.ISBN,books.Title,books.DDC,books.Publisher,books.Subject,books.Author,books.Year,books.Pages,books.BookNumber AS 'Book No' from books");
            BooksListTable.setModel(DbUtils.resultSetToTableModel(bk));
            ResultSet rs5 = st.executeQuery("select issue.issueIndex,issue.issueName,issue.issueGrade,issue.issueISBN,issue.issueTitle,issue.issueAuthor,issue.issueDate,issue.issueExpire from issue");
            jTable3.setModel(DbUtils.resultSetToTableModel(rs5));
            ResultSet rs9 = st.executeQuery("select bookrs.bookrsIndex,bookrs.bookrsName,bookrs.bookrsGrade,bookrs.bookrsISBN,bookrs.bookrsTitle,bookrs.bookrsAuthor,bookrs.bookrsDate from bookrs");
            jTable4.setModel(DbUtils.resultSetToTableModel(rs9));
            
            
            
            
            String query = "select count(*) from books";
            ResultSet rs2 = st.executeQuery(query);
            //Refreshing Number of Books Label
            if (rs2.next())
            {
                int countbooks;
                countbooks = rs2.getInt(1);
                
                String p = rs2.getString(1);
                
                if(countbooks <= 9)
                {
                    NumberOfBooksjLabel.setText(0+p);
                }
                else
                {
                    NumberOfBooksjLabel.setText(p);
                }
                
                String quer = "select count(*) from student";
                ResultSet rs3 = st.executeQuery(quer);
                
                
                if (rs3.next())
                {
                    int countstudent;
                    countstudent = rs3.getInt(1);
                    
                    String q = rs3.getString(1);
                    
                    if(countstudent <= 9)
                    {
                       NumberOfStudentjLabel.setText(0+q); 
                    }
                    else
                    {
                        NumberOfStudentjLabel.setText(q);
                        
                    }
                    
                    
                    String queri = "select count(*) from issue";
                    ResultSet rs4 = st.executeQuery(queri);
                    
                    if (rs4.next())
                    {
                        int countunreturnedbooks;
                        countunreturnedbooks = rs4.getInt(1);
                        
                        String county = rs4.getString(1);
                       
                        if(countunreturnedbooks <= 9)
                        {
                            UnreturnedBooksLabel.setText(0+county);
                        }
                        else
                        {
                            UnreturnedBooksLabel.setText(county);
                        }
                         
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Students");
                }
                 
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Books");
                
                new MainView().setVisible(true);
            } 
                CurrentlySelected.setText(null);
        }
            
            
        }
        catch (Exception e)
        {
            
        }
    }//GEN-LAST:event_jLabel101MouseClicked

    private void IssueBooksGrey_OutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IssueBooksGrey_OutMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "This Option Will be availiable oly after the Activation.");
    }//GEN-LAST:event_IssueBooksGrey_OutMouseClicked

    private void ReceiveBooksGrey_OutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReceiveBooksGrey_OutMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "This Option Will be availiable oly after the Activation.");
    }//GEN-LAST:event_ReceiveBooksGrey_OutMouseClicked

    private void AddNewBookGrey_OutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddNewBookGrey_OutMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "This Option Will be availiable oly after the Activation.");
    }//GEN-LAST:event_AddNewBookGrey_OutMouseClicked

    private void AddNewStudentGrey_OutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddNewStudentGrey_OutMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "This Option Will be availiable oly after the Activation.");
    }//GEN-LAST:event_AddNewStudentGrey_OutMouseClicked

    private void IssuedListGrey_OutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IssuedListGrey_OutMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "This Option Will be availiable oly after the Activation.");
    }//GEN-LAST:event_IssuedListGrey_OutMouseClicked

    private void HistoryGrey_OutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistoryGrey_OutMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "This Option Will be availiable oly after the Activation.");
    }//GEN-LAST:event_HistoryGrey_OutMouseClicked

    private void jLabel107MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel107MouseClicked
        // TODO add your handling code here:
        String Title = CurrentlySelected1.getText();
        try
        {
            Connection com = ConnectionProvider.getCon();
            Statement st = com.createStatement();
            
            st.executeUpdate("DELETE from books where Title = '"+Title+"'");
            
            JOptionPane.showMessageDialog(null, "Delete Successful");
            
            //Refresh Begin
            ResultSet rs8 = st.executeQuery("select student.studentIndex AS 'Student Index',student.studentName AS 'Name',student.studentAddress AS 'Address',student.studentClass AS 'Grade',student.studentIsland AS 'Island',student.studentPhone AS 'Phone No' from student");
            StudentListTable.setModel(DbUtils.resultSetToTableModel(rs8));
            ResultSet bk = st.executeQuery("select books.ISBN,books.Title,books.DDC,books.Publisher,books.Subject,books.Author,books.Year,books.Pages,books.BookNumber AS 'Book No' from books");
            BooksListTable.setModel(DbUtils.resultSetToTableModel(bk));
            ResultSet rs5 = st.executeQuery("select issue.issueIndex,issue.issueName,issue.issueGrade,issue.issueISBN,issue.issueTitle,issue.issueAuthor,issue.issueDate,issue.issueExpire from issue");
            jTable3.setModel(DbUtils.resultSetToTableModel(rs5));
            ResultSet rs9 = st.executeQuery("select bookrs.bookrsIndex,bookrs.bookrsName,bookrs.bookrsGrade,bookrs.bookrsISBN,bookrs.bookrsTitle,bookrs.bookrsAuthor,bookrs.bookrsDate from bookrs");
            jTable4.setModel(DbUtils.resultSetToTableModel(rs9));
            
            
            
            
            String query = "select count(*) from books";
            ResultSet rs2 = st.executeQuery(query);
            //Refreshing Number of Books Label
            if (rs2.next())
            {
                int countbooks;
                countbooks = rs2.getInt(1);
                
                String p = rs2.getString(1);
                
                if(countbooks <= 9)
                {
                    NumberOfBooksjLabel.setText(0+p);
                }
                else
                {
                    NumberOfBooksjLabel.setText(p);
                }
                
                String quer = "select count(*) from student";
                ResultSet rs3 = st.executeQuery(quer);
                
                
                if (rs3.next())
                {
                    int countstudent;
                    countstudent = rs3.getInt(1);
                    
                    String q = rs3.getString(1);
                    
                    if(countstudent <= 9)
                    {
                       NumberOfStudentjLabel.setText(0+q); 
                    }
                    else
                    {
                        NumberOfStudentjLabel.setText(q);
                        
                    }
                    
                    
                    String queri = "select count(*) from issue";
                    ResultSet rs4 = st.executeQuery(queri);
                    
                    if (rs4.next())
                    {
                        int countunreturnedbooks;
                        countunreturnedbooks = rs4.getInt(1);
                        
                        String county = rs4.getString(1);
                       
                        if(countunreturnedbooks <= 9)
                        {
                            UnreturnedBooksLabel.setText(0+county);
                        }
                        else
                        {
                            UnreturnedBooksLabel.setText(county);
                        }
                         
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Students");
                }
                 
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Books");
                
                new MainView().setVisible(true);
            } 
                CurrentlySelected.setText(null);
        }
            
            
        }
        catch (Exception e)
        {
            
        }
    }//GEN-LAST:event_jLabel107MouseClicked

    private void bookNamegetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookNamegetMouseClicked
        // TODO add your handling code here:
        bookNameget.setText(null);
        bookNameget.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_bookNamegetMouseClicked

    private void indexNamegetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indexNamegetMouseClicked
        // TODO add your handling code here:
        indexNameget.setText(null);
        indexNameget.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_indexNamegetMouseClicked

    private void jLabel111MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel111MouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedComponent(PasswordTab);
        jLabel83.setVisible(false);
        jLabel165.setVisible(true);
    }//GEN-LAST:event_jLabel111MouseClicked

    private void jLabel86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)BooksListTable.getModel();
        int selectedRowIndex = BooksListTable.getSelectedRow();

        CurrentlySelected1.setText(model.getValueAt(selectedRowIndex, 1).toString());
    }//GEN-LAST:event_jLabel86MouseClicked

    private void jLabel116MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel116MouseClicked
        // TODO add your handling code here:
        String username = NewUsername.getText();
        String ppl = CurrentUsername.getText();
        
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            
            if(username.matches(""))
            {
                JOptionPane.showMessageDialog(null, "New Username Filed is Blank");
            }
            
            else{
            //st.executeUpdate("DELETE from* admin where username = ('"+ppl+"')");
            st.executeUpdate("update admin set username = '"+username+"'");
            JOptionPane.showMessageDialog(null, "You have updated your Username.");
            
            
             
            ResultSet rs = st.executeQuery("select *from admin");
            
            if(rs.next())
            {
                NewUsername.setText(null);
                CurrentUsername.setText(rs.getString(3));
            }
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel116MouseClicked

    private void jLabel110MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel110MouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedComponent(UsernameTab);
        jLabel83.setVisible(false);
        jLabel165.setVisible(true);
    }//GEN-LAST:event_jLabel110MouseClicked

    private void jLabel94MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel94MouseClicked
        // TODO add your handling code here:
        try{
        
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
        
        //Refresh Begin
            ResultSet rs8 = st.executeQuery("select student.studentIndex AS 'Student Index',student.studentName AS 'Name',student.studentAddress AS 'Address',student.studentClass AS 'Grade',student.studentIsland AS 'Island',student.studentPhone AS 'Phone No' from student");
            StudentListTable.setModel(DbUtils.resultSetToTableModel(rs8));
            ResultSet bk = st.executeQuery("select books.ISBN,books.Title,books.DDC,books.Publisher,books.Subject,books.Author,books.Year,books.Pages,books.BookNumber AS 'Book No' from books");
            BooksListTable.setModel(DbUtils.resultSetToTableModel(bk));
            ResultSet rs5 = st.executeQuery("select issue.issueIndex,issue.issueName,issue.issueGrade,issue.issueISBN,issue.issueTitle,issue.issueAuthor,issue.issueDate,issue.issueExpire from issue");
            jTable3.setModel(DbUtils.resultSetToTableModel(rs5));
            ResultSet rs9 = st.executeQuery("select bookrs.bookrsIndex,bookrs.bookrsName,bookrs.bookrsGrade,bookrs.bookrsISBN,bookrs.bookrsTitle,bookrs.bookrsAuthor,bookrs.bookrsDate from bookrs");
            jTable4.setModel(DbUtils.resultSetToTableModel(rs9));
            
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e );
        }
           
    }//GEN-LAST:event_jLabel94MouseClicked

    private void VisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisibleMouseClicked
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(null, "Do you wish to proceed?");
        
        CurrentUsername.setVisible(true);
        
        Visible.setVisible(false);
        Hide.setVisible(true);
    }//GEN-LAST:event_VisibleMouseClicked

    private void HideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HideMouseClicked
        // TODO add your handling code here:
        CurrentUsername.setVisible(false);
        Hide.setVisible(false);
        Visible.setVisible(true);
    }//GEN-LAST:event_HideMouseClicked

    private void Visible1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Visible1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Visible1MouseClicked

    private void Hide1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hide1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Hide1MouseClicked

    private void jLabel128MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel128MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel128MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        // TODO add your handling code here:
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jLabel108MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel108MouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedComponent(jPanel4);
        jLabel83.setVisible(false);
        jLabel165.setVisible(true);
    }//GEN-LAST:event_jLabel108MouseClicked

    private void Hide2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hide2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Hide2MouseClicked

    private void Visible2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Visible2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Visible2MouseClicked

    private void jLabel137MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel137MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel137MouseClicked

    private void Hide3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hide3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Hide3MouseClicked

    private void Visible3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Visible3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Visible3MouseClicked

    private void jLabel144MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel144MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel144MouseClicked

    private void Hide4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hide4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Hide4MouseClicked

    private void Visible4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Visible4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Visible4MouseClicked

    private void jLabel151MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel151MouseClicked
        // TODO add your handling code here:
        String password = CurrentUsername4.getText();
        String defaultPass = CurrentPassword.getText();
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            
            if(password.matches(defaultPass))
            {
                JOptionPane.showConfirmDialog(null, "Are you sure?");
                st.executeUpdate("DELETE from bookrs");
                CurrentUsername4.setText(null);
            }
            else if (password.matches(("")))
            {
                JOptionPane.showMessageDialog(null, "Enter Your Password to delete History");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Wrong Password");
            }
            
            //Refresh
            ResultSet rs8 = st.executeQuery("select student.studentIndex AS 'Student Index',student.studentName AS 'Name',student.studentAddress AS 'Address',student.studentClass AS 'Grade',student.studentIsland AS 'Island',student.studentPhone AS 'Phone No' from student");
            StudentListTable.setModel(DbUtils.resultSetToTableModel(rs8));
            ResultSet bk = st.executeQuery("select books.ISBN,books.Title,books.DDC,books.Publisher,books.Subject,books.Author,books.Year,books.Pages,books.BookNumber AS 'Book No' from books");
            BooksListTable.setModel(DbUtils.resultSetToTableModel(bk));
            ResultSet rs5 = st.executeQuery("select issue.issueIndex,issue.issueName,issue.issueGrade,issue.issueISBN,issue.issueTitle,issue.issueAuthor,issue.issueDate,issue.issueExpire from issue");
            jTable3.setModel(DbUtils.resultSetToTableModel(rs5));
            ResultSet rs9 = st.executeQuery("select bookrs.bookrsIndex,bookrs.bookrsName,bookrs.bookrsGrade,bookrs.bookrsISBN,bookrs.bookrsTitle,bookrs.bookrsAuthor,bookrs.bookrsDate from bookrs");
            jTable4.setModel(DbUtils.resultSetToTableModel(rs9));

            String query = "select count(*) from books";
            ResultSet rs2 = st.executeQuery(query);
            //Refreshing Number of Books Label
            if (rs2.next())
            {
                int countbooks;
                countbooks = rs2.getInt(1);

                String p = rs2.getString(1);

                if(countbooks <= 9)
                {
                    NumberOfBooksjLabel.setText(0+p);
                }
                else
                {
                    NumberOfBooksjLabel.setText(p);
                }

                String quer = "select count(*) from student";
                ResultSet rs3 = st.executeQuery(quer);

                if (rs3.next())
                {
                    int countstudent;
                    countstudent = rs3.getInt(1);

                    String q = rs3.getString(1);

                    if(countstudent <= 9)
                    {
                        NumberOfStudentjLabel.setText(0+q);
                    }
                    else
                    {
                        NumberOfStudentjLabel.setText(q);
                    }

                    String queri = "select count(*) from issue";
                    ResultSet rs4 = st.executeQuery(queri);

                    if (rs4.next())
                    {
                        int countunreturnedbooks;
                        countunreturnedbooks = rs4.getInt(1);

                        String county = rs4.getString(1);

                        if(countunreturnedbooks <= 9)
                        {
                            UnreturnedBooksLabel.setText(0+county);
                        }
                        else
                        {
                            UnreturnedBooksLabel.setText(county);
                        }

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Students");
                    }

                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Books");

                    new MainView().setVisible(true);
                }
            }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel151MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedComponent(jPanel5);
        jLabel83.setVisible(false);
        jLabel165.setVisible(true);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel88MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel88MouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedComponent(jPanel6);
        jLabel83.setVisible(false);
        jLabel165.setVisible(true);
    }//GEN-LAST:event_jLabel88MouseClicked

    private void jLabel109MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel109MouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedComponent(jPanel7);
        jLabel83.setVisible(false);
        jLabel165.setVisible(true);
    }//GEN-LAST:event_jLabel109MouseClicked

    private void Hide5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hide5MouseClicked
        // TODO add your handling code here:
        CurrentPassword.setVisible(false);
        Hide5.setVisible(false);
        Visible5.setVisible(true);
    }//GEN-LAST:event_Hide5MouseClicked

    private void Visible5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Visible5MouseClicked
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(null, "Do you wish to proceed?");
        
        CurrentPassword.setVisible(true);
        
        Visible5.setVisible(false);
        Hide5.setVisible(true);
    }//GEN-LAST:event_Visible5MouseClicked

    private void jLabel124MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel124MouseClicked
        // TODO add your handling code here:
        String password = NewPassword.getText();
        //String ppl = CurrentUsername.getText();
        
        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            
            if(password.matches(""))
            {
                JOptionPane.showMessageDialog(null, "New Username Filed is Blank");
            }
            
            else{
            //st.executeUpdate("DELETE from* admin where username = ('"+ppl+"')");
            st.executeUpdate("update admin set password = '"+password+"'");
            JOptionPane.showMessageDialog(null, "You have updated your Password");
            
            
             
            ResultSet rs = st.executeQuery("select *from admin");
            
            if(rs.next())
            {
                NewPassword.setText(null);
                CurrentPassword.setText(rs.getString(4));
            }
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jLabel124MouseClicked

    private void jLabel155MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel155MouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedComponent(Dashboard);
        jLabel165.setVisible(false);
        jLabel83.setVisible(true);
       
    }//GEN-LAST:event_jLabel155MouseClicked

    private void ISBNSearchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ISBNSearchFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)        
        {
            SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        String issueIndex = IndexSearchField.getText();
        String issueName = StudentNameget.getText();
        String issueGrade = StudentGradeget.getText();
        String issueISBN = ISBNSearchField.getText();
        String issueTitle = BookTitleget.getText();
        String issueAuthor = BookAuthorget.getText();
        String issueDate = dFormat.format (issueBookDateget.getDate());
        String issueExpire = dFormat.format (expireBookDateget.getDate());

        try
        {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from books where ISBN = '"+issueISBN+"'");
            if(issueIndex.matches(""))
            {
                JOptionPane.showMessageDialog(null, "Enter an Index");
            }
            else if(rs.next())
            {

                ResultSet rsl = st.executeQuery("select *from student where studentIndex = '"+issueIndex+"'");
                if(rsl.next())
                {

                    st.executeUpdate("insert into issue values('"+issueIndex+"','"+issueName+"','"+issueGrade+"','"+issueISBN+"','"+issueTitle+"','"+issueAuthor+"','"+issueDate+"','"+issueExpire+"')");

                    
                   
                    Success b = new Success();
                    b.setVisible(true);
                    b.jLabel2.setText("Successfully Issued");
                    
                    IndexSearchField.setText(null);
                    StudentNameget.setText(null);
                    StudentGradeget.setText(null);
                    ISBNSearchField.setText(null);
                    BookTitleget.setText(null);
                    BookAuthorget.setText(null);
                    issueBookDateget.setDate(null);
                    StudentGradeget.setText(null);

                    //this.setVisible(false);
                    //new MainView().setVisible(true);
                    //Refresh Begin
                    ResultSet rs8 = st.executeQuery("select student.studentIndex AS 'Student Index',student.studentName AS 'Name',student.studentAddress AS 'Address',student.studentClass AS 'Grade',student.studentIsland AS 'Island',student.studentPhone AS 'Phone No' from student");
                    StudentListTable.setModel(DbUtils.resultSetToTableModel(rs8));
                    ResultSet bk = st.executeQuery("select books.ISBN,books.Title,books.DDC,books.Publisher,books.Subject,books.Author,books.Year,books.Pages,books.BookNumber AS 'Book No' from books");
                    BooksListTable.setModel(DbUtils.resultSetToTableModel(bk));
                    ResultSet rs5 = st.executeQuery("select issue.issueIndex,issue.issueName,issue.issueGrade,issue.issueISBN,issue.issueTitle,issue.issueAuthor,issue.issueDate,issue.issueExpire from issue");
                    jTable3.setModel(DbUtils.resultSetToTableModel(rs5));
                    ResultSet rs9 = st.executeQuery("select bookrs.bookrsIndex,bookrs.bookrsName,bookrs.bookrsGrade,bookrs.bookrsISBN,bookrs.bookrsTitle,bookrs.bookrsAuthor,bookrs.bookrsDate from bookrs");
                    jTable4.setModel(DbUtils.resultSetToTableModel(rs9));

                    String query = "select count(*) from books";
                    ResultSet rs2 = st.executeQuery(query);
                    //Refreshing Number of Books Label
                    if (rs2.next())
                    {
                        int countbooks;
                        countbooks = rs2.getInt(1);

                        String p = rs2.getString(1);

                        if(countbooks <= 9)
                        {
                            NumberOfBooksjLabel.setText(0+p);
                        }
                        else
                        {
                            NumberOfBooksjLabel.setText(p);
                        }

                        String quer = "select count(*) from student";
                        ResultSet rs3 = st.executeQuery(quer);

                        if (rs3.next())
                        {
                            int countstudent;
                            countstudent = rs3.getInt(1);

                            String q = rs3.getString(1);

                            if(countstudent <= 9)
                            {
                                NumberOfStudentjLabel.setText(0+q);
                            }
                            else
                            {
                                NumberOfStudentjLabel.setText(q);

                            }

                            String queri = "select count(*) from issue";
                            ResultSet rs4 = st.executeQuery(queri);

                            if (rs4.next())
                            {
                                int countunreturnedbooks;
                                countunreturnedbooks = rs4.getInt(1);

                                String county = rs4.getString(1);

                                if(countunreturnedbooks <= 9)
                                {
                                    UnreturnedBooksLabel.setText(0+county);
                                }
                                else
                                {
                                    UnreturnedBooksLabel.setText(county);
                                }

                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Students");
                            }

                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Failed to retrieve Number of Books");

                            new MainView().setVisible(true);
                        }
                    }
                }
                else
                JOptionPane.showConfirmDialog(null, "Incorrect Student Index");
            }
            else
            JOptionPane.showConfirmDialog(null, "Incorrect Book ISBN Number");

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_ISBNSearchFieldKeyPressed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ActivationCode;
    public javax.swing.JLabel ActivationCompleted;
    public javax.swing.JLabel ActivationNo;
    public javax.swing.JLabel ActivationNotComplete;
    public javax.swing.JLabel ActivationYes;
    private javax.swing.JLabel AddNewBook;
    private javax.swing.JLabel AddNewBookGrey_Out;
    private javax.swing.JLabel AddNewBookSelected;
    private javax.swing.JLabel AddNewBookUnselected;
    private javax.swing.JPanel AddNewBookjPanel;
    private javax.swing.JLabel AddNewStudentGrey_Out;
    private javax.swing.JLabel AddNewStudentSelected;
    private javax.swing.JLabel AddNewStudentUnselected;
    private javax.swing.JPanel AddNewStudentjPanel;
    private javax.swing.JTextField BookAuthorget;
    private javax.swing.JPanel BookDirectory;
    public javax.swing.JLabel BookDirectoryBarSelection;
    private javax.swing.JTextField BookTitleget;
    private javax.swing.JTable BooksListTable;
    private javax.swing.JLabel CloseButtonX;
    private javax.swing.JTextField CurrentPassword;
    private javax.swing.JTextField CurrentUsername;
    private javax.swing.JTextField CurrentUsername1;
    private javax.swing.JTextField CurrentUsername2;
    private javax.swing.JTextField CurrentUsername3;
    private javax.swing.JTextField CurrentUsername4;
    private javax.swing.JTextField CurrentlySelected;
    private javax.swing.JTextField CurrentlySelected1;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JLabel DashboardHistoryCount;
    private javax.swing.JLabel DashboardIssuedListCount;
    private javax.swing.JLabel DashboardStudentsCount;
    private javax.swing.JLabel DashboardTitle;
    public javax.swing.JLabel Dataslect;
    private javax.swing.JLabel HeadingIssue;
    private javax.swing.JLabel Hide;
    private javax.swing.JLabel Hide1;
    private javax.swing.JLabel Hide2;
    private javax.swing.JLabel Hide3;
    private javax.swing.JLabel Hide4;
    private javax.swing.JLabel Hide5;
    private javax.swing.JPanel Hidebar1;
    private javax.swing.JPanel Hidebar2;
    private javax.swing.JPanel Hidebar4;
    private javax.swing.JPanel Hidebar5;
    private javax.swing.JPanel Hidebar6;
    private javax.swing.JPanel Hidebar7;
    private javax.swing.JPanel Hidebar8;
    private javax.swing.JPanel History;
    private javax.swing.JLabel HistoryBox;
    private javax.swing.JLabel HistoryDashboardTitle;
    private javax.swing.JLabel HistoryGrey_Out;
    private javax.swing.JLabel HistorySelected;
    private javax.swing.JLabel HistoryUnselected;
    private javax.swing.JLabel HistroryLabel;
    private javax.swing.JTextField ISBNSearchField;
    private javax.swing.JTextField IndexSearchField;
    public javax.swing.JLabel IssueBookUnselected;
    private javax.swing.JPanel IssueBookjPanel;
    private javax.swing.JLabel IssueBooksGrey_Out;
    public javax.swing.JLabel IssueBooksSelected;
    private javax.swing.JPanel IssuedBooksList;
    private javax.swing.JLabel IssuedListDashboardTitle;
    private javax.swing.JLabel IssuedListGrey_Out;
    private javax.swing.JLabel IssuedListSelected;
    private javax.swing.JLabel IssuedListUnselected;
    private javax.swing.JLabel MainJFrameCover;
    private javax.swing.JLabel MinimiseButton;
    private javax.swing.JTextField NewPassword;
    private javax.swing.JTextField NewUsername;
    public javax.swing.JLabel NumberOfBooksjLabel;
    public javax.swing.JLabel NumberOfStudentjLabel;
    private javax.swing.JPanel PasswordTab;
    private javax.swing.JPanel Profile;
    public javax.swing.JLabel Profileslect;
    private javax.swing.JLabel ReceiveBooksGrey_Out;
    private javax.swing.JLabel ReceiveBooksSelected;
    private javax.swing.JLabel ReceiveBooksUnselected;
    private javax.swing.JPanel RecievejPanel;
    private javax.swing.JLabel StudentDashboardTitle;
    public javax.swing.JLabel StudentDirectoryBarSelection;
    private javax.swing.JTextField StudentGradeget;
    private javax.swing.JTable StudentListTable;
    private javax.swing.JTextField StudentNameget;
    public javax.swing.JPanel StudentTables;
    private javax.swing.JLabel StudentTablesLabel;
    private javax.swing.JPanel Teachers;
    private javax.swing.JLabel TeachersIcon;
    public javax.swing.JLabel Teachersslect;
    private javax.swing.JLabel UnreturnedBooksLabel;
    private javax.swing.JPanel UsernameTab;
    private javax.swing.JLabel Visible;
    private javax.swing.JLabel Visible1;
    private javax.swing.JLabel Visible2;
    private javax.swing.JLabel Visible3;
    private javax.swing.JLabel Visible4;
    private javax.swing.JLabel Visible5;
    private javax.swing.JTextField bookNameget;
    private com.toedter.calendar.JDateChooser expireBookDateget;
    private javax.swing.JTextField indexNameget;
    private com.toedter.calendar.JDateChooser issueBookDateget;
    private javax.swing.JTextField jAuthor;
    private javax.swing.JTextField jBookNumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JTextField jDDC;
    private javax.swing.JTextField jISBN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JTextField jPages;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jPublisher;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jSubject;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTitle;
    private javax.swing.JTextField jYear;
    private javax.swing.JTextField returnAuthorget;
    private javax.swing.JTextField returnBookget;
    private com.toedter.calendar.JDateChooser returnDateget;
    private javax.swing.JTextField returnGradeget;
    private javax.swing.JTextField returnISBNget;
    private javax.swing.JTextField returnIndexget;
    private javax.swing.JTextField returnNameget;
    private javax.swing.JTextField studentAddressjField;
    private javax.swing.JTextField studentIndexjField;
    private javax.swing.JTextField studentIslandjField;
    private javax.swing.JTextField studentNamejField;
    private javax.swing.JTextField studentPhonejField;
    // End of variables declaration//GEN-END:variables
}
