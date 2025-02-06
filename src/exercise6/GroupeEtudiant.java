package src.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GroupeEtudiant {
    List<Etudiant> etudiantList;
    public GroupeEtudiant(){
        this.etudiantList = new ArrayList<>();
    }

    public void ajouterEtudiant(Etudiant etudiant){
        etudiantList.add(etudiant);
    }

    public Optional<Etudiant> meilleurEleve(){
        etudiantList.sort((o1, o2) -> Float.compare(o2.moyenne, o1.moyenne));
        Optional<Etudiant> meilleure = etudiantList.stream().findFirst();
        meilleure.ifPresentOrElse(System.out::println, () -> System.out.println("Liste vide"));
        return meilleure;
    }
}
