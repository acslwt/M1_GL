package hotel;

import java.util.ArrayList;

public class Hotel {
	
	private String nom;
    private Adresse adresse;
    private int etoiles;
    private ArrayList<Chambre> chambres = new ArrayList<>();

    public Hotel(String nom, Adresse adresse, int etoiles) {
        this.nom = nom;
        this.adresse = adresse;
        this.etoiles = etoiles;
    }

    public ArrayList<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(ArrayList<Chambre> chambres) {
        this.chambres = chambres;
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
}
