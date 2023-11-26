package com.restful.hotel.controller;

import com.restful.hotel.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;

}
