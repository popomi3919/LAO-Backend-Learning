package Complexe.exercise1;

import java.util.List;

public class Evenement {
    String date;
    String lieu;
    List<String> inviter;

    public Evenement(String date, String lieu, List<String> inviter){
        this.date = date;
        this.lieu = lieu;
        this.inviter = inviter;
    }

    public void afficherLesDetails(){
        System.out.println("Date de L'evenement: " + date + "\nLieux: " + lieu
                + "\nListe des invité: " + inviter);
    }

}
