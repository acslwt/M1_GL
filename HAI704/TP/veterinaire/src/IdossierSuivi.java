import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IdossierSuivi extends Remote {
    void addAnimal(Animal animal) throws RemoteException;
}
