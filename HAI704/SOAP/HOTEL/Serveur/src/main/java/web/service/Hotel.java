package web.service;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.util.ArrayList;

@XmlRootElement
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

    @XmlElement
    public ArrayList<Chambre> getChambres() {
        return chambres;
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

    @XmlElement
    public int getEtoiles() {
        return etoiles;
    }

    public void setEtoiles(int etoiles) {
        this.etoiles = etoiles;
    }

    @XmlElement
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @XmlElement
    public Adresse getAdresse() {
        return adresse;
    }

    public void reserver(Client client, String debutS, String finS,int nombre_lits){
        LocalDate debut = LocalDate.parse(debutS);
        LocalDate fin = LocalDate.parse(finS);
        for(Chambre current_chambre : chambres){
            if(current_chambre.estDisponible(debutS, finS) && current_chambre.getLits()==nombre_lits){
                Reservation reservation_client = new Reservation(client, this, debutS, finS, current_chambre);
                current_chambre.addReservation(reservation_client);
                System.out.println("Chambre réserver avec succès");
                return;
            }
        }
        System.out.println("Aucune chambre disponible à cette date");
    }
}
