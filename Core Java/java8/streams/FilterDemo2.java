package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

}

public class FilterDemo2 {
    public static void main(String[] args) {
        Product p1 = new Product(20, "mobile", 20000.00);
        Product p2 = new Product(32, "air pods", 25000.00);
        Product p3 = new Product(98, "laptop", 45000.00);
        Product p4 = new Product(32, "AC", 30000.00);
        Product p5 = new Product(109, "Bike", 80000.00);
        Product p6 = new Product(22, "cloth", 12000.00);
        Product p7 = new Product(45, "cycle", 4000.00);

        List<Product> productList = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        List<Product> highestPrice = new ArrayList<>();

        highestPrice = productList.stream()
                .filter(x -> x.price > 25000.00)
                .collect(Collectors.toList());
        System.out.println(highestPrice);
        productList.stream().filter(x-> x.price > 25000.00).forEach(n-> System.out.println(n.name));

    }
}
