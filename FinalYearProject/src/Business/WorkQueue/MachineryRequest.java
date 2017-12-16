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
public class MachineryRequest extends WorkRequest {
    private String MachineryType;
    private Date availabilityDate;

    public String getMachineryType() {
        return MachineryType;
    }

    public void setMachineryType(String MachineryType) {
        this.MachineryType = MachineryType;
    }

    public Date getAvailabilityDate() {
        return availabilityDate;
    }

    public void setAvailabilityDate(Date availabilityDate) {
        this.availabilityDate = availabilityDate;
    }
    
    public String toString(){
        return MachineryType;
    }

    
}
