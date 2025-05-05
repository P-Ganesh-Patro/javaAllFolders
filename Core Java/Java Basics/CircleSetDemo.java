import java.util.*;

class Circle implements Comparable<Circle> {
    private int x, y;
    
    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return x == circle.x && y == circle.y;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    
    @Override
    public int compareTo(Circle other) {
        if (this.x != other.x) return Integer.compare(this.x, other.x);
        return Integer.compare(this.y, other.y);
    }
    
    @Override
    public String toString() {
        return "Circle(" + x + ", " + y + ")";
    }
}

public class CircleSetDemo {
    public static void main(String[] args) {
        HashSet<Circle> hashSet = new HashSet<>();
        TreeSet<Circle> treeSet = new TreeSet<>();
        
        Circle c1 = new Circle(5, 10);
        Circle c2 = new Circle(3, 7);
        Circle c3 = new Circle(5, 10); 
        Circle c4 = new Circle(8, 12);
        
        hashSet.add(c1);
        hashSet.add(c2);
        hashSet.add(c3);
        hashSet.add(c4);
        
        treeSet.add(c1);
        treeSet.add(c2);
        treeSet.add(c3);
        treeSet.add(c4);
        
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
