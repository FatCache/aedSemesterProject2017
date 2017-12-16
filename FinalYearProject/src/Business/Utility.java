/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Enterprise.MarketEnterprise;
import Business.Network.Network;
import Business.Organization.MarketOrganization;
import Business.Organization.Organization;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author abdusamed
 */
public class Utility {
    
    public static String getDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    public static Date getCurrentDate(){
        Date date = new Date();
        return date;
    }
    
    public static MarketOrganization getMarketOrganization(){
        EcoSystem business = EcoSystem.getInstance();
        for(Network network:business.getNetworkList()){
            for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof MarketEnterprise){
                    for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                        if(organization instanceof MarketOrganization){
                            return (MarketOrganization) organization;
                    }

                    }
                }
            }
        }
        return null;
    }
    
    public static boolean stringCheck(String input){
        return input.matches("[a-zA-Z]*");
    }
    
    public static boolean intCheck(String input){
        return input.matches("[0-9]*");
    }
}
