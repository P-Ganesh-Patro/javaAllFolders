package duke.choice;

public class clothing {
    String description;
    double price;
    String size = "M";
    private final double MIN_PRICE = 10.0;
    private final double MIN_TAX = 0.2;

    public static void main(String[] args) {

    }

    public void setPrice(Double price) {
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public double getPrice(Double price) {
        return price + (price * MIN_TAX);
    }

}
