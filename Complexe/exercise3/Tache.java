package Complexe.exercise3;

import java.sql.Timestamp;
import java.time.Instant;

public class Tache {
    String description;
    String date;
    String status;
    int priorite;

    public Tache(String description, String status) {
            this.description = description;
            this.date = Timestamp.from(Instant.now()).toString();
            this.status = status;

        switch (status) {
            case "en cours" -> priorite = 5;
            case "annuler" -> priorite = 3;
            case "terminer" -> priorite = 0;
            case null, default -> System.out.println("Etat invalide");
        }
    }
}
