package web.service;

import javax.xml.ws.Endpoint;
public class HotelWebServicePublisher {
    public static void main(String[] args) {

        Hotel ibis = new Hotel("Hotel Ibis",new Adresse("France","Montpellier","Avenue bataillon",5,123,345),3);
        ibis.addChambre(new Chambre(2,1,123));
        ibis.addChambre(new Chambre(1, 1, 789));
        ibis.addChambre(new Chambre(4, 2, 234));
        ibis.addChambre(new Chambre(2, 1, 567));

        Hotel carleton = new Hotel("Le carleton",new Adresse("France","Agde","Boulevard bataillon",5,123,345),3);
        ibis.addChambre(new Chambre(2,1,123));
        ibis.addChambre(new Chambre(1, 1, 789));
        ibis.addChambre(new Chambre(4, 2, 234));
        ibis.addChambre(new Chambre(2, 1, 567));

        Endpoint.publish("http://localhost:8080/hotelwebserviceibis",new HotelWebServiceHotelImpl(ibis));
        Endpoint.publish("http://localhost:8080/hotelwebservicecarleton",new HotelWebServiceHotelImpl(carleton));

        System.err.println("Serveur prêt");
    }
}
