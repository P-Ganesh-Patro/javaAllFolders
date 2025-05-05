import java.util.HashSet;
import java.util.TreeSet;

public class CircleXY41 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(20, 30);
        Circle circle2 = new Circle(21, 31);
        Circle circle3 = new Circle(22, 32);
        Circle circle4 = new Circle(23, 33);
        Circle circle5 = new Circle(24, 34);
        Circle circle6 = new Circle(24, 34);
        Circle circle7 = new Circle(24, 34);
        HashSet<Circle> c1 = new HashSet<>();
        c1.add(circle1);
        c1.add(circle2);
        c1.add(circle3);
        c1.add(circle4);
        c1.add(circle7);
        c1.add(circle5);
        c1.add(circle6);
        TreeSet<Circle> c2 = new TreeSet<Circle>();
        c2.add(circle1);
        c2.add(circle2);
        c2.add(circle3);
        c2.add(circle4);
        c2.add(circle7);
        c2.add(circle5);
        c2.add(circle6);
        System.out.println(c2.size());
        System.out.println(c1);
    }

} 

class Circle {
    int x;
    int y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
