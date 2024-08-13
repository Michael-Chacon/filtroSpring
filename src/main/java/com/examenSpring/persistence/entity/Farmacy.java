package com.examenSpring.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "farmacy")
public class Farmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "namefarmacy")
    private String nameFarmacy;
    @Column(name = "addressfarmacy")
    private String addressFarmacy;

    @Column(name = "longf")
    private Long longFarmacy;
    @Column(name = "latfarmacy")
    private Long latFarmacy;

    @Column(name = "logofarmacy")
    private String logoFarmacy;

    @ManyToOne
    @JoinColumn(name = "codecityfarmacy")
    private City city;

    public Farmacy() {
    }

    public Farmacy(String nameFarmacy, String addressFarmacy, Long longFarmacy, Long latFarmacy, String logoFarmacy) {
        this.nameFarmacy = nameFarmacy;
        this.addressFarmacy = addressFarmacy;
        this.longFarmacy = longFarmacy;
        this.latFarmacy = latFarmacy;
        this.logoFarmacy = logoFarmacy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameFarmacy() {
        return nameFarmacy;
    }

    public void setNameFarmacy(String nameFarmacy) {
        this.nameFarmacy = nameFarmacy;
    }

    public String getAddressFarmacy() {
        return addressFarmacy;
    }

    public void setAddressFarmacy(String addressFarmacy) {
        this.addressFarmacy = addressFarmacy;
    }

    public Long getLongFarmacy() {
        return longFarmacy;
    }

    public void setLongFarmacy(Long longFarmacy) {
        this.longFarmacy = longFarmacy;
    }

    public Long getLatFarmacy() {
        return latFarmacy;
    }

    public void setLatFarmacy(Long latFarmacy) {
        this.latFarmacy = latFarmacy;
    }

    public String getLogoFarmacy() {
        return logoFarmacy;
    }

    public void setLogoFarmacy(String logoFarmacy) {
        this.logoFarmacy = logoFarmacy;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
