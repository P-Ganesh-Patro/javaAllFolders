class insuffecientBalance extends Exception {
    insuffecientBalance(double balance, double withdrawal) {
        super("Insuffecient Balance of " + balance + " for withdrawal " + withdrawal);
    }
}

public class CustomExceptionBalance {
    private double balance;

    public CustomExceptionBalance(double balance) {
        this.balance = balance;
    }

    public static void withdrawalAmount(double balance, double withdrawal) throws insuffecientBalance {
            if (withdrawal > balance) {
                throw new insuffecientBalance(balance, withdrawal);
            }
            balance -= withdrawal;
            System.out.println("Withdrawal successful! Remaining balance: " + balance);
        }
    
        public static void main(String[] args) {
            CustomExceptionBalance c1 = new CustomExceptionBalance(1000);
            try {
                withdrawalAmount(c1.balance, 100.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
