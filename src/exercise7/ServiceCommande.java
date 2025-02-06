package exercise7;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ServiceCommande {
    Map<Integer, Commande> commandes;
    public ServiceCommande(){
        this.commandes = new HashMap<>();
    }

    public void ajouterCommande(Commande commande){
        commandes.put(commande.numeroDeCommande, commande);
    }

    public Optional<Commande> commandeCouteux(){
        Optional<Commande> max = commandes.values().stream().max(Comparator.comparingDouble(o -> o.prix));
        max.ifPresentOrElse(System.out::println, () -> System.out.println("Liste vide"));
        return max;

    }
}
