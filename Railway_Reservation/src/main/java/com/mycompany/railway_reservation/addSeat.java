/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.railway_reservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class addSeat extends javax.swing.JFrame {

    /**
     * Creates new form addSeat
     */
    public addSeat() {
        initComponents();
        labelADD.setVisible(false);
                bsleeper.setVisible(false);
                bfirst.setVisible(false);
                bsecond.setVisible(false);
                bthird.setVisible(false);
    }
    
    Connection con ;
    PreparedStatement pst ;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        tbTrainID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        bsleeper = new javax.swing.JButton();
        bfirst = new javax.swing.JButton();
        bthird = new javax.swing.JButton();
        bsecond = new javax.swing.JButton();
        labelADD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("TRAIN ID");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bsleeper.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bsleeper.setText("SLEEPER");
        bsleeper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsleeperActionPerformed(evt);
            }
        });

        bfirst.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bfirst.setText("FIRST AC");
        bfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfirstActionPerformed(evt);
            }
        });

        bthird.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bthird.setText("THIRD AC");
        bthird.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthirdActionPerformed(evt);
            }
        });

        bsecond.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bsecond.setText("SECOND AC");
        bsecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsecondActionPerformed(evt);
            }
        });

        labelADD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelADD.setText("CHOOSE THE COACH IN WHICH YOU NEED TO ADD THE SEATS-");

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tbTrainID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bsleeper, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bfirst, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bthird, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bsecond, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelADD, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bthird)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(tbTrainID, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bsleeper, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)
                                .addComponent(jButton1))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bsecond)
                                    .addComponent(bfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(labelADD, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tbTrainID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(37, 37, 37)
                .addComponent(labelADD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(bsleeper)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bfirst)
                .addGap(21, 21, 21)
                .addComponent(bsecond)
                .addGap(18, 18, 18)
                .addComponent(bthird)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (tbTrainID.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Please Fill the Train ID");
        return; // Exit the method if the Train ID is empty
    }

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/railway";
        String userName = "root";
        String password = "Vectors123";
        con = DriverManager.getConnection(url, userName, password);

        // Prepare the SQL statement to check if the train ID exists in the train table
        pst = con.prepareStatement("SELECT COUNT(*) FROM train WHERE train_id = ?");
        pst.setString(1, tbTrainID.getText()); // Set the train ID from the text field

        // Execute the SQL query
        ResultSet rs = pst.executeQuery();

        // Process the result
        if (rs.next()) {
            int count = rs.getInt(1);
            if (count > 0) {
               
                labelADD.setVisible(true);
                bsleeper.setVisible(true);
                bfirst.setVisible(true);
                bsecond.setVisible(true);
                bthird.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Train ID does not exist in the train table.");
                labelADD.setVisible(false);
                bsleeper.setVisible(false);
                bfirst.setVisible(false);
                bsecond.setVisible(false);
                bthird.setVisible(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error: Unable to check train ID.");
        }

        // Close the ResultSet, PreparedStatement, and Connection
        rs.close();
        pst.close();
        con.close();
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bsleeperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsleeperActionPerformed
        // TODO add your handling code here:
    String trainID = tbTrainID.getText().trim();
    if (trainID.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter the Train ID.");
        return;
    }

    try {
        // Assuming you have already connected to the database and validated the train ID

        // Create an instance of the sleeper class and pass the train ID to its constructor
        sleeper sleeperForm = new sleeper(trainID);

        // Make the sleeper form visible
        sleeperForm.setVisible(true);
        sleeperForm.setSize(600, 350);

        // Hide the current addSeat form
        setVisible(false);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: Unable to open the sleeper form.");
    }
    }//GEN-LAST:event_bsleeperActionPerformed

    private void bfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfirstActionPerformed
        // TODO add your handling code here:
         String trainID = tbTrainID.getText().trim();
    if (trainID.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter the Train ID.");
        return;
    }

    try {
        // Assuming you have already connected to the database and validated the train ID

        // Create an instance of the sleeper class and pass the train ID to its constructor
        firstAc my=new firstAc(trainID);

        // Make the sleeper form visible
        my.setVisible(true);
        my.setSize(680, 525);

        // Hide the current addSeat form
        setVisible(false);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: Unable to open the sleeper form.");
    }
  
    }//GEN-LAST:event_bfirstActionPerformed

    private void bthirdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthirdActionPerformed
        // TODO add your handling code here:
         String trainID = tbTrainID.getText().trim();
    if (trainID.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter the Train ID.");
        return;
    }

    try {
        // Assuming you have already connected to the database and validated the train ID

        // Create an instance of the sleeper class and pass the train ID to its constructor
        thirdAc sleeperForm = new thirdAc(trainID);

        // Make the sleeper form visible
        sleeperForm.setVisible(true);
        sleeperForm.setSize(680, 370);

        // Hide the current addSeat form
        setVisible(false);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: Unable to open the sleeper form.");
    }
    }//GEN-LAST:event_bthirdActionPerformed

    private void bsecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsecondActionPerformed
        // TODO add your handling code here:
         String trainID = tbTrainID.getText().trim();
    if (trainID.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter the Train ID.");
        return;
    }

    try {
        // Assuming you have already connected to the database and validated the train ID

        // Create an instance of the sleeper class and pass the train ID to its constructor
        secondAc sleeperForm = new secondAc(trainID);

        // Make the sleeper form visible
        sleeperForm.setVisible(true);
        sleeperForm.setSize(630, 340);

        // Hide the current addSeat form
        setVisible(false);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: Unable to open the sleeper form.");
    }
    }//GEN-LAST:event_bsecondActionPerformed

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
            java.util.logging.Logger.getLogger(addSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addSeat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bfirst;
    private javax.swing.JButton bsecond;
    private javax.swing.JButton bsleeper;
    private javax.swing.JButton bthird;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelADD;
    private javax.swing.JTextField tbTrainID;
    // End of variables declaration//GEN-END:variables
}
