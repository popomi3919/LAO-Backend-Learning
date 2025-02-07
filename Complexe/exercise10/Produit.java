package Complexe.exercise10;

import java.util.Optional;

public class Produit {
    String name;
    Optional<String> description;
    int price;
    int quantiter;
    public Produit(String name, String description, int price, int quantiter){
        this.name = name;
        this.description = Optional.ofNullable(description);
        this.quantiter = quantiter;
        this.price = price;
    }
}
