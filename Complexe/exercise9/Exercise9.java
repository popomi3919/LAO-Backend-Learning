package Complexe.exercise9;

public class Exercise9 {
    public static void main(String[] args){
        Etudiant john = new Etudiant("John");
        john.ajouterEvaluation(new Evaluation("Mathematics", 11.0, 3));
        john.ajouterEvaluation(new Evaluation("Anglais", 15.5, 3));
        john.ajouterEvaluation(new Evaluation("Francais", 18.5, 3));
        john.ajouterEvaluation(new Evaluation("ECM", null, 2));

        john.afficherEvaluation();
    }
}
