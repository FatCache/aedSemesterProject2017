/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MarketAssistant;
import Business.Role.MarketBuyer;
import Business.Role.MarketManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author abdusamed
 */
public class MarketOrganization extends Organization {

    public MarketOrganization() {
        super(Type.Market.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MarketManager());
        roles.add(new MarketAssistant());
        roles.add(new MarketBuyer());
        return roles;
    }
    
}
