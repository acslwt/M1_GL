package web.service;

import javax.xml.ws.Endpoint;
public class HotelWebServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/hotelwebservice",new HotelWebServiceHotelImpl());
        System.err.println("Serveur prêt");
    }
}
