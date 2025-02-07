package Complexe.exercise6;

import java.util.Optional;

public class CompteBancaire {
    String numeroIdentificationUnique;
    Optional<String> proprietaire;
    double solde;

    public CompteBancaire(String numeroIdentificationUnique,String proprietaire, double solde){
        this.numeroIdentificationUnique = numeroIdentificationUnique;
        this.proprietaire = Optional.ofNullable(proprietaire);
        this.solde = solde;
    }

    public void afficherCompteBancaire(){
        System.out.println("Numero Unique du compte: " + numeroIdentificationUnique
                + "\nNom du proprietaire: " + proprietaire.orElse("Inconnu")
                + "\t Solde: " + solde
        );
    }
}
