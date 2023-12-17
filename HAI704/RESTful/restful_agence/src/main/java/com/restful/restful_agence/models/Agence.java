package com.restful.restful_agence.models;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Agence {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    private String nomAgence;
    @OneToMany(mappedBy="agency", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private List<Reservation> reservations;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNomAgence() {
        return nomAgence;
    }
    public void setNomAgence(String nomAgence) {
        this.nomAgence = nomAgence;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }
    public void setOffers(List<Reservation> reservations) {
        this.reservations = reservations;
    }


    public Agence(String nomAgence, List<Reservation> offers) {
        this.nomAgence = nomAgence;
        this.reservations = offers;
    }
    public Agence() {
        this.nomAgence = "agence de base";
        this.reservations = new ArrayList<Reservation>();
    }

    @Override
    public String toString() {
        return "Agence [nomAgence=" + nomAgence + ", reservations=" + reservations + "]";
    }


}