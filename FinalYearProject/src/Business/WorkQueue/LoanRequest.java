/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author abdusamed
 */
public class LoanRequest extends WorkRequest {
    
    private String loanDescription;
    private int loanAmount;
    
    public LoanRequest(){
        super();
    }

    public String getLoanDescription() {
        return loanDescription;
    }

    public void setLoanDescription(String loanDescription) {
        this.loanDescription = loanDescription;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }
    
    @Override
    public String toString(){
        return loanDescription;
    }
    
    
    
}
