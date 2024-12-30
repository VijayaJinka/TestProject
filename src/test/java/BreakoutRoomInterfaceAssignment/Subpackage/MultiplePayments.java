package BreakoutRoomInterfaceAssignment.Subpackage;

public class MultiplePayments {
    public static void main(String[] args) {
        CreditCardPayment ccpayments= new CreditCardPayment(3000,2);
        PayPalPayments pppayments= new PayPalPayments(389,1);
        BankTransferPayments btpayments= new BankTransferPayments(500,20);

        System.out.println("CreditCardPayment: $" + ccpayments.monthlybills);
        System.out.println("CreditCardPayment: $" + ccpayments.statements);
        System.out.println("PayPalPayment: $" + pppayments.paypalbills);
        System.out.println("PayPalPayment: $" + pppayments.paypalstatements);
        System.out.println("BankTransferPayment: $" + btpayments.etransfer);
        System.out.println("BankTransferPayment: $" + btpayments.interactransfer);
    }
}
