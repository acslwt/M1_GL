package web.service;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Client {
	
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

	@XmlElement
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@XmlElement
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@XmlElement
	public CarteCredit getCarteCredit() {
		return carteCredit;
	}

	public void setCarteCredit(CarteCredit carteCredit) {
		this.carteCredit = carteCredit;
	}
	
}