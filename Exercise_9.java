import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class Etudiantt{
    String id;
    String nom;

    public Etudiantt(String nom){
        this.id = UUID.randomUUID().toString();
        this.nom = nom;
    }

    @Override
    public String toString() {
        return id + "-" + nom;
    }
}

public class Exercise_9 {
    public static void main(String[] args){
        ArrayList<Etudiantt> listeEtudiant = new ArrayList<>();
        listeEtudiant.add(new Etudiantt("John"));
        listeEtudiant.add(new Etudiantt("Nobert"));
        listeEtudiant.add(new Etudiantt("Chloe"));

        System.out.println("Liste: ");


        Map<String, String> mapEtudiants =new HashMap<>();

        for (Etudiantt e: listeEtudiant){
            mapEtudiants.put(e.id, e.nom);
        }

        System.out.println(mapEtudiants);
    }
}
