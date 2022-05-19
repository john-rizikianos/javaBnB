package com.mycompany.it21986;

/**
 *
 * @author johnrizikianos
 */
public class Reservation {
    public int housId;//house id
    public String firstDay;
    public String endDay;
    public int resId; //reservation ID
    public String resPeriod; //reservation-period
    public int totalPrice;

    public Reservation(int housId,String firstDay, String endDay, int resId, String resPeriod, int totalPrice) {
        this.housId = housId;
        this.firstDay = firstDay;
        this.endDay = endDay;
        this.resId = resId;
        this.resPeriod = resPeriod;
        this.totalPrice = totalPrice;
    }

    public int getHousId() {
        return housId;
    }
    
    public String getFirstDay() {
        return firstDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public int getResId() {
        return resId;
    }

    public String getResPeriod() {
        return resPeriod;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setFirstDay(String firstDay) {
        this.firstDay = firstDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public void setResPeriod(String resPeriod) {
        this.resPeriod = resPeriod;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public void setHousId(int housId) {
        this.housId = housId;
    }
}
