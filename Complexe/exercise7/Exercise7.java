package Complexe.exercise7;

import java.util.List;

public class Exercise7 {
    public static void main(String[] args) {
        Enclos savane = new Enclos("savane");
        Enclos aquarium = new Enclos("aquarium");

        Animaux Lion = new Animaux("Pumba", "Lion", List.of("Viande", "Chaleur", "L'eaux"));
        Animaux Poisson = new Animaux("Nemo", "Poisson", List.of("Nouriture pour poisson", "L'eau"));

        savane.ajouterAnimaux(Lion);
        aquarium.ajouterAnimaux(Poisson);

        savane.afficherEnclos();
        aquarium.afficherEnclos();
    }
}
