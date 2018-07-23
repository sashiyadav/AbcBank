/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.CustomerSelfServiceSystem;


import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author test
 */
public class BillPaymentMenu extends javax.swing.JFrame {

    /**
     * Creates new form BillPaymentMenu
     */
    public BillPaymentMenu() {
        initComponents();
        String str=BillPaymentLogin.cust_name; 
        lblMsg.setText("WELCOME "+ str);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnManageBillers = new javax.swing.JButton();
        btnMakePayment = new javax.swing.JButton();
        btnViewPayment = new javax.swing.JButton();
        btnLogOff = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Bill Payment Menu");

        btnManageBillers.setText("Manage Billers");
        btnManageBillers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageBillersActionPerformed(evt);
            }
        });

        btnMakePayment.setText("Make Payment");
        btnMakePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakePaymentActionPerformed(evt);
            }
        });

        btnViewPayment.setText("View Payment History");
        btnViewPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPaymentActionPerformed(evt);
            }
        });

        btnLogOff.setText("Log Off");
        btnLogOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLogOff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageBillers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMakePayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(3, 3, 3)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnManageBillers)
                    .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnMakePayment)
                .addGap(18, 18, 18)
                .addComponent(btnViewPayment)
                .addGap(18, 18, 18)
                .addComponent(btnLogOff)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageBillersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageBillersActionPerformed
        try
        {
        ListOfBillers listOfBillers=new ListOfBillers();
        listOfBillers.setVisible(true);
        this.setVisible(false);
        }
        catch(ClassNotFoundException | SQLException e){}
    }//GEN-LAST:event_btnManageBillersActionPerformed

    private void btnMakePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakePaymentActionPerformed
        try
        {
        MakePayment payment=new MakePayment();
        payment.setVisible(true);
<<<<<<< HEAD
        
=======
        this.setVisible(false);
        }
        catch(ClassNotFoundException | SQLException e){}
>>>>>>> cb689a3f8b8a23874e546e8dc00ea51b476b06e4
    }//GEN-LAST:event_btnMakePaymentActionPerformed
    
    private void btnViewPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPaymentActionPerformed
        ViewPaymentHistory history=new ViewPaymentHistory();
        this.setVisible(false);
        history.setVisible(true);
        LocalDate todaydate = LocalDate.now();
        //history.txtTo.setText(String.valueOf(todaydate));
    }//GEN-LAST:event_btnViewPaymentActionPerformed

    private void btnLogOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOffActionPerformed
        CustomerLogin obj=new CustomerLogin();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogOffActionPerformed

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
            java.util.logging.Logger.getLogger(BillPaymentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillPaymentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillPaymentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillPaymentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillPaymentMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOff;
    private javax.swing.JButton btnMakePayment;
    private javax.swing.JButton btnManageBillers;
    private javax.swing.JButton btnViewPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMsg;
    // End of variables declaration//GEN-END:variables
}
