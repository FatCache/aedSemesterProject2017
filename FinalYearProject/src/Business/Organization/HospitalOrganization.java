/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HospitalManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author abdusamed
 */
public class HospitalOrganization extends Organization {

    public HospitalOrganization() {
        super(Type.Hospital.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();

        roles.add(new HospitalManager());
        return roles;
    }
    
}
