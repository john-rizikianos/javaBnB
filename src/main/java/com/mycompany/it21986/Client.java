package com.mycompany.it21986;

import java.util.Scanner;

/**
 *
 * @author johnrizikianos
 */
public class Client {
    public String afm;
    public String name;
    public String email;
    public String idnum;

    public Client(String afm, String name, String email, String idnum) {
        this.afm = afm;
        this.name = name;
        this.email = email;
        this.idnum = idnum;
    }
    
    public Client(){
    }

    public String getAfm() {
        return afm;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }
    
    public Client createClient(String afm, Client Client){
        Scanner sc = new Scanner(System.in);
            Client.setAfm(afm);
            System.out.println("Registering as a new client, please tell me your name:");
            Client.setName(sc.nextLine());
            System.out.println("Please enter your ID Number:");
            Client.setIdnum(sc.nextLine());
            System.out.println("Please enter your email address:");
            Client.setEmail(sc.nextLine());
        return Client;
    }
    
}
