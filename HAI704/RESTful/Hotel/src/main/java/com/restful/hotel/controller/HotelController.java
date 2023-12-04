package com.restful.hotel.controller;

import com.restful.hotel.exceptions.HotelInexistantException;
import com.restful.hotel.models.Hotel;
import com.restful.hotel.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;
    private static final String uri = "http://localhost:8080/hotelwebservice/api";

    @GetMapping(uri+"/hotels")
    public List<Hotel> getAllHotels(){
        return hotelRepository.findAll();
    }

    @GetMapping(uri+"/hotels/count")
    public String count(){
        return String.format("{\" %s\": %d}","count",hotelRepository.count());
    }

    @GetMapping(uri+"/hotels/{id}")
    public Hotel getHotelById(@PathVariable long id) throws HotelInexistantException {
        return hotelRepository.findById(id).orElseThrow(
                () -> new HotelInexistantException("Aucun hotel avec l'id "+id+" n'a été trouvé")
        );

    }

    @PostMapping(uri+"/hotels")
    public Hotel createHotel(@RequestBody Hotel hotel){
        return hotelRepository.save(hotel);
    }

    @PutMapping(uri+"/hotels/{id}")
    public Hotel modifierHotel(Hotel nouvelle_hotel, long id){
        return hotelRepository.findById(id)
                .map(hotel->{
                    hotel.setNom(nouvelle_hotel.getNom());
                    hotel.setEtoiles(nouvelle_hotel.getEtoiles());
                    hotel.setChambres(nouvelle_hotel.getChambres());
                    hotel.setAdresse(nouvelle_hotel.getAdresse());
                    return nouvelle_hotel;
                })
                .orElseGet(()->{
                    nouvelle_hotel.setId(id);
                    hotelRepository.save(nouvelle_hotel);
                    return nouvelle_hotel;
                });
    }

    @DeleteMapping(uri+"hotels/{id}")
    public void supprimerHotel(@PathVariable long id) throws HotelInexistantException{
        Hotel hotel = hotelRepository.findById(id)
                .orElseThrow(()-> new HotelInexistantException((
                            "Erreur : l'hotel d'id"+id+" n'a pas été trouvé"
                        )));
        hotelRepository.delete(hotel);
    }
}