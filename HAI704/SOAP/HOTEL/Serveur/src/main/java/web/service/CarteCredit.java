package web.service;

import java.time.LocalDate;

public class CarteCredit {
	
	private String nom;
	private String prenom;
	private int numero;
	private String dateExp;
	private int cvc;

	public CarteCredit(){
		this.nom = "nom";
		this.prenom = "prenom";
		this.numero = 6666;
		this.dateExp = "1999-01-01";
		this.cvc = 666;
	}
	public CarteCredit(String nom, String prenom, int numero, String date, int cvc) {
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
		this.dateExp = date;
		this.cvc = cvc;
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
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDateExp() {
		return dateExp;
	}
	public void setDateExp(String dateExp) {
		this.dateExp = dateExp;
	}
	public int getCvc() {
		return cvc;
	}
	public void setCvc(int cvc) {
		this.cvc = cvc;
	}
	
}
