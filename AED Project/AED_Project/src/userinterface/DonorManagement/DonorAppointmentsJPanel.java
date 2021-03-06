/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DonorManagement;

import Business.Donor.Donor;
import Business.Donor.DonorDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.PatternSyntaxException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import userinterface.LaboratoryManagement.*;

/**
 *
 * @author rajusingh
 */
public class DonorAppointmentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabShippingWorkArea
     */
    private DonorDirectory donorDirectory;
    private JPanel userProcessContainer;
    //private UserAccount ua;
    public DonorAppointmentsJPanel(JPanel userProcessContainer,DonorDirectory donorDirectory) {
        initComponents();
        this.donorDirectory=donorDirectory;
        this.userProcessContainer=userProcessContainer;
        //System.out.println(donorDirectory.getDonorDirectory().get(1).getLastName());
        populateAppointmentTable();
        
    }
    
    public void populateAppointmentTable(){
        DefaultTableModel dTM = (DefaultTableModel)receptionistAppointmentTable.getModel();
        dTM.setRowCount(0);
        
        for(Donor d:donorDirectory.getDonorDirectory()){
            Object row[]  = new Object[6];
            row[0] = d;
            row[1] = d.getFirstName();
            row[2] = d.getMobileNo();
            row[3] = d.getEmailID();
            row[4] = d.getDonorPresenceStatus();
            row[5] = d.getDonationStatus();
            
            dTM.addRow(row);
        }
    }
    
    private void Search (String s) {
        TableModel vT = receptionistAppointmentTable.getModel();
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(vT);
        receptionistAppointmentTable.setRowSorter(sorter);
        String text = searchTxtField.getText();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
            receptionistAppointmentTable.clearSelection();
        } else {
            try {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            } catch (PatternSyntaxException pse) {
                pse.printStackTrace();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receptionistAppointmentTable = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        searchDonor = new javax.swing.JButton();
        searchTxtField = new javax.swing.JTextField();
        viewDonor = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Apple Chancery", 3, 18)); // NOI18N
        jLabel1.setText("Scheduled Donors Appointment");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        receptionistAppointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Reg.ID", "Donor Name", "Phone Number", "Email ID", "Status", "Remark"
            }
        ));
        jScrollPane1.setViewportView(receptionistAppointmentTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 904, 217));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel2.setText("Select Date");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 70, 30));

        searchDonor.setText("Search");
        searchDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDonorActionPerformed(evt);
            }
        });
        add(searchDonor, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, -1, -1));

        searchTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtFieldActionPerformed(evt);
            }
        });
        add(searchTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 360, 110, -1));

        viewDonor.setText("View Donor");
        viewDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDonorActionPerformed(evt);
            }
        });
        add(viewDonor, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void searchDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDonorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchDonorActionPerformed

    private void searchTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtFieldActionPerformed
        String query = searchTxtField.getText().toLowerCase();
        Search(query);
    }//GEN-LAST:event_searchTxtFieldActionPerformed

    private void viewDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDonorActionPerformed

        int selectedRow = receptionistAppointmentTable.getSelectedRow();

        if (selectedRow <0){
            JOptionPane.showMessageDialog(null,"Please select any row to get details", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Donor d = (Donor) receptionistAppointmentTable.getValueAt(selectedRow, 0);
            DonorRegistrationJPanel_Test viewDetails = new DonorRegistrationJPanel_Test(userProcessContainer, donorDirectory);
            userProcessContainer.add("ViewCustomersPanel", viewDetails);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
       // populateTable();
 
    }//GEN-LAST:event_viewDonorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable receptionistAppointmentTable;
    private javax.swing.JButton searchDonor;
    private javax.swing.JTextField searchTxtField;
    private javax.swing.JButton viewDonor;
    // End of variables declaration//GEN-END:variables
}
