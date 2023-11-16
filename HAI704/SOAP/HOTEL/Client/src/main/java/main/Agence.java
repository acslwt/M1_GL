package main;

import web.service.Chambre;
import web.service.Hotel;
import web.service.HotelWebService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Agence {

    private final int id_agence;
    private String nom_agence;
    private String mot_de_passe;
    private HashMap<HotelWebService, String> liste_hotels = new HashMap<HotelWebService, String>();

    public Agence(){
        this.id_agence = 0;
        this.nom_agence = "Guest";
        this.mot_de_passe = "admin";
    }

    public Agence(int id_agence, String nom_agence, String mot_de_passe) {
        this.id_agence=id_agence;
        this.mot_de_passe = mot_de_passe;
        this.nom_agence = nom_agence;
    }

    public String getNomAgence() {
        return nom_agence;
    }

    public String getMotDePasse(){
        return this.mot_de_passe;
    }

    public void setNomAgence(String nom_agence) {
        this.nom_agence = nom_agence;
    }

    public HashMap<HotelWebService, String> getListeHotels() {
        return liste_hotels;
    }

    public void setListeHotels(HashMap<HotelWebService, String> liste_hotels) {
        this.liste_hotels = liste_hotels;
    }

    public void addListeHotels(HotelWebService hotel, String url){
        this.liste_hotels.put(hotel,url);
    }

    public static void hotelFinder(Client client) {
        try  {
            Scanner textScanner = new Scanner(System.in);
            Scanner intScanner = new Scanner(System.in);
            System.out.println("Quel Pays?\n");
            String pays = textScanner.nextLine();
            System.out.println("Quelle est votre date d'arrivé ? (yyyy-MM-dd))\n");
            String debutS = textScanner.nextLine();
            System.out.println("Quelle est votre date de retour ? (yyyy-MM-dd))\n");
            String finS = textScanner.nextLine();
            System.out.println("Combien de lis voulez vous ?\n");
            int nombre_lits = intScanner.nextInt();
            System.out.println("Combien d'étoiles ?");
            int etoiles = intScanner.nextInt();
            System.out.println("Nous recherchons les meilleurs offres pour vous...\n");

            HashMap<Hotel, Double> hotels = rechercher(pays,nombre_lits,debutS,finS, etoiles);

            if(hotels.isEmpty()) {
                System.err.println("Désolé, aucun hotel ne correspond à vos attentes.");
                return;
            }

            ArrayList<Hotel> liste_hotels = new ArrayList<>();
            int cpt = 1;
            for (Map.Entry<Hotel, Double> current_proxy : hotels.entrySet()) {
                Hotel hotel = current_proxy.getKey();
                liste_hotels.add(hotel);
                String etoiles_string = String.valueOf(etoiles);
                System.out.println(hotel.getNom() + " " + etoiles_string + "\n" + hotel.getAdresse().toString());
                for(int j = 1; j <= hotel.getChambres().size(); j++) {
                    Chambre chambre = hotel.getChambres().get(j-1);
                    System.out.println("N°" + cpt + "-" + j + " : " + chambre.toString());
                }
                System.out.println();
                cpt++;
            }


            System.out.println("Voulez vous reservez l'une d'entre elles ?\n");
            int choix_hotel = -1;
            int choix_chambre = 0;
            while(choix_hotel == -1) {
                System.out.println("Numéro de l'hotel voulu (choisissez 0 pour quitter) : ");
                choix_hotel = intScanner.nextInt();
                if(choix_hotel == 0) {
                    System.out.println("A bientot...");
                    return;
                }
                else if(choix_hotel > hotels.size() || choix_hotel <= -1) {
                    System.err.println("Impossible de faire ce choix !");
                    choix_hotel = -1;
                }
                else {
                    System.out.println("Numero de chambre : ");
                    choix_chambre = intScanner.nextInt();
                }
            }
            LocalDate debut = LocalDate.parse(debutS) ;
            LocalDate fin = LocalDate.parse(finS);
            try {
                makeReservation(agency, client, ind, outd, hotelList.get(choix_hotel -1).getRooms().get(choix_chambre -1), hotelList.get(choix_hotel -1), hotels.get(hotelList.get(choix_hotel -1)));
            } catch (ReservationException e) {
                e.printStackTrace();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static HashMap<Hotel, Double> rechercher(String location, int size, String in, String out, int priceMin, int priceMax, double rating) {
        HashMap<Hotel, Double> hotels = new HashMap<>();
        HashMap<HotelService, Double> proxy = agency.getOffers();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://dakota.o2switch.net:3306/sc1samo7154_hotelfinderdb","sc1samo7154_hotelviewer","hotelfinderviewer");
            Statement stmt=con.createStatement();
            for (Map.Entry<HotelService, Double> prox : proxy.entrySet()) {
                HotelService hotel = prox.getKey();
                if((hotel.getHotel().getAddress().getCity().equals(location) || hotel.getHotel().getAddress().getCountry().equals(location))
                        && hotel.getHotel().getStars() >= rating) {
                    Hotel results = agency.searchRoom(hotel, in, out, size, priceMin, priceMax);
                    ResultSet rs=stmt.executeQuery("select ID from Hotel where Name='"+results.getName()+"'");
                    int id = 0;
                    if(rs.next()) {
                        id = rs.getInt("ID");
                    }

                    rs=stmt.executeQuery("select * from Reservation where Hotel="+ id);
                    ArrayList<Integer> listID = new ArrayList<>();
                    while(rs.next()) {
                        listID.add(rs.getInt("Room"));
                    }

                    ArrayList<Integer> roomNums = new ArrayList<Integer>();
                    for(int roomID : listID) {
                        ResultSet rs2=stmt.executeQuery("select * from Room where ID="+ roomID);
                        if(rs2.next()) {
                            roomNums.add(rs2.getInt("Number"));
                        }
                        rs2.close();
                    }

                    ArrayList<Room> newRooms = new ArrayList<Room>();
                    for(Room room : results.getRooms()) {
                        boolean check = true;
                        for(int roomNum : roomNums) {
                            if(room.getRoomNumber() == roomNum) {
                                check = false;
                            }
                        }
                        if(check) {
                            newRooms.add(room);
                        }
                    }

                    if(!newRooms.isEmpty()) {
                        for (Room room : newRooms) {
                            room.setPrice(room.getPrice() - (room.getPrice() / 100 ) * agency.getOffers().get(hotel));
                        }
                        results.setRoom(newRooms);
                        hotels.put(results, prox.getValue());
                    }
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return hotels;
    }


}
