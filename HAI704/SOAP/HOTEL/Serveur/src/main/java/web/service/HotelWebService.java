package web.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;

@WebService
public interface HotelWebService {

    @WebMethod
    String chambreToString(int i);
    @WebMethod
    ArrayList<Chambre> getChambres();
    @WebMethod
    int getEtoiles();
    @WebMethod
    String getNom();
    @WebMethod
    Adresse getAdresse();
    @WebMethod
    ArrayList<Chambre> chambreDisponible(Client client, String debutS, String finS,int nombre_lits);
    @WebMethod
    int reserver(int numero,Client client, String debut, String fin);

}
