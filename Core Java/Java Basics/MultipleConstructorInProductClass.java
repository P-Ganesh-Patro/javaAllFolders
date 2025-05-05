public class MultipleConstructorInProductClass {
    int product_id;
    double product_price;
    String product_name;
    int product_quantity_on_hand;

    MultipleConstructorInProductClass(String product_name, int product_id, double product_price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_quantity_on_hand = 0;
    }

    MultipleConstructorInProductClass(String product_name, int product_id, double product_price,
            int product_quantity_on_hand) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_quantity_on_hand = product_quantity_on_hand;
    }

    MultipleConstructorInProductClass(String product_name, double product_price, int product_id,
            int product_quantity_on_hand) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_quantity_on_hand = product_quantity_on_hand;
    }

    public void purchase(int quantity) {
        try {
            if (quantity <= 0) {
                System.out.println("Please enter valid quantity size !!");
            }

            this.product_quantity_on_hand += quantity;

        } catch (Exception e) {
            System.out.println("Error:- " + e.getMessage());

        }
    }

    public void sell(int quantiy) {
        try {
            if (quantiy <= 0) {
                throw new IllegalArgumentException("Please Enter Valid Quantiy Size...");
            } else if (quantiy > this.product_quantity_on_hand) {
                throw new IllegalStateException(
                        "Insuffiecien stock !! " + this.product_quantity_on_hand + " is available");

            }
            this.product_quantity_on_hand -= quantiy;

        } catch (IllegalArgumentException e) {
            System.out.println("Error Argument:- " + e.getMessage());

        } catch (IllegalStateException e) {
            System.out.println("Error in state :- " + e.getMessage());
        }
    }

    public void displayTheProduct() {
        System.out.println("product details:- ");
        System.out.println("product id:- " + product_id);
        System.out.println("Product name:- " + product_name);
        System.out.println("Product price:- " + product_price);
        System.out.println("Product quantity:- " + product_quantity_on_hand);

    }

    public static void main(String[] args) {

        System.out.println("Product 1");
        MultipleConstructorInProductClass product1 = new MultipleConstructorInProductClass("Mobile", 124, 34000.0);
        product1.purchase(3);
        product1.sell(1);
        product1.displayTheProduct();
        System.out.println();

        System.out.println("Product 2");
        MultipleConstructorInProductClass product2 = new MultipleConstructorInProductClass("Laptop", 132, 54000.0, 2);
        product2.purchase(5);
        product2.sell(2);
        product2.displayTheProduct();
        System.out.println();

        System.out.println("Product 3");
        MultipleConstructorInProductClass product3 = new MultipleConstructorInProductClass("Tab", 56000.0, 43, 4);
        product3.purchase(3);
        product3.sell(1);
        product3.displayTheProduct();

    }

}
