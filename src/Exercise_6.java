import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Etudiant{
    String nom;
    int age;
    int note;
    float moyenne;

    public Etudiant(String nom, int age, int note, float moyenne){
        this.nom = nom;
        this.age = age;
        this.note = note;
        this.moyenne = moyenne;
    }

    @Override
    public String toString() {
        return "nom='" + nom + '\'' +
                ", age=" + age +
                ", note=" + note +
                ", moyenne=" + moyenne;
    }
}

class GroupeEtudiant{
    static List<Etudiant> etudiantList= new ArrayList<>();

    public static void ajouterEtudiant(Etudiant etudiant){
        etudiantList.add(etudiant);
    }

    public static Optional<Etudiant> meilleurEleve(){
          etudiantList.sort((o1, o2) -> Float.compare(o2.moyenne, o1.moyenne));
        return etudiantList.stream().findFirst();
    }
}


public class Exercise_6 {
    public static void main(String[] args){
        GroupeEtudiant.ajouterEtudiant(new Etudiant("John",18, 15, 12.5F));
        GroupeEtudiant.ajouterEtudiant(new Etudiant("Paul",25, 2, 9.8F));
        GroupeEtudiant.ajouterEtudiant(new Etudiant("Jean",22, 18, 14.9F));
        GroupeEtudiant.ajouterEtudiant(new Etudiant("Pierre",17, 10, 11.5F));

        GroupeEtudiant.meilleurEleve().ifPresent(System.out::println);

    }
}
