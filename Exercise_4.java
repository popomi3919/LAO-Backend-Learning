import java.util.Comparator;
import java.util.PriorityQueue;

class Tache {
    String nom;
    int priorité;

    public Tache(String nom, int priorité){
        this.nom = nom;
        this.priorité = priorité;
    }

    @Override
    public String toString() {
        return  nom;
    }
}
public class Exercise_4 {
    public static void main(String[] args){

        Comparator<Tache> comparateurDeTache = Comparator.comparingInt(Tache -> Tache.priorité);
        PriorityQueue<Tache> tacheQueue = new PriorityQueue<>(comparateurDeTache);
        tacheQueue.add(new Tache("reinstallé ma machine", 4));
        tacheQueue.add(new Tache("Telecharger Fifa 23", 5));
        tacheQueue.add(new Tache("Faire des exercise", 2));
        tacheQueue.add(new Tache("Apprendre des notion", 1));
        tacheQueue.add(new Tache("Sauvegardé mes donnée", 3));

        while (!tacheQueue.isEmpty()){
            Tache tacheCouant = tacheQueue.poll();

            System.out.println("En cours d'execution: " + tacheCouant);
        }



        System.out.println("");
    }
}
