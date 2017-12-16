/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Role.TransportDriver;
import Business.Role.TransportManager;
import java.util.ArrayList;

/**
 *
 * @author abdusamed
 */
public class TransportEnterprise extends Enterprise{

    public TransportEnterprise(String name) {
        super(name, EnterpriseType.TRANSPORT);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new TransportDriver());
        roles.add(new TransportManager());
        return roles;
    }
    
    
}
