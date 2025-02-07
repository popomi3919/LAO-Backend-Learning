package Complexe.exercise2;

public class CompteBancaire {
    String numeroIdentificationUnique;
    String proprietaire;
    double solde;

    public CompteBancaire(String numeroIdentificationUnique,String proprietaire, double solde){
        this.numeroIdentificationUnique = numeroIdentificationUnique;
        this.proprietaire = proprietaire;
        this.solde = solde;
    }

    public void afficherCompteBancaire(){
        System.out.println("Numero Unique du compte: " + numeroIdentificationUnique
                + "\nNom du proprietaire: " + proprietaire
                + "\t Solde: " + solde
        );
    }
}
