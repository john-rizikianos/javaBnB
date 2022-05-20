
package com.mycompany.it21986;

import java.util.Scanner;

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
 public Owner createOwner(String res, Owner newOwner){
            Scanner sc = new Scanner(System.in);
            newOwner.setAfm(res);
            System.out.println("Registering as a new user, please tell me your name:");
            newOwner.setName(sc.next());
            System.out.println("Please enter your home address:");
            newOwner.setAddressOwner(sc.next());
            System.out.println("Please enter your Government ID Number:");
            newOwner.setIdnum(sc.next());
            return newOwner;
            
 }
}
