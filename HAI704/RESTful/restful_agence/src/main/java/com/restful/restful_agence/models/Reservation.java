package com.restful.restful_agence.models;

import java.time.LocalDate;

public class Reservation {

    private long id;
    private String client;
    private LocalDate debut;
    private LocalDate fin;
    private double prix;
    private Chambre chambre;
    @SuppressWarnings("unused")
    private Hotel hotel;

    public Reservation(Client client, Hotel hotel, String debutS, String finS, Chambre chambre) {
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getClient() {
        return client;
    }
    public void setClient(String client) {
        this.client = client;
    }
    public LocalDate getDebut() {
        return debut;
    }
    public void setDebut(LocalDate debut) {
        this.debut = debut;
    }
    public LocalDate getFin() {
        return fin;
    }
    public void setFin(LocalDate fin) {
        this.fin = fin;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public Chambre getChambre() {
        return chambre;
    }
    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public Reservation(String client, LocalDate debut, LocalDate fin, double prix,Chambre chambre, Hotel hotel) {
        this.client = client;
        this.debut = debut;
        this.fin = fin;
        this.prix = prix;
        this.chambre = chambre;
        this.hotel = hotel;
    }


    public Reservation() {
        this.client = "null";
        this.debut = LocalDate.parse("2000-01-01");
        this.fin = LocalDate.parse("2000-01-01");
        this.amount = 0;
        this.hotel = new Hotel();
        this.chambre = new Chambre();
    }
    @Override
    public String toString() {
        return "Reservation : " + client + "chambre n�" + chambre + "\n"+
                "From " + debut + " to " + fin + "\n";
    }

    public Hotel getChambreReservee() {
    }
}