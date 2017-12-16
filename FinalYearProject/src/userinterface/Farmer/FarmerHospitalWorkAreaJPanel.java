/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Farmer;

import Business.Network.Hospital;
import Business.Network.Network;
import Business.UserAccount.FarmerUserAccount;
import Business.Utility;
import Business.WorkQueue.HospitalAssistanceRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author abdusamed
 */
public class FarmerHospitalWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private FarmerUserAccount account;
    private Network network;
    private Hospital nearestHospital = null;
    
    

    /**
     * Creates new form FarmerHospitalWorkAreaJPanel
     */
    FarmerHospitalWorkAreaJPanel(JPanel userProcessContainer, FarmerUserAccount account, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.network = network;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLong = new javax.swing.JTextField();
        txtLat = new javax.swing.JTextField();
        btnCancelRequest2 = new javax.swing.JButton();
        btnSubmitRequest = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        txtHotLineNumber = new javax.swing.JTextField();
        txtHospitalAddress = new javax.swing.JTextField();
        btnSubmitRequest1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        jLabel1.setText("Farmer Hospital Dashboard");

        jLabel2.setText("Find Nearest Hospital");

        jLabel3.setText("Enter Longitude");

        jLabel4.setText("Enter Latitude");

        txtLat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLatActionPerformed(evt);
            }
        });

        btnCancelRequest2.setText("<< Back");
        btnCancelRequest2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelRequest2ActionPerformed(evt);
            }
        });

        btnSubmitRequest.setText("Request Assistance");
        btnSubmitRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitRequestActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setText("Nearest Hospital");

        jLabel6.setText("Name");

        jLabel7.setText("Address");

        jLabel8.setText("Hot-Line Number");

        txtHospitalName.setEditable(false);

        txtHotLineNumber.setEditable(false);
        txtHotLineNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHotLineNumberActionPerformed(evt);
            }
        });

        txtHospitalAddress.setEditable(false);
        txtHospitalAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalAddressActionPerformed(evt);
            }
        });

        btnSubmitRequest1.setText("Submit Request");
        btnSubmitRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitRequest1ActionPerformed(evt);
            }
        });

        jButton1.setText("View Map");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtLong, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                            .addComponent(txtLat))
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnSubmitRequest1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jLabel1))))
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHotLineNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(txtHospitalName)
                                    .addComponent(txtHospitalAddress))
                                .addGap(18, 18, 18)
                                .addComponent(btnSubmitRequest))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCancelRequest2)))
                .addContainerGap(193, Short.MAX_VALUE))
            .addComponent(jSeparator3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmitRequest1))
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtHospitalAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtHotLineNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubmitRequest))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelRequest2)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelRequest2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelRequest2ActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        
        Component component = componentArray[componentArray.length - 1];
        FarmerFarmerWorkAreaJPanel dwjp = (FarmerFarmerWorkAreaJPanel) component;
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnCancelRequest2ActionPerformed

    private void txtLatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLatActionPerformed

    private void btnSubmitRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitRequest1ActionPerformed
        // TODO add your handling code here:
        if(!txtLat.getText().isEmpty() && !txtLat.getText().isEmpty() && Utility.intCheck(txtLong.getText()) && Utility.intCheck(txtLat.getText())){
        int xLong = Integer.parseInt(txtLong.getText());
        int xLati = Integer.parseInt(txtLat.getText());
        double shortestDistance = 0.0;
        for(Hospital hospitalTest : network.getHospitalDirectory().getHospitalDirectory()){
            double distanceCalculated = Math.sqrt((xLong-hospitalTest.getLongitude())*(xLong-hospitalTest.getLongitude())+(xLati-hospitalTest.getLatitude())*(xLati-hospitalTest.getLatitude()));
            System.out.println("Distance Calulated -> " + distanceCalculated);
            System.out.println("Current Shortest Distance -> " + shortestDistance);
            if(shortestDistance == 0){
                shortestDistance = distanceCalculated;
                nearestHospital = hospitalTest;
            }else{
                if(distanceCalculated<shortestDistance){
                    nearestHospital = hospitalTest;
                    shortestDistance = distanceCalculated;
                    System.out.println("New Shortest Distance -> " + distanceCalculated);
                }
            }            
        }
        
        txtHospitalAddress.setText(nearestHospital.getAddress());
        txtHospitalName.setText(nearestHospital.getName());
        txtHotLineNumber.setText(nearestHospital.getName());
        
        JOptionPane.showMessageDialog(null, "Nearest Hospital Found -> " + nearestHospital.getName(), "Found", JOptionPane.INFORMATION_MESSAGE);        
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Entry. Please Try Again", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSubmitRequest1ActionPerformed

    private void btnSubmitRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitRequestActionPerformed
        // TODO add your handling code here:
        if(nearestHospital != null){
            HospitalAssistanceRequest request = new HospitalAssistanceRequest();
            request.setHospitalSelected(nearestHospital);
            request.setSender(account);
            account.getHosptialWorkQueue().add(request);
        }
        JOptionPane.showMessageDialog(null, "Assistance Successfully Completed", "Congo", JOptionPane.INFORMATION_MESSAGE);        
    }//GEN-LAST:event_btnSubmitRequestActionPerformed

    private void txtHospitalAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalAddressActionPerformed

    private void txtHotLineNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHotLineNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHotLineNumberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!txtLat.getText().isEmpty() && !txtLat.getText().isEmpty() && Utility.intCheck(txtLong.getText()) && Utility.intCheck(txtLat.getText()) && nearestHospital!=null){
            int xLong = Integer.parseInt(txtLong.getText());
            int xLati = Integer.parseInt(txtLat.getText());
            
            MapPlotter mapView = new MapPlotter("Map Displayed for Farm User", network, xLong, xLati, nearestHospital);          
            
            MapView VIEW = new MapView(userProcessContainer, mapView);
            userProcessContainer.add("mapView", VIEW);

            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

            
            

            
            
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Entry. Please Try Again", "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelRequest2;
    private javax.swing.JButton btnSubmitRequest;
    private javax.swing.JButton btnSubmitRequest1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtHospitalAddress;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtHotLineNumber;
    private javax.swing.JTextField txtLat;
    private javax.swing.JTextField txtLong;
    // End of variables declaration//GEN-END:variables
}