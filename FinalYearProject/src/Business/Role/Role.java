/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
//        Chemical("Chemical"),
//        Farmer("Farmer"),
//        Finance("Finance"),
//        Hospital("Hospital"),
//        Market("Market"),
//        Transport("Transport");
        ChemicalManager("Chemical Manager"),FarmerFarmer("Farmer"),FinanceManager("Finance Manager"),HospitalAssistant("Hospital Assistant"),HospitalManager("Hospital Manager"),
        MarketAssistant("Market Assistant"),MarketBuyer("Market Buyer"),SYSTEMADMINROLE("System Admin Role"),TransportDriver("Transport Driver"),TransportManager("Transport Manager"),ADMINROLE("AdminRole");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            Network network);

    @Override
    public String toString() {
        return this.getClass().getName().toString();
    }
    
    
}