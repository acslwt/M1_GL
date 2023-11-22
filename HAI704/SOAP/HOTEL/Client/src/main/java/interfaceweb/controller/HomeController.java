package interfaceweb.controller;


import interfaceweb.agencemodel.Agence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.Client;
import web.service.HotelWebService;
import web.service.HotelWebServiceHotelImplService;

import java.net.MalformedURLException;
import java.net.URL;

@Controller
public class HomeController {

    private Agence agence;
    private Boolean first_connexion = true;

    @Autowired
    public HomeController(Agence agence) {
        this.agence = agence;
    }

    @RequestMapping("/")
    public String home(Model model) {

        if(first_connexion){
            agence.setNomAgence("Atlas Hotel");
            Client c1 = new Client();

            HotelWebService proxy_ibis = null;
            HotelWebService proxy_carleton = null;

            try {
                URL url_ibis;
                url_ibis = new URL("http://localhost:8090/hotelwebserviceibis?wsdl");
                HotelWebServiceHotelImplService serviceImpl = new HotelWebServiceHotelImplService(url_ibis);
                proxy_ibis = serviceImpl.getHotelWebServiceHotelImplPort();

                URL url_carleton;
                url_carleton = new URL("http://localhost:8090/hotelwebservicecarleton?wsdl");
                serviceImpl = new HotelWebServiceHotelImplService(url_carleton);
                proxy_carleton = serviceImpl.getHotelWebServiceHotelImplPort();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            agence.addListeHotels(proxy_ibis, 1.6);
            agence.addListeHotels(proxy_carleton, 1.1);

            first_connexion = false;
        }
        model.addAttribute("agence", agence);
        return "home";

    }
}