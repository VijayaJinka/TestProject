package Inheritances.SubPackageAssignment;

public class SavingAccount extends Account {
    private int minimumbalance;

    public SavingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }


    public double withdraw(double amount) {
        balance = minimumbalance - amount;
        if (minimumbalance >= 0) {
            System.out.println("Insufficent balance");
        } else {

            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }

            return balance;
    }


}

