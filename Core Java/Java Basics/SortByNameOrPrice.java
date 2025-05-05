import java.util.ArrayList;
import java.util.Collections;

public class SortByNameOrPrice {
    public static void main(String[] args) {
        Product p1 = new Product(101, "mobile", 23000);
        Product p2 = new Product(102, "laptop", 33000);
        Product p3 = new Product(103, "tv", 13000);
        Product p4 = new Product(104, "bag", 1300);
        Product p5 = new Product(105, "car", 100000);
        Product p6 = new Product(106, "bat", 1100);
        ArrayList<Product> ts = new ArrayList<Product>();
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);
        ts.add(p5);
        ts.add(p6);
        Collections.sort(ts);
        System.out.println(ts);
    }

}

class Product implements Comparable<Product> {
    int product_id;
    String product_name;
    int product_price;

    public Product(int product_id, String product_name, int product_price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
    }

    @Override
    public String toString() {
        return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
                + product_price + "]";
    }

    // sort by name
    @Override
    public int compareTo(Product product) {
        return this.product_name.compareTo(product.product_name);
    }

    // sort by product price
    // @Override
    // public int compareTo(Product product) {
    // if( this.product_price< product.product_price ){
    // return 1;
    // }
    // return -1;
    // }

}