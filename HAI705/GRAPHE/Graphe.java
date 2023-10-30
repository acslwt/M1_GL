import java.util.ArrayList;
import java.util.List;

public class Graphe {
    private List<Sommet> sommets;
    private List<Arete> aretes;

    public Graphe() {
        sommets = new ArrayList<>();
        aretes = new ArrayList<>();
    }

    public void ajouterSommet(Sommet sommet) {
        sommets.add(sommet);
    }

    public void ajouterArete(Arete arete) {
        aretes.add(arete);
    }

    public List<Sommet> getSommets() {
        return sommets;
    }

    public List<Arete> getAretes() {
        return aretes;
    }
}