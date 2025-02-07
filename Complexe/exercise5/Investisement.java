package Complexe.exercise5;

import java.util.Optional;

public class Investisement {
    String nom;
    int quantiter;
    Optional<Integer> prix;

    public Investisement(String nom, int quantiter, Integer prix){
        this.nom = nom;
        this.prix = Optional.ofNullable(prix);
        this.quantiter = quantiter;
    }

    @Override
    public String toString() {
        return "Investisement{" +
                "nom='" + nom + '\'' +
                ", quantiter=" + quantiter +
                ", prix=" + prix.orElse(0) ;
    }
}
