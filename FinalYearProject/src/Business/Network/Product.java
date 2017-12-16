/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

/**
 *
 * @author abdusamed
 */
public class Product {
    
    private ProductType productType;
    private ProductMonth productMonth;
    private int rate;
    
    public Product(ProductType productType){
        this.productType = productType;
    }

    public void setProductMonth(ProductMonth productMonth) {
        this.productMonth = productMonth;
    }
    
    
    
    public enum ProductType{
        ORANGE("Orange") ,APPLE("Apple"),PEACH("Peach"),PINEAPPLE("Pineapple");
        
        private String value;
        
        private ProductType(String value){
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
    public enum ProductMonth{
        JAN("JANUARY"),FEB("FEBUARY"),MAR("MARCH"),APR("APRIL"),MAY("MAY"),JUN("JUNE"),
        JUL("JULY"),AUG("AUGUST"),SEP("SEPTEMBER"),OCT("OCTOBER"),NOV("NOVEMBER"),DEC("DECEMBER");
        
        private String value;
        
        private ProductMonth(String value){
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

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public ProductType getProductType() {
        return productType;
    }

    public ProductMonth getProductMonth() {
        return productMonth;
    }
    
    
    
    @Override
    public String toString(){
        return this.getProductType().getValue();
    }
    
    
    
    
}
