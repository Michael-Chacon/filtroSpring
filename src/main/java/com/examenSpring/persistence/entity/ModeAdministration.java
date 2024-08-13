package com.examenSpring.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "modeadministration")
public class ModeAdministration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descriptionmode")
    private String descriptionMode;

    public ModeAdministration() {
    }

    public ModeAdministration(String descriptionMode) {
        this.descriptionMode = descriptionMode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescriptionMode() {
        return descriptionMode;
    }

    public void setDescriptionMode(String descriptionMode) {
        this.descriptionMode = descriptionMode;
    }
}
