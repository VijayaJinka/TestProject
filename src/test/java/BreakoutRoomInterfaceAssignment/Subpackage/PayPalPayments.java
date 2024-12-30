package BreakoutRoomInterfaceAssignment.Subpackage;

public class PayPalPayments implements PaymentProcessor {
    double paypalbills;
    double paypalstatements;
    public PayPalPayments(double paypalbills,double paypalstatements){
        this.paypalbills=paypalbills;
        this.paypalstatements=paypalstatements;

    }

    @Override
    public double processpayment() {
        return paypalbills;
    }

    @Override
    public String validatepaymentdetails() {
        return "";
    }

    @Override
    public double refund() {
        return paypalstatements;
    }
}
