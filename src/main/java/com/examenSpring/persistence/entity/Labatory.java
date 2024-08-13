package com.examenSpring.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "laboratory")
public class Labatory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namelab;

    @ManyToOne
    @JoinColumn(name = "codecityreg")
    private City city;

    public Labatory() {
    }

    public Labatory(String namelab) {
        this.namelab = namelab;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamelab() {
        return namelab;
    }

    public void setNamelab(String namelab) {
        this.namelab = namelab;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
