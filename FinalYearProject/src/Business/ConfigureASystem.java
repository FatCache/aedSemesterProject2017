package Business;

import Business.Employee.Employee;
import Business.Network.Hospital;
import Business.Network.Network;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("a", "a", employee, new SystemAdminRole());
        
        // Create Main Network
        Network defaultNetwork = system.createAndAddNetwork();
        defaultNetwork.setName("DefaultNetwork");
        
        populateTable(defaultNetwork);
        
        return system;
    }

    private static void populateTable(Network network) {
        Hospital hospital = network.getHospitalDirectory().createAndAddHospital();
        hospital.setName("GeneralMass");
        hospital.setAddress("Boston MA");
        hospital.setAdministrationNumber("666-699-9666");
        hospital.setHotlineNumber(911);
        hospital.setLongitude(50);
        hospital.setLatitude(50);
        
        Hospital hospital1 = network.getHospitalDirectory().createAndAddHospital();
        hospital1.setName("Franklin Hospital");
        hospital1.setAddress("Boston MA");
        hospital1.setAdministrationNumber("999-111-1111");
        hospital1.setHotlineNumber(811);
        hospital1.setLongitude(25);
        hospital1.setLatitude(25);
        
        Hospital hospital3 = network.getHospitalDirectory().createAndAddHospital();
        hospital3.setName("Big Free Hospital");
        hospital3.setAddress("Providence MA");
        hospital3.setAdministrationNumber("999-000-0000");
        hospital3.setHotlineNumber(411);
        hospital3.setLongitude(99);
        hospital3.setLatitude(99);
        
        Hospital hospital4 = network.getHospitalDirectory().createAndAddHospital();
        hospital4.setName("Northeastern Hospital");
        hospital4.setAddress("Boston MA");
        hospital4.setAdministrationNumber("655-555-5555");
        hospital4.setHotlineNumber(111);
        hospital4.setLongitude(82);
        hospital4.setLatitude(25);
    }
    

    
}
