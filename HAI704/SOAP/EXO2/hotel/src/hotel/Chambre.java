package hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Chambre {
	
	private int numero;
    private int lits;
    private ArrayList<Reservation> date_occupation;
    private double prix;

    public Chambre(int numero, int lits, ArrayList<Reservation> date_occupation, double prixNuit) {
        this.numero = numero;
        this.lits = lits;
        this.date_occupation = date_occupation;
        this.prix = prixNuit;
    }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getLits() {
		return lits;
	}

	public void setLits(int lits) {
		this.lits = lits;
	}

	public boolean estDisponible(LocalDate debut, LocalDate fin) {
		for(Reservation reservation : date_occupation){
			LocalDate date_arrive = reservation.getDateArrivee();
			LocalDate date_depart = reservation.getDateDepart();

			if((date_arrive.isBefore(fin) && date_arrive.isAfter(debut)) || date_depart.isBefore(fin) && date_depart.isAfter(debut) || (date_arrive.isBefore(debut) && date_depart.isAfter(fin))){
				return false;
			}
		}
		return true;
	}

	public ArrayList<Reservation> getDisponibilite(){
		return date_occupation;
	}

	public void setDateOccupation(ArrayList<LocalDate> disponibilite) {
		this.date_occupation = date_occupation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	//C pas comme ça
	public void addReservation(Reservation reservation) {
		if(this.estDisponible(reservation.getDateDepart(),reservation.))
		this.date_occupation.add(reservation);
	}
	
}
