package exercise9;

public class Produit {
    String nom;
    int prix;
    int stock;

    public Produit(String nom, int prix, int stock){
        this.nom = nom;
        this.prix = prix;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return
                "nom='" + nom + '\'' +
                        ", prix=" + prix +
                        ", stock=" + stock ;
    }
}
