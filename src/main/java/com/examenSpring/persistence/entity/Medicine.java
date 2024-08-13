package com.examenSpring.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "medicine")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "proceendings", length = 10)
    private String proceEndings;

    @Column(name = "namemedicine", length = 100)
    private String nameMedicine;

    @Column(name = "healthregister", length = 50)
    private String healthRegister;

    private String description;

    @Column(name = "namerol", length = 100)
    private String nameRol;

    @ManyToOne
    @JoinColumn(name = "codeap")
    private ActivePrincipie activePrincipie;

    @ManyToOne
    @JoinColumn(name = "codelab")
    private Labatory labatory;

    @ManyToOne
    @JoinColumn(name = "codeum")
    private Unitmeasurement unitmeasurement;

    @ManyToOne
    @JoinColumn(name = "codemodeadmin")
    private ModeAdministration modeAdministration;

    public Medicine() {
    }

    public Medicine(String proceEndings, String nameMedicine, String healthRegister, String description, String nameRol) {
        this.proceEndings = proceEndings;
        this.nameMedicine = nameMedicine;
        this.healthRegister = healthRegister;
        this.description = description;
        this.nameRol = nameRol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProceEndings() {
        return proceEndings;
    }

    public void setProceEndings(String proceEndings) {
        this.proceEndings = proceEndings;
    }

    public String getNameMedicine() {
        return nameMedicine;
    }

    public void setNameMedicine(String nameMedicine) {
        this.nameMedicine = nameMedicine;
    }

    public String getHealthRegister() {
        return healthRegister;
    }

    public void setHealthRegister(String healthRegister) {
        this.healthRegister = healthRegister;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNameRol() {
        return nameRol;
    }

    public void setNameRol(String nameRol) {
        this.nameRol = nameRol;
    }

    public ActivePrincipie getActivePrincipie() {
        return activePrincipie;
    }

    public void setActivePrincipie(ActivePrincipie activePrincipie) {
        this.activePrincipie = activePrincipie;
    }

    public Labatory getLabatory() {
        return labatory;
    }

    public void setLabatory(Labatory labatory) {
        this.labatory = labatory;
    }

    public Unitmeasurement getUnitmeasurement() {
        return unitmeasurement;
    }

    public void setUnitmeasurement(Unitmeasurement unitmeasurement) {
        this.unitmeasurement = unitmeasurement;
    }

    public ModeAdministration getModeAdministration() {
        return modeAdministration;
    }

    public void setModeAdministration(ModeAdministration modeAdministration) {
        this.modeAdministration = modeAdministration;
    }
}
