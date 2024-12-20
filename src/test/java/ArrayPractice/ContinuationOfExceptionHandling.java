package ArrayPractice;

public class ContinuationOfExceptionHandling {
    public static void main(String[] args) {

        try
        {
           // BankingSite b1=null;
           // b1.login();

            Integer.parseInt("2021.,421125");
        }

        catch (NumberFormatException e4)
        {
//            System.out.println("Number Format Exception Occured");

            //Syntax of throwing your own exception:
            //throw new <exception class> (message you want to display)
            throw new RuntimeException("Please check the data that you are trying to convert");
        }

        catch (NullPointerException e6)
        {
            throw new RuntimeException("Do not perform any operations on the null objects");
        }

        System.out.println("Another Line of code under execution");

    }
}