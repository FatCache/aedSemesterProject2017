/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author abdusamed
 */
public class ProductPickUpMarket extends ProducePickUpRequest {
    private int currentBid;
    private int finalBid;
    private UserAccount lastBidBy;

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
