/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DonorNurseRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rajusingh
 */
public class DonorNurseOrganization extends Organization {

    public DonorNurseOrganization() {
        super(Organization.Type.Donor_Nurse.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DonorNurseRole());
        return roles;
    }
    
}
