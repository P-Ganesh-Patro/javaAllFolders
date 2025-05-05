package duke.choice;


// import assignments.customer;
public class shopApp {
    public static void main(String[] args) {
        System.out.println("Wel come to duke choice..!");
        Customer c1 = new Customer();
        c1.name = "Mithun";
        double tax = 0.5, total = 0.0;
        // System.out.println("name of the customer is:- " + c1.name);
        // String name = "Ganesh patro ";
        // int lengthOfString = name.length();
        // System.out.println("length of string:- " + lengthOfString);
        // String trimLength = name.trim();
        // System.out.println(trimLength + 10);
        // int indexOfChar = name.indexOf("p");
        // System.out.println(indexOfChar);
        // int cost = 1_2_2;
        // int total =cost + 76;
        // System.out.println(total);
        clothing item1 = new clothing();
        item1.description = "Blue jacket";
        item1.price = 1200.00;
        item1.size = "S";
        clothing item2 = new clothing();
        item2.description = "orange T-shirt";
        item2.price = 1900.00;
        item2.size = "M";
        clothing[] items = { item1, item2 };
        // System.out.println("items:- " + Arrays.toString(items)); 
        

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].description);
            System.out.println(items[i].price);
            System.out.println(items[i].size);
        }

        System.out.println("item1:- " + item1.description + ", " + item1.price + ", " + item1.size);
        System.out.println("item2:- " + item2.description + ", " + item2.price + ", " + item2.size);
        clothing item3 = new clothing();
        item3.description = "orange T-shirt";
        item3.price = 2000.00;
        item3.size = "L";
        // total = (item1.price + item2.price * 2) * 1 + tax;
        System.out.println("total:- " + total);

    }
}
