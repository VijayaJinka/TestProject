package BreakoutRoomInterfaceAssignment.Subpackage;

public class CreditCardPayment implements PaymentProcessor {

    public double monthlybills;
    public double statements;


    public CreditCardPayment(double monthlybills,double statements){
        this.monthlybills=monthlybills;
        this.statements=statements;

    }

    @Override
    public double processpayment() {
        return monthlybills;
    }

    @Override
    public String validatepaymentdetails() {
        return "";
    }

    @Override
    public double refund() {
        return statements;
    }
}
