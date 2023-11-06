package hotel;

import java.time.LocalDate;
import java.util.Date;

public class Reservation {
	
	private Client client;
    private Hotel hotel;
    private LocalDate dateArrivee;
    private LocalDate dateDepart;
    private Chambre chambreReservee;

    public Reservation(Client client, Hotel hotel, LocalDate dateArrivee, LocalDate dateDepart, Chambre chambreReservee) {
        this.client = client;
        this.hotel = hotel;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
        this.chambreReservee = chambreReservee;
    }

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public LocalDate getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(LocalDate dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public LocalDate getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(LocalDate dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Chambre getChambreReservee() {
		return chambreReservee;
	}

	public void setChambreReservee(Chambre chambreReservee) {
		this.chambreReservee = chambreReservee;
	}
	
}
