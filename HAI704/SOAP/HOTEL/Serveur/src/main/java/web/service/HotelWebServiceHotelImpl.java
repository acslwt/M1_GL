package web.service;

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(endpointInterface = "web.service.HotelWebService")
public class HotelWebServiceHotelImpl implements HotelWebService{

    private Hotel hotel = new Hotel("Triolet",new Adresse("France","Montpellier","Avenue Augustin Fliche",75,18,14),3);

    public HotelWebServiceHotelImpl(){}

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
    public void reserver(Client client, String  debut, String fin, int nombre_lits){
        hotel.reserver(client,debut,fin,nombre_lits);
    }
}
