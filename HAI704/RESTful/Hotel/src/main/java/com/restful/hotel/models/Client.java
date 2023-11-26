package com.restful.hotel.models;

import jakarta.persistence.GeneratedValue;

import java.util.Objects;

public class Client {

	@GeneratedValue
	private int id;
	private String nom;
    private String prenom;
    private CarteCredit carteCredit;

	public Client(){
		this.nom = "nom";
		this.prenom = "prenom";
		this.carteCredit = new CarteCredit();
	}
    public Client(String nom, String prenom, CarteCredit carteCredit) {
        this.nom = nom;
        this.prenom = prenom;
        this.carteCredit = carteCredit;
    }

	public int getId(){
		return id;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public CarteCredit getCarteCredit() {
		return carteCredit;
	}

	public void setCarteCredit(CarteCredit carteCredit) {
		this.carteCredit = carteCredit;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Client client)) return false;
		return Objects.equals(getNom(), client.getNom()) && Objects.equals(getPrenom(), client.getPrenom());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getNom(), getPrenom());
	}

	@Override
	public String toString() {
		return "Client{" +
				"id client='" + id + '\'' +
				"nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				", carteCredit=" + carteCredit +
				'}';
	}
}