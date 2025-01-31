import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Product {
    int id;
    String name;
    int price;
    public Product(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price;
    }
}

class ProductCatalogue{
    static List<Product> products = new ArrayList<>();;

    public static void addProduct(Product product){
        products.add(product);
    }

    public static Optional<Product> findById(int id){
        Optional<Product> checker = products.stream().filter(product -> product.id == id).findFirst();
        return checker;
    }

}


public class Exercise_4 {
    public static void main(String[] args) {
        ProductCatalogue.addProduct(new Product(20, "Stylo", 50));
        ProductCatalogue.addProduct(new Product(1, "Table", 5000));
        ProductCatalogue.addProduct(new Product(2, "Chaise", 3000));
        ProductCatalogue.addProduct(new Product(10, "Crayon", 25));

        ProductCatalogue.findById(20).ifPresentOrElse(System.out::println, Optional::empty);
    }
}