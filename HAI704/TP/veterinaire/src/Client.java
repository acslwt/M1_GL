import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    private Client() {}

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(1099);
            Ianimal stub = (Ianimal) registry.lookup("chien1");
            DossierSuivi dossier_rex = stub.getDossierSuivi();
            System.out.println("reponse : " + dossier_rex.toString());
        } catch(Exception e){
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}