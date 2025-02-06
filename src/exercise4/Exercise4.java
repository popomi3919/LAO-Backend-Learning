package src.exercise4;

public class Exercise4 {
    public static void main(String[] args){
        ProductCatalogue productCatalogue = new ProductCatalogue();

        productCatalogue.addProduct(new Product(20, "Stylo", 50));
        productCatalogue.addProduct(new Product(1, "Table", 5000));
        productCatalogue.addProduct(new Product(2, "Chaise", 3000));
        productCatalogue.addProduct(new Product(10, "Crayon", 25));

        productCatalogue.findById(10);
    }
}
