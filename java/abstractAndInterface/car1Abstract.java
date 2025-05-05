package abstractAndInterface;

public class car1Abstract extends carAbstract{

    public void drive(){
        System.out.println("im driving car...");
    }
    public static void main(String[] args) {
        car1Abstract car1  = new car1Abstract();
        car1.drive();
    }
    
}
