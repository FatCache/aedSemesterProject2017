/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Network.MarketNews;
import Business.WorkQueue.AgricultureProductRequest;
import Business.WorkQueue.HospitalAssistanceRequest;
import Business.WorkQueue.LoanRequest;
import Business.WorkQueue.MachineryRequest;
import Business.WorkQueue.ProducePickUpRequest;
import Business.WorkQueue.SoilConditionReport;
import java.util.ArrayList;

/**
 *
 * @author abdusamed
 */
public class FarmerUserAccount extends UserAccount{
    private String address;
    private ArrayList<AgricultureProductRequest> chemicalProductWorkQueue;
    private ArrayList<HospitalAssistanceRequest> hosptialWorkQueue;
    private ArrayList<LoanRequest> financeWorkQueue;
    private ArrayList<MachineryRequest> transportMachineWorkQueue;
    private ArrayList<SoilConditionReport> chemicalSoilWorkQueue;
    private ArrayList<ProducePickUpRequest> producePickUpRequest;
    
    private ArrayList<MarketNews> messageList;
        
    public FarmerUserAccount(){
        chemicalProductWorkQueue = new ArrayList<>();
        hosptialWorkQueue = new ArrayList<>();
        financeWorkQueue = new ArrayList<>();
        transportMachineWorkQueue = new ArrayList<>();
        chemicalSoilWorkQueue = new ArrayList<>();       
        producePickUpRequest = new ArrayList<>();
        messageList = new ArrayList<>();
    }

    public ArrayList<ProducePickUpRequest> getProducePickUpRequest() {
        return producePickUpRequest;
    }
    
    
    public String getAddress() {
        return address;
    }

    public ArrayList<AgricultureProductRequest> getChemicalProductWorkQueue() {
        return chemicalProductWorkQueue;
    }

    public ArrayList<HospitalAssistanceRequest> getHosptialWorkQueue() {
        return hosptialWorkQueue;
    }

    public ArrayList<LoanRequest> getFinanceWorkQueue() {
        return financeWorkQueue;
    }

    public ArrayList<MachineryRequest> getTransportMachineWorkQueue() {
        return transportMachineWorkQueue;
    }

    public ArrayList<SoilConditionReport> getChemicalSoilWorkQueue() {
        return chemicalSoilWorkQueue;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<MarketNews> getMessageList() {
        return messageList;
    }

    public void setMessageList(ArrayList<MarketNews> messageList) {
        this.messageList = messageList;
    }
    
    
   
}
