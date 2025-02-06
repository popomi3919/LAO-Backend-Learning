package exercise5;

import java.util.Optional;

public class Exercise5 {
    public static void main(String[] args){
        FlotteVehicules flotte = new FlotteVehicules();

        flotte.ajouterVehicule(new Voiture(12, "Toyota", "Corolla", 2015, true));
        flotte.ajouterVehicule(new Moto(33, "Yamaha", "R1", 2018, false));
        flotte.ajouterVehicule(new Camion(59, "Mercedes", "Actros", 2010, true));

        System.out.print("Recherche de la moto : ");
        flotte.rechercherVehicule(33);
        System.out.print("Véhicule disponible le plus ancien : ");
        flotte.vehiculeLePlusAncien();
    }
}
