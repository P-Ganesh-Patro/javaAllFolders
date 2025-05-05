public class Productdetails {
    int product_id;
    String product_name;
    double product_price;
    int product_quantity_on_hand;

    Productdetails(int product_id, String product_name, double product_price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_quantity_on_hand = 0;

    }

    public double getNetPrice() {
        return product_price + (product_price * 0.12);
    }

    public void purchase(int quantity) {
        try {
            if (quantity <= 0) {
                throw new IllegalArgumentException("Invalid quantity size");
            }
            this.product_quantity_on_hand += quantity;

        } catch (IllegalArgumentException e) {
            System.out.println("Error:- " + e.getMessage());
        }
    }

    public void sell(int quantity) {
        try {
            if (quantity <= 0) {
                throw new IllegalArgumentException("Invalid quantity. Please enter a positive value.");
            }
            if (quantity > this.product_quantity_on_hand) {
                throw new IllegalStateException(
                        "Insufficient stock! Only " + this.product_quantity_on_hand + " units available.");
            }
            this.product_quantity_on_hand -= quantity;
            System.out.println(quantity + " units sold. Remaining Stock: " + this.product_quantity_on_hand);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void displayTheProduct() {
        System.out.println("product Details:- ");
        System.out.println("product ID " + product_id);
        System.out.println("product Name " + product_name);
        System.out.println("product price " + product_id);
        System.out.println("product Total price " + getNetPrice());
        System.out.println("Quantity on hand " + product_quantity_on_hand);

    }

    public static void main(String[] args) {

        Productdetails product = new Productdetails(101, "laptop", 40000.0);
        product.purchase(5);
        product.sell(5);
        product.displayTheProduct();

    }

}
