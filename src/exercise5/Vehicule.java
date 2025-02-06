package exercise5;

public class Vehicule {
    int id;
    String marque;
    String modele;
    int année;
    boolean disponibilité;
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
