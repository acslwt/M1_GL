package hotel;

import java.util.Date;

public class CarteCredit {
	
	private String nom;
	private String prenom;
	private int numero;
	private Date dateExp;
	private int cvc;
	
	public CarteCredit(String n, String p, int num, Date d, int cvc) {
		this.nom = n;
		this.prenom = p;
		this.numero = num;
		this.dateExp = d;
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
	public Date getDateExp() {
		return dateExp;
	}
	public void setDateExp(Date dateExp) {
		this.dateExp = dateExp;
	}
	public int getCvc() {
		return cvc;
	}
	public void setCvc(int cvc) {
		this.cvc = cvc;
	}
	
}
