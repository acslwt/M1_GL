import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Ianimal extends Remote{
    String getNom() throws RemoteException;
    String getNomMaitre() throws RemoteException;
    String getEspece() throws RemoteException;
    String getRace() throws RemoteException;
    DossierSuivi getDossierSuivi() throws RemoteException;

}