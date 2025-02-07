package Complexe.exercise5;

public class Evercise5 {
    public static void main(String[] args){
        Portfolio portfolio = new Portfolio();

        portfolio.ajouterInvestissement(new Investisement
                ("Apple", 200, 8000));
        portfolio.ajouterInvestissement(new Investisement
                ("Microsoft", 108, 8619));
        portfolio.ajouterInvestissement(new Investisement
                ("Google", 14, null));
        portfolio.ajouterInvestissement(new Investisement
                ("Yahoo", 2, 47));

        portfolio.afficherPortefeuille();
    }
}
