import java.util.Scanner;

public class StudentCourseJavaPython {
    int admin_no;
    String student_name;
    int fee_paid;
    String course_joined;

    StudentCourseJavaPython(int admin_no, String student_name, int fee_paid, String course_joined) {
        this.admin_no = admin_no;
        this.student_name = student_name;
        this.fee_paid = fee_paid;
        this.course_joined = course_joined;

    }

    public int getToalFee() {
        if (this.course_joined.toLowerCase().equals("java")) {
            return 10000;
        } else if (this.course_joined.toLowerCase().equals("python")) {
            return 7500;
        } else {

            return -1;
        }
    }

    public int getDue() {
        int pendingAmount = this.getToalFee() - this.fee_paid;
        return pendingAmount;
    }

    public int getFeePaid() {
        int feepaid = this.fee_paid;
        return feepaid;
    }

   public  void displayTheMessage(){
    System.out.println();
    System.out.println("Thank you for choosing " + this.course_joined + " course !!!");

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter The Admin No: ");
        int adminNo = in.nextInt();

        System.out.print("Please Enter The Student Name:- ");
        String studentname = in.next();

        System.out.println("Course fee:- java - 10000 & python- 7500");
        System.out.print("Please Select The Course 'java' or 'Python' :- ");
        String courseSelection = in.next();

        System.out.print("Enter The Amout:- ");
        int amount = in.nextInt();
        StudentCourseJavaPython student1 = new StudentCourseJavaPython(adminNo, studentname, amount, courseSelection);
        System.out.println(adminNo + " " + studentname + " " + amount);
        System.out.println("get total Fee :- " + student1.getToalFee());

        System.out.println("get Fee paid:- " + student1.getFeePaid());

        System.out.println("get Fee due:- " + student1.getDue());
        student1.displayTheMessage();

        in.close();
    }

}
