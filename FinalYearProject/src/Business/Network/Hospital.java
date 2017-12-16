    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

/**
 *
 * @author abdusamed
 */
public class Hospital{
    private int latitude;
    private int longitude;
    private String address;
    private int hotlineNumber;
    private String administrationNumber;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdministrationNumber() {
        return administrationNumber;
    }

    public void setAdministrationNumber(String administrationNumber) {
        this.administrationNumber = administrationNumber;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getHotlineNumber() {
        return hotlineNumber;
    }

    public void setHotlineNumber(int hotlineNumber) {
        this.hotlineNumber = hotlineNumber;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
    
}
