package BreakoutRoomInterfaceAssignment.Subpackage;

public class BankTransferPayments implements PaymentProcessor {
double etransfer;
int interactransfer;

public BankTransferPayments(double etransfer,int interactransfer){
    this.etransfer=etransfer;
    this.interactransfer=interactransfer;

}

    @Override
    public double processpayment() {
        return etransfer;
    }

    @Override
    public String validatepaymentdetails() {
        return "";
    }

    @Override
    public double refund() {
        return 0;
    }
}
