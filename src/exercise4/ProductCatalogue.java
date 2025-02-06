package exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductCatalogue {
    List<Product> products;
    public ProductCatalogue(){
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public Optional<Product> findById(int id){
        Optional<Product> findProduct = products.stream().filter(product -> product.id == id).findFirst();
        findProduct.ifPresentOrElse(System.out::println, Optional::empty);
        return findProduct;
    }
}
