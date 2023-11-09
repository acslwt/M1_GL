package web.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;

@WebService
public interface HotelWebService {

    @WebMethod
    ArrayList<Chambre> getChambres();
    @WebMethod
    int getEtoiles();
    @WebMethod
    String getNom();
    @WebMethod
    Adresse getAdresse();
    @WebMethod
    void reserver(Client client, String debut, String fin, int nombre_lits);

}
