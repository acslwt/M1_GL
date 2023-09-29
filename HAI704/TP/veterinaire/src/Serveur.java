import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Serveur {
    public Serveur(){}
    public static void main(String[] args) {
        try{
            DossierSuivi dossier_rex = new DossierSuivi();
            Animal chien = new Animal("Rex","Job","Chien","Malinois",dossier_rex);
            dossier_rex.addAnimal(chien);
            System.out.println();
            Registry registry = LocateRegistry.createRegistry(1099);
            if (registry==null){
                System.err.println("RmiRegistery not found");
            }else{
                registry.rebind("chien1",chien);
                System.err.println("Serveur pret.");
            }
        }catch (Exception e){
            System.err.println("Serveur exception : "+e.toString());
            e.printStackTrace();
        }
    }
}