package com.mycompany.it21986;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author johnrizikianos
 */
public class It21986 {

    public static void main(String[] args) {
        List listOwner = new LinkedList();
        List listHouse = new LinkedList();
        List listClient = new LinkedList();
        List listReservation = new LinkedList();
        
        //owner init
        Owner John = new Owner("68912","John Rizikianos", "Agias Lauras", "it21986");
        listOwner.add(John);
        Owner Thanos = new Owner("13250","Thanos Rizikianos", "Agias Lauras", "ak05231");
        listOwner.add(Thanos);
        Owner Christina = new Owner("11007","Christina Papadopoyloy", "Omhroy", "ak70011");
        listOwner.add(Christina);
        
        //House init
        House house1 = new House("John Rizikianos","house1", "Nea Ionia","Lauras","68912",4,2,true,true,true,true,"street",200,70,2,0001,false,false);
        listHouse.add(house1);
        
        House house2 = new House("Thanos Rizikianos","house2","Metamorfosh","Alexandroy","13250",1,1,true,false,true,false,"street",600,50,1,0002,false,false);
        listHouse.add(house2);
        
        Resort house3 = new Resort(20,60,true,"Christina Papadopoyloy","house3","Metamorfosh","Ektoros","11007",4,4,true,true,true,false,"sea",1500,350,1,0003,false,true);
        listHouse.add(house3);
        
        //Reservation init
        Reservation reservation1 = new Reservation(0001,"0107", "0707",1001,"01020304050607",490);
        listReservation.add(reservation1);
        
        Reservation reservation2 = new Reservation(0002,"0307", "1307",1002,"0304050607080910111213",550);
        listReservation.add(reservation2);
        
        Reservation reservation3 = new Reservation(0003,"0107", "0707",1003,"01020304050607",2450);
        listReservation.add(reservation3);
        
        //Client init
        Client client1 = new Client("15872","Son Goku","kakarotto@gmail.com","ssj0001");
        listClient.add(client1);
        
        Client client2 = new Client("45766","Vegeta","vegeta@gmail.com","ssj0002");
        listClient.add(client2);
        
        Client client3 = new Client("10527","Gohan","gohan@gmail.com","ssj0021");
        listClient.add(client3);
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose a function:\n1.List an asset\n2.Make a Reservation\n3.Change a reservation\n4.Show Reports\n5.Exit");
        int response = sc.nextInt();
        System.out.println("Response is " + response);
        switch (response) {
            case 1:
            System.out.println("Enter your AFM:");
            String res=sc.next(); // AFM
            boolean flag = true;
            while(true) {
            for(int i=0;i<+listOwner.size();i++){
                Owner owner = (Owner) listOwner.get(i);
                if(owner.afm.equals(res)){ 
                    House  newHouse = new House();
                    System.out.println("Please enter your name:");
                    newHouse.setOwnerName(sc.next());
                    System.out.println("Please enter house name:");
                    newHouse.setName(sc.next());
                    System.out.println("Please enter municipality:");
                    newHouse.setMunicipality(sc.next());
                    System.out.println("Please enter house address:");
                    newHouse.setAddress(sc.next());
                    System.out.println("Please enter guest number:");
                    newHouse.setGuestnum(sc.nextInt());
                    System.out.println("Please enter number of bedrooms:");
                    newHouse.setBednum(sc.nextInt());
                    System.out.println("Does the house have WiFi? (answer true or false)");
                    newHouse.setHasWifi(sc.nextBoolean());
                    System.out.println("Does the house have a TV? (answer true or false)");
                    newHouse.setHasTv(sc.nextBoolean());
                    System.out.println("Does the house have Parking? (answer true or false)");
                    newHouse.setHasParking(sc.nextBoolean());
                    System.out.println("What kind of view does it have? (answer street,sea,mountain )");
                    newHouse.setView(sc.next());
                    System.out.println("What is the distance from the nearest Metro Station?");
                    newHouse.setDisMetro(sc.nextInt());
                    System.out.println("How much is the cost per day??");
                    newHouse.setPpd(sc.nextInt());
                    newHouse.setComfort();
                    newHouse.setId();
                    
                    System.out.println("Is the house a Resort? (answer true or false)");
                    boolean res3=sc.nextBoolean();
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
                        newResort.setPoolSqmt(sc.nextInt());
                        System.out.println("Please enter the garden square meters:");
                        newResort.setGardenSqmt(sc.nextInt());
                        System.out.println("Does the resort have a BBQ?");
                        newResort.setHasBbq(sc.nextBoolean());
                        listHouse.add(newResort);
                        flag=false;
                        break;
                    }
                    System.out.println("Is the house an Apartment? (answer true or false)");
                    boolean res4=sc.nextBoolean();
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
                        newApartment.setFloor(sc.nextInt());
                        System.out.println("Does the apartment have an elevator?");
                        newApartment.setHasElevator(sc.nextBoolean());
                        System.out.println("Does the apartment have a balcony?");
                        newApartment.setHasBalcony(sc.nextBoolean());
                        listHouse.add(newApartment);
                        flag=false;
                        break;
                    }
                    listHouse.add(newHouse);
                    flag=false;
                    break;
                }
            } //an den exei kanei break mexri stigmhs ayto shmainei oti den yparxei to afk ara ftiaxnw idiokthth
            Owner newOwner = new Owner();
            newOwner.setAfm(res);
            System.out.println("Registering as a new user, please tell me your name:");
            newOwner.setName(sc.next());
            System.out.println("Please enter your home address:");
            newOwner.setAddressOwner(sc.next());
            System.out.println("Please enter your Government ID Number:");
            newOwner.setIdnum(sc.next());
            listOwner.add(newOwner);
            break;
            }
            break;
            case 2:
                System.out.println("Make a reservation");
            break;
            case 3:
                System.out.println("Change a Reservation");
            break;
            case 4:
                System.out.println("Showing reports...");
            break;
            case 5:
                System.out.println("Exiting...");
            break;
            default:
                break;
        
    
    }
       
}
}
