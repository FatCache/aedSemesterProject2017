/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Farmer.getValue())){
            organization = new FarmerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Chemical.getValue())){
            organization = new ChemicalOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Finance.getValue())){
            organization = new FinanceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Hospital.getValue())){
            organization = new HospitalOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Market.getValue())){
            organization = new MarketOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Transport.getValue())){
            organization = new TransportOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}