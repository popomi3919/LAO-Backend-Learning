package Complexe.exercise5;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    List<Investisement> investisements;
    public Portfolio(){
        this.investisements = new ArrayList<>();
    }

    public  void ajouterInvestissement(Investisement investisement){
        investisements.add(investisement);
    }
    public void afficherPortefeuille(){
        System.out.println("Portefeuille d'investissement: ");
        for (Investisement investisement : investisements){
            System.out.println(investisement);
        }
    }
}
