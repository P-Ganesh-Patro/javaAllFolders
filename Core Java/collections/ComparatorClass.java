import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorClass {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(20);
        al.add(23);
        al.add(10);
        al.add(21);
        al.add(9);
        al.add(2);
        al.sort((a, b) -> b - a);
        
        System.out.println(al);

    }
}