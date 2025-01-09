import java.util.*;

class Etudiant {
     String nom;
     int age;
     double moyenne;

    public Etudiant(String nom, int age, double moyenne) {
        this.nom = nom;
        this.age = age;
        this.moyenne = moyenne;
    }


}
public class Exercise_1 {
    public static void main(String[] args){
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant("Paul", 22, 9.99));
        etudiants.add(new Etudiant("Jean", 25, 11.33));
        etudiants.add(new Etudiant("Bryan", 19, 12.11));
        etudiants.add(new Etudiant("Harry", 18, 14.99));
        etudiants.add(new Etudiant("James", 19, 13.5));

        System.out.println("Liste des Etudiants: ");
        System.out.println("Nom \t\t\tAge \t\tMoyenne");
        System.out.println("--- \t\t\t--- \t\t------- \n");
        for (Etudiant e : etudiants){
            System.out.println(e.nom + "\t\t\t" + e.age + "\t\t\t" + e.moyenne );
        }

        etudiants.sort(new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant o1, Etudiant o2) {
                return Double.compare(o2.moyenne, o1.moyenne);
            }
        });

        System.out.println("\n Etudiant trier par moyenne décroisant: ");
        System.out.println("Nom \t\t\tAge \t\tMoyenne");
        System.out.println("--- \t\t\t--- \t\t------- \n");
        for (Etudiant e : etudiants){
            System.out.println(e.nom + "\t\t\t" + e.age + "\t\t\t" + e.moyenne );
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n Entrée le nom de l'étudiant: ");
        String nomEtudiant = scanner.nextLine();

        boolean trouver = false;
        for(Etudiant e : etudiants){
            if(Objects.equals(nomEtudiant, e.nom)){
                trouver = true;
                System.out.println("\nEtudiant trouvé: ");
                System.out.println("Nom: " + e.nom + "\tAge: " + e.age + " \tMoyenne: " + e.moyenne );
                break;
            }
        }

        if(!trouver){
            System.out.println("Etudiant non trouvable, verifier l'orthographe");
        }
    }
}