import java.util.Scanner;

public class AccountImp implements CreateAccountInterface {
    int depositPreviousAmount;

    @Override
    public void deposit(int depositAmount) {
        if (depositAmount < 0) {
            System.out.println("Invalid AMount ! Please Enter Positive Number");
        } else {
            depositPreviousAmount += depositAmount;
            System.out.println("Deposit Successful! Amount Deposited: " + depositAmount);
        }
    }

    @Override
    public int getBalance() {
        return this.depositPreviousAmount;
    }

    AccountImp(int depositPreviousAmount) {
        this.depositPreviousAmount = depositPreviousAmount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AccountImp acount1 = new AccountImp(500);
        System.out.println("Previous Amount:- " + acount1.getBalance());
        System.out.print("Please Enter Amount:- ");
        int depostiAmountNow = in.nextInt();
        acount1.deposit(depostiAmountNow);

        System.out.println("Total Amount- " + acount1.getBalance());

        in.close();
    }
}
