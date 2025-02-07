package Complexe.exercise1;

import java.util.List;

public class Concert extends Evenement{
    int nombeDeplace;
    List<String> artisteInviter;
    public Concert(String date, String lieu, List<String> inviter,
                   List<String> artisteInviter, int nombeDeplace) {
        super(date, lieu, inviter);
        this.artisteInviter = artisteInviter;
        this.nombeDeplace = nombeDeplace;
    }

    @Override
    public void afficherLesDetails() {
        System.out.println("\nEvenement: Concert");
        System.out.println("Nombre de place: " + nombeDeplace);
        super.afficherLesDetails();
        System.out.println("Artiste Inviter: " + artisteInviter);
    }
}
