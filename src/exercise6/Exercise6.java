package src.exercise6;

public class Exercise6 {
    public static void main(String[] args){
        GroupeEtudiant groupeEtudiant = new GroupeEtudiant();
        groupeEtudiant.ajouterEtudiant(new Etudiant("John",18, 15, 12.5F));
        groupeEtudiant.ajouterEtudiant(new Etudiant("Paul",25, 2, 9.8F));
        groupeEtudiant.ajouterEtudiant(new Etudiant("Jean",22, 18, 14.9F));
        groupeEtudiant.ajouterEtudiant(new Etudiant("Pierre",17, 10, 11.5F));

        groupeEtudiant.meilleurEleve();
    }
}
