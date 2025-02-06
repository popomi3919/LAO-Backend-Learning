package exercise8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GestionEmploye {
    List<Employe> employes;
    public GestionEmploye(){
        employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe){
        employes.add(employe);
    }

    public Optional<Employe> lePlusRiche(){
        employes.sort((o1, o2) -> Integer.compare(o2.salaire, o1.salaire));
        Optional<Employe> riche = employes.stream().findFirst();
        riche.ifPresentOrElse(System.out::println, () -> System.out.println("Liste vide"));
        return riche;
    }
}
