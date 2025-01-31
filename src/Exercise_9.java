import java.util.*;

class Produit{
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


class GestionDeStock{
    List<Produit> produitMap;
    public GestionDeStock(){
        this.produitMap = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit){
        produitMap.add(produit);
    }

    public Optional<Produit> moinsPayer(){
        produitMap.sort((o1, o2) -> Float.compare(o1.stock, o2.stock));
        return produitMap.stream().findFirst();
    }
}


public class Exercise_9 {
    public static void main(String[] args){
        GestionDeStock gestionDeStock = new GestionDeStock();

        gestionDeStock.ajouterProduit(new Produit("moniteur", 20000, 20));
        gestionDeStock.ajouterProduit(new Produit("chaise", 5000, 1));
        gestionDeStock.ajouterProduit(new Produit("bafle", 6000, 10));

        System.out.println("Produit moins chere: ");
        gestionDeStock.moinsPayer().ifPresent(System.out::println);
    }
}
