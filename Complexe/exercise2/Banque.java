package Complexe.exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Banque {

    Map<String,CompteBancaire> listeCompteBancaire;
    public Banque(){
        this.listeCompteBancaire = new HashMap<>();
    }

    public void ajouterCompteBancaire(CompteBancaire compteBancaire){
        listeCompteBancaire.put(compteBancaire.numeroIdentificationUnique, compteBancaire);
    }

    public void afficherComptebancaire(){
        for(Map.Entry<String, CompteBancaire> entry : listeCompteBancaire.entrySet()){
            entry.getValue().afficherCompteBancaire();
        }
    }

    public void depot(String numeroUnique, double montant){
        boolean trouver = false;
        for(Map.Entry<String, CompteBancaire> entry : listeCompteBancaire.entrySet()){
            if (Objects.equals(entry.getKey(), numeroUnique)){
                trouver = true;
                entry.getValue().solde += montant;
                System.out.println("Depot effectuer");
            }
        }
        if(!trouver){
            System.out.println("Compte Inexistant");
        }
    }

    public boolean retrait(String numeroUnique,double montant){
        boolean trouver = false;
        for(Map.Entry<String, CompteBancaire> entry : listeCompteBancaire.entrySet()){
            if (Objects.equals(entry.getKey(), numeroUnique)){
                trouver = true;
                if(montant <= entry.getValue().solde){
                    entry.getValue().solde -= montant;
                    System.out.println("Votre nouveau solde est de: " + entry.getValue().solde);
                    return true;
                }
                else {
                    System.out.println("solde insuffissant");
                }
            }
        }
        if(!trouver){
            System.out.println("Compte introuvable ou inexistant");
        }
        return false;
    }

    public void transfert(String idEnvoyeur,String idDestinataire, double montant){

        boolean idTrouver = false;
        for(Map.Entry<String, CompteBancaire> entry : listeCompteBancaire.entrySet()){
            for (Map.Entry<String, CompteBancaire> secondentry : listeCompteBancaire.entrySet()){
                if (Objects.equals(entry.getKey(), idEnvoyeur) && Objects.equals(secondentry.getKey(), idDestinataire)){
                    idTrouver = true;
                    if(retrait(idEnvoyeur, montant)){
                        depot(idDestinataire, montant);
                        System.out.println("Depot Effectuer a Mr/Mme: " + secondentry.getValue().proprietaire +
                                " d'une valeur de: " + montant);
                    }
                    else {
                        System.out.println("solde insuffissant");
                    }
                }
            }
        }
        if(!idTrouver){
            System.out.println("Compte introuvable ou inexistant");
        }
    }
}
