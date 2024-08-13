package com.examenSpring.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {
    @Id
    private String codeCountry;
    private String namecountry;

    public Country() {
    }

    public Country(String namecountry) {
        this.namecountry = namecountry;
    }

    public String getCodeCountry() {
        return codeCountry;
    }

    public void setCodeCountry(String codeCountry) {
        this.codeCountry = codeCountry;
    }

    public String getNamecountry() {
        return namecountry;
    }

    public void setNamecountry(String namecountry) {
        this.namecountry = namecountry;
    }
}
