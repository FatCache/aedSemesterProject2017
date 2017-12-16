/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author abdusamed
 */
public class AgricultureProductRequest extends WorkRequest{
    private boolean organicFarmer;
    private String quantityPreference;
    private String bagPreference;
    private Date dateDeliveryRequest;   
    private AgricultureProduct agricultureProduct;
    
    public static enum AgricultureProduct{
        LIQUIDFISH("Liquid Fish"),UREA("Urea"),GYPSUM("Pelleted Gypsum"),PHOOSPHATE("Soft Rock Phosphate"),
        NITRATE("Chilean Nitrate"),SULFATE("Potassium Sulfate"),AMMONIUM("Liquid Ammonium Phosphate"),DEXT("Dextrose"),HUMATES("Humates"),
        DRYNITRATE("Dry Calcium Nitrate"),CARBON("Carbonized"),LIME("Limestone"),K("Potassium Nitrate"),
        WATERK("Water Soluble Potassium Sulfate");
        
        private String value;
        
        private AgricultureProduct(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }
    
    public AgricultureProductRequest(){
        super();
    }

    public boolean isOrganicFarmer() {
        return organicFarmer;
    }

    public void setOrganicFarmer(boolean organicFarmer) {
        this.organicFarmer = organicFarmer;
    }

    public String getQuantityPreference() {
        return quantityPreference;
    }

    public void setQuantityPreference(String quantityPreference) {
        this.quantityPreference = quantityPreference;
    }

    public String getBagPreference() {
        return bagPreference;
    }

    public void setBagPreference(String bagPreference) {
        this.bagPreference = bagPreference;
    }

    public Date getDateDeliveryRequest() {
        return dateDeliveryRequest;
    }

    public void setDateDeliveryRequest(Date dateDeliveryRequest) {
        this.dateDeliveryRequest = dateDeliveryRequest;
    }

    public AgricultureProduct getAgricultureProduct() {
        return agricultureProduct;
    }

    public void setAgricultureProduct(AgricultureProduct agricultureProduct) {
        this.agricultureProduct = agricultureProduct;
    }
    
    @Override
    public String toString(){
        return quantityPreference;
    }
    
    
    
    
    
}
