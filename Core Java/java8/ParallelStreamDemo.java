import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student1 {
    String name;
    int marks;

    Student1(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return this.name;
    }

    public int getMarks() {
        return this.marks;
    }
}

public class ParallelStreamDemo {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Raju", 78);
        Student1 s2 = new Student1("Santhosh", 88);
        Student1 s3 = new Student1("Ramesh", 98);
        Student1 s4 = new Student1("Shyam", 76);
        Student1 s5 = new Student1("Srikar", 86);
        Student1 s6 = new Student1("Dhanush", 68);
        Student1 s7 = new Student1("Krishna", 59);

        List<Student1> students = Arrays.asList(s1, s2, s3, s4, s5, s6, s7);

        System.out.println("Sequential Stream:");
        students.stream()
                .filter(stu -> stu.getMarks() > 75)
                .collect(Collectors.toList())
                .forEach(stu -> System.out.println(stu.getName() + " " + stu.getMarks()));

        System.out.println("\nParallel Stream:");
        students.parallelStream()
                .filter(stu -> stu.getMarks() > 75)
                .collect(Collectors.toList())
                .forEach(stu -> System.out.println(stu.getName() + " " + stu.getMarks()));
    }
}