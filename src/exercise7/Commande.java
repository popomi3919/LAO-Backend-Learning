package exercise7;

public class Commande {
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
