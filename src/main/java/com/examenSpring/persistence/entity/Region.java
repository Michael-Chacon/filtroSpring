package com.examenSpring.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "region")
public class Region {
    @Id
    private String codereg;
    private String namereg;

    @ManyToOne
    @JoinColumn(name = "codecountry")
    private Country country;

    public Region() {
    }

    public Region(String namereg) {
        this.namereg = namereg;
    }

    public String getCodereg() {
        return codereg;
    }

    public void setCodereg(String codereg) {
        this.codereg = codereg;
    }

    public String getNamereg() {
        return namereg;
    }

    public void setNamereg(String namereg) {
        this.namereg = namereg;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
