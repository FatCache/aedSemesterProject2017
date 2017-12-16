/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TransportDriver;
import Business.Role.TransportManager;
import java.util.ArrayList;

/**
 *
 * @author abdusamed
 */
public class TransportOrganization extends Organization {

    public TransportOrganization() {
        super(Type.Transport.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new TransportManager());
        roles.add(new TransportDriver());
        return roles;
    }
    
}
