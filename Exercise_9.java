import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class Etudiant{
    String id;
    String nom;

    public Etudiant(String nom){
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
        ArrayList<Etudiant> listeEtudiant = new ArrayList<>();
        listeEtudiant.add(new Etudiant("John"));
        listeEtudiant.add(new Etudiant("Nobert"));
        listeEtudiant.add(new Etudiant("Chloe"));

        System.out.println("Liste: ");


        Map<String, String> mapEtudiants =new HashMap<>();

        for (Etudiant e: listeEtudiant){
            mapEtudiants.put(e.id, e.nom);
        }

        System.out.println(mapEtudiants);
    }
}
