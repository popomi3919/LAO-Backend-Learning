package src.exercise8;

public class Exercise8 {
    public static void main(String[] args){
        GestionEmploye gestionEmploye = new GestionEmploye();

        gestionEmploye.ajouterEmploye(new Employe("Harry", "comptable", 200000));
        gestionEmploye.ajouterEmploye(new Employe("Steve", "secretaire", 30000));
        gestionEmploye.ajouterEmploye(new Employe("Ben", "directeur", 500000));

        System.out.println("Employé le mieux payé: ");
        gestionEmploye.lePlusRiche();
    }
}
