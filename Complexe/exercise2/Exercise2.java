package Complexe.exercise2;

public class Exercise2 {
    public static void main(String[] args){
        Banque cca = new Banque();
        cca.ajouterCompteBancaire(new CompteBancaire("CE5D","Paul", 1000));
        cca.ajouterCompteBancaire(new CompteBancaire("MRP7","Jean", 0));
        cca.ajouterCompteBancaire(new CompteBancaire("Pr89L","Tony", 2005.4));
        cca.ajouterCompteBancaire(new CompteBancaire("KIF86","Helene", 25000));

        cca.afficherComptebancaire();

        cca.depot("CE5D", 2000);
        cca.retrait("CE5D", 1500);
        cca.transfert("KIF86", "CE5D5", 6500);




    }
}
