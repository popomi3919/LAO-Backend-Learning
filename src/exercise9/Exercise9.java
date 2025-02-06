package exercise9;

public class Exercise9 {
    public static void main(String[] args){
        GestionDeStock gestionDeStock = new GestionDeStock();

        gestionDeStock.ajouterProduit(new Produit("moniteur", 20000, 20));
        gestionDeStock.ajouterProduit(new Produit("chaise", 5000, 1));
        gestionDeStock.ajouterProduit(new Produit("bafle", 6000, 10));

        System.out.println("Produit moins chere: ");
        gestionDeStock.moinsPayer();
    }
}
