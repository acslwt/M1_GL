import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Animal extends UnicastRemoteObject implements Ianimal {
    private String nom;
    private String nom_maitre;
    private String espece;
    private String race;

    public Animal(String nom, String nom_maitre, String espece, String race) throws RemoteException {
        this.nom = nom;
        this.nom_maitre = nom_maitre;
        this.espece = espece;
        this.race = race;
    }

    @Override
    public String getNom() throws RemoteException{
        return this.nom;
    }

    @Override
    public String getNom_maitre() throws RemoteException{
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
