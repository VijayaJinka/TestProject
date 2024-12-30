package Inheritances.SubPackageAssignment;

public class Account {
    public int accountNumber;
    public double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double withdraw(double amount) {
        balance = balance - amount;
        if(balance >= 0){
            return amount;
        }
        return 0;
    }

}
