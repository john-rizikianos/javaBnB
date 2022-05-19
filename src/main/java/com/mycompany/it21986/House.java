package com.mycompany.it21986;
import java.util.Random;

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
}
