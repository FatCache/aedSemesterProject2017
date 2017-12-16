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
public class HospitalDirectory {
    private ArrayList<Hospital> hospitalDirectory;
    
    public HospitalDirectory(){
        hospitalDirectory = new ArrayList<>();
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }
    
    public Hospital createAndAddHospital(){
        Hospital hospital = new Hospital();
//        hospital.setName(name);
//        hospital.setAddress(address);
//        hospital.setAdministrationNumber(adminNumber);
//        hospital.setHotlineNumber(hotNumber);
//        hospital.setLongitude(log);
//        hospital.setLatitude(lat);
        hospitalDirectory.add(hospital);
        return hospital;
    }
    
    
    
}
