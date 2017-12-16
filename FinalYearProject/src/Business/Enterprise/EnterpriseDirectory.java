/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == EnterpriseType.HOSPITAL){
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == EnterpriseType.CHEMICAL){
            enterprise = new ChemicalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == EnterpriseType.FARMER){
            enterprise = new FarmerEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == EnterpriseType.FINANCE){
            enterprise = new FinanceEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == EnterpriseType.MARKET){
            enterprise = new MarketEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if (type == EnterpriseType.TRANSPORT){
            enterprise = new TransportEnterprise(name);
            enterpriseList.add(enterprise);
        }        
        
        return enterprise;
    }
    
}
