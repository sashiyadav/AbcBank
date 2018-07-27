/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.valuemobilization;

import com.abc.JDBCConnection.ConnectionClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author test
 */
public class Assign_Prospects extends javax.swing.JFrame {

    /**
     * Creates new form Assign_Prospects
     */
    public Assign_Prospects() throws SQLException, ClassNotFoundException {
        initComponents();

        Connection con = ConnectionClass.getConnected();
        Statement s = con.createStatement();
        String q = "Select Campaign_Title from Campaign";
        ResultSet rs = s.executeQuery(q);
        while (rs.next()) {
            cbCampaign.addItem(rs.getString("Campaign_Title"));
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

        jLabel1 = new javax.swing.JLabel();
        lblCampaign = new javax.swing.JLabel();
        lblEName = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtEmployee = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomers = new javax.swing.JTable();
        lblStatus = new javax.swing.JLabel();
        cbCampaign = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Assign Prospects to Sales Agents");

        lblCampaign.setText("Campaign Title :");

        lblEName.setText("Employee's name");

        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeActionPerformed(evt);
            }
        });

        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Campaign Id", "Campaign Name", "Customer Id", "Customer Name", "Phone Number", "Check"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomers);

        lblStatus.setText("Status");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCampaign)
                        .addGap(32, 32, 32)
                        .addComponent(cbCampaign, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEName)
                                        .addGap(31, 31, 31)
                                        .addComponent(txtEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75)
                                        .addComponent(btnAssign)
                                        .addGap(61, 61, 61))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)))
                                .addComponent(btnCancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addGap(30, 30, 30)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCampaign)
                    .addComponent(btnSearch)
                    .addComponent(cbCampaign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEName)
                    .addComponent(txtEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancel)
                        .addComponent(btnAssign)
                        .addComponent(btnBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        String Campaign = cbCampaign.getSelectedItem().toString();
        String Employee = txtEmployee.getText();

        DefaultTableModel model;
        model = (DefaultTableModel) tblCustomers.getModel();
        //System.out.println(model.getValueAt(1,5).toString().equals("true"));

        /*for(int i=0; i<tblCustomers.getRowCount(); i++)
        {
            model.setValueAt(false, i, 5);
        }*/
        for (int i = 0; i < tblCustomers.getRowCount(); i++) {
            // lblStatus.setText("Assigning...");
            //boolean b=model.getValueAt(i,5).toString().equals("true");
            System.out.println(model.getValueAt(i, 5));
            //System.out.println(tblCustomers.getModel().getValueAt(i, 5));
            //System.out.println((Boolean) tblCustomers.getModel().getValueAt(i, 5));
            //System.out.println(Boolean.valueOf(tblCustomers.getValueAt(i, 5).toString()));
            //System.out.println(model.getValueAt(tblCustomers.getSelectedRow(), 5).toString());
            //boolean b=(boolean)tblCustomers.getModel().getValueAt(i,5);
            /*String b=model.getValueAt(tblCustomers.getSelectedRow(), 5).toString();
                    System.out.println(b);*/

            //if(true)
            if ((Boolean) model.getValueAt(i, 5))/*.toString().equals("null")*/ {
                try {
                    
                    Connection con = ConnectionClass.getConnected();
                    
                     
                    //String q3 = "insert into PROSPECTIVE_CUSTOMERS values('nil'," + model.getValueAt(i, 2).toString() + ",'" + model.getValueAt(i, 0).toString() + "'," + txtEmployee.getText() + ")";
                    String q3 = "insert into PROSPECTIVE_CUSTOMERS values(?,?,?,?)";
                    PreparedStatement s3 = con.prepareStatement(q3);
                    /*String cid=tblCustomers.getValueAt(i, 2).toString();
                    String c=(String)tblCustomers.getValueAt(i,0);
                    cid=c.concat(cid);
                    int id=Integer.parseInt(cid);*/
                    
                    s3.setString(1,"Pending");
                    s3.setInt(2,(int)tblCustomers.getValueAt(i, 2));
                    s3.setString(3,model.getValueAt(i, 0).toString());
                    s3.setInt(4,Integer.parseInt(txtEmployee.getText().toString()));
                    
                    int result = s3.executeUpdate();
                    
                    System.out.println(result);
                    
                    if (result>0) {
                        lblStatus.setText("Successfully assigned");
                     
                        
                    } 
                    
                    else {
                        
                        lblStatus.setText("Not assigned");
                    }
                   
                } catch (ClassNotFoundException | SQLException ex) {
                    ex.printStackTrace();
                }
            }

        }

    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        Campaign_Management cm = new Campaign_Management();
        cm.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String CTitle = cbCampaign.getSelectedItem().toString();
        DefaultTableModel model;
        model = (DefaultTableModel) tblCustomers.getModel();
        model.setRowCount(0);
        

        try {
            int age = 0;
            double balance = 0.0;
            String profession = "";
            String Cid = "";
            LocalDate ldate = LocalDate.now();

            Connection con = ConnectionClass.getConnected();
            Statement s = con.createStatement();
            String q = "Select * from CAMPAIGN_CRITERIA c1 join CAMPAIGN c2 on c1.CAMPAIGN_ID=c2.CAMPAIGN_ID where c2.CAMPAIGN_TITLE='" + CTitle + "'";
            ResultSet rs = s.executeQuery(q);
            while (rs.next()) {
                age = rs.getInt("AGE_OF_RELATIONSHIP");
                balance = rs.getDouble("MIN_BALANCE");
                profession = rs.getString("PROFESSION");
                Cid = rs.getString("CAMPAIGN_ID");
            }
            
            String q2="";
            
           
            if(profession==null)
            {
                q2 = "Select * from CUSTOMER c inner join ACCOUNT a on c.CUSTOMER_ID = a.CUSTOMER_ID  where c.PREFERRED_ACC_1=a.ACCOUNT_NUMBER and a.BALANCE>=" + balance;
            }
        
            else
            {
                q2 = "Select * from CUSTOMER c inner join ACCOUNT a on c.CUSTOMER_ID = a.CUSTOMER_ID  where C.OCCUPATION='" + profession + "' and c.PREFERRED_ACC_1=a.ACCOUNT_NUMBER and a.BALANCE>=" + balance;
            }
            Statement s2 = con.createStatement();
            ResultSet rs2 = s2.executeQuery(q2);

            
            model = (DefaultTableModel) tblCustomers.getModel();
            while (rs2.next()) 
            {
                System.out.println(rs2.getDate("OPENING_DATE"));
                LocalDate date = rs2.getDate("OPENING_DATE").toLocalDate();
                int age_rel = Period.between(date, ldate).getYears();

                if (age_rel <= age) {

                    model.addRow(new Object[]{Cid, CTitle, rs2.getInt("CUSTOMER_ID"), rs2.getString("NAME"), rs2.getString("MOBILE_NUM")});
                }

            }

            model = (DefaultTableModel) tblCustomers.getModel();
            for (int i = 0; i < tblCustomers.getRowCount(); i++) {
                model.setValueAt(false, i, 5);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Campaign_Management ob=new Campaign_Management();
        ob.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(Assign_Prospects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assign_Prospects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assign_Prospects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assign_Prospects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Assign_Prospects().setVisible(true);
                } catch (SQLException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbCampaign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCampaign;
    private javax.swing.JLabel lblEName;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tblCustomers;
    private javax.swing.JTextField txtEmployee;
    // End of variables declaration//GEN-END:variables
}
