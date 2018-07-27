/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.customer_one_system;

import com.abc.JDBCConnection.ConnectionClass;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.String;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author test
 */
public class LostOrStolenCard extends javax.swing.JFrame {
    String card_No;
    /**
     * Creates new form LostOrStolenCard
     *
     * @param
     */
    public LostOrStolenCard() throws ClassNotFoundException, SQLException {
        initComponents();
    }

    public LostOrStolenCard(int requestTypeVal, String requestStatus) throws Exception {
        initComponents();
        Connection con = ConnectionClass.getConnected();
        Statement stmt = con.createStatement();

        String query = "select s.card_no,c.card_type, cr.csr_status, cr.csr_response,cr.csr_id from   customer_service_request cr  join stolen_lost_card s \n"
                + "on s.csr_id=cr.csr_id join credit_card_detail c on  s.card_no= c.card_no where cr.csr_status='" + requestStatus + "' and  cr.csr_type=" + requestTypeVal;

        ResultSet rs = stmt.executeQuery(query);
<<<<<<< HEAD
        while (rs.next())
        {
        
            card_No = String.valueOf(rs.getLong(1));
=======
        while (rs.next()) {

            String card_No = String.valueOf(rs.getLong(1));
>>>>>>> c7c8d68417ff03f0a93afe0e38a4a7ad488ea57c
            String card_Type = rs.getString(2);
            String lsc_Status = rs.getString(3);
            String lsc_Response = rs.getString(4);
            ListOfCustomerRequests.csr_id = rs.getInt(5);
            System.out.println(ListOfCustomerRequests.csr_id);

            lbltxtCardNoCsr3.setText(card_No);
            lbltxtCardTypeCsr3.setText(card_Type);
            cmbStatusCsr3.setSelectedItem(lsc_Status);
            txtResponseCsr3.setText(lsc_Response);

        }
<<<<<<< HEAD
    }      
   
   

   
=======
    }

 
>>>>>>> 9c4d15100281ef488e90d62e9abed02424de8f80

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblCardNoCsr3 = new javax.swing.JLabel();
        lbltxtCardNoCsr3 = new javax.swing.JLabel();
        lblCardTypeCsr3 = new javax.swing.JLabel();
        lbltxtCardTypeCsr3 = new javax.swing.JLabel();
        lblStatusCsr3 = new javax.swing.JLabel();
        lblAsterisk = new javax.swing.JLabel();
        cmbStatusCsr3 = new javax.swing.JComboBox<>();
        lblResponseCsr3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResponseCsr3 = new javax.swing.JTextArea();
        btnSubmitCsr3 = new javax.swing.JButton();
        btnBackCsr3 = new javax.swing.JButton();
        lblSubmit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Lost/Stolen Card");

        lblCardNoCsr3.setText("Card Number");

        lblCardTypeCsr3.setText("Card Type");

        lblStatusCsr3.setText("Status");

        lblAsterisk.setForeground(new java.awt.Color(229, 30, 30));
        lblAsterisk.setText("*");

        cmbStatusCsr3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Rejected", "Processed" }));
        cmbStatusCsr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusCsr3ActionPerformed(evt);
            }
        });

        lblResponseCsr3.setText("Response");

        txtResponseCsr3.setColumns(20);
        txtResponseCsr3.setRows(5);
        jScrollPane1.setViewportView(txtResponseCsr3);

        btnSubmitCsr3.setText("Submit");
        btnSubmitCsr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitCsr3ActionPerformed(evt);
            }
        });

        btnBackCsr3.setText("Back");
        btnBackCsr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackCsr3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCardNoCsr3, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(lblCardTypeCsr3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1)))
                .addContainerGap(198, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAsterisk, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStatusCsr3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblResponseCsr3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbltxtCardTypeCsr3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbltxtCardNoCsr3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(cmbStatusCsr3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSubmitCsr3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBackCsr3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCardNoCsr3)
                    .addComponent(lbltxtCardNoCsr3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCardTypeCsr3)
                    .addComponent(lbltxtCardTypeCsr3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatusCsr3)
                    .addComponent(lblAsterisk)
                    .addComponent(cmbStatusCsr3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResponseCsr3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmitCsr3)
                    .addComponent(btnBackCsr3)
                    .addComponent(lblSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackCsr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackCsr3ActionPerformed
        this.setVisible(false);
        ListOfCustomerRequests listofcustomerrequests = new ListOfCustomerRequests();
        listofcustomerrequests.setVisible(true);
    }//GEN-LAST:event_btnBackCsr3ActionPerformed

    private void btnSubmitCsr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitCsr3ActionPerformed
        // TODO add your handling code here:
        int flag=1;
        //Connection connect;
        try {
          Connection  connect = ConnectionClass.getConnected();
        
        Statement st = connect.createStatement();
         if (cmbStatusCsr3.getSelectedItem()=="Rejected" )
        {if ( txtResponseCsr3.getText().equals("") )
        {   lblSubmit.setText(" ");
            JOptionPane.showMessageDialog(null,"Enter a reason for rejection!");
            flag=0;
        }
        }
           
         if (cmbStatusCsr3.getSelectedItem()=="Processed" )
         {  
             
            try {
             System.out.println(card_No);   
             String q1 = "update credit_card_detail set status='Blocked' where card_no = " + card_No;
              System.out.println(card_No);
                int result=st.executeUpdate(q1);
                System.out.println(result);
            } catch (SQLException ex) {
                Logger.getLogger(LostOrStolenCard.class.getName()).log(Level.SEVERE, null, ex);
            } 
         
         
         
         }
         
        try {
            //ListOfCustomerRequests.csr_id=;
            if (flag==1){
            
           
            String query="update customer_service_request set csr_status='"+cmbStatusCsr3.getSelectedItem().toString()+"' where csr_id="+ListOfCustomerRequests.csr_id ;
            int result=st.executeUpdate(query);
            String query1="update customer_service_request set csr_response='"+txtResponseCsr3.getText()+"' where csr_id="+ListOfCustomerRequests.csr_id ;
            int result1=st.executeUpdate(query1);
            
            lblSubmit.setText("Data submitted!");

}
            
<<<<<<< HEAD
        } catch (SQLException ex) {
            Logger.getLogger(LostOrStolenCard.class.getName()).log(Level.SEVERE, null, ex);
        }
=======
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LostOrStolenCard.class
.getName()).log(Level.SEVERE, null, ex);
        

}
>>>>>>> c7c8d68417ff03f0a93afe0e38a4a7ad488ea57c
         
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(LostOrStolenCard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LostOrStolenCard.class.getName()).log(Level.SEVERE, null, ex);
        } 
         
         
    }//GEN-LAST:event_btnSubmitCsr3ActionPerformed

    private void cmbStatusCsr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusCsr3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStatusCsr3ActionPerformed

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
            java.util.logging.Logger.getLogger(LostOrStolenCard.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LostOrStolenCard.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LostOrStolenCard.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LostOrStolenCard.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LostOrStolenCard().setVisible(true);
                

} catch (ClassNotFoundException ex) {
                    Logger.getLogger(LostOrStolenCard.class
.getName()).log(Level.SEVERE, null, ex);
                

} catch (SQLException ex) {
                    Logger.getLogger(LostOrStolenCard.class
.getName()).log(Level.SEVERE, null, ex);
                }
                                    }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackCsr3;
    private javax.swing.JButton btnSubmitCsr3;
    private javax.swing.JComboBox<String> cmbStatusCsr3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAsterisk;
    private javax.swing.JLabel lblCardNoCsr3;
    private javax.swing.JLabel lblCardTypeCsr3;
    private javax.swing.JLabel lblResponseCsr3;
    private javax.swing.JLabel lblStatusCsr3;
    private javax.swing.JLabel lblSubmit;
    private javax.swing.JLabel lbltxtCardNoCsr3;
    private javax.swing.JLabel lbltxtCardTypeCsr3;
    private javax.swing.JTextArea txtResponseCsr3;
    // End of variables declaration//GEN-END:variables
}
