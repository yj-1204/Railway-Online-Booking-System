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
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class railDisplay extends javax.swing.JFrame {

    /**
     * Creates new form railDisplay
     */
    String CLASSRAIL;
    public railDisplay() {
        
        initComponents();
    }
    
                
    PreparedStatement pst5;
  private void displayDataInTable(ResultSet rs) {
        try {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Train ID");
            model.addColumn("Train Name");
            model.addColumn("Departure Time From Source Station");
            model.addColumn("Arrival Time At Destination Station");
            model.addColumn("Available  Seats");
            while (rs.next()) {
                String trainID = rs.getString("train_id");
                
                String trainName = rs.getString("train_name");
                String departureTime = rs.getString("departure_time");
                String arrivalTime = rs.getString("arrival_time");
                int availableSeats = rs.getInt("available_seats");
               model.addRow(new Object[]{trainID, trainName, departureTime, arrivalTime, availableSeats});
            }
            jTable1.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(railDisplay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    String source;
    String destination;
    String journeyDate;
    String travelClass ;
    String railDisplay;
    Connection con ;
    PreparedStatement pst ;
    public railDisplay(String source, String destination, String journeyDate, String travelClass,String id) {
        initComponents();
        this.source = source;
        this.destination = destination;
        this.journeyDate = journeyDate;
        this.travelClass = travelClass;
        this.railDisplay=id;
        
        try {
        SimpleDateFormat inputFormat = new SimpleDateFormat("E MMM dd HH:mm:ss zzz yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date date = inputFormat.parse(journeyDate);
        String formattedDate = outputFormat.format(date);
        labelDate.setText(formattedDate);
    } catch (Exception ex) {
        ex.printStackTrace();
        labelDate.setText("Error formatting date");
    }
        System.out.println("railDispaly"+railDisplay);
        labelSource.setText(source);
        labelDestination.setText(destination);
       
        
        
        this.CLASSRAIL = travelClass;
        
        lbclass.setText(travelClass);
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/";
            String dbname="railway";
            String userName="root";
            String password="Vectors123";
            con=DriverManager.getConnection(url+dbname,userName,password);
            PreparedStatement pst1=con.prepareStatement("select station_id from station where station_name=?");
            pst1.setString(1,source);
            ResultSet rs1 = pst1.executeQuery();
            String sourceStationID = "";
            if (rs1.next()) {
                sourceStationID = rs1.getString("station_id");
            }
            PreparedStatement pst2=con.prepareStatement("select station_id from station where station_name=?");
            pst2.setString(1,destination);
            ResultSet rs2 = pst2.executeQuery();
            System.out.println("CLASS"+travelClass);
            System.out.println("Source"+sourceStationID);
            
            String destStationID = "";
            if (rs2.next()) {
                destStationID = rs2.getString("station_id");
            }
            
            System.out.println("Destination"+destStationID);
            PreparedStatement pst = con.prepareStatement("SELECT t.train_id, t.train_name, ts1.departure_time, ts2.arrival_time, "
                    + "COUNT(CASE WHEN s.status = 'Available' AND s.class = ? THEN 1 END) AS available_seats "
                    + "FROM train t "
                    + "JOIN train_schedule ts1 ON t.train_id = ts1.train_id "
                    + "JOIN station s1 ON ts1.station_id = s1.station_id AND s1.station_id = ? " // Placeholder for source station ID
                    + "LEFT JOIN seat s ON s.train_id = t.train_id AND s.class = ? AND s.status = 'Available' "
                    + "JOIN train_schedule ts2 ON t.train_id = ts2.train_id "
                    + "JOIN station s2 ON ts2.station_id = s2.station_id AND s2.station_id = ? " // Placeholder for destination station ID
                    + "WHERE ts2.arrival_time IS NOT NULL "
                    + "GROUP BY t.train_id, t.train_name, ts1.departure_time, ts2.arrival_time "
                    + "ORDER BY t.train_id;");
            pst.setString(1,travelClass );
            pst.setString(2, sourceStationID); // Set the value for sourceStationID
            pst.setString(3,travelClass );
            pst.setString(4, destStationID); // Set the value for destStationID
            ResultSet rs = pst.executeQuery();

            displayDataInTable(rs);
        } catch (SQLException ex) {
            // Handle any SQL exceptions here
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(railDisplay.class.getName()).log(Level.SEVERE, null, ex);
        }

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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        labelSource = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelDestination = new javax.swing.JLabel();
        lbclass = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Destination");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Source");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("DATE OF JOURNEY");

        labelDate.setText("jLabel4");

        labelSource.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSource.setText("TAKE PREVIOUS");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("CLASS");

        labelDestination.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelDestination.setText("TAKE PREVIOUS");

        lbclass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbclass.setText("TAKE PREVIOUS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelSource, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDate)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbclass, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSource)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDate)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelDestination)
                    .addComponent(lbclass))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Train ID", "Train Name", "No. of Seats"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jDesktopPane1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        search my=new search();
        my.setSize(861,347);
        my.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (selectedRow != -1) {
        String trainID = model.getValueAt(selectedRow, 0).toString();
        String trainName = model.getValueAt(selectedRow, 1).toString();
        String departureTime = model.getValueAt(selectedRow, 2).toString();
        String arrivalTime = model.getValueAt(selectedRow, 3).toString();
        int availableSeats = Integer.parseInt(model.getValueAt(selectedRow, 4).toString());
      setVisible(false)  ;
      authenticate my=new authenticate(CLASSRAIL,source,destination,journeyDate,trainID,trainName,departureTime,arrivalTime,availableSeats,railDisplay);
      my.setVisible(true);
      my.setSize(643,400);
    }//GEN-LAST:event_jTable1MouseClicked
    }
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
            java.util.logging.Logger.getLogger(railDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(railDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(railDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(railDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new railDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelDestination;
    private javax.swing.JLabel labelSource;
    private javax.swing.JLabel lbclass;
    // End of variables declaration//GEN-END:variables
}
