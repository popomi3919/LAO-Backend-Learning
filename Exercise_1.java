import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Etudiant {
    private String nom;
    private int age;
    private double moyenne;

    public Etudiant(String nom, int age, double moyenne) {
        this.nom = nom;
        this.age = age;
        this.moyenne = moyenne;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    @Override
    public String toString() {
        return "Nom: '" + nom + '\'' +
                ", Age: " + age +
                ", Moyenne: " + moyenne;
    }
}
public class Exercise_1 {
    public static void main(String[] args){
        ArrayList<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant("Paul", 22, 9.99));
        etudiants.add(new Etudiant("Jean", 25, 11.33));
        etudiants.add(new Etudiant("Bryan", 19, 12.11));
        etudiants.add(new Etudiant("Harry", 18, 14.99));
        etudiants.add(new Etudiant("James", 19, 13.5));

        System.out.println("Liste des Etudiants: ");
        for (Etudiant e : etudiants){
            System.out.println(e);
        }

        Collections.sort(etudiants, new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant o1, Etudiant o2) {
                return Double.compare(o2.getMoyenne(), o1.getMoyenne());
            }
        });

        System.out.println("\n Etudiant trier par moyenne décroisant: ");
        for(Etudiant e : etudiants){
            System.out.println(e);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n Entrée le nom de l'étudiant: ");
        String nomEtudiant = scanner.nextLine();

        boolean trouver = false;
        for(Etudiant e : etudiants){
            if(Objects.equals(nomEtudiant, e.getNom())){
                trouver = true;
                System.out.println("Etudiant trouvé: " + e);
                break;
            }
        }

        if(!trouver){
            System.out.println("Etudiant non trouvable, verifier l'orthographe");
        }
    }
}