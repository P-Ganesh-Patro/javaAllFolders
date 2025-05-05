package streams;

import java.util.ArrayList;

public class ParallelStreams {
    public static void main(String[] args) {
        Student s1 = new Student("saikiran", 20);
        Student s2 = new Student("varma", 23);
        Student s3 = new Student("prasad", 32);
        Student s4 = new Student("ganesh", 21);
        Student s5 = new Student("naidu", 19);
        ArrayList<Student> studentDeatils = new ArrayList<>();
        studentDeatils.add(s5);
        studentDeatils.add(s4);
        studentDeatils.add(s3);
        studentDeatils.add(s2);
        studentDeatils.add(s1);
        System.out.println(studentDeatils.size());
        // normal streams(sequntional opertion)
        studentDeatils.stream().filter(student -> student.getScore() >= 20).limit(3)
                .forEach(n -> System.out.println(n.getName() + " " + n.getScore()));

        // parallel stream
        studentDeatils.parallelStream().filter(stu -> stu.getScore() >= 20).limit(3)
                .forEach(n -> System.out.println(n.getName()));

        // convert normal stream to parallel stream
        // parallel-Method
        studentDeatils.stream().parallel().filter(student -> student.getScore() >= 20).limit(3)
                .forEach(n -> System.out.println(n.getName() + " " + n.getScore()));

    }

}

class Student {
    private String name;
    private int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
