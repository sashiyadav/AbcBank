/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.CustomerSelfServiceSystem;

import com.abc.JDBCConnection.ConnectionClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivasai
 */

public class Accounts extends javax.swing.JFrame {

    static int accno;
    
    /**
     * Creates new form Accounts
     */
    public Accounts() {
        initComponents();
         wellbl.setText(CustomerServiceMenu.wel);
        //int id=CustomerLogin.customerid;
        //int id=CustomerLogin.customerid;
        int id=CustomerLogin.customerid;
        
        
        
         try
        {
            
            Connection con=ConnectionClass.getConnected();
            String query="select account_number,acc_type,balance from account where customer_id="+id;
            PreparedStatement stmt=con.prepareStatement(query);
          
            ResultSet s=stmt.executeQuery();
            double avg;
            int count;
            while(s.next())
            {
                avg=0.0;
                count=0;
                String query1="select closing_balance from transaction_ where account_number="+s.getInt(1);
                PreparedStatement stmt1=con.prepareStatement(query1);
                ResultSet s1=stmt1.executeQuery();
                while(s1.next())
                {
                    count++;
                    avg+=s1.getDouble(1);
                }
                if(count>0)
                {
                    avg/=count;
                }
                else
                {
                    avg=s.getDouble(3);
                }
                
            
            DefaultTableModel model=(DefaultTableModel)accountsTbl.getModel();
            model.addRow(new Object[]{s.getInt(1),s.getString(2),s.getDouble(3),avg});
            
           
    }
        }
         catch(SQLException | ClassNotFoundException e)
         {
             e.printStackTrace();
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

        header4 = new javax.swing.JLabel();
        wellbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        accountsTbl = new javax.swing.JTable();
        backBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MY ACCOUNTS");

        header4.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        header4.setText("My Accounts");

        wellbl.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        wellbl.setText("Welcome    ");

        accountsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account Number", "Account Type", "Account Balance", "Average balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        accountsTbl.getTableHeader().setReorderingAllowed(false);
        accountsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountsTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(accountsTbl);

        backBt.setText("Back");
        backBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(header4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(wellbl)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(backBt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(header4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wellbl))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backBt)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtActionPerformed
        CustomerServiceMenu obj = new CustomerServiceMenu();
        obj.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_backBtActionPerformed

    private void accountsTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsTblMouseClicked
           
        int row=accountsTbl.getSelectedRow();
                int column=0;
        accno=(Integer)(accountsTbl.getValueAt(row, column));
                AccountStatement obj = new AccountStatement();
                obj.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_accountsTblMouseClicked

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
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accounts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable accountsTbl;
    private javax.swing.JButton backBt;
    private javax.swing.JLabel header4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel wellbl;
    // End of variables declaration//GEN-END:variables
}
