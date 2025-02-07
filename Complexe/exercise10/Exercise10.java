package Complexe.exercise10;

public class Exercise10 {
    public static void main(String[] args){
        GestionDeMagasin gestionDeMagasin = new GestionDeMagasin();
        gestionDeMagasin.ajouterProduit(new Produit("ordinateur",
                "pc gaming", 12500, 100));
        gestionDeMagasin.ajouterProduit(new Produit("chaise",
                null, 50000, 20));
        gestionDeMagasin.ajouterProduit(new Produit("Stylo",
                "Stylo de qualité pour ecrire", 100, 50));
        gestionDeMagasin.ajouterProduit(new Produit("Ventilateur",
                null, 18000, 10));

        gestionDeMagasin.afficherProduit();

        gestionDeMagasin.retireProduit("chaise");
        gestionDeMagasin.rechercherProduit("Ventilateur");
    }
}
