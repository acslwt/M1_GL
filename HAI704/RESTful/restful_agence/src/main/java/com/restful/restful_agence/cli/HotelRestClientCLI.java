package com.restful.restful_agence.cli;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.restful.restful_agence.exceptions.ReservationException;
import com.restful.restful_agence.models.Chambre;
import com.restful.restful_agence.models.Hotel;
import com.restful.restful_agence.models.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.*;

@Component
public class HotelRestClientCLI extends com.restful.hotel.cli.AbstractMain implements CommandLineRunner {

    @Autowired
    private RestTemplate proxy;
    private String URI_HOTEL;
    private String URI_HOTEL_ID;
    private static Map<String, String> URIS;
    @Override
    protected boolean validServiceUrl() {
        return false;
    }

    @Override
    protected void menu() {
        StringBuilder builder = new StringBuilder();
        builder.append(QUIT+"Quitter.");
        builder.append("\n1.Nombre hotels");
        builder.append("\n2.Voir tous les hotels.");
        builder.append("\n3.Lhotel par ID.");
        builder.append("\n4.Ajouter hotel");
        builder.append("\n5.Supprimer hotel");
        builder.append("\n6.Mettre a jour un hotel");

        System.out.println(builder);

    }

    @Override
    public void run(String... args) throws Exception {
        BufferedReader inputReader;
        String userInput = "";
        try {
            inputReader = new BufferedReader(new InputStreamReader(System.in));
            setTestServiceUrl(inputReader);
            URI_HOTEL = "hotels";
            URI_HOTEL_ID = URI_HOTEL + "/{id}";
            URIS = new HashMap<String, String>();
            URIS.put(SERVICE_URL1 + "hotels", SERVICE_URL1 + URI_HOTEL_ID);
            URIS.put(SERVICE_URL2 + "hotels", SERVICE_URL2 + URI_HOTEL_ID);
            URIS.put(SERVICE_URL3 + "hotels", SERVICE_URL3 + URI_HOTEL_ID);
            do {
                menu();
                userInput = inputReader.readLine();
                processUserInput(inputReader, userInput, proxy);

            } while (!userInput.equals(QUIT));
            System.exit(0);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void processUserInput(BufferedReader reader, String userInput, RestTemplate proxy) {
        Map<String, String> params = new HashMap<>();
        try {
            switch(userInput) {
                case "1":
                    int x = 0;
                    for (String uri : URIS.keySet()) {
                        try {
                            String uriCount = uri + "/count";
                            ObjectMapper mapper = new ObjectMapper();
                            String countStr = proxy.getForObject(uriCount, String.class);
                            long count = (int)mapper.readValue(countStr, Map.class).get("count");
                            x += count;
                        }
                        catch (Exception e) {
                            continue;
                        }
                    }
                    System.out.println(String.format("There are %d hotels:", x));
                    for (String uri : URIS.keySet()) {
                        try {
                            Hotel[] hotels = proxy.getForObject(uri, Hotel[].class);
                            Arrays.asList(hotels).forEach(System.out::println);
                        }

                        catch (Exception e) {
                            continue;
                        }
                    }
                    break;

                case "2":
                    System.out.println("Where do you want to go ? (City or country)\n");
                    String position = reader.readLine();
                    System.out.println("\nRating: ");
                    double rating = Double.parseDouble(reader.readLine());
                    System.out.println("\nPrice: ");
                    double price = Double.parseDouble(reader.readLine());
                    System.out.println("\nDate in: ");
                    String inDate = "2022-05-05";
                    System.out.println("\nDate out: ");
                    String outDate = "2022-05-06";
                    System.out.println("\nNumber of persons: ");
                    int size = Integer.parseInt(reader.readLine());
                    params.put("position", position);
                    params.put("datein", inDate);
                    params.put("dateout", outDate);
                    params.put("size", String.valueOf(size));
                    params.put("rating", String.valueOf(rating));
                    params.put("price", String.valueOf(price));

                    List<Hotel> resultHotel = new ArrayList<>();
                    int cpt = 1;
                    ArrayList<String> uriList = new ArrayList<>();
                    System.out.println("Results:\n");
                    for (String uri : URIS.keySet()) {
                        try {
                            String url = uri + "/search?position={position}&size={size}&rating={rating}&datein={datein}&dateout={dateout}&price={price}";
                            Hotel currentHotel = proxy.getForObject(url, Hotel.class, params);
                            if(!currentHotel.getNom().equals("Undefined")) {
                                uriList.add(uri);
                                resultHotel.add(currentHotel);
                                System.out.println("Hotel n°"+ String.valueOf(cpt));
                                cpt++;
                                System.out.println(currentHotel.toString());
                                for (Chambre chambre: currentHotel.getChambres()) {
                                    System.out.println(chambre.toString());
                                }
                                System.out.println();
                            }
                        }
                        catch (Exception e) {
                            continue;
                        }
                    }


                    System.out.println("Would you like to order one of these ?\n");
                    int chambreChoisi = -1;
                    int roomChoice = 0;
                    while(chambreChoisi == -1) {
                        System.out.println("Hotel number (0 to exit): ");
                        chambreChoisi = Integer.parseInt(reader.readLine());
                        if(chambreChoisi == 0) {
                            System.out.println("Quitting hotel research...");
                            break;
                        }
                        else if(chambreChoisi > resultHotel.size() || chambreChoisi <= -1) {
                            System.err.println("Impossible choice !");
                            chambreChoisi = -1;
                        }
                        else {
                            System.out.println("Room number : ");
                            roomChoice = Integer.parseInt(reader.readLine());
                        }
                    }
                    LocalDate ind = LocalDate.parse(inDate);
                    LocalDate outd = LocalDate.parse(outDate);
                    if(chambreChoisi != 0 && roomChoice != 0) {
                        Hotel selectedHotel = resultHotel.get(chambreChoisi-1);
                        Chambre chambreSelectionner = selectedHotel.getChambre(roomChoice-1);
                        Reservation currentReservation = selectedHotel.reserver(reader, ind, outd, chambreSelectionner);
                        selectedHotel.addReservation(currentReservation);
                        params.put("id", String.valueOf(selectedHotel.getId()));
                        String uriID = URIS.get(uriList.get(chambreChoisi-1));
                        proxy.put(uriID, selectedHotel, params);
                        System.out.println("Votre commande a été réaliser avec succès. Au revoir !\n");


                    }

                    break;

                case QUIT:
                    System.out.println("Bye bye...");
                    return;
                default:
                    System.err.println("Wrong input. Try again: ");
                    return;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
