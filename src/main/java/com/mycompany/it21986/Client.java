package com.mycompany.it21986;

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
    
}
