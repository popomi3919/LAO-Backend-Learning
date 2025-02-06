package src.exercise7;

public class Exercise7 {
    public static void main(String[] args){
        ServiceCommande serviceCommande = new ServiceCommande();
        serviceCommande.ajouterCommande(new Commande(202, "ridos", "Mr. Paul", 2000));
        serviceCommande.ajouterCommande(new Commande(360, "chaise", "Mr. John", 5000));
        serviceCommande.ajouterCommande(new Commande(101, "table", "Mme. Jeane",90000));
        serviceCommande.ajouterCommande(new Commande(582, "mirrior", "Mr. Pierre", 800));

        System.out.println("Commande la plus couteux: ");
        serviceCommande.commandeCouteux();
    }
}
