package com.examenSpring.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Unitmeasurement")
public class Unitmeasurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idum")
    private Long idUm;

    @Column(name = "nameum")
    private String nameUm;

    public Unitmeasurement() {
    }

    public Unitmeasurement(String nameUm) {
        this.nameUm = nameUm;
    }

    public Long getIdUm() {
        return idUm;
    }

    public void setIdUm(Long idUm) {
        this.idUm = idUm;
    }

    public String getNameUm() {
        return nameUm;
    }

    public void setNameUm(String nameUm) {
        this.nameUm = nameUm;
    }
}
