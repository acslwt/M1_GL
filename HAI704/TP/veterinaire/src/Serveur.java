import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Serveur {
    public Serveur(){}
    public static void main(String[] args) {
        try{
            Animal chien = new Animal("Rex","Job","Chien","Malinois");
            Registry registry = LocateRegistry.createRegistry(1099);
            if (registry==null){
                System.err.println("RmiRegistery not found");
            }else{
                registry.rebind("rex",chien);
                System.err.println("Serveur pret.");
            }
        }catch (Exception e){
            System.err.println("Client exception : "+e.toString());
            e.printStackTrace();
        }
    }
}