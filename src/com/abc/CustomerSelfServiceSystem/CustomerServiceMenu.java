/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.CustomerSelfServiceSystem;

/**
 *
 * @author shivasai
 */
public class CustomerServiceMenu extends javax.swing.JFrame {

    /**
     * Creates new form CustomerServiceMenu
     */
    public CustomerServiceMenu() {
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

        header2 = new javax.swing.JLabel();
        wellbl = new javax.swing.JLabel();
        signOutBt = new javax.swing.JButton();
        myprofileBt = new javax.swing.JButton();
        mkSerReqBt = new javax.swing.JButton();
        vewReqStatusBt = new javax.swing.JButton();
        viewStatBt = new javax.swing.JButton();
        chgPassBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        header2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        header2.setText("Customer Service Menu");

        wellbl.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        wellbl.setText("Welcome");

        signOutBt.setText("Signout");
        signOutBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutBtActionPerformed(evt);
            }
        });

        myprofileBt.setText("MyProfile");
        myprofileBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myprofileBtActionPerformed(evt);
            }
        });

        mkSerReqBt.setText("Make a Service Request");
        mkSerReqBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mkSerReqBtActionPerformed(evt);
            }
        });

        vewReqStatusBt.setText("View Request Status");
        vewReqStatusBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vewReqStatusBtActionPerformed(evt);
            }
        });

        viewStatBt.setText("View Statement");
        viewStatBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStatBtActionPerformed(evt);
            }
        });

        chgPassBt.setText("Change Password");
        chgPassBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chgPassBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(signOutBt)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(header2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(wellbl, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chgPassBt)
                            .addComponent(viewStatBt)
                            .addComponent(vewReqStatusBt)
                            .addComponent(mkSerReqBt)
                            .addComponent(myprofileBt))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wellbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(signOutBt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myprofileBt)
                .addGap(26, 26, 26)
                .addComponent(chgPassBt)
                .addGap(21, 21, 21)
                .addComponent(viewStatBt)
                .addGap(33, 33, 33)
                .addComponent(mkSerReqBt)
                .addGap(27, 27, 27)
                .addComponent(vewReqStatusBt))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myprofileBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myprofileBtActionPerformed
                MyProfile obj = new MyProfile();
                obj.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_myprofileBtActionPerformed

    private void mkSerReqBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mkSerReqBtActionPerformed
                ServiceRequest obj = new ServiceRequest();
                obj.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_mkSerReqBtActionPerformed

    private void viewStatBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStatBtActionPerformed
                Accounts obj = new Accounts();
                obj.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_viewStatBtActionPerformed

    private void signOutBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutBtActionPerformed
                CustomerLogin obj = new CustomerLogin();
                obj.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_signOutBtActionPerformed

    private void vewReqStatusBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vewReqStatusBtActionPerformed
        
                ViewRequestStatus obj = new ViewRequestStatus();
                obj.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_vewReqStatusBtActionPerformed

    private void chgPassBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chgPassBtActionPerformed
            ChangePassword obj = new ChangePassword();
            obj.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_chgPassBtActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerServiceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerServiceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerServiceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerServiceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerServiceMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chgPassBt;
    private javax.swing.JLabel header2;
    private javax.swing.JButton mkSerReqBt;
    private javax.swing.JButton myprofileBt;
    private javax.swing.JButton signOutBt;
    private javax.swing.JButton vewReqStatusBt;
    private javax.swing.JButton viewStatBt;
    private javax.swing.JLabel wellbl;
    // End of variables declaration//GEN-END:variables
}
