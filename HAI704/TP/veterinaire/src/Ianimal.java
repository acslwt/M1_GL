import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Ianimal extends Remote{
    String getNom() throws RemoteException;
    String getNom_maitre() throws RemoteException;
    String getEspece() throws RemoteException;
    String getRace() throws RemoteException;

}