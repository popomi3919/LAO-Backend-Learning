package Complexe.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GestionEvenement {
    List<Evenement> listeDesEvenemts;
    public GestionEvenement(){
        this.listeDesEvenemts = new ArrayList<>();
    }

    public void ajouterEvenement(Evenement evenement){
        listeDesEvenemts.add(evenement);
    }

    public void afficherEvenement(){
        for (Evenement e : listeDesEvenemts){
            e.afficherLesDetails();
            System.out.println("\n");
        }
    }

    public void rechercheEvenement(String date){
        boolean trouver = false;
        for (Evenement e : listeDesEvenemts){
            if(Objects.equals(date, e.date)) {
                trouver = true;
                System.out.println("Evement Trouver: ");
                e.afficherLesDetails();
            }
        }
        if(!trouver){
            System.out.println("Evenement introuvable ou Inexistant");
        }
    }
}
