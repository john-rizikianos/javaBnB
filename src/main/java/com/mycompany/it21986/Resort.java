package com.mycompany.it21986;

/**
 *
 * @author johnrizikianos
 */
public class Resort extends House{
    public int poolSqmt;//square meters
    public int gardenSqmt;
    public boolean hasBbq;

    
    public Resort(){
        
    }
    public Resort(int poolSqmt, int gardenSqmt, boolean hasBbq,String ownerName,  String name, String municipality, String address, String ownerAfm, int guestnum, int bednum, boolean hasWifi, boolean hasTv, boolean hasKitchen, boolean hasParking, String view, int disMetro, int ppd, int comfort, int id, boolean isApartment, boolean isResort) {
        super(ownerName,name, municipality, address, ownerAfm, guestnum, bednum, hasWifi, hasTv, hasKitchen, hasParking, view, disMetro, ppd, comfort, id, isApartment, isResort);
        this.poolSqmt = poolSqmt;
        this.gardenSqmt = gardenSqmt;
        this.hasBbq = hasBbq;
    }

    public int getPoolSqmt() {
        return poolSqmt;
    }

    public int getGardenSqmt() {
        return gardenSqmt;
    }

    public boolean isHasBbq() {
        return hasBbq;
    }

    public void setPoolSqmt(int poolSqmt) {
        this.poolSqmt = poolSqmt;
    }

    public void setGardenSqmt(int gardenSqmt) {
        this.gardenSqmt = gardenSqmt;
    }

    public void setHasBbq(boolean hasBbq) {
        this.hasBbq = hasBbq;
    }
    
    
}
