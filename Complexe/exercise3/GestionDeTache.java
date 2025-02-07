package Complexe.exercise3;

import java.util.*;

public class GestionDeTache {
        Queue<Tache> taches;

    public GestionDeTache() {
        Comparator<Tache> tacheComparator = (o1, o2) -> (Integer.compare(o2.priorite, o1.priorite));
        this.taches = new PriorityQueue<>(tacheComparator);
    }

        public void ajouterTache(Tache tache) {
            taches.add(tache);
        }

        public void retirerTache(String description) {
            boolean tacheARetirer = false;
            for (Tache tache : taches) {
                if (Objects.equals(tache.description, description)) {
                    tacheARetirer = true;
                    taches.remove(tache);
                    System.out.println("Tâche supprimée : " + tache.description);
                    break;
                }
            }
            if(!tacheARetirer) {
                System.out.println("Tâche non trouvée.");
            }
        }


        public void afficherTache() {
            if (taches.isEmpty()) {
                System.out.println("Aucune tâche à afficher.");
            } else {
                System.out.println("Liste des tâches : ");
                for (Tache tache : taches) {
                    System.out.println(tache.status+ " : " + tache.description+ " : " + tache.date);
                }
            }
        }

        public void afficherTacheParEtat(String status) {
            boolean trouverTache = false;
            System.out.println("Tâches avec l'état '" + status + "':");
            for (Tache tache : taches) {
                if (tache.status.equalsIgnoreCase(status)) {
                    trouverTache = true;
                    System.out.println(tache.status+ " : " + tache.description+ " : " + tache.date);
                }
            }
            if(!trouverTache){
                System.out.println("Aucene tache ayant cette etat");
            }
        }


}
