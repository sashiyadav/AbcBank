/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.CreditCardSelfService;

import com.abc.CustomerSelfServiceSystem.CreditCardLogin;
import com.abc.CustomerSelfServiceSystem.CustomerLogin;
import com.abc.CustomerSelfServiceSystem.CustomerLoginTo;
import com.abc.JDBCConnection.ConnectionClass;
import com.abc.customer_one_system.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author test
 */
public class SelfServiceMenu extends javax.swing.JFrame {

    /**
     * Creates new form SelfServiceMenu
     */
     public String name;
     public SelfServiceMenu()
     {
         initComponents();
     }
    public SelfServiceMenu(String name) throws ClassNotFoundException, SQLException {
        initComponents();
        /*  Connection con=ConnectionClass.getConnected();
        Statement st=con.createStatement();
        String s="select name from customer where customer_id="+CreditCardLogin.cid;
        ResultSet rs=st.executeQuery(s);    
        while(rs.next()){
            lblWelcome.setText(rs.getString(1));}*/
         lblWelcome.setText("welcome "+name);
        
    }
          
       
    
   /* public void setWel(String name)
    {
        lblWelcome.setText(name);
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle2 = new javax.swing.JLabel();
        btnRedeem = new javax.swing.JButton();
        btnViewStatus = new javax.swing.JButton();
        btnSignOut = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        btnCardAccounts = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle2.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        lblTitle2.setText("Credit card self-service menu ");

        btnRedeem.setText("Redeem reward points");
        btnRedeem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedeemActionPerformed(evt);
            }
        });

        btnViewStatus.setText("view request status");
        btnViewStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStatusActionPerformed(evt);
            }
        });

        btnSignOut.setText("Sign out");
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });

        lblWelcome.setText("                               ");

        btnCardAccounts.setText("List of Credit Card Accounts");
        btnCardAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCardAccountsActionPerformed(evt);
            }
        });

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnViewStatus)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitle2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnHome)
                                    .addComponent(lblWelcome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSignOut))
                            .addComponent(btnCardAccounts)
                            .addComponent(btnRedeem))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnRedeem))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWelcome)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHome)
                            .addComponent(btnSignOut))))
                .addGap(26, 26, 26)
                .addComponent(btnCardAccounts)
                .addGap(28, 28, 28)
                .addComponent(btnViewStatus)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRedeemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedeemActionPerformed
        // TODO add your handling code here:
        RedeemRewardPoints rrp;
         try {
             rrp = new RedeemRewardPoints();
               rrp.setVisible(true);
          this.setVisible(false);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(SelfServiceMenu.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(SelfServiceMenu.class.getName()).log(Level.SEVERE, null, ex);
         }
      
    }//GEN-LAST:event_btnRedeemActionPerformed

    private void btnViewStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStatusActionPerformed
        // TODO add your handling code here:
        ViewRequestStatus vrs;
         
         try {
             vrs = new ViewRequestStatus();
             vrs.setVisible(true);
             this.setVisible(false);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(SelfServiceMenu.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(SelfServiceMenu.class.getName()).log(Level.SEVERE, null, ex);
         }
      
    }//GEN-LAST:event_btnViewStatusActionPerformed

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        // TODO add your handling code here:
        CreditCardLogin l=new  CreditCardLogin();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSignOutActionPerformed

    private void btnCardAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCardAccountsActionPerformed
        // TODO add your handling code here:
        ListOfCreditCardAcc cca=new ListOfCreditCardAcc();
         cca.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_btnCardAccountsActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
       CustomerLoginTo menu=new CustomerLoginTo();
       menu.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(SelfServiceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelfServiceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelfServiceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelfServiceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SelfServiceMenu(CreditCardLogin.topName).setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SelfServiceMenu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(SelfServiceMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
       
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCardAccounts;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRedeem;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JButton btnViewStatus;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
