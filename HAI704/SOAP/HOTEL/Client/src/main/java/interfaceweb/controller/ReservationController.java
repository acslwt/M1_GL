package interfaceweb.controller;

import interfaceweb.agencemodel.Agence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.Hotel;
import web.service.Reservation;

@Controller
public class ReservationController {

    private Agence agence;
    private Hotel hotel;

    @Autowired
    public ReservationController(Agence agence){
        this.agence = agence;
    }

    @RequestMapping("/reservation")
    public String reservation(Model model){
        String debut = (String) model.getAttribute("debut");

        model.addAttribute("debut",debut);
        return "reservation";
    }
}
