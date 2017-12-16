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
public class MarketNewsDirectory {
    private ArrayList<MarketNews> marketNewsDirectory;
    
    public MarketNewsDirectory(){
        marketNewsDirectory = new ArrayList<>();
    }

    public ArrayList<MarketNews> getMarketNewsDirectory() {
        return marketNewsDirectory;
    }

    public void setMarketNewsDirectory(ArrayList<MarketNews> marketNewsDirectory) {
        this.marketNewsDirectory = marketNewsDirectory;
    }
    
    
    
}
