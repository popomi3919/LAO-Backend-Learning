import java.util.HashMap;
import java.util.Map;

class Stock{
    Map<String, Integer> produits;
    public Stock(){
        produits = new HashMap<>();
    }
    public void ajouterProduit(String nomProduit, int quantité){
        produits.put(nomProduit, produits.getOrDefault(nomProduit, 0) + quantité);
    }

    public void modifierProduit(String nomProduit, int nouvelleQuantité){
        if (produits.containsKey(nomProduit)){
            produits.put(nomProduit, nouvelleQuantité);
        } else {
            System.out.println("Produit inexistant");
        }
    }

    public void retirerProduit(String nomProduit){
        if(produits.containsKey(nomProduit)){
            produits.remove(nomProduit);
        }
        else {
            System.out.println("Produit inexistant");
        }
    }

    public int rechercherProduit(String nomProduit){
        return produits.getOrDefault(nomProduit,0);
    }

    public void afficherStock() {
        for (Map.Entry<String, Integer> entry : produits.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

public class Exercise_5 {
    public static void main(String[] args){
        Stock stock = new Stock();
        stock.ajouterProduit("Orange", 50);
        stock.ajouterProduit("Ananas", 100);
        stock.ajouterProduit("PC", 20);
        stock.ajouterProduit("table", 10);
        stock.ajouterProduit("Chaussure", 0);
        stock.afficherStock();

        System.out.println("\n");
        stock.modifierProduit("Chaussure", 10);
        stock.afficherStock();

        System.out.println("\n");
        stock.retirerProduit("table");
        stock.afficherStock();

        stock.rechercherProduit("Ananas");
    }
}
