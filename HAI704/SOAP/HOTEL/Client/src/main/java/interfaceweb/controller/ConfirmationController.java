package interfaceweb.controller;

import interfaceweb.agencemodel.Agence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarteCredit;
import web.service.Client;
import web.service.Hotel;

@Controller
public class ConfirmationController {

    private Agence agence;
    private Hotel hotel;
    @Autowired
    public ConfirmationController(Agence agence){
        this.agence = agence;
    }

    @RequestMapping("/confirmation")
    public String confirmation(@RequestParam("numeroChambre") int numeroChambre,@RequestParam("nom") String nom,@RequestParam("prenom") String prenom,@RequestParam("debut") String debut,@RequestParam("fin") String fin,@RequestParam("numero") String numero,@RequestParam("date_exp") String date_exp,@RequestParam("cvc") int cvc ,Model model){

        CarteCredit carte_credit = new CarteCredit();
        carte_credit.setNom(nom);
        carte_credit.setPrenom(prenom);
        carte_credit.setNumero(numero);
        carte_credit.setDateExp(date_exp);
        carte_credit.setCvc(cvc);

        Client client = new Client();
        client.setNom(nom);
        client.setPrenom(prenom);
        client.setCarteCredit(carte_credit);

        agence.reserverChambre(client,debut,fin,hotel.getChambres().);
        return "confirmation";
    }

}
