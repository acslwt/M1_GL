package com.restful.hotel.data;

import com.restful.hotel.models.Adresse;
import com.restful.hotel.models.Hotel;
import com.restful.hotel.repositories.HotelRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HotelData {
   private Logger logger = LoggerFactory.getLogger(HotelData.class);

   @Bean
    public CommandLineRunner initDataBase(HotelRepository hotelRepository){
        return args->{
            logger.info("Ajout d'une donnée..."+hotelRepository.save(
                 new Hotel("Ibis",new Adresse("France","Montpellier","Avenue Mendes France",7,134,130),3)
            ));
            logger.info("Ajout d'une donnée..."+hotelRepository.save(
                    new Hotel("Krishna",new Adresse("France","Montpellier","Avenue de la Liberté",23,234,180),5)
            ));
        };
    }
}
