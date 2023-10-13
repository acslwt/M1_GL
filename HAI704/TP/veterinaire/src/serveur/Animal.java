package serveur;

import common.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Animal extends UnicastRemoteObject implements Ianimal {
    private String nom;
    private String nom_maitre;
    private String espece;
    private String race;
    private DossierSuivi dossier_suivi;

    public Animal(String nom, String nom_maitre, String espece, String race,DossierSuivi dossier_suivi) throws RemoteException {
        this.nom = nom;
        this.nom_maitre = nom_maitre;
        this.espece = espece;
        this.race = race;
        this.dossier_suivi = dossier_suivi;
    }

    @Override
    public IdossierSuivi getDossierSuivi(){
        return this.dossier_suivi;
    }
    @Override
    public String getNom() throws RemoteException{
        return this.nom;
    }

    @Override
    public String getNomMaitre() throws RemoteException{
        return this.nom_maitre;
    }

    @Override
    public String getEspece() throws RemoteException{
        return this.espece;
    }

    @Override
    public String getRace() throws RemoteException{
        return this.race;
    }

}
