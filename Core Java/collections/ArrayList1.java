import java.util.List;

import java.util.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>(1000);
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(1, 15);
        arrayList.set(2, 22);
        // arrayList.remove(1);
        // arrayList.remove(Integer.valueOf(15));
        // System.out.println(arrayList.size());
        // Collections.sort(arrayList);
        // arrayList.sort(new StringLengthCompare());
        // System.out.println(arrayList);
        // Convert to arrayList to array
        // Object[] arr = arrayList.toArray(); //
        // Integer[] array = arrayList.toArray(new Integer[2]);
        // List<String> listString = Arrays.asList("ganesh", "saikiran", "harish");
        // listString.sort(new StringLengthCompare());
        // System.out.println(listString);

        List<Student> students = new ArrayList<>();
        students.add(new Student(32, "Ganesh"));
        students.add(new Student(42, "chandu"));
        students.add(new Student(52, "Harish"));
        students.add(new Student(28, "john"));
        students.add(new Student(28, "eswar"));

        // Comparator<Student> comparator = Comparator.comparing(Student::getGpa);
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed()
                .thenComparing(Student::getName);

        // students.sort( comparator);
        Collections.sort(students, comparator);
        // System.out.println(students);
        for (Student ele : students) {
            System.out.println(ele.getGpa() + " " + ele.getName());
        }
    }

    static class StringLengthCompare implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length());
        }
    }
}

class Student {
    int gpa;
    String name;

    public Student(int gpa, String name) {
        this.gpa = gpa;
        this.name = name;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [gpa=" + gpa + ", name=" + name + "]";
    }

}