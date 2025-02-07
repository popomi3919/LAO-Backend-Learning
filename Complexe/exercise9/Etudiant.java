package Complexe.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    String nom;
    List<Evaluation> evaluations;
    public Etudiant(String nom){
        this.nom = nom;
        this.evaluations = new ArrayList<>();
    }

    public void ajouterEvaluation(Evaluation evaluation){
        evaluations.add(evaluation);
    }

    public void afficherEvaluation(){
        System.out.println("Laperfomance de l'eleve es la suivante: ");
        for (Evaluation evaluation: evaluations){
            System.out.println(evaluation.matiere + " : " + evaluation.note.orElse(0.0) + " : " + evaluation.coefficient );
        }
    }
}
