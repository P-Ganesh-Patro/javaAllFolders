package duke.choice;

public class shopAppPro {
    private clothing[] items ;
    public void addItems(clothing[] someItems){
        items = someItems; 
    }
    // public double getTotalClothingCost(){
    //     for(clothing item: items){
    //         System.out.println();
    //     }
    // }
    public static void main(String[] args) {
        customerSize c1 = new customerSize();
        c1.measurement = 0;

        switch (c1.measurement) {
            case 1:
            case 2:
            case 3: {
                c1.size = "S";
                break;
            }
            case 4:
            case 5:
            case 6: {
                c1.size = "M";
                break;
            }
            case 7:
            case 8:
            case 9: {
                c1.size = "L";
                break;
            }
            default: {
                c1.size = "X";

            }
        }
        System.out.println("size:- " + c1.size);

    }

}
