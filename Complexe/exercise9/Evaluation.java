package Complexe.exercise9;

import java.util.Optional;

public class Evaluation {
    String matiere;
    Optional<Double> note;
    int coefficient;

    public Evaluation(String matiere, Double note, int coefficient){
        this.matiere = matiere;
        this.note = Optional.ofNullable(note);
        this.coefficient = coefficient;
    }
}
