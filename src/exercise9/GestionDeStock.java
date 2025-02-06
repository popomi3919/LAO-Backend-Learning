package src.exercise9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GestionDeStock {
    List<Produit> produitMap;
    public GestionDeStock(){
        this.produitMap = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit){
        produitMap.add(produit);
    }

    public Optional<Produit> moinsPayer(){
        produitMap.sort((o1, o2) -> Float.compare(o1.stock, o2.stock));
        Optional<Produit> moinPayer = produitMap.stream().findFirst();
        moinPayer.ifPresentOrElse(System.out::println, () -> System.out.println("Liste vide"));
        return moinPayer;
    }
}
