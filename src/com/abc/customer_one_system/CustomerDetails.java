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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author test
 */
public class CustomerDetails extends javax.swing.JFrame {

    /**
     * Creates new form CustomerDetails
     */
    public CustomerDetails() {
        initComponents();
    }
    int custID;
    public CustomerDetails(int CustID) throws ClassNotFoundException, SQLException {
        initComponents();
        this.custID = CustID;
        Connection connect = ConnectionClass.getConnected();
        Statement statement = connect.createStatement();
        String query = "select * from customer where customer_id=" + CustID + " ";
        String queryAccount = "select account_number,acc_type,balance from account where customer_id=" + CustID + "";
        ResultSet resultData = statement.executeQuery(query);
        if (resultData.next()) {
            String lclName = resultData.getString("NAME");
            int lclCustID = resultData.getInt(1);
            String lclDOB = resultData.getString("DATE_OF_BIRTH");
            lclDOB = lclDOB.substring(0, 10);
            String lclEmail = resultData.getString("EMAIL_ID");
            String pan = resultData.getString("PAN");
            String lclMobile = resultData.getString("MOBILE_NUM");
            outName.setText(lclName);
            outDOB.setText(lclDOB);
            outAddress.setText(resultData.getString("address"));
            outEmailID.setText(lclEmail);
            outContactNo.setText(lclMobile);
            outOccupation.setText(resultData.getString("occupation"));
            outMonthlyIncome.setText(Integer.toString(resultData.getInt("salary")));
            outPAN.setText(resultData.getString("pan"));
            ResultSet resultAcc = statement.executeQuery(queryAccount);
            DefaultTableModel modelData = (DefaultTableModel) tblAccountDetails.getModel();
            while (resultAcc.next()) {
                String accNo =   resultAcc.getString("account_number");
                String accType = resultAcc.getString("acc_type");
                Double balance = resultAcc.getDouble("balance");
                modelData.addRow(new Object[]{accNo, accType, balance});
            }

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

        lblCustomerDetails = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblEmailId = new javax.swing.JLabel();
        lblPAN = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        lblOccupation = new javax.swing.JLabel();
        lblMonthlyIncome = new javax.swing.JLabel();
        outName = new javax.swing.JLabel();
        outDOB = new javax.swing.JLabel();
        outAddress = new javax.swing.JLabel();
        outEmailID = new javax.swing.JLabel();
        outPAN = new javax.swing.JLabel();
        outContactNo = new javax.swing.JLabel();
        outOccupation = new javax.swing.JLabel();
        outMonthlyIncome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAccountDetails = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblAddAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Details");

        lblCustomerDetails.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblCustomerDetails.setText("CUSTOMER DETAILS");

        lblName.setText("Name");

        lblDOB.setText("Date Of Birth");

        lblAddress.setText("Address");

        lblEmailId.setText("Email Id");

        lblPAN.setText("PAN Number");

        lblContactNo.setText("Contact Number");

        lblOccupation.setText("Occupation");

        lblMonthlyIncome.setText("Monthly Income");

        outName.setText(" ");

        outDOB.setText(" ");

        outAddress.setText(" ");

        outEmailID.setText(" ");

        outPAN.setText(" ");

        outContactNo.setText(" ");

        outOccupation.setText(" ");

        outMonthlyIncome.setText(" ");

        tblAccountDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account Number", "Account Type", "Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAccountDetails.setToolTipText("");
        jScrollPane1.setViewportView(tblAccountDetails);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblAddAccount.setText("Add Account");
        lblAddAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAddAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(lblCustomerDetails))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDOB)
                            .addComponent(lblAddress)
                            .addComponent(lblEmailId)
                            .addComponent(lblPAN)
                            .addComponent(lblContactNo)
                            .addComponent(lblOccupation)
                            .addComponent(lblMonthlyIncome))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(outDOB, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(outName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(outAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(outEmailID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(outPAN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(outContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(outOccupation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(outMonthlyIncome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(lblAddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCustomerDetails)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(outName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDOB)
                    .addComponent(outDOB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress)
                    .addComponent(outAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailId)
                    .addComponent(outEmailID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPAN)
                    .addComponent(outPAN))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNo)
                    .addComponent(outContactNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOccupation)
                    .addComponent(outOccupation))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonthlyIncome)
                    .addComponent(outMonthlyIncome))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblAddAccount))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CustomerSearch obj;
        obj = new CustomerSearch();
        obj.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_btnBackActionPerformed

    private void lblAddAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAddAccountActionPerformed
        try {
            AccountSetup obj=new AccountSetup(custID,false);
            obj.setVisible(true);
            this.setVisible(false);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_lblAddAccountActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CustomerDetails().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lblAddAccount;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblCustomerDetails;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblMonthlyIncome;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOccupation;
    private javax.swing.JLabel lblPAN;
    private javax.swing.JLabel outAddress;
    private javax.swing.JLabel outContactNo;
    private javax.swing.JLabel outDOB;
    private javax.swing.JLabel outEmailID;
    private javax.swing.JLabel outMonthlyIncome;
    private javax.swing.JLabel outName;
    private javax.swing.JLabel outOccupation;
    private javax.swing.JLabel outPAN;
    private javax.swing.JTable tblAccountDetails;
    // End of variables declaration//GEN-END:variables
}
