package Complexe.exercise7;

import java.util.List;

public class Animaux {
    String nom;
    String espece;
    List<String> listeDeBesoin;

    public Animaux(String nom, String espece, List<String> listeDeBesoin){
        this.nom = nom;
        this.espece = espece;
        this.listeDeBesoin = listeDeBesoin;
    }
}
