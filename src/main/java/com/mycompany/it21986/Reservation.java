package com.mycompany.it21986;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

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
    public double totalPrice;
    public String municipality;
    public int people;
    public boolean cancel;
    public int cancelFee;
    
    public Reservation(int housId,String firstDay, String endDay, int resId, String resPeriod, int totalPrice, String municipality, int people, boolean cancel, int cancelFee) {
        this.housId = housId;
        this.firstDay = firstDay;
        this.endDay = endDay;
        this.resId = resId;
        this.resPeriod = resPeriod;
        this.totalPrice = totalPrice;
        this.municipality=municipality;
        this.people=people;
        this.cancel=false;
        this.cancelFee=0;
    }
    public Reservation(){
        
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

    public double getTotalPrice() {
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
    public void setMunicipality(String municipality){
        this.municipality= municipality;
    }

    public String getMunicipality() {
        return municipality;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }
    
    public void checkAvailability(House house, Reservation reservation){
        //a function that checks all available houses and prints them on the screen
        if((house.guestnum==reservation.people) && (house.municipality==reservation.municipality )){
                System.out.println("House ID: "+ house.id + "Cost per Day: "+ house.ppd);
        }
    }
    
    public Reservation createReservation(Reservation reservation, House house){
        reservation.housId=house.id;
        Random ranid = new Random();
        reservation.resId = ranid.nextInt(1000);
        System.out.println("Reservation ID: "+reservation.resId+"Cost Per Day: "+house.ppd);
        return reservation;
    }
    public Reservation initSearch(Reservation reservation){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your desired First Day:(format: DDMMYYYY)");
        reservation.setFirstDay(sc.nextLine());
        System.out.println("Please enter your desired Last Day:(format: DDMMYYYY)");
        reservation.setEndDay(sc.nextLine());
        System.out.println("How many of you will it be?");
        reservation.setPeople(Integer.parseInt(sc.nextLine()));
        System.out.println("In which Municipality would you like to stay?");
        reservation.setMunicipality(sc.nextLine());
        return reservation;
    }
    public void alterRes(Reservation reservation){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the new Starting date:");
        reservation.firstDay=sc.nextLine();
        System.out.println("Enter the new Final date:");
        reservation.endDay=sc.nextLine();
        sc.close();
        //return reservation;
    }
    public void cancelRes(Reservation reservation){
        reservation.cancel=true;
        reservation.cancelFee=(int) (reservation.totalPrice*0.10);
        System.out.println("Reservation ID: "+reservation.resId+"Cancelation Fee: "+reservation.cancelFee);
    }
}
