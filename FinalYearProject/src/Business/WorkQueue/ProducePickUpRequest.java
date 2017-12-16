/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Network.Product;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author abdusamed
 */
public class ProducePickUpRequest extends WorkRequest {
    
    private String truckSize;
    private Date pickupDate;
    private Product product;
    private String dropOffLocation;
    
    // Integrating Into One

    private int currentBid;
    private int finalBid;
    private UserAccount lastBidBy;
    
    private boolean bidStatus;

    public boolean isBidStatus() {
        return bidStatus;
    }

    public void setBidStatus(boolean bidStatus) {
        this.bidStatus = bidStatus;
    }
    
    

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public String getTruckSize() {
        return truckSize;
    }

    public void setTruckSize(String truckSize) {
        this.truckSize = truckSize;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    @Override
    public String toString(){
        return product.getProductType().getValue();
    }

    public int getCurrentBid() {
        return currentBid;
    }

    public void setCurrentBid(int currentBid) {
        this.currentBid = currentBid;
    }

    public int getFinalBid() {
        return finalBid;
    }

    public void setFinalBid(int finalBid) {
        this.finalBid = finalBid;
    }

    public UserAccount getLastBidBy() {
        return lastBidBy;
    }

    public void setLastBidBy(UserAccount lastBidBy) {
        this.lastBidBy = lastBidBy;
    }
    
    
 
    
    
}
