import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Employe{
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

class GestionEmploye{
    List<Employe> employes;
    public GestionEmploye(){
        employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe){
        employes.add(employe);
    }

    public Optional<Employe> lePlusRiche(){
        employes.sort((o1, o2) -> Integer.compare(o2.salaire, o1.salaire));
        return employes.stream().findFirst();
    }
}


public class Exercise_8 {
    public static void main(String[] args){
        GestionEmploye gestionEmploye = new GestionEmploye();

        gestionEmploye.ajouterEmploye(new Employe("Harry", "comptable", 200000));
        gestionEmploye.ajouterEmploye(new Employe("Steve", "secretaire", 30000));
        gestionEmploye.ajouterEmploye(new Employe("Ben", "directeur", 500000));

        System.out.println("Employé le mieux payé: ");
        gestionEmploye.lePlusRiche().ifPresent(System.out::println);
    }
}
