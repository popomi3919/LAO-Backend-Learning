package exercise5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FlotteVehicules {
    List<Vehicule> vehicules;
    FlotteVehicules(){
        vehicules = new ArrayList<>();
    }

    public void ajouterVehicule(Vehicule vehicule){
        vehicules.add(vehicule);
    }

    public Optional<Vehicule> rechercherVehicule(int id){
        Optional<Vehicule> recherche = vehicules.stream().filter(vehicule -> vehicule.id == id).findFirst();
        recherche.ifPresentOrElse(System.out::println, Optional::empty);
        return recherche;
    }

    public Optional<Vehicule> vehiculeLePlusAncien(){
        Optional<Vehicule> vehiculeAncien = vehicules.stream().min(Comparator.comparingInt(o -> o.année)).stream().findFirst();
        vehiculeAncien.ifPresentOrElse(System.out::println, Optional::empty);
        return vehiculeAncien;
    }
}
