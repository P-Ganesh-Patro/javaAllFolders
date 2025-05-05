import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class CollectionsComp {
    public static void main(String[] args) {

        student s1 = new student(16, "saikiran kanacharana", 578, 22);
        student s2 = new student(20, "varma aaksah", 763, 21);
        student s3 = new student(21, "eswar rao", 234, 25);
        student s4 = new student(43, "ram suhas", 543, 21);
        student s5 = new student(12, "manoj naidu", 533, 26);
        student s6 = new student(87, "chandu", 873, 23);
        student s7 = new student(26, "prasad", 763, 28);

        ArrayList<student> al = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5, s6,
                s7));
        // ArrayList<student> al = new ArrayList<>();
        // al.add(s1);
        // al.add(s2);
        // al.add(s3);
        // al.add(s4);
        // al.add(s5);
        // al.add(s6);
        // al.add(s7);
        Collections.sort(al, (a, b) -> a.std_name.compareTo(b.std_name)); // java8
        // Collections.sort(al, new collectionsComparator());
        Predicate<Integer> highestMarks = age -> age > 25;
        for (student ele : al) {
            // boolean result = highestMarks.test(ele.std_mark);
            if (highestMarks.test(ele.age)) {
                System.out.println(ele);
            }
        }
        try (FileWriter fw = new FileWriter("studentList.txt")) {
            for (student ele : al) {
                fw.write(ele.std_id+","+ele.std_name+","+ele.std_mark+","+ele.age+"\n");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

}

class student implements Comparable<student> {
    int std_id;
    String std_name;
    double std_mark;
    int age;

    student(int std_id, String std_name, double std_mark, int age) {
        this.age = age;
        this.std_mark = std_mark;
        this.std_name = std_name;
        this.std_id = std_id;
    }

    @Override
    public String toString() {
        // return "student [std_id=" + std_id + ", std_name=" + std_name + ", std_mark="
        // + std_mark + ", age=" + age + "]";
        return "student [std_id=" + std_id + ", std_name=" + std_name + ", std_mark=" + std_mark + ", age=" + age + "]";

    }

    @Override
    public int compareTo(student s) {
        return this.std_id - s.std_id;
    }

}
