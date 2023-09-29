import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DossierSuivi extends UnicastRemoteObject implements IdossierSuivi{
    private String etat;
    public DossierSuivi() throws RemoteException{}
    public DossierSuivi(String etat) throws RemoteException{
        this.etat = etat;
    }
    @Override
    public String toString(){
        try{
            return "ETAT : "+this.etat;
        }catch (Exception e) {
            return e.toString();
        }
    }
    @Override
    public void addAnimal(Animal animal) throws RemoteException {

    }
}
