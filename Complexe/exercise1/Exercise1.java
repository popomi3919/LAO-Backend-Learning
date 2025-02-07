package Complexe.exercise1;

import java.util.List;

public class Exercise1 {
    public static void main(String[] args){
        GestionEvenement gestionEvenement = new GestionEvenement();
        Evenement mariage = new Mariage("12/01/2025", "Bonanjo",
                List.of("Paul",
                        "Harry",
                        "Marie",
                        "Jean")
        );
        Evenement concert = new Concert("07/02/2024", "Pacour Vita",
                List.of("Toute persone ayant un ticket"),
                List.of("Maahlox", "3xdavs", "KsBloom"), 200
        );

        gestionEvenement.ajouterEvenement(mariage);
        gestionEvenement.ajouterEvenement(concert);
        gestionEvenement.afficherEvenement();
        gestionEvenement.rechercheEvenement("12/01/2025");
    }
}
