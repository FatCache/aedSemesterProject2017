/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.FarmerFarmer;
import Business.Role.Role;
import Business.Role.TransportDriver;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        if(role instanceof FarmerFarmer){
            FarmerUserAccount farmerUserAccount = new FarmerUserAccount();
            farmerUserAccount.setUsername(username);
            farmerUserAccount.setAddress("Random Farmer Address");            
            farmerUserAccount.setPassword(password);
            farmerUserAccount.setEmployee(employee);
            farmerUserAccount.setRole(role);
            userAccountList.add(farmerUserAccount);
            return farmerUserAccount;
            
        }else if(role instanceof TransportDriver){            
            DriverUserAccount driverUserAccount = new DriverUserAccount();
            driverUserAccount.setUsername(username);
            driverUserAccount.setPassword(password);
            driverUserAccount.setEmployee(employee);
            driverUserAccount.setRole(role);
            userAccountList.add(driverUserAccount);
            return driverUserAccount;
            
        }
        else{
            UserAccount userAccount = new UserAccount();
            userAccount.setUsername(username);
            userAccount.setPassword(password);
            userAccount.setEmployee(employee);
            userAccount.setRole(role);
            userAccountList.add(userAccount);
            return userAccount;
        }
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
