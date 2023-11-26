package com.restful.hotel.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Hotel {

    private String nom;
    private Adresse adresse;
    private int etoiles;
    private ArrayList<Chambre> chambres = new ArrayList<>();

    public Hotel(){
        this.nom = "Hotel";
        this.adresse = new Adresse();
        this.etoiles = 0;
    }
    public Hotel(String nom, Adresse adresse, int etoiles) {
        this.nom = nom;
        this.adresse = adresse;
        this.etoiles = etoiles;
    }

    public void addReservation(Reservation reservation){
        reservation.getChambreReservee().addReservation(reservation);
    }
    public ArrayList<Chambre> getChambres() {
        return chambres;
    }

    public Chambre getChambre(int i){
        return this.chambres.get(i);
    }

    public void setChambres(ArrayList<Chambre> chambres) {
        this.chambres = chambres;
    }

    public void addChambre(Chambre chambre){
        for(Chambre current_chambre : chambres){
            if(current_chambre.getNumero()==chambre.getNumero()){
                System.out.println("Le numéro de chambre existe déjà");
                return;
            }
        }
        this.chambres.add(chambre);
        System.out.println("Chambre ajouter avec succes.");
    }

    ArrayList<Reservation> getReservation(Chambre chambre){
        return chambre.getDisponibilite();
    }

    public int getEtoiles() {
        return etoiles;
    }

    public void setEtoiles(int etoiles) {
        this.etoiles = etoiles;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public ArrayList<Chambre> chambreDisponible(int nombre_lits, String debutS, String finS){
        LocalDate debut = LocalDate.parse(debutS);
        LocalDate fin = LocalDate.parse(finS);
        ArrayList<Chambre> liste_chambre= new ArrayList<Chambre>();
        for(Chambre current_chambre : chambres){
            if(current_chambre.estDisponible(debutS, finS) && current_chambre.getLits()==nombre_lits){
                liste_chambre.add(current_chambre);
            }
        }
        return liste_chambre;
    }

    public int reserver(int numero_Chambre, Client client, String debutS, String finS){
        Chambre chambre = this.getChambre(numero_Chambre);
        if(chambre.estDisponible(debutS,finS)) {
            Reservation reservation_client = new Reservation(client, this, debutS, finS, chambre);
            chambre.addReservation(reservation_client);
            System.out.println("Chambre réserver avec succès.");
            return 1;
        }else{
            System.out.println("Chambre non disponible à cette date.");
            return 0;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hotel hotel)) return false;
        return getEtoiles() == hotel.getEtoiles() && Objects.equals(getNom(), hotel.getNom()) && Objects.equals(getAdresse(), hotel.getAdresse()) && Objects.equals(getChambres(), hotel.getChambres());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNom(), getAdresse(), getEtoiles(), getChambres());
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nom='" + nom + '\'' +
                ", adresse=" + adresse +
                ", etoiles=" + etoiles +
                ", chambres=" + chambres +
                '}';
    }
}
