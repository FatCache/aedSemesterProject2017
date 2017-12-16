/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author abdusamed
 */
public class ProductDirectory {
    
    private ArrayList<Product> productList;
    
    public ProductDirectory(){
        productList = new ArrayList<>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }
    
    
    
}
