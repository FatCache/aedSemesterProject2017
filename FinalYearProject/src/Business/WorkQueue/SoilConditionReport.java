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
public class SoilConditionReport extends WorkRequest {
    private String soilReport;
    
    public SoilConditionReport(){
        super();
    }

    public String getSoilReport() {
        return soilReport;
    }

    public void setSoilReport(String soilReport) {
        this.soilReport = soilReport;
    }
    
    @Override
    public String toString(){
        return soilReport;
    }
    
    
}
