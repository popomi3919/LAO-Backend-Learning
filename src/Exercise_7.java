import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class Commande{
    int numeroDeCommande;
    String articlesCommandé;
    String client;
    int prix;
    public Commande(int numeroDeCommande, String articlesCommandé, String client, int prix){
        this.articlesCommandé = articlesCommandé;
        this.numeroDeCommande = numeroDeCommande;
        this.client = client;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "numeroDeCommande=" + numeroDeCommande +
                ", articlesCommandé='" + articlesCommandé + '\'' +
                ", client='" + client + '\'' ;
    }
}

class ServiceCommande{
    Map<Integer, Commande>  commandes;
    public ServiceCommande(){
        this.commandes = new HashMap<>();
    }

    public void ajouterCommande(Commande commande){
        commandes.put(commande.numeroDeCommande, commande);
    }

    public Optional<Commande> commandeCouteux(){
        Optional<Commande> max = commandes.values().stream().max(Comparator.comparingDouble(o -> o.prix));
        return max;

    }
}

public class Exercise_7 {
    public static void main(String[] args){
        ServiceCommande serviceCommande = new ServiceCommande();
        serviceCommande.ajouterCommande(new Commande(202, "ridos", "Mr. Paul", 2000));
        serviceCommande.ajouterCommande(new Commande(360, "chaise", "Mr. John", 5000));
        serviceCommande.ajouterCommande(new Commande(101, "table", "Mme. Jeane",90000));
        serviceCommande.ajouterCommande(new Commande(582, "mirrior", "Mr. Pierre", 800));

        System.out.println("Commande la pllus couteux: ");
        serviceCommande.commandeCouteux().ifPresent(System.out::println);
    }
}
