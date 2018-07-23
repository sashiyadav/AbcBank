/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.CustomerSelfServiceSystem;

//import com.abc.customer_one_system.MatchFormats;

import com.abc.JDBCConnection.ConnectionClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Locale;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author test
 */
public class MakePayment extends javax.swing.JFrame {

    /**
     * Creates new form MakePayment
     */
    
    public static String customer_id="";
    public static String biller_id="";

    public MakePayment() throws ClassNotFoundException, SQLException {
        initComponents();
        //BillPaymentLogin login=new BillPaymentLogin(); 
        Connection connect = ConnectionClass.getConnected();
        String customer_id=BillPaymentLogin.cust_id;
        String statement = "select b.biller_name from biller b join customer c on b.customer_id=c.customer_id where c.customer_id=?";
        PreparedStatement stmt = connect.prepareStatement(statement);
        stmt.setString(1,customer_id);
        ResultSet rs = stmt.executeQuery();
        while(rs.next())
        {
            cbmBiller.addItem(rs.getString(1));
        }
        statement="select a.account_number from account a join customer c on a.customer_id=c.customer_id where c.customer_id=?";
        stmt=connect.prepareStatement(statement);
        stmt.setString(1,customer_id);
        rs=stmt.executeQuery();
        while(rs.next())
        {
                cbmAcNo.addItem(rs.getString(1));
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

        btnGroupPay = new javax.swing.ButtonGroup();
        lblAcNo = new javax.swing.JLabel();
        lblBiller = new javax.swing.JLabel();
        lblBillAmount = new javax.swing.JLabel();
        lblPayNow = new javax.swing.JLabel();
        lblPayDueDate = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbmAcNo = new javax.swing.JComboBox<>();
        cbmBiller = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        radYes = new javax.swing.JRadioButton();
        radNo = new javax.swing.JRadioButton();
        txtPayDueDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MsgBiller = new javax.swing.JLabel();
        MsgAcNo = new javax.swing.JLabel();
        MsgAmount = new javax.swing.JLabel();
        MsgDate = new javax.swing.JLabel();
        MsgPay = new javax.swing.JLabel();
        lblMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAcNo.setText("AC No.");

        lblBiller.setText("Biller");

        lblBillAmount.setText("Bill Amount");

        lblPayNow.setText("Pay now?");

        lblPayDueDate.setText("Payment Due Date");

        jLabel6.setForeground(new java.awt.Color(252, 11, 11));
        jLabel6.setText("*");


        cbmAcNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "item1", "item2", "item3", "item4", " " }));
        cbmAcNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "add account" }));
        cbmAcNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmAcNoActionPerformed(evt);
            }
        });

        cbmBiller.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select biller" }));

        jLabel7.setForeground(new java.awt.Color(249, 6, 6));
        jLabel7.setText("*");

        jLabel8.setForeground(new java.awt.Color(246, 9, 9));
        jLabel8.setText("*");

        txtAmount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAmountMouseClicked(evt);
            }
        });

        btnGroupPay.add(radYes);
        radYes.setText("Yes");
        radYes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radYesMouseClicked(evt);
            }
        });

        btnGroupPay.add(radNo);
        radNo.setText("No");
        radNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radNoMouseClicked(evt);
            }
        });

        txtPayDueDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPayDueDateMouseClicked(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(251, 8, 8));
        jLabel9.setText("*");

        jLabel10.setForeground(new java.awt.Color(252, 7, 7));
        jLabel10.setText("*");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel11.setText("Make Payment");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("x,xx,xx,xxx");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSubmit)
                        .addGap(48, 48, 48)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAcNo)
                    .addComponent(lblBiller)
                    .addComponent(lblBillAmount)
                    .addComponent(lblPayNow)
                    .addComponent(lblPayDueDate))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAmount)
                    .addComponent(cbmBiller, 0, 134, Short.MAX_VALUE)
                    .addComponent(txtPayDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radYes)
                        .addGap(34, 34, 34)
                        .addComponent(radNo))
                    .addComponent(cbmAcNo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MsgDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MsgPay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MsgAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MsgBiller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MsgAcNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbmAcNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAcNo))
                                .addGap(18, 18, 18)
                                .addComponent(lblBiller))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbmBiller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MsgAcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MsgBiller, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBillAmount)
                            .addComponent(jLabel8)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(MsgAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPayNow)
                            .addComponent(radYes)
                            .addComponent(radNo)
                            .addComponent(jLabel9))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MsgPay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPayDueDate)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPayDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MsgDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSubmit)
                            .addComponent(btnCancel))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        BillPaymentMenu menu=new BillPaymentMenu();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        //MatchFormats match=new MatchFormats();
        boolean flag = true;
        double am=0;
        try
        {
            lblMsg.setText("");
            String acNo=cbmAcNo.getSelectedItem().toString();
            if(acNo.equals(""))
            {
                MsgAcNo.setText("Cannot be empty");
                flag &= false;
            }
            else
            {
                MsgAcNo.setText("");
                flag &=true;
            }
        
            String name=cbmBiller.getSelectedItem().toString();
            if(name.equals(""))
            {
                MsgBiller.setText("Cannot be empty");
                flag &= false;
            }
            else
            {   
                MsgBiller.setText("");
                flag &=true;
            }
            if(!radNo.isSelected() && !radYes.isSelected())
            {
                MsgPay.setText("cannot be empty");
                flag &=false;
            }
            else
            {
                flag &=true;
            }
            String amount=txtAmount.getText().trim();
            if(amount.equals(""))
            {
                MsgAmount.setText("Cannot be empty");
                flag &=false;
            }
            else
            {
                am=Double.parseDouble(txtAmount.getText());
            }
            String date=txtPayDueDate.getText().trim();
            if(date.equals(""))
            {
                MsgDate.setText("Cannot be empty");
                flag &=false;
            }
            else
            {
                flag &=true;
            }
            if(flag)
            {
                lblMsg.setText("Processing");
                Connection con=ConnectionClass.getConnected();
                DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MMM/yyyy");
                //String todate = String.valueOf(LocalDate.parse(date, f));
                String paydate=String.valueOf(f.format(LocalDate.now()));
                //System.out.println("date="+date+" paydate="+paydate);
                addPayment(am,date,paydate,"Pending",acNo,getBiller(name,acNo,con),con);
            }
            else
            {
                lblMsg.setText("Invalid Entry");
            }
        }
        catch(NumberFormatException e)
        {
            lblMsg.setText("Invalid input(s)");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MakePayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed
private void addPayment(Double amount,String dueDate,String date,String status,String acc,String billerId,Connection connect) throws SQLException
{
    String query="insert into make_payment values(?,?,?,?,billNo_seq.NEXTVAL,?,?)";
    PreparedStatement stmt=connect.prepareStatement(query);
    stmt.setDouble(1,amount);
    stmt.setString(2,dueDate);
    stmt.setString(3,date);
    stmt.setString(4,status);
    //stmt.setInt(5,billNo);
    stmt.setString(5,acc);
    stmt.setString(6,billerId);
    stmt.execute();
    //System.out.println("add Payment method");
}

private String getBiller(String name,String acNo,Connection con) throws SQLException, ClassNotFoundException
{
    String query="select biller_id from biller where biller_name=? and customer_id=?";
    PreparedStatement stmt=con.prepareStatement(query);
    stmt.setString(1,name);
    stmt.setString(2,getCustId(acNo,con));
    ResultSet rs=stmt.executeQuery();
    //System.out.println("get Biller method");
    while(rs.next()) {biller_id=rs.getString(1);}
    return biller_id;
}
private String getCustId(String acNo,Connection con) throws ClassNotFoundException, SQLException
{
    String query="select customer_id from account where account_number=?";
    PreparedStatement stmt=con.prepareStatement(query);
    stmt.setString(1,acNo);
    ResultSet rs=stmt.executeQuery();
    //System.out.println("get cust_id method");
    while(rs.next()) { customer_id=rs.getString(1);}
    return customer_id;
}
    private void cbmAcNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmAcNoActionPerformed
<<<<<<< HEAD
        // TODO add your handling code here:
=======

>>>>>>> c00ca001d943a6cfc73b7b46f5fadc21d2f006df
    }//GEN-LAST:event_cbmAcNoActionPerformed

    private void txtAmountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAmountMouseClicked
        if(!MsgAmount.getText().trim().equals(""))
        {
            MsgAmount.setText("");
        }
    }//GEN-LAST:event_txtAmountMouseClicked

    private void radYesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radYesMouseClicked
        if(!MsgPay.getText().trim().equals(""))
        {
            MsgPay.setText("");
        }
    }//GEN-LAST:event_radYesMouseClicked

    private void radNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radNoMouseClicked
        if(!MsgPay.getText().trim().equals(""))
        {
            MsgPay.setText("");
        }
    }//GEN-LAST:event_radNoMouseClicked

    private void txtPayDueDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPayDueDateMouseClicked
        if(!MsgDate.getText().trim().equals(""))
        {
            MsgDate.setText("");
        }
    }//GEN-LAST:event_txtPayDueDateMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new MakePayment().setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(MakePayment.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MsgAcNo;
    private javax.swing.JLabel MsgAmount;
    private javax.swing.JLabel MsgBiller;
    private javax.swing.JLabel MsgDate;
    private javax.swing.JLabel MsgPay;
    private javax.swing.JButton btnCancel;
    private javax.swing.ButtonGroup btnGroupPay;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cbmAcNo;
    private javax.swing.JComboBox<String> cbmBiller;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAcNo;
    private javax.swing.JLabel lblBillAmount;
    private javax.swing.JLabel lblBiller;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblPayDueDate;
    private javax.swing.JLabel lblPayNow;
    private javax.swing.JRadioButton radNo;
    private javax.swing.JRadioButton radYes;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtPayDueDate;
    // End of variables declaration//GEN-END:variables
}
