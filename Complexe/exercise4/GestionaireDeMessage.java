package Complexe.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GestionaireDeMessage {
    Map<String, Utilisateur> utilisateurs;
    Map<String, List<Message>> conversation;

    public void ajouterUtilisateur(String nom){
        if (!utilisateurs.containsKey(nom)){
            utilisateurs.put(nom, new Utilisateur(nom));
        }
        else {
            System.out.println("Utilisateur existant");
        }
    }
    public void envoyerMessage(String expediteur, String recepteur, String contenu){
        if(utilisateurs.containsKey(expediteur) && utilisateurs.containsKey(recepteur)){
            Message message = new Message(expediteur,recepteur, contenu);
            String discussion = expediteur + "-" + expediteur;

            conversation.computeIfAbsent(discussion,s -> new ArrayList<>());
            System.out.println("Message envoyer " + message);
        }
        else {
            System.out.println("L'un ou tout les utilisateur n'existe pas.");
        }
    }

}
