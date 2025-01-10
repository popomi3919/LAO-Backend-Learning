import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Joueur{
    String nom;
    int score;
    public Joueur(String nom, int score){
        this.nom = nom;
        this.score = score;
    }

    @Override
    public String toString() {
        return "nom: '" + nom + '\'' +
                ", score: " + score ;
    }
}
public class Exercise_8 {
    public static void main(String[] args){
        ArrayList<Joueur> joueurs = new ArrayList<>();
        joueurs.add(new Joueur("C.Ronaldo", 100));
        joueurs.add(new Joueur("L.Messi", 150));
        joueurs.add(new Joueur("Pele", 200));
        joueurs.add(new Joueur("Halaand", 70));

        Collections.sort(joueurs, new Comparator<Joueur>() {
            @Override
            public int compare(Joueur j1, Joueur j2) {
                return Double.compare(j2.score, j1.score);
            }
        });

        System.out.println("Classement des Joueur: ");
        for (Joueur j: joueurs){
            System.out.println(j);
        }
    }

    }
