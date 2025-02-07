package Complexe.exercise4;

import java.sql.Timestamp;
import java.time.Instant;

public class Message {
    String expéditeur;
    String récepteur;
    String contenu;
    Timestamp horodatage;


    public Message(String expéditeur, String récepteur, String contenu){
        this.expéditeur = expéditeur;
        this.récepteur = récepteur;
        this.contenu = contenu;
        this.horodatage = Timestamp.from(Instant.now());
    }
}
