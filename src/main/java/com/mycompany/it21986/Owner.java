
package com.mycompany.it21986;

/**
 *
 * @author johnrizikianos
 */
public class Owner {
    public String afm;
    public String name;
    public String addressOwner;
    public String idnum;

    
    public Owner(){
        
    }
    public Owner(String afm, String name, String addressOwner, String idnum) {
        this.afm = afm;
        this.name = name;
        this.addressOwner = addressOwner;
        this.idnum = idnum;
    }

    public String getAfm() {
        return afm;
    }

    public String getName() {
        return name;
    }

    public String getAddressOwner() {
        return addressOwner;
    }

    public String getIdnum() {
        return idnum;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddressOwner(String addressOwner) {
        this.addressOwner = addressOwner;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }
    
}
