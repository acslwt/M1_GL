package web.service;

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(endpointInterface = "web.service.HotelWebService")
public class HotelWebServiceHotelImpl implements HotelWebService{

    private Hotel hotel = new Hotel("Triolet",new Adresse("France","Montpellier","Avenue Augustin Fliche",75,18,14),3);

    public HotelWebServiceHotelImpl(){}

    public HotelWebServiceHotelImpl(Hotel hotel){
        this.hotel = hotel;
    }

    @Override
    public String chambreToString(int i) {
        return hotel.getChambres().get(i).toString();
    }

    @Override
    public ArrayList<Chambre> getChambres(){
        return hotel.getChambres();
    }

    @Override
    public int getEtoiles(){
        return hotel.getEtoiles();
    }

    @Override
    public String getNom(){
        return hotel.getNom();
    }

    @Override
    public Adresse getAdresse(){
        return hotel.getAdresse();
    }

    @Override
    public ArrayList<Chambre> chambreDisponible(Client client, String debutS, String finS, int nombre_lits) {
        return hotel.chambreDisponible(client,debutS,finS,nombre_lits);
    }

    @Override
    public int reserver(int numero,Client client, String  debut, String fin){
        return hotel.reserver(numero,client,debut,fin);
    }
}
