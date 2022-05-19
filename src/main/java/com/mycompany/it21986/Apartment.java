
package com.mycompany.it21986;

/**
 *
 * @author johnrizikianos
 */
public class Apartment extends House{
    public int floor;
    public boolean hasElevator;
    public boolean hasBalcony;

    
    public Apartment(){
    }
    public Apartment(int floor, boolean hasElevator, boolean hasBalcony,String ownerName,  String name, String municipality, String address, String ownerAfm, int guestnum, int bednum, boolean hasWifi, boolean hasTv, boolean hasKitchen, boolean hasParking, String view, int disMetro, int ppd, int comfort, int id, boolean isApartment, boolean isResort) {
        super(ownerName, name,municipality, address, ownerAfm, guestnum, bednum, hasWifi, hasTv, hasKitchen, hasParking, view, disMetro, ppd, comfort, id, isApartment, isResort);
        this.floor = floor;
        this.hasElevator = hasElevator;
        this.hasBalcony = hasBalcony;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setHasElevator(boolean hasElevator) {
        this.hasElevator = hasElevator;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public int getFloor() {
        return floor;
    }

    public boolean isHasElevator() {
        return hasElevator;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }
    
}
