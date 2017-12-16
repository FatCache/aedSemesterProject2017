/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author raunak
 */
public class Network{
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private MarketNewsDirectory marketNewsDirectory;
    private ProductDirectory productDirectory;
    private HospitalDirectory hospitalDirectory;
    

    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
        marketNewsDirectory = new MarketNewsDirectory();
        productDirectory = new ProductDirectory();
        hospitalDirectory = new HospitalDirectory();
    }    

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }
    

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public MarketNewsDirectory getMarketNewsDirectory() {
        return marketNewsDirectory;
    }

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }   

   
}
