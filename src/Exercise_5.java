import java.util.*;

class Vehicule{
    protected int id;
    protected String marque;
    protected String modele;
    protected int année;
    protected boolean disponibilité;
    public Vehicule(int id, String marque, String modele, int année, boolean disponibilité){
        this.id= id;
        this.marque = marque;
        this.modele = modele;
        this.année = année;
        this.disponibilité = disponibilité;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", année=" + année +
                ", disponibilité=" + disponibilité;
    }
}

class Moto extends Vehicule{
    public Moto(int id, String marque, String modele, int année, boolean disponibilité) {
        super(id, marque, modele, année, disponibilité);
    }
}

class Voitures extends Vehicule{
    public Voitures(int id, String marque, String modele, int année, boolean disponibilité) {
        super(id, marque, modele, année, disponibilité);
    }
}

class Camion extends Vehicule{
    public Camion(int id, String marque, String modele, int année, boolean disponibilité) {
        super(id, marque, modele, année, disponibilité);
    }
}

class FlotteVehicules{
    List<Vehicule> vehicules;
    FlotteVehicules(){
        vehicules = new ArrayList<>();
    }
    public void ajouterVehicule(Vehicule vehicule){
        vehicules.add(vehicule);
    }



    public Optional<Vehicule> rechercherVehicule(int id){
        Optional<Vehicule> checker = vehicules.stream().filter(vehicule -> vehicule.id == id).findFirst();
        return checker;
    }

    public Optional<Vehicule> vehiculeLePlusAncien(){

        vehicules.stream().min((o1, o2) -> Integer.compare(o1.année, o2.année));
        return vehicules.stream().findFirst();
    }


    public void retirerProduit(int id){
        for (Vehicule v : vehicules){
            if (id == v.id){
                vehicules.remove(v);
            }
            else{
                System.out.println("Vehicule inexistant");
            }
        }
    }
}


public class Exercise_5 {
    public static void main(String[] args){
        FlotteVehicules flotte = new FlotteVehicules();

        flotte.ajouterVehicule(new Voitures(12, "Toyota", "Corolla", 2015, true));
        flotte.ajouterVehicule(new Moto(33, "Yamaha", "R1", 2018, false));
        flotte.ajouterVehicule(new Camion(59, "Mercedes", "Actros", 2010, true));

        System.out.print("Recherche de la moto : ");
        flotte.rechercherVehicule(33).ifPresent(System.out::println);
        System.out.print("Véhicule disponible le plus ancien : ");
        flotte.vehiculeLePlusAncien().ifPresent(System.out::println);
    }
}

