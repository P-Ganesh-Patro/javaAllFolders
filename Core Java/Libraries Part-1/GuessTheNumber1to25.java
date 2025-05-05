import java.util.Scanner;

public class GuessTheNumber1to25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 25) + 1;
        int count = 0;
        while (count < 3) {
            System.out.print("Please Enter The Guessing Number:- ");
            int chooseNumber = in.nextInt();
            if (chooseNumber < randomNumber) {
                System.out.println("To Low ! Try Again...");
                count++;

            } else if (chooseNumber > randomNumber) {
                System.out.println("To High ! Try Again...");
                count++;

            } else if (chooseNumber == randomNumber) {
                count++;
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("It took you " + count + " attempts.");
                break;
            }
        }

        if (count == 3) {
            System.out.println("Oops! That's not the correct number. Try again!");
        }
        in.close();
    }
}
