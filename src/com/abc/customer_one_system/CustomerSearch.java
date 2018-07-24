/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.customer_one_system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author test
 */
public class CustomerSearch extends javax.swing.JFrame {

    /**
     * Creates new form CustomerSearch
     */
    static Boolean dataFlag[] = {false,false,false,false,false,false,false};
    static String name="", dob="", accountNo="", emailID="", PAN="", mobile="";
    static int customerID=0;
    public CustomerSearch() {
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

        lblName = new javax.swing.JLabel();
        lblCustomerID = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblAccountNo = new javax.swing.JLabel();
        lblEmailID = new javax.swing.JLabel();
        lblPANNo = new javax.swing.JLabel();
        lblMobileNo = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCustomerID = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtAccountNo = new javax.swing.JTextField();
        txtEmailID = new javax.swing.JTextField();
        txtPAN = new javax.swing.JTextField();
        txtMobileNo = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblCustomerSearch = new javax.swing.JLabel();
        lblDateFormat = new javax.swing.JLabel();
        lblCustIDFormat = new javax.swing.JLabel();
        lblNameFormat = new javax.swing.JLabel();
        lblAccountNoFormat = new javax.swing.JLabel();
        lblEmailFormat = new javax.swing.JLabel();
        lblPANFormat = new javax.swing.JLabel();
        lblMobileNoFormat = new javax.swing.JLabel();
        lblMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Search");

        lblName.setText("Name  ");

        lblCustomerID.setText("Customer ID");

        lblDOB.setText("Date of Dirth");

        lblAccountNo.setText("Account Number");

        lblEmailID.setText("Email ID");

        lblPANNo.setText("PAN Number");

        lblMobileNo.setText("Mobile Number");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        txtAccountNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountNoActionPerformed(evt);
            }
        });

        txtMobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileNoActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblCustomerSearch.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblCustomerSearch.setText("CUSTOMER SEARCH");

        lblDateFormat.setText("dd/mm/yyyy");

        lblCustIDFormat.setText(" ");

        lblNameFormat.setText(" ");

        lblAccountNoFormat.setText(" ");

        lblEmailFormat.setText(" ");

        lblPANFormat.setText(" ");

        lblMobileNoFormat.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblAccountNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomerID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDOB, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmailID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPANNo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMobileNo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomerSearch)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMobileNo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPAN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmailID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAccountNo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDOB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustomerID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNameFormat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCustIDFormat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAccountNoFormat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmailFormat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPANFormat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMobileNoFormat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDateFormat, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear)
                        .addGap(27, 27, 27)
                        .addComponent(btnBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblCustomerSearch)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameFormat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerID)
                    .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustIDFormat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDateFormat))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountNo)
                    .addComponent(txtAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccountNoFormat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailID)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailFormat))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPANNo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPANFormat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMobileNo)
                    .addComponent(lblMobileNoFormat))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnClear)
                    .addComponent(btnBack)
                    .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ResultSet rs = null;
    private void txtAccountNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountNoActionPerformed

    private void txtMobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileNoActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtName.setText("");
        txtCustomerID.setText("");
        txtDOB.setText("");
        txtAccountNo.setText("");
        txtEmailID.setText("");
        txtPAN.setText("");
        txtMobileNo.setText("");
        lblDateFormat.setText("dd/mm/yyyy");
        lblEmailFormat.setText("");
        lblCustIDFormat.setText("");
        lblPANFormat.setText("");
        lblMobileNoFormat.setText("");
        lblNameFormat.setText("");
        lblAccountNoFormat.setText("");
        for(int i=0;i<7;i++){
            dataFlag[i]=false;
        }
        name="";
        dob="";
        accountNo="";
        emailID="";
        PAN="";
        mobile="";
        customerID=0;
    
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            MainMenu obj = new MainMenu();
            obj.setVisible(true);
            this.setVisible(false);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackActionPerformed
    //name 1, custID 2, dob 3, accountNo 4, email 5 
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        MatchFormats match = new MatchFormats();
        boolean isValid = true;
        try {
            name = txtName.getText().trim();
            if (!name.equals("")) {
                if (match.matchName(name)) {
                    dataFlag[0] = true;
                } else {
                    lblNameFormat.setText("Invalid name");
                    isValid = false;
                }
            } else {
                lblNameFormat.setText("");
            }
            if (!txtCustomerID.getText().equals("")) {
                customerID = Integer.parseInt(txtCustomerID.getText());
                dataFlag[1] = true;
            }
            dob = txtDOB.getText().trim();
            //date of bith is in form dd/mm/yyyy
            if (!dob.equals("")) {
                if (match.matchDOB(dob)) {
                    dataFlag[2] = true;
                } else {
                    lblDateFormat.setText("Invalid");
                    isValid = false;
                }
            } else {
                lblDateFormat.setText("dd/mm/yyyy");
            }
            accountNo = txtAccountNo.getText().trim();
            if (!accountNo.equals("")) {
                if (match.matchAccountNumber(accountNo)) {
                    dataFlag[3] = true;
                } else {
                    lblAccountNoFormat.setText("Invalid format");
                    isValid = false;
                }
            } else {
                lblAccountNoFormat.setText("");
            }
            emailID = txtEmailID.getText().toLowerCase();
            if (!emailID.equals("")) {
                if (match.matchEmail(emailID)) {
                    dataFlag[4] = true;
                } else {
                    lblEmailFormat.setText("Invalid Email ID");
                    isValid = false;
                }
            } else {
                lblEmailFormat.setText("");
            }
            PAN = txtPAN.getText().trim();
            if (!PAN.equals("")) {
                if (match.matchPAN(PAN)) {
                    dataFlag[5] = true;
                } else {
                    lblPANFormat.setText("Invalid pan");
                    isValid = false;
                }
            } else {
                lblPANFormat.setText("");
            }
            mobile = txtMobileNo.getText().trim().replace(" ", "");
            if (!mobile.equals("")) {
                if (match.matchMobileNo(mobile)) {
                    dataFlag[6] = true;
                } else {
                    lblMobileNoFormat.setText("Invalid mobile no.");
                    isValid = false;
                }
            } else {
                lblMobileNoFormat.setText("");
            }

        } catch (NumberFormatException e) {
            lblMsg.setText("Enter valid data");
            isValid = false;
        }
        if (isValid) {
            try {
                ListCustomers obj = new ListCustomers();
                obj.setVisible(true);
                this.setVisible(false);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(CustomerSearch.class.getName()).log(Level.SEVERE, null, ex);
            }catch (Exception e){
                lblMsg.setText("Error");
            }
        }


    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CustomerSearch().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lblAccountNo;
    private javax.swing.JLabel lblAccountNoFormat;
    private javax.swing.JLabel lblCustIDFormat;
    private javax.swing.JLabel lblCustomerID;
    private javax.swing.JLabel lblCustomerSearch;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDateFormat;
    private javax.swing.JLabel lblEmailFormat;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblMobileNo;
    private javax.swing.JLabel lblMobileNoFormat;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameFormat;
    private javax.swing.JLabel lblPANFormat;
    private javax.swing.JLabel lblPANNo;
    private javax.swing.JTextField txtAccountNo;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPAN;
    // End of variables declaration//GEN-END:variables
}
