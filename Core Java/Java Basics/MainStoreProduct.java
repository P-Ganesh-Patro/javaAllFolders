class StoreProduct {
    protected String name;
    protected double basePrice;

    public StoreProduct(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public void setPrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getNetPrice() {
        return basePrice;
    }

    public void print() {
        System.out.println("Product: " + name + ", Base Price: " + basePrice);
    }
}


class ImportedProduct extends StoreProduct {
    private double importDuty;

    public ImportedProduct(String name, double basePrice, double importDuty) {
        super(name, basePrice);
        this.importDuty = importDuty;
    }

    public void setImportDuty(double importDuty) {
        this.importDuty = importDuty;
    }

    @Override
    public double getNetPrice() {
        return basePrice + importDuty;
    }

    @Override
    public void print() {
        System.out.println("Imported Product: " + name + ", Base Price: " + basePrice + ", Import Duty: " + importDuty
                + ", Net Price: " + getNetPrice());
    }
}

class DiscountedProduct extends StoreProduct {
    double discountRate;

    public DiscountedProduct(String name, double basePrice, double discountRate) {
        super(name, basePrice);
        this.discountRate = discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double getNetPrice() {
        return basePrice - (basePrice * discountRate / 100);
    }

    @Override
    public void print() {
        System.out.println("Discounted Product: " + name + ", Base Price: " + basePrice + ", Discount Rate: "
                + discountRate + "%, Net Price: " + getNetPrice());
    }
}

public class MainStoreProduct {
    public static void main(String[] args) {
        StoreProduct p1 = new ImportedProduct("Laptop", 50000, 5000);
        StoreProduct p2 = new DiscountedProduct("Phone", 20000, 10);

        p1.print();
        p2.print();

        if (p1 instanceof ImportedProduct) {
            ImportedProduct imp = (ImportedProduct) p1;
            imp.setImportDuty(6000);
            imp.print();
        }

        if (p2 instanceof DiscountedProduct) {
            DiscountedProduct disc = (DiscountedProduct) p2;
            disc.setDiscountRate(15);
            disc.print();
        }
    }
}
