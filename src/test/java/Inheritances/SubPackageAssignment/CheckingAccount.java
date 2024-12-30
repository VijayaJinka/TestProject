package Inheritances.SubPackageAssignment;

public class CheckingAccount extends Account {
    private double withdrawalfee;

    public CheckingAccount(int accountnumber, double balance) {
        super(accountnumber, balance);

        public void withdraw(double amount) {
            double totalAmount = amount + withdraw;
            if (totalAmount > balance) {
                System.out.println("Insufficient balance for withdrawal and fees!");
            } else {
                balance -= totalAmount;
                System.out.println("Withdrawal successful. Fee applied: " + withdrawalFee +
                        ". Remaining balance: " + balance);
            }
        }

    }
}
