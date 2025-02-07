package Complexe.exercise10;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GestionDeMagasin {
    Map<String, Produit> produits;
    public GestionDeMagasin(){
        this.produits = new HashMap<>();
    }

    public void ajouterProduit(Produit produit){
        produits.put(produit.name, produit);
    }

    public void retireProduit(String nom){
        if (produits.containsKey(nom)){
            produits.remove(nom);
            System.out.println("Produit suprimer");
        }else {
            System.out.println("Produit inexistant");
        }
    }

    public void rechercherProduit(String nom){
        boolean trouver = false;
        for (Map.Entry<String, Produit> entry : produits.entrySet()){
            if (Objects.equals(entry.getKey(), nom)){
                trouver = true;
                System.out.println(
                        "Le produit est: \n" +
                                "\nnom: " + entry.getValue().name +
                                "\nDescription: " + entry.getValue().description.orElse("Pas de description") +
                                "\nprice: " + entry.getValue().price +
                                "\nQuantité: " + entry.getValue().quantiter
                );
                break;
            }
        }
        if (!trouver){
            System.out.println("Ce produit n'existe pas en stock");
        }
    }

    public void afficherProduit(){
        System.out.println("Les produit sont les suivant: \n");
        for (Map.Entry<String, Produit> entry : produits.entrySet()){
            System.out.println(
                    "\nnom: " + entry.getValue().name +
                            "\nDescription: " + entry.getValue().description.orElse("Pas de description") +
                            "\nprice: " + entry.getValue().price +
                            "\nQuantité: " + entry.getValue().quantiter + "\n"
            );
        }
    }
}
