package interfaceweb.agencemodel;

import web.service.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import web.service.Client;

public class Main {

    public static void main(String[] args) {

        Agence agence1 = new Agence(1,"TripAdvisor","admin");

        CarteCredit cb = new CarteCredit();

        Client c1 = new Client();

        HotelWebService proxy_ibis = null;
        HotelWebService proxy_carleton = null;

        try {
            URL url_ibis;
            url_ibis = new URL("http://localhost:8080/hotelwebserviceibis?wsdl");
            HotelWebServiceHotelImplService serviceImpl = new HotelWebServiceHotelImplService(url_ibis);
            proxy_ibis = serviceImpl.getHotelWebServiceHotelImplPort();

            URL url_carleton;
            url_carleton = new URL("http://localhost:8080/hotelwebservicecarleton?wsdl");
            serviceImpl = new HotelWebServiceHotelImplService(url_carleton);
            proxy_carleton = serviceImpl.getHotelWebServiceHotelImplPort();
        }catch (MalformedURLException e){
            e.printStackTrace();
        }



        HashMap<HotelWebService, String> liste_hotels = new HashMap<HotelWebService, String>();

        agence1.addListeHotels(proxy_ibis, 1.98);
        agence1.addListeHotels(proxy_carleton, 1.1);

        agence1.hotelFinder(c1);

       /* System.out.println("Choix :\n" +
                "1. Ibis.com\n" +
                "2. Carleton.com");

        Scanner intScanner = new Scanner(System.in);
        int choix_hotel = intScanner.nextInt();

        HotelWebService current_proxy = null;

        switch (choix_hotel){
            case 1:
                current_proxy = proxy_ibis;
                break;
            case 2:
                current_proxy = proxy_carleton;
                break;
            default:
                System.out.println("Aucun hotel ne correspond");
        }

        Client c1 = new Client();

        System.out.println("L'hotel choisi est : "+current_proxy.getNom());

        for(int i=0;i<current_proxy.getChambres().size();i++){
            System.out.println(current_proxy.chambreToString(i));
        }

        ArrayList<Chambre> liste_chambres = (ArrayList<Chambre>) current_proxy.chambreDisponible(1,"2023-06-01","2023-07-07");
        for(Chambre c : liste_chambres){
            System.out.println("Num�ro de chambre : "+c.getNumero());
        }

        if(current_proxy.reserver(2,c1,"2023-06-01","2023-07-07")==1){
            System.out.println("Reservation confirm�");
        }else{
            System.out.println("Non r�serv�");
        }*/

    }

}