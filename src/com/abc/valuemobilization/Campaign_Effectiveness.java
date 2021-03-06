/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.valuemobilization;

import com.abc.JDBCConnection.ConnectionClass;
import java.sql.Connection;
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
public class Campaign_Effectiveness extends javax.swing.JFrame {

    /**
     * Creates new form Campaign_Effectiveness
     */
    public Campaign_Effectiveness()throws SQLException, ClassNotFoundException {
        initComponents();
        
        Connection con = ConnectionClass.getConnected();
        Statement s = con.createStatement();
        String q="Select Campaign_Id from Campaign";
        ResultSet rs=s.executeQuery(q);
        while(rs.next())
        {
            cbCampaign.addItem(rs.getString("Campaign_Id"));
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

        lblTitle = new javax.swing.JLabel();
        lblCampaign = new javax.swing.JLabel();
        lblTotalProspects = new javax.swing.JLabel();
        lblUnassignedP = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblUnassigned = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMonitor = new javax.swing.JTable();
        lblBack = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        cbCampaign = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Monitor Campaign Effectiveness");

        lblCampaign.setText("Campaign Id :");

        lblTotalProspects.setText("Total Prospects :");

        lblUnassignedP.setText("Unassigned Prospects :");

        lblTotal.setText("xxx");

        lblUnassigned.setText("xxx");

        tblMonitor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sales Agent", "Assigned Prospects", "Follow Up", "Not Interested", "Committed"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMonitor);

        lblBack.setText("Back");
        lblBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblBackActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblUnassignedP)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblUnassigned, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTotalProspects)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbCampaign, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(96, 96, 96))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCampaign)
                                .addGap(36, 36, 36)))
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(lblBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(lblTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitle)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCampaign)
                    .addComponent(btnSearch)
                    .addComponent(cbCampaign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalProspects))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUnassigned, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnassignedP))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblBackActionPerformed
        Campaign_Management cm = new Campaign_Management();
        cm.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_lblBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
            String campaign = cbCampaign.getSelectedItem().toString();
            int assigned=0, total=0;
            DefaultTableModel model;
        model = (DefaultTableModel) tblMonitor.getModel();
        model.setRowCount(0);
        try 
        {
            Connection con = ConnectionClass.getConnected();
            
            
            Statement s = con.createStatement();
            String q = "Select * from PROSPECTIVE_CUSTOMERS where CAMPAIGN_ID='" + campaign + "'";
            ResultSet rs = s.executeQuery(q);

            while (rs.next()) 
            {
                
                String agent = rs.getString("Employee_id");
                String customer = rs.getString("Customer_id");
                String status = rs.getString("Status");
                
                
                String agent_name="", customer_name="";
                String q2="Select NAME from CUSTOMER where CUSTOMER_ID="+customer;
                Statement s2=con.createStatement();
                ResultSet rs2=s2.executeQuery(q2);
                while(rs2.next())
                {
                    customer_name=rs2.getString("Name");
                }
                
                
                String q3="Select NAME from EMPLOYEE where EMP_ID="+agent;
                Statement s3=con.createStatement();
                ResultSet rs3=s3.executeQuery(q3);
                while(rs3.next())
                {
                    agent_name=rs3.getString("Name");
                    
                }
                
                String ni="", c="";
                
                if(status.equalsIgnoreCase("active"))
                {
                    c="Yes";
                }
                
                else if(status.equalsIgnoreCase("inactive"))
                {
                    ni="Yes";
                }
                

                //DefaultTableModel model;
                model = (DefaultTableModel) tblMonitor.getModel();
                int count=0;
                for(int i=0; i<model.getRowCount(); i++)
                {
           
                    if(tblMonitor.getValueAt(i,1).toString().equals(customer_name) )
                    {
                        count++;
               
                    }
                }
       
        if(count==0)
        {
            model.addRow(new Object[]{agent_name, customer_name, status, ni, c});
             assigned++;   
        }    
                
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        
        
        
        
        
        try 
        {
            int age=0;
            double balance=0.0;
            String profession="";
            String Cid="";
            LocalDate ldate=LocalDate.now();
            
            Connection con = ConnectionClass.getConnected();
            Statement s = con.createStatement();
            String q="Select * from CAMPAIGN_CRITERIA c1 join CAMPAIGN c2 on c1.CAMPAIGN_ID=c2.CAMPAIGN_ID where c2.CAMPAIGN_ID='"+campaign+"'";
            ResultSet rs= s.executeQuery(q);
            while(rs.next())
            {
                age=rs.getInt("AGE_OF_RELATIONSHIP");
                balance=rs.getDouble("MIN_BALANCE");
                profession=rs.getString("PROFESSION");
                Cid=rs.getString("CAMPAIGN_ID");
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
            //String q2="Select * from CUSTOMER c join ACCOUNT a on c.CUSTOMER_ID = a.CUSTOMER_ID  where C.OCCUPATION='"+profession+"' and a.BALANCE>="+balance;
            Statement s2 = con.createStatement();
            ResultSet rs2= s2.executeQuery(q2);
            
            
            while(rs2.next())
            {
                LocalDate date=rs2.getDate("OPENING_DATE").toLocalDate();
                int age_rel=Period.between(date, ldate).getYears();
                
                if(age_rel<=age)
                {
                    
                    total++;
                }
                total++;    
            }
        }catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        
        lblTotal.setText(Integer.toString(total));
        lblUnassigned.setText(Integer.toString(total-assigned));

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
            java.util.logging.Logger.getLogger(Campaign_Effectiveness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Campaign_Effectiveness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Campaign_Effectiveness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Campaign_Effectiveness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()  {
            public void run() {
                try {
                    new Campaign_Effectiveness().setVisible(true);
                } catch (SQLException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                } 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbCampaign;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lblBack;
    private javax.swing.JLabel lblCampaign;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalProspects;
    private javax.swing.JLabel lblUnassigned;
    private javax.swing.JLabel lblUnassignedP;
    private javax.swing.JTable tblMonitor;
    // End of variables declaration//GEN-END:variables
}
