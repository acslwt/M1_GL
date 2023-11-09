package main;

import webservice.HotelWebService;
import webservice.HotelWebServiceHotelImplService;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080/hotelwebservice?wsdl");
            HotelWebServiceHotelImplService serviceImpl = new HotelWebServiceHotelImplService(url);
            HotelWebService proxy = serviceImpl.getHotelWebServiceHotelImplPort();

            System.out.println(proxy.getNom());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

}