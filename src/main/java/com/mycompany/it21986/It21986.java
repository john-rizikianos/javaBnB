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
        Reservation reservation1 = new Reservation(0001,"0107", "0707",1001,"01020304050607",490,"Nea Ionia", 4,false,0);
        listReservation.add(reservation1);
        
        Reservation reservation2 = new Reservation(0002,"0307", "1307",1002,"0304050607080910111213",550,"Metamorfosh",1,false,0);
        listReservation.add(reservation2);
        
        Reservation reservation3 = new Reservation(0003,"0107", "0707",1003,"01020304050607",2450,"Metamorfosh",4,false,0);
        listReservation.add(reservation3);
        
        //Client init
        Client client1 = new Client("15872","Son Goku","kakarotto@gmail.com","ssj0001");
        listClient.add(client1);
        
        Client client2 = new Client("45766","Vegeta","vegeta@gmail.com","ssj0002");
        listClient.add(client2);
        
        Client client3 = new Client("10527","Gohan","gohan@gmail.com","ssj0021");
        listClient.add(client3);
        
        
        Scanner sc = new Scanner(System.in);
        
        boolean flag=true;
        
        while(flag){
        System.out.println("Please choose a function:\n1.List an asset\n2.Make a Reservation\n3.Change a reservation\n4.Show Reports\n5.Exit");
        int response = Integer.parseInt(sc.nextLine());
        if(response==1) {
            System.out.println("Enter your AFM:");
            String res=sc.next(); // AFM
            boolean exists = false;
            for(int i=0;i<+listOwner.size();i++){
                Owner owner = (Owner) listOwner.get(i);
                if(owner.afm.equals(res)){
                 exists=true;
                 House newHouse = new House();
                 newHouse.createHouse(newHouse);
                 listHouse.add(newHouse.createHouse(newHouse));
                } 
                
                }
            if(exists==false){
            Owner newOwner = new Owner();
            listOwner.add(newOwner.createOwner(res, newOwner));
            }
            System.out.println("Please choose a function:\n1.List an asset\n2.Make a Reservation\n3.Change a reservation\n4.Show Reports\n5.Exit");
            response = Integer.parseInt(sc.nextLine());
        
        } else if(response==2){
                System.out.println("Enter your AFM to make a reservation");
                String res=sc.nextLine();
                //TODO TODO
                boolean exists = false;
                for(int i=0;i<+listClient.size();i++){
                    Client client = (Client) listClient.get(i);
                    if(client.afm.equals(res)){
                        exists=true;
                        //search before RESERVATION
                        Reservation newRes = new Reservation();
                        newRes.initSearch(newRes);//initialises search
                        for(i =0; i<=listHouse.size();i++){
                            House house = (House) listHouse.get(i);
                            //int houseID =listHouse.get(house.id);
                            for(int j=0;j<=listReservation.size();j++){
                                Reservation reservation = (Reservation) listReservation.get(j);
                                if(reservation.housId==house.id){
                                reservation.checkAvailability(house,reservation);//shows available houses
                            }
                            }
                        }
                        System.out.println("Please enter the House ID: ");
                        int houseId = Integer.parseInt(sc.nextLine());
                        for(int k=0;k<=listHouse.size();i++){
                            House house = (House) listHouse.get(k);
                                if(house.id==houseId){
                                listReservation.add(newRes.createReservation(newRes,house));//creates reservation
                                
                                }
                        }
                                        
                }
                }
                if(exists==false){
                Client newClient = new Client();
                listClient.add(newClient.createClient(res, newClient));
            }
            System.out.println("Please choose a function:\n1.List an asset\n2.Make a Reservation\n3.Change a reservation\n4.Show Reports\n5.Exit");
            response = Integer.parseInt(sc.nextLine());
            
        }else if (response==3){
            System.out.println("Please enter the Reservation Id: (for testing: 1001, 1002, 1003)");
            int alterable = Integer.parseInt(sc.nextLine());
            boolean found = false;
            for(int i=0;i<=listReservation.size();i++){
                Reservation reservation = (Reservation) listReservation.get(i);
                if(alterable==reservation.resId){
                    System.out.println("Would you like to \n1.Alter a reservation \n2.Cancel a reservation?");
                    int reply = Integer.parseInt(sc.nextLine());
                    if(reply==1){
                    reservation.alterRes(reservation);
                    found=true;
                    }else{
                    reservation.cancelRes(reservation);
                    listReservation.remove(i);
                    found=true;
                    }
                }
            }
            if(found==false){
                System.out.println("Reservation not found! Try again or make a new one! (dont, because it doesnt work!)");
            }
            System.out.println("Please choose a function:\n1.List an asset\n2.Make a Reservation\n3.Change a reservation\n4.Show Reports\n5.Exit");
            response = Integer.parseInt(sc.nextLine());
        
        }else if (response==4){
            
            System.out.println("Showing reports...");
            System.out.println("Please choose a function:\n1.List an asset\n2.Make a Reservation\n3.Change a reservation\n4.Show Reports\n5.Exit");
            response = Integer.parseInt(sc.nextLine());
        }else if(response==5){
                System.out.println("Exiting...");
                flag=false;
        }
    
    }
       
}
}