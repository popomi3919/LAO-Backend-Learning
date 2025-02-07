package Complexe.exercise8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Representation {
    String date;
    List<Reservation> reservation;
    Set<Integer> placeDisponible;
    int nombreDePlaces;
    public Representation(String date, int nombreDePlaces){
        this.date = date;
        this.reservation = new ArrayList<>();
        this.placeDisponible = new HashSet<>();
        this.nombreDePlaces = nombreDePlaces;
    }

    public void reservationClient(String nomDuClient, int nombrDePlace){
        for (int i = 0; i <= nombreDePlaces; i++) {
            placeDisponible.add(i);
        }

        if (placeDisponible.remove(nombrDePlace)){
            reservation.add(new Reservation(nomDuClient, nombrDePlace));
        } else {
            System.out.println("Nombre de place excede le nombre de place maximum disponible");
        }
    }
    public void afficherReservation(){
        System.out.println("Representation du: " + date);
        System.out.println("Les inviter ayant reserver leur places sont les suivant: ");
        for (Reservation reservation1: reservation){
            System.out.println(reservation1.nomDuClient +" : "+ reservation1.numeroDePlace);
        }
    }
}
