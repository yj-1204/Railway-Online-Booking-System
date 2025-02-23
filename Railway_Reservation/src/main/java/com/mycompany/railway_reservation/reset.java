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
public class reset extends javax.swing.JFrame {

    /**
     * Creates new form add_random1
     */
    public reset() {
        initComponents();
        bcoachNumber.setVisible(false);
        tCoachNumber.setVisible(false);
        bClass.setVisible(false);
        tClass.setVisible(false);
        bSeat.setVisible(false);
        tSeatNumber.setVisible(false);
        bClear.setVisible(false);
        bUpdate.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        tfTrainID = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        bcoachNumber = new javax.swing.JButton();
        tCoachNumber = new javax.swing.JTextField();
        bSeat = new javax.swing.JButton();
        bClass = new javax.swing.JButton();
        tClass = new javax.swing.JTextField();
        tSeatNumber = new javax.swing.JTextField();
        bUpdate = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(255, 204, 204));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("TRAIN ID");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        bcoachNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bcoachNumber.setText("COACH NUMBER");

        bSeat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bSeat.setText("SEAT NUMBER");

        bClass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bClass.setText("CLASS");

        bUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bUpdate.setText("UPDATE");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        bClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bClear.setText("CLEAR");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfTrainID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bcoachNumber, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tCoachNumber, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bSeat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bClass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tClass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tSeatNumber, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bUpdate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bClear, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addComponent(bSeat)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tSeatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(65, 65, 65)
                                    .addComponent(tfTrainID, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bcoachNumber)
                                        .addComponent(bClass))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tCoachNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tClass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(bClear))
                        .addGap(33, 33, 33)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bUpdate)
                            .addComponent(jButton2)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(19, 19, 19)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(tfTrainID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(37, 37, 37)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcoachNumber)
                    .addComponent(tCoachNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bClass)
                    .addComponent(tClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSeat)
                    .addComponent(tSeatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bUpdate)
                    .addComponent(bClear))
                .addContainerGap(20, Short.MAX_VALUE))
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
    
    Connection con;
    PreparedStatement pst ;
    String id;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            id=tfTrainID.getText();
            // TODO add your handling code here:
            if (tfTrainID.getText().equals("") ) {
                JOptionPane.showMessageDialog(null,"Please Fill the Train ID");
            }
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/";
            String dbname="railway";
            String userName="root";
            String password="Vectors123";
            con=DriverManager.getConnection(url+dbname,userName,password);
            pst=con.prepareStatement("select * from train where train_id=?");
            pst.setString(1,id);
             if (pst.executeQuery().next()) {
                        bcoachNumber.setVisible(true);
                        tCoachNumber.setVisible(true);
                        bClass.setVisible(true);
                        tClass.setVisible(true);
                        bSeat.setVisible(true);
                        tSeatNumber.setVisible(true);
                        bClear.setVisible(true);
        bUpdate.setVisible(true);
                        
            }
            if (!pst.executeQuery().next()) {
            JOptionPane.showMessageDialog(null, "Invalid Train ID");
                        return; // Exit the method if Train ID is invalid
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(reset.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(reset.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        try {
            // TODO add your handling code here:
            if (tCoachNumber.getText().equals("") ) {
                JOptionPane.showMessageDialog(null,"Please Fill the Coach Number");
                return ;
            }
            if (tSeatNumber.getText().equals("") ) {
                JOptionPane.showMessageDialog(null,"Please Fill the Seat Number");
                return ;
            }
            if (tClass.getText().equals("") ) {
                JOptionPane.showMessageDialog(null,"Please Fill the Class");
                return ;
            }
            String coach_number=tCoachNumber.getText();
            String tnSeatNumber = tSeatNumber.getText();
            String class_t=tClass.getText();
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/";
            String dbname="railway";
            String userName="root";
            String password="Vectors123";
            con=DriverManager.getConnection(url+dbname,userName,password);
            pst=con.prepareStatement("select * from seat where coach=? and train_id=? and seat_number=? and class=?");

            pst.setString(1,coach_number);
            pst.setString(2,id);
            pst.setString(3,tnSeatNumber);
            pst.setString(4,class_t);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                        
                        pst=con.prepareStatement("update seat set status='Available' where coach=? and train_id=? and seat_number=? and class=?");
                        pst.setString(1,coach_number);
                        pst.setString(2,id);
                        pst.setString(3,tnSeatNumber);
                        pst.setString(4,class_t);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Status Updated");
                        return;
            }
            if (!resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Status not Updated");
                return ;
            }
             
            if (!pst.executeQuery().next()) {
            JOptionPane.showMessageDialog(null, "Invalid Train ID");
                        return; // Exit the method if Train ID is invalid
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(reset.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(reset.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        // TODO add your handling code here:
        tCoachNumber.setText("");
        tSeatNumber.setText("");
        tClass.setText("");
        
    }//GEN-LAST:event_bClearActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        manageTrain1 my=new manageTrain1();
        my.setSize(725,550);
        my.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClass;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bSeat;
    private javax.swing.JButton bUpdate;
    private javax.swing.JButton bcoachNumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JTextField tClass;
    private javax.swing.JTextField tCoachNumber;
    private javax.swing.JTextField tSeatNumber;
    private javax.swing.JTextField tfTrainID;
    // End of variables declaration//GEN-END:variables
}
