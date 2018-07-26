/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.CustomerSelfServiceSystem;

import com.abc.JDBCConnection.ConnectionClass;
import com.abc.customer_one_system.MatchFormats;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author test
 */
public class ModifyBillerInfo extends javax.swing.JFrame {

    /**
     * Creates new form ModifyBillerInfo
     */
    public ModifyBillerInfo() {
        initComponents();
    }

    public ModifyBillerInfo(String name,String acNo,String add)
    {
        initComponents();
        txtBillerName.setText(name);
        txtBillerAcNo.setText(acNo);
        txtAddress.setText(add);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpStat = new javax.swing.ButtonGroup();
        lblBillerName = new javax.swing.JLabel();
        txtBillerName = new javax.swing.JTextField();
        lblAccNo = new javax.swing.JLabel();
        txtBillerAcNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblPinCode = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPin = new javax.swing.JTextField();
        cbmCategory = new javax.swing.JComboBox<>();
        lblCategory = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        radYes = new javax.swing.JRadioButton();
        radNo = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        lblPayNow = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        MsgBiller = new javax.swing.JLabel();
        MsgAddress = new javax.swing.JLabel();
        MsgCity = new javax.swing.JLabel();
        MsgPin = new javax.swing.JLabel();
        MsgCategory = new javax.swing.JLabel();
        lblMsg = new javax.swing.JLabel();
        MsgAcNo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblStat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBillerName.setText("Biller Name");

        lblAccNo.setText("Account No");

        txtBillerAcNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillerAcNoActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(249, 9, 6));
        jLabel2.setText("*");

        jLabel3.setForeground(new java.awt.Color(249, 9, 6));
        jLabel3.setText("*");

        lblAddress.setText("Address");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(249, 9, 6));
        jLabel7.setText("*");

        lblCity.setText("City");

        jLabel8.setForeground(new java.awt.Color(249, 9, 6));
        jLabel8.setText("*");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        lblPinCode.setText("Pin Code");

        jLabel9.setForeground(new java.awt.Color(249, 9, 6));
        jLabel9.setText("*");

        cbmCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "item1", "item2", " ", " " }));

        lblCategory.setText("Category");

        jLabel10.setForeground(new java.awt.Color(249, 9, 6));
        jLabel10.setText("*");

        btnGrpStat.add(radYes);
        radYes.setText("Active");
        radYes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radYesMouseClicked(evt);
            }
        });

        btnGrpStat.add(radNo);
        radNo.setText("Inactive");
        radNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radNoMouseClicked(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(251, 8, 8));
        jLabel11.setText("*");

        lblPayNow.setText("Status");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Modify Biller Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAccNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBillerName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAddress)
                                    .addComponent(lblPinCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBillerName, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(txtBillerAcNo)
                                            .addComponent(txtAddress)
                                            .addComponent(txtCity)
                                            .addComponent(txtPin)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCategory)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblPayNow)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(cbmCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radYes)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radNo)))
                                        .addGap(6, 6, 6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBack)
                                        .addGap(23, 23, 23)))))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MsgPin, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MsgCity, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MsgAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(MsgBiller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MsgAcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblStat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MsgCategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MsgBiller, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MsgAcNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBillerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBillerName)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblAccNo)
                                .addComponent(jLabel3))
                            .addComponent(txtBillerAcNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblAddress))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MsgAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblCity)
                        .addGap(18, 18, 18)
                        .addComponent(lblPinCode))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MsgCity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MsgPin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCategory)
                        .addComponent(jLabel10)
                        .addComponent(cbmCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MsgCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPayNow)
                                .addComponent(radYes)
                                .addComponent(radNo)
                                .addComponent(lblStat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnBack)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBillerAcNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBillerAcNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBillerAcNoActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void radYesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radYesMouseClicked
        
    }//GEN-LAST:event_radYesMouseClicked

    private void radNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radNoMouseClicked
       
    }//GEN-LAST:event_radNoMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try{
        ListOfBillers list= new ListOfBillers();
        this.setVisible(false);
        list.setVisible(true);
        }
        catch(ClassNotFoundException | SQLException e){}
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try
        {
            //System.out.println("inside update");
        //ListOfBillers billers=new ListOfBillers();
        //this.setVisible(false);
        //billers.setVisible(true);
        MatchFormats match = new MatchFormats();
        boolean flag = true;
        try {
            //System.out.println(flag+" first");
            //System.out.println("inside update");
            lblMsg.setText("first");
            String name = txtBillerName.getText().trim();
            System.out.println("name "+ name);
            if (!name.equals("")) //&& match.matchName(name)) 
            {
                //System.out.println("inside else in biller");
                MsgBiller.setText("");
                flag &= true;              
            } 
            else if(!match.matchName(name))
            {
                MsgBiller.setText("Invalid Name format");
                flag &=false;
            }
            else 
            {
                MsgBiller.setText("Cannot be empty");
                flag &= false;
            }
            String ac_no = txtBillerAcNo.getText().trim();
            if(ac_no.equals("")) {
                MsgAcNo.setText("Cannot be empty");
                flag &= false;
            } else 
            {
                MsgAcNo.setText("");
                flag &= true;
            }                   
            String address = txtAddress.getText().trim();
            if (address.equals("")) {
                MsgAddress.setText("Cannot be empty");
                flag &= false;
            } else 
            {
                MsgAddress.setText("");
                flag &= true;
            }
            String city = txtCity.getText().trim();
            if (city.equals("")) {
                MsgCity.setText("Cannot be empty");
                flag &= false;
            } else {
                MsgCity.setText("");
            }
            String pin = txtPin.getText().trim();
            if (pin.equals("")) 
            {
                MsgPin.setText("Cannot be empty");
                flag &= false;
            } 
            else if (!match.matchPIN(pin)) 
            {
                MsgPin.setText("Invalid Format");
                flag &= false;
            } 
            else 
            {
                MsgPin.setText("");
            }           
            String stat="";
            if(radYes.isSelected())
            {
                stat="Active";
            }
            else if(radNo.isSelected())
            {
                stat="Inactive";
            }
            else
            {
                lblStat.setText("Cannot be empty");
            }
            Connection con = ConnectionClass.getConnected();
            System.out.println(flag+" before if");
            if (flag) 
            {
                lblMsg.setText("updating");
                String cbm=String.valueOf(cbmCategory.getSelectedItem());
                updateBiller(name,ac_no,address,cbm,stat,con);
            } 
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(AddNewBiller.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }
        catch(Exception e){}
    }//GEN-LAST:event_btnUpdateActionPerformed
    private void updateBiller(String name,String acc_no,String add,String cbm,String stat,Connection con) throws ClassNotFoundException,SQLException
    {
        //System.out.println("update biller");
        String query="update biller set biller_name=?,biller_acc_no=?,biller_address=?,biller_category=?,customer_id=?,biller_status=? where biller_id=?";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,name);
        ps.setString(2,acc_no);
        ps.setString(3,add);
        ps.setString(4,cbm);       
        ps.setInt(5,10000);//BillPaymentLogin.cust_id);
        ps.setString(6,stat);
        ps.setInt(7,getBillerId(name,con));
        ps.executeUpdate();  
        System.out.println("update biller");
    }
    private int getBillerId(String name,Connection connect) throws ClassNotFoundException, SQLException
    {
        System.out.println("biller");
        //Connection connect = ConnectionClass.getConnected();
        String customer_id=BillPaymentLogin.cust_id;
        //System.out.println("cust_id"+customer_id+"cust_name"+BillPaymentLogin.cust_name);
        String statement = "select biller_id from biller b join customer c on b.customer_id=c.customer_id where c.customer_id=? and b.biller_name=?";
        PreparedStatement stmt = connect.prepareStatement(statement);
        stmt.setString(1,customer_id);
        stmt.setString(2,name);
        ResultSet rs = stmt.executeQuery();
        System.out.println("biller");
        int id=0;
        while(rs.next())
        {
        id=rs.getInt(1);
        }
        return id;
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
            java.util.logging.Logger.getLogger(ModifyBillerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyBillerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyBillerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyBillerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyBillerInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MsgAcNo;
    private javax.swing.JLabel MsgAddress;
    private javax.swing.JLabel MsgBiller;
    private javax.swing.JLabel MsgCategory;
    private javax.swing.JLabel MsgCity;
    private javax.swing.JLabel MsgPin;
    private javax.swing.JButton btnBack;
    private javax.swing.ButtonGroup btnGrpStat;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbmCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAccNo;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBillerName;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblPayNow;
    private javax.swing.JLabel lblPinCode;
    private javax.swing.JLabel lblStat;
    private javax.swing.JRadioButton radNo;
    private javax.swing.JRadioButton radYes;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBillerAcNo;
    private javax.swing.JTextField txtBillerName;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtPin;
    // End of variables declaration//GEN-END:variables
}