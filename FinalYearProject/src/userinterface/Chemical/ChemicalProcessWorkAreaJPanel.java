/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Chemical;

import Business.Enterprise.Enterprise;
import Business.Enterprise.FarmerEnterprise;
import Business.Network.MarketNews;
import Business.Network.Network;
import Business.Organization.FarmerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.FarmerUserAccount;
import Business.UserAccount.UserAccount;
import Business.Utility;
import Business.WorkQueue.AgricultureProductRequest;
import Business.WorkQueue.SoilConditionReport;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abdusamed
 */
public class ChemicalProcessWorkAreaJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    UserAccount account;
    Network network;
    FarmerOrganization inFarmerOrganization;

    /**
     * Creates new form ChemicalAssistantWorkAreaJPanel
     */
    public ChemicalProcessWorkAreaJPanel() {
        initComponents();
    }

    ChemicalProcessWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.network = network;
        
        populateTableProduct();
        populateTableSoil();
    }
    
    public void populateTableProduct(){
        DefaultTableModel dtm = (DefaultTableModel) tblProductInquery.getModel();
        dtm.setRowCount(0);
        for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise instanceof FarmerEnterprise){
                for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                    if(organization instanceof FarmerOrganization){
                        inFarmerOrganization = (FarmerOrganization) organization;
                            for(UserAccount farmerUserAccount : organization.getUserAccountDirectory().getUserAccountList()){
                                if(farmerUserAccount instanceof FarmerUserAccount){
                                    for(AgricultureProductRequest agricultureProductRequest : ((FarmerUserAccount) farmerUserAccount).getChemicalProductWorkQueue()){
                                        Object[] row = new Object[10];
                                        row[0] = farmerUserAccount.getEmployee().getName();
                                        row[1] = agricultureProductRequest.isOrganicFarmer();
                                        row[2] = agricultureProductRequest;
                                        row[3] = agricultureProductRequest.getBagPreference();
                                        row[4] = agricultureProductRequest.getRequestDate();
                                        row[5] = agricultureProductRequest.getAgricultureProduct();
                                        Date resolveDate = agricultureProductRequest.getResolveDate();
                                        row[6] = resolveDate == null? "Waiting" : resolveDate;
                                        row[7] = agricultureProductRequest.getReceiver() == null? "Waiting" : agricultureProductRequest.getReceiver();
                                        Date deliveryDate = agricultureProductRequest.getDateDeliveryRequest();
                                        row[8] = deliveryDate == null? "Waiting" : deliveryDate;
                                        row[9] = agricultureProductRequest.getStatus() == null? "Waiting" : agricultureProductRequest.getStatus();
                                        dtm.addRow(row);                                    }
                                }
                            }
                    }
                }
            }
        } 
    }
    
    public void populateTableSoil(){
        
        DefaultTableModel dtm = (DefaultTableModel) tblSoilReport.getModel();
        dtm.setRowCount(0);
        for(UserAccount farmerUserAccount : inFarmerOrganization.getUserAccountDirectory().getUserAccountList()){
            if(farmerUserAccount instanceof FarmerUserAccount){
                for(SoilConditionReport soilConditionReport:((FarmerUserAccount) farmerUserAccount).getChemicalSoilWorkQueue()){
                    Object[] row = new Object[7];
                    row[0] = farmerUserAccount.getEmployee().getName();
                    row[1] = ((FarmerUserAccount) farmerUserAccount).getAddress();
                    row[2] = soilConditionReport.getRequestDate();
                    Date resolveDate = soilConditionReport.getResolveDate();
                    row[3] = resolveDate == null? "Waiting" : resolveDate;
                    row[4] = soilConditionReport.getReceiver() == null? "Waiting" : soilConditionReport.getReceiver();
                    row[5] = soilConditionReport.getStatus() == null? "Waiting" : soilConditionReport.getStatus();
                    row[6] = soilConditionReport == null? "No Report" : soilConditionReport;
                    dtm.addRow(row);                                    
                }
            }
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

        jColorChooser1 = new javax.swing.JColorChooser();
        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductInquery = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSoilReport = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jxDatePickerDelievery = new org.jdesktop.swingx.JXDatePicker();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaSoil = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        tblProductInquery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Farmer Name", "Organic Farmer", "Quantity Preference", "Bag Preference", "Date Requested", "Product Requested", "Date Resolved", "Resolved By", "Delievered By", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblProductInquery);
        if (tblProductInquery.getColumnModel().getColumnCount() > 0) {
            tblProductInquery.getColumnModel().getColumn(1).setResizable(false);
        }

        jButton1.setText("Send Approve Notice");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblSoilReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Farmer Name", "Address", "Date Requested", "Status", "Resolved By", "Resolved On", "Soil Report"
            }
        ));
        jScrollPane2.setViewportView(tblSoilReport);
        if (tblSoilReport.getColumnModel().getColumnCount() > 0) {
            tblSoilReport.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton2.setText("Submit Soil Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Agriculture Product Request");

        jLabel3.setText("Soil Report Test");

        jLabel4.setText("Select Delivery Date");

        jLabel5.setText("Type Soil Report:");

        txtAreaSoil.setColumns(20);
        txtAreaSoil.setLineWrap(true);
        txtAreaSoil.setRows(5);
        txtAreaSoil.setText("Type report here");
        txtAreaSoil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAreaSoilMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(txtAreaSoil);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Chemical Manager Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jxDatePickerDelievery, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2)))
                                .addGap(0, 287, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jxDatePickerDelievery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int seletectedRow = tblProductInquery.getSelectedRow();
        if(seletectedRow < 0 || jxDatePickerDelievery.getDate() == null){
            JOptionPane.showMessageDialog(null, "Please select a row from the Table or pick Date", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            
            AgricultureProductRequest request = (AgricultureProductRequest) tblProductInquery.getValueAt(seletectedRow, 2);
            Date pickupdate = jxDatePickerDelievery.getDate();
            
            request.setDateDeliveryRequest(pickupdate);
            request.setReceiver(account);
            request.setStatus("Order Processed - Chemical");   
            request.setResolveDate(Utility.getCurrentDate());
            
            MarketNews marketNews = new MarketNews();
            marketNews.setDateAnnounced(Utility.getCurrentDate());
            marketNews.setNewsDetail("Agriculture Product has been approved. Date of Delivery: " + pickupdate);
            marketNews.setNewsSubject("Agriculture Product Request");
            
            ((FarmerUserAccount)request.getSender()).getMessageList().add(marketNews);
            
            JOptionPane.showMessageDialog(null, "Farmer requst for goods Approved!", "Order Status Changed!", JOptionPane.OK_OPTION);
        }
        populateTableProduct();        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    private void txtAreaSoilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAreaSoilMouseClicked
        // TODO add your handling code here:
//        txtAreaSoil.setText(null);
//        txtAreaSoil.setForeground(Color.green);
    }//GEN-LAST:event_txtAreaSoilMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int seletectedRow = tblSoilReport.getSelectedRow();
        if(seletectedRow < 0 || txtAreaSoil.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Please select a row from the Table", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            String message = txtAreaSoil.getText();
            SoilConditionReport report = (SoilConditionReport) tblSoilReport.getValueAt(seletectedRow, 6);
            report.setSoilReport(message);
            report.setResolveDate(Utility.getCurrentDate());
            report.setReceiver(account);
            report.setStatus("Soil Report Created");

            MarketNews marketNews = new MarketNews();
            marketNews.setDateAnnounced(Utility.getCurrentDate());
            marketNews.setNewsDetail("The Soil analysis team has visited your field and analysis has been prepared.");
            marketNews.setNewsSubject("Soil Report Status");

            ((FarmerUserAccount)report.getSender()).getMessageList().add(marketNews);

            JOptionPane.showMessageDialog(null, "Soil Report Submitted", "Success!", JOptionPane.OK_OPTION);
            
                    }
        populateTableSoil();
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private org.jdesktop.swingx.JXDatePicker jxDatePickerDelievery;
    private javax.swing.JTable tblProductInquery;
    private javax.swing.JTable tblSoilReport;
    private javax.swing.JTextArea txtAreaSoil;
    // End of variables declaration//GEN-END:variables
}
