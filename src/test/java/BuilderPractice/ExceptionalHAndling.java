package BuilderPractice;

public class ExceptionalHAndling {
    public static void main(String[] args) {

        //Exception Handling: Handling the errors at the run time

        //Compile Time Exceptions: It occurs during the time of coding, it will throw an syntatical error stating please handle this exception for the particular method
        //Run Time Exceptions: It occurs during the execution of the code

        //Examples of Compile Time Exceptions:

        //1. InterruptedException
        //2. FileNotFoundException
        //3. IOException etc......

        //Examples of RunTime Exceptions:

        //1. NullPointer Exception
        //2. StringIndexOutOfBounds Exception
        //3. NoSuchElement Exception


        //Syntax of try-catch block:

        //try
        //{
        //Block of code which is prone to throwing an error
        //}

        //catch(Exact Exception to be handled)
        //{
        //      //Block of code written to handle the error
        //}

        //For a single try block we can have multiple catch blocks

//        try
//        {
//            System.out.println(Integer.parseInt("59325.232")); //.parseInt --> Convert a string to an integer
//        }
//
//        catch (NumberFormatException e6)
//        {
//            System.out.println("Number Format Error Occured, Please check");
//        }

        try
        {
            //Nested Try Catch Block
            try {
                System.out.println("Hello".charAt(5000));
            }

            catch (StringIndexOutOfBoundsException r6)
            {
                System.out.println("String Index Out Of Bounds Occured");
            }

            //When we divide any decimal number by zero it will print infinity
            //When we divide any integer by zero it throws an Error called as Arithmetic Exception
            System.out.println(10.5/0);
            BankingSite s1=null;
            s1.login();

            System.out.println(40/0); //Error is occured at this line, it will not execute the subsequent code after this line

            System.out.println("This is my first Program");
        }

        catch (ArithmeticException e10)
        {
            System.out.println("Arithmetic Exception occured, when we divide a number by zero");
        }

        catch (NullPointerException e7)
        {
            System.out.println("Null Pointer Exception Occured, please be careful while performing any operations on the null objects");
        }

        catch (StringIndexOutOfBoundsException e2)
        {
            System.out.println("Please check the length of the string, before we perform any sort of operations");
        }

        //Exception is the parent class of all different kinds of exceptions
        catch (Exception e6)
        {
            e6.printStackTrace(); //Prints the exact reason of why the code has failed, and continues the execution further
        }

        System.out.println("Executing another line of code");
    }

}
