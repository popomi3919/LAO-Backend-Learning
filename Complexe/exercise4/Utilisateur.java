package Complexe.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    String nom;
    List<Message> messages;

    public Utilisateur(String nom){
        this.nom = nom;
        this.messages = new ArrayList<>();
    }

    public void inbox(Message message){
        messages.add(message);
    }
}
