package exercise6;

public class Etudiant {
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
