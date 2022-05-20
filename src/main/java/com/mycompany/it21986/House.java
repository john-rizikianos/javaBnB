package com.mycompany.it21986;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author johnrizikianos
 */
public class House {
    public String ownerName;
    public String name;
    public String municipality;
    public String address;
    public String ownerAfm;
    public int guestnum;
    public int bednum;
    public boolean hasWifi;
    public boolean hasTv;
    public boolean hasKitchen;
    public boolean hasParking;
    public String view;
    public int disMetro;
    public int ppd; //price per day
    public int comfort; //comfort level== guestnum/bednum
    public int id;
    protected boolean isApartment;
    protected boolean isResort;

    public House(){
        
    }
    
    public House(String ownerName, String name,String municipality, String address, String ownerAfm, int guestnum, int bednum, boolean hasWifi, boolean hasTv, boolean hasKitchen, boolean hasParking, String view, int disMetro, int ppd, int comfort, int id, boolean isApartment, boolean isResort) {
        this.ownerName = ownerName;
        this.name = name;
        this.municipality = municipality;
        this.address = address;
        this.ownerAfm = ownerAfm;
        this.guestnum = guestnum;
        this.bednum = bednum;
        this.hasWifi = hasWifi;
        this.hasTv = hasTv;
        this.hasKitchen = hasKitchen;
        this.hasParking = hasParking;
        this.view = view;
        this.disMetro = disMetro;
        this.ppd = ppd;
        this.comfort = comfort;
        this.id = id;
        this.isApartment = isApartment;
        this.isResort = isResort;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }
    public void setName(String name){
        this.name = name;
    
    }
    public void setOwnerName(String name){
        this.ownerName = name;
    
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void setOwnerAfm(String ownerAfm) {
        this.ownerAfm = ownerAfm;
    }

    public void setGuestnum(int guestnum) {
        this.guestnum = guestnum;
    }

    public void setBednum(int bednum) {
        this.bednum = bednum;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public void setHasTv(boolean hasTv) {
        this.hasTv = hasTv;
    }

    public void setHasKitchen(boolean hasKitchen) {
        this.hasKitchen = hasKitchen;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    public void setView(String view) {
        this.view = view;
    }

    public void setDisMetro(int disMetro) {
        this.disMetro = disMetro;
    }

    public void setPpd(int ppd) {
        this.ppd = ppd;
    }

    public void setComfort() {
        this.comfort = this.guestnum/this.bednum;
    }

    public void setId() {
        Random ranid = new Random();
        this.id = ranid.nextInt(1000);
    }

    public void setIsApartment(boolean isApartment) {
        this.isApartment = isApartment;
    }

    public void setIsResort(boolean isResort) {
        this.isResort = isResort;
    }

    public String getMunicipality() {
        return municipality;
    }

    public String getAddress() {
        return address;
    }

    public String getOwnerAfm() {
        return ownerAfm;
    }

    public int getGuestnum() {
        return guestnum;
    }

    public int getBednum() {
        return bednum;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public boolean isHasTv() {
        return hasTv;
    }

    public boolean isHasKitchen() {
        return hasKitchen;
    }

    public boolean isHasParking() {
        return hasParking;
    }

    public String getView() {
        return view;
    }

    public int getDisMetro() {
        return disMetro;
    }

    public int getPpd() {
        return ppd;
    }

    public int getComfort() {
        return comfort;
    }

    public int getId() {
        return id;
    }

    public boolean isIsApartment() {
        return isApartment;
    }

    public boolean isIsResort() {
        return isResort;
    }

    public void entryMade(){
        System.out.println("House ID: " + this.id + "Owner Name: " + this.ownerName + "Owner AFM: " + this.ownerAfm);
    }
public House createHouse(House newHouse){
    Scanner sc = new Scanner(System.in);
                    System.out.println("Please enter your name:");
                    newHouse.setOwnerName(sc.nextLine());
                    System.out.println("Please enter house name:");
                    newHouse.setName(sc.nextLine());
                    System.out.println("Please enter municipality:");
                    newHouse.setMunicipality(sc.nextLine());
                    System.out.println("Please enter house address:");
                    newHouse.setAddress(sc.nextLine());
                    System.out.println("Please enter guest number:");
                    newHouse.setGuestnum(Integer.parseInt(sc.nextLine()));
                    System.out.println("Please enter number of bedrooms:");
                    newHouse.setBednum(Integer.parseInt(sc.nextLine()));
                    System.out.println("Does the house have WiFi? (answer true or false)");
                    newHouse.setHasWifi(Boolean.parseBoolean(sc.nextLine()));
                    System.out.println("Does the house have a TV? (answer true or false)");
                    newHouse.setHasTv(Boolean.parseBoolean(sc.nextLine()));
                    System.out.println("Does the house have Parking? (answer true or false)");
                    newHouse.setHasParking(Boolean.parseBoolean(sc.nextLine()));
                    System.out.println("What kind of view does it have? (answer street,sea,mountain )");
                    newHouse.setView(sc.nextLine());
                    System.out.println("What is the distance from the nearest Metro Station?");
                    newHouse.setDisMetro(Integer.parseInt(sc.nextLine()));
                    System.out.println("How much is the cost per day??");
                    newHouse.setPpd(Integer.parseInt(sc.nextLine()));
                    newHouse.setComfort();
                    newHouse.setId();
                    
                    System.out.println("Is the house a Resort? (answer true or false)");
                    boolean res3=Boolean.parseBoolean(sc.nextLine());
                    if(res3==true){
                        Resort newResort = new Resort();
                        newResort.ownerName=newHouse.ownerName;
                        newResort.municipality=newHouse.municipality;
                        newResort.address=newHouse.address;
                        newResort.ownerAfm=newHouse.ownerAfm;
                        newResort.guestnum=newHouse.guestnum;
                        newResort.bednum=newHouse.bednum;
                        newResort.hasWifi=newHouse.hasWifi;
                        newResort.hasParking=newHouse.hasParking;
                        newResort.view=newHouse.view;
                        newResort.disMetro=newHouse.disMetro;
                        newResort.ppd=newHouse.ppd;
                        newResort.comfort=newHouse.comfort;
                        newResort.id=newHouse.id;
                        newResort.isApartment=newHouse.isApartment;
                        newResort.isResort=newHouse.isResort;
                        
                        
                        System.out.println("Please enter the pool square meters:");
                        newResort.setPoolSqmt(Integer.parseInt(sc.nextLine()));
                        System.out.println("Please enter the garden square meters:");
                        newResort.setGardenSqmt(Integer.parseInt(sc.nextLine()));
                        System.out.println("Does the resort have a BBQ?");
                        newResort.setHasBbq(Boolean.parseBoolean(sc.nextLine()));
                        return newResort;
                       }
                    System.out.println("Is the house an Apartment? (answer true or false)");
                    boolean res4=Boolean.parseBoolean(sc.nextLine());
                    if(res4==true){
                        Apartment newApartment = new Apartment();
                         newApartment.ownerName=newHouse.ownerName;
                        newApartment.municipality=newHouse.municipality;
                        newApartment.address=newHouse.address;
                        newApartment.ownerAfm=newHouse.ownerAfm;
                        newApartment.guestnum=newHouse.guestnum;
                        newApartment.bednum=newHouse.bednum;
                        newApartment.hasWifi=newHouse.hasWifi;
                        newApartment.hasParking=newHouse.hasParking;
                        newApartment.view=newHouse.view;
                        newApartment.disMetro=newHouse.disMetro;
                        newApartment.ppd=newHouse.ppd;
                        newApartment.comfort=newHouse.comfort;
                        newApartment.id=newHouse.id;
                        newApartment.isApartment=newHouse.isApartment;
                        newApartment.isResort=newHouse.isResort;
                        System.out.println("Please enter the apartment floor:");
                        newApartment.setFloor(Integer.parseInt(sc.nextLine()));
                        System.out.println("Does the apartment have an elevator?");
                        newApartment.setHasElevator(Boolean.parseBoolean(sc.nextLine()));
                        System.out.println("Does the apartment have a balcony?");
                        newApartment.setHasBalcony(Boolean.parseBoolean(sc.nextLine()));
                        return newApartment;
                        
                        
                    }
                    return newHouse;
}

}
