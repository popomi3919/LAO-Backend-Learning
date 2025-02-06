package src.exercise8;

public class Employe {
    String nom;
    String poste;
    int salaire;

    public Employe(String nom, String poste, int salaire){
        this.nom = nom;
        this.poste = poste;
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "nom='" + nom + '\'' +
                ", poste='" + poste + '\'' +
                ", salaire=" + salaire;
    }
}
