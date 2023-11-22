package interfaceweb.controller;

import interfaceweb.agencemodel.Agence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.Hotel;
import web.service.HotelWebService;

@Controller
public class HotelController {

    private Agence agence;

    @Autowired
    public HotelController(Agence agence){
        this.agence = agence;
    }
    @GetMapping("/hotel")
    public String showHotelDetails(@RequestParam("nom") String nom, Model model) {
        model.addAttribute("agence",agence);
        model.addAttribute("nom",nom);
        return "hotel";
    }
}