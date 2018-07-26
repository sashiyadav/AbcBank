/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.CreditCardSelfService;

import com.abc.CustomerSelfServiceSystem.CreditCardLogin;
import com.abc.JDBCConnection.ConnectionClass;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author test
 */
public class RedeemRewardPoints extends javax.swing.JFrame {

    /**
     * Creates new form RedeemRewardPoints
     */
    DefaultTableModel model=null;
      int c = 0,f=0;
    public RedeemRewardPoints() throws ClassNotFoundException, SQLException {
        initComponents();
        lblWel.setText(CreditCardLogin.topName);
        Connection connect = ConnectionClass.getConnected();
        Statement st = connect.createStatement();
        String sql = "select c.account_number,c.reward_points from customer u join account a on u.customer_id=a.customer_id join credit_card_detail c on a.account_number=c.account_number where u.customer_id=" + CreditCardLogin.cid;
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            lblAccno.setText(rs.getString(1));
            lblPts.setText(String.valueOf(rs.getInt(2)));
        }
        //String sql1="select product_desc,points_reqd from product where points_reqd<='"+lblPts.getText()+"'";

        String sql1 = "select product_desc,points_reqd from product";// where points_reqd<='"+lblPts.getText()+"'";
        ResultSet rs1 = st.executeQuery(sql1);
      

        while (rs1.next()) {
            try {
                int req = Integer.parseInt(rs1.getString(2));
                int avail = Integer.parseInt(lblPts.getText());
                lblAccno.setText(Integer.toString(req));
                if (req <= avail) {
                    ++c;
                    f=c;
                    model = (DefaultTableModel) tblRedeem.getModel();
                    model.addRow(new Object[]{rs1.getString(1)," ", rs1.getString(2),"",""});
                    

                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

        }
        /*  while(c>0)
         {
            DefaultTableModel model = (DefaultTableModel)tblRedeem.getModel();
            int qty=(int)model.getValueAt(tblRedeem.getSelectedRow(), 3);
            int req=(int)model.getValueAt(tblRedeem.getSelectedRow(), 2);
            int redeem=qty*req;
            if(redeem>Integer.parseInt(lblPts.getText()))
            {
                lblStat.setText("OOPS! Can't redeem because you run out of points");
            }
            else
            {
                 model.setValueAt(redeem, tblRedeem.getSelectedRow(), 4);
                 --c;
            }
            
         }*/

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
        lblWel = new javax.swing.JLabel();
        lblAccNoLHS = new javax.swing.JLabel();
        lblPtsLHS = new javax.swing.JLabel();
        lblAccno = new javax.swing.JLabel();
        lblPts = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRedeem = new javax.swing.JTable();
        lblTotalRedeemedLHS = new javax.swing.JLabel();
        lblTotalRedeemed = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblStat = new javax.swing.JLabel();
        btnProceed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Redeem reward Points");

        lblWel.setText("xxxxxx");

        lblAccNoLHS.setText("Account number :");

        lblPtsLHS.setText("Points available :");

        lblAccno.setText("xxxxxxxx");

        lblPts.setText("xxxxxx");

        tblRedeem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Desc", " Product Image", "Points  needed ", "Quantity", "Points redeemed"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRedeem);

        lblTotalRedeemedLHS.setText("Total points Redeemed");

        lblTotalRedeemed.setText("xxxx");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblStat.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        lblStat.setForeground(new java.awt.Color(235, 16, 16));
        lblStat.setText(" ");

        btnProceed.setText("jButton1");
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAccNoLHS)
                            .addComponent(lblPtsLHS))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPts)
                            .addComponent(lblAccno)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotalRedeemedLHS)
                .addGap(48, 48, 48)
                .addComponent(lblTotalRedeemed)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnProceed)
                .addGap(39, 39, 39)
                .addComponent(btnSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblWel)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblWel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccNoLHS)
                    .addComponent(lblAccno))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPts)
                    .addComponent(lblPtsLHS))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalRedeemedLHS)
                    .addComponent(lblTotalRedeemed))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnBack)
                    .addComponent(btnProceed))
                .addGap(34, 34, 34)
                .addComponent(lblStat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ListOfCreditCardAcc cca = new ListOfCreditCardAcc();
        cca.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        findSum();
        System.out.println("sum in submit "+sum);
          if(sum>Integer.parseInt(lblPts.getText()))
              lblStat.setText("Limit is exceeded...can't redeem");
          else
          {
              
          }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        
            getQty();
    }//GEN-LAST:event_btnProceedActionPerformed

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
            java.util.logging.Logger.getLogger(RedeemRewardPoints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RedeemRewardPoints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RedeemRewardPoints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RedeemRewardPoints.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RedeemRewardPoints().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RedeemRewardPoints.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(RedeemRewardPoints.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProceed;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAccNoLHS;
    private javax.swing.JLabel lblAccno;
    private javax.swing.JLabel lblPts;
    private javax.swing.JLabel lblPtsLHS;
    private javax.swing.JLabel lblStat;
    private javax.swing.JLabel lblTotalRedeemed;
    private javax.swing.JLabel lblTotalRedeemedLHS;
    private javax.swing.JLabel lblWel;
    private javax.swing.JTable tblRedeem;
    // End of variables declaration//GEN-END:variables
 List<Integer>l=new ArrayList<Integer>();
 int sum=0;
    private void getQty() {
        //model = (DefaultTableModel) tblRedeem.getModel();
        for(int i=0;i<tblRedeem.getRowCount();i++)
        {
        tblRedeem.editCellAt(tblRedeem.getSelectedRow(), 3);
        
        try {
            int qty = Integer.parseInt((String) model.getValueAt(i,3));
            System.out.println("c= "+c);
            int req1 = Integer.parseInt((String) model.getValueAt(i,2));
            
            int redeem = qty * req1;
            //lblPts.setText(String.valueOf(qty));
            String str=lblPts.getText();
            //model.setValueAt(redeem, tblRedeem.getSelectedRow(), 4);
            model.setValueAt(redeem,i, 4);
            System.out.println(i);
            if (redeem > Integer.parseInt(str) ){
                lblStat.setText("OOPS! Can't redeem because you run out of points");
            } 
            else {
                model.setValueAt(redeem, tblRedeem.getSelectedRow(), 4);
                lblStat.setText("");
                //--c;
            }
           
            l.add((Integer) model.getValueAt(tblRedeem.getSelectedRow(),4));
            if(c==0)
                findSum();
            
            
        }catch (NumberFormatException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        }
        
    }
    public void findSum()
    {
          for(int i:l)
                sum+=i;
          System.out.println("sum is: "+sum);
        
              
    }
    
    
          
                
}
