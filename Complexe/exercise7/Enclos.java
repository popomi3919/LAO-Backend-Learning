package Complexe.exercise7;

import java.util.ArrayList;
import java.util.List;

public class Enclos {
    String nom;
    List<Animaux> animaux;
    public Enclos(String nom){
        this.nom = nom;
        this.animaux = new ArrayList<>();
    }

    public void ajouterAnimaux(Animaux animal){
        animaux.add(animal);
    }

    public void retirerAnimaux(Animaux animal){
        animaux.remove(animal);
    }

    public void afficherEnclos(){
        System.out.println("Enclos contient: ");
        for (Animaux animal : animaux){
            System.out.println(animal.nom + animal.espece + animal.listeDeBesoin);
        }
    }
}
