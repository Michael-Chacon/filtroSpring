package com.examenSpring.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "farmacymedicine")
public class FarmacyMedicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long price;

    @ManyToOne
    @JoinColumn(name = "idfarmacymd")
    private Farmacy farmacy;

    @ManyToOne
    @JoinColumn(name = "idmedicinefarmacy")
    private Medicine medicine;

    public FarmacyMedicine() {
    }

    public FarmacyMedicine(Long price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Farmacy getFarmacy() {
        return farmacy;
    }

    public void setFarmacy(Farmacy farmacy) {
        this.farmacy = farmacy;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
}
