package Complexe.exercise3;

public class Exercise3 {
    public static void main(String[] args){
        GestionDeTache gestionDeTache= new GestionDeTache();

        gestionDeTache.ajouterTache(new Tache("Acheter telephone", "en cours"));
        gestionDeTache.ajouterTache(new Tache("faire des course","terminer"));
        gestionDeTache.ajouterTache(new Tache("Laver habit", "annuler"));
        gestionDeTache.ajouterTache(new Tache("reparer ordinateur", "terminer"));
        gestionDeTache.ajouterTache(new Tache("Faire le netoyage", "en cours"));

        gestionDeTache.afficherTache();
        gestionDeTache.afficherTacheParEtat("en cours");
        gestionDeTache.retirerTache("Acheter telephone");

    }
}
