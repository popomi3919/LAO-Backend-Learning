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

    public void rechercherProduit(String nomProduit){
        String valeur = String.valueOf(produits.get(nomProduit));
        if(valeur != null){
            System.out.println("il y a " + valeur + " produit de " + nomProduit);
        } else {
            System.out.println("la clé n'existe pas");
        }

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
        System.out.println("Stock");
        stock.afficherStock();

        System.out.println("\n");
        System.out.println("\n Stock apres mofification");
        stock.modifierProduit("Chaussure", 10);
        stock.afficherStock();


        System.out.println("\n");
        System.out.println("\n stock apres suprrésiion de table");
        stock.retirerProduit("table");
        stock.afficherStock();

        System.out.println("\n RECHERCHE");
        stock.rechercherProduit("Ananas");
    }
}
