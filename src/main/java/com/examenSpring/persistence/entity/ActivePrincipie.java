package com.examenSpring.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "activeprincipie")
public class ActivePrincipie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idap")
    private Long idAp;

    @Column(name = "nameap")
    private String nameAp;

    public ActivePrincipie() {
    }

    public ActivePrincipie(String nameAp) {
        this.nameAp = nameAp;
    }

    public Long getIdAp() {
        return idAp;
    }

    public void setIdAp(Long idAp) {
        this.idAp = idAp;
    }

    public String getNameAp() {
        return nameAp;
    }

    public void setNameAp(String nameAp) {
        this.nameAp = nameAp;
    }
}
