/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Donor.DonorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DonorReceptionOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ReceptionistRole.ReceptionistWorkAreaJPanel;

/**
 *
 * @author rajusingh
 */
public class DonorReceptionistRole extends Role{

    @Override
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,DonorDirectory donor) {
        return new ReceptionistWorkAreaJPanel(userProcessContainer, account, (DonorReceptionOrganization) organization, enterprise, donor);
    }
    
}
