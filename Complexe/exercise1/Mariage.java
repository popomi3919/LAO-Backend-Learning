package Complexe.exercise1;

import java.util.List;

public class Mariage extends Evenement{
    public Mariage(String date, String lieu, List<String> inviter) {
        super(date, lieu, inviter);
    }

    @Override
    public void afficherLesDetails() {
        System.out.println("\nEvenement: Mariage");
        super.afficherLesDetails();
    }
}
