package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    int id;
    String name;
    char grade;

    public Student(int id, String name, char grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
    }

}

public class FlatMapObject {
    public static void main(String[] args) {
        Student s1 = new Student(16, "saikiran", 'C');
        Student s2 = new Student(15, "rajesh bolem", 'B');
        Student s3 = new Student(20, "chandu", 'D');
        Student s4 = new Student(32, "mohan krishna", 'A');
        Student s5 = new Student(27, "balaraju", 'C');
        Student s6 = new Student(33, "divish", 'E');

        List<Student> studetList1 = new ArrayList<Student>();
        studetList1.add(s3);
        studetList1.add(s2);
        studetList1.add(s1);

        List<Student> studetList2 = new ArrayList<Student>();
        studetList2.add(s4);
        studetList2.add(s5);
        studetList2.add(s6);

        List<List<Student>> studentList = new ArrayList<>();
        studentList.add(studetList2);
        studentList.add(studetList1);

        List<String> studList = new ArrayList<>();

        studList = studentList.stream().flatMap(stu -> stu.stream().map(n->n.name)).collect(Collectors.toList());

        System.out.println(studList + "\n");

    }

}
