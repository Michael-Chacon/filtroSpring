package com.examenSpring.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "idcustomer")
    private String idCustomer;

    @Column(name = "namecustomer")
    private String nameCustomer;
    @Column(name = "lastnamecustomer")
    private String lastnameCustomer;
    @Column(name = "emailcustomer")
    private String emailCustomer;
    @Column(name = "birthdate")
    private Date birthDate;
    private Float lon;
    private Float latitud;

    @ManyToOne
    @JoinColumn(name = "codecitycustomer")
    private City city;

    public Customer() {
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getLastnameCustomer() {
        return lastnameCustomer;
    }

    public void setLastnameCustomer(String lastnameCustomer) {
        this.lastnameCustomer = lastnameCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Float getLatitud() {
        return latitud;
    }

    public void setLatitud(Float latitud) {
        this.latitud = latitud;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Customer(String nameCustomer, String lastnameCustomer, String emailCustomer, Date birthDate, Float lon, Float latitud) {
        this.nameCustomer = nameCustomer;
        this.lastnameCustomer = lastnameCustomer;
        this.emailCustomer = emailCustomer;
        this.birthDate = birthDate;
        this.lon = lon;
        this.latitud = latitud;


    }
}
