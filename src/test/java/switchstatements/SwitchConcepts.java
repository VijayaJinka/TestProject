package switchstatements;

public class SwitchConcepts {
    public static void main(String[] args) {

        //Widely when there are more than 4 to 5 conditions to be validated:

        //Switch is very good in terms of performance when compared to if-else

        //Switch is a control statement that is used to select one of the many blocks of code to be executed

        //if - else condition will check for all the conditions until it finds the correct condition
        //switch case will directly jump to the correct condition
        int a=40;

        if(a%4==3)
            System.out.println("Remainder is 3");
        else if(a%4==2)
            System.out.println("Remainder is 2");
        else if(a%4==1)
            System.out.println("Remainder is 1");
        else
            System.out.println("Remainder is 0");

        //Syntax:
        //switch(expression)
//        {
//          case value1: //Code
        //break;

//          case value2: //Code
        //break;

//          case value3: //Code
        //break;

//          default: //Code
//        }

        //We need to remember that default is like else block in if-else condition

        System.out.println("Switch Case");
        switch ((a-1)%4)
        {
            case 3:
                System.out.println("Remainder is 3");
                break;
            case 2:
                System.out.println("Remainder is 2");
                break;
            case 1:
                System.out.println("Remainder is 1");
                break;
            default:
                System.out.println("Remainder is 0");
        }

        //break keyword is used to come out of the switch case block
        //If the break keyword is not used, then it will execute all the subsequent cases until it finds the break keyword,
        //irrespective of the condition is matching or not

        //From JDK 10, we can use the latest version of switch case

        //Syntax:
        //switch(expression)
//        {
//          case value1 -> //Code
//          case value2 -> //Code
//          case value3 -> //Code
//          default -> //Code
//        }

        //In the latest version of switch case, we need not use any break statement
        //Automatically it will come out of the switch case block
        System.out.println("Switch Case from JDK 10");
        switch ((a-1)%4)
        {
            // -> is called as the lambda operator
            case 3 -> System.out.println("Remainder is 3");
            case 2 -> System.out.println("Remainder is 2");
            case 1 -> System.out.println("Remainder is 1");
            default -> System.out.println("Remainder is 0");
        }

        displayArithmeticOperations(10, 20, "FACTORIAL");
        displayArithmeticOperations(50,424, "LOGARITHM");

        displayArithmeticOperations(10.0, 20.0, "FACTORIAL");
        displayArithmeticOperations(21,52.32, "LOGARITHM");

        displayArithmeticOperations(412, 20, "SUM");

        //Can u write a program to print the length of the string without using .length() function??

        String s4="Hello World";

        //.lastIndexOf("") will give the length of the string
        System.out.println(s4.lastIndexOf(""));

//        int counter=0;
//        while(true) {
//            s4.substring(counter,counter+1);
//            counter++;
//            System.out.println(counter);
//        }

    }

    public static void displayArithmeticOperations(int a, int b, String operation)
    {
        switch (operation.toUpperCase())
        {
            case "ADDITION",
                 "SUM",
                 "ADD" -> {
                System.out.println("Addition of two numbers: "+(a+b));
            }

            case "SUBTRACTION",
                 "DIFFERENCE",
                 "SUBRACT"-> {
                System.out.println("Subtraction of two numbers: "+(a-b));
            }

            case "MULTIPLICATION",
                 "PRODUCT",
                 "MULTIPLY"-> {
                System.out.println("Multiplication of two numbers: "+(a*b));
            }

            case "DIVISION",
                 "QUOTIENT"-> {
                System.out.println("Division of two numbers: "+(a/b));
            }

            case "MODULUS",
                 "REMAINDER"-> {
                System.out.println("Modulus of two numbers: "+(a%b));
            }

            case "FACTORIAL" -> {

                int product=1;
                for(int d=1;d<=Math.min(a,b);d+=1)
                {
                    product*=d;
                }

                System.out.println("Factorial of a number: "+product);

            }

            case "LOGARITHM" -> {
                System.out.println("Logarithm of b to the base 10 is: "+Math.log(Math.max(a,b)));
            }

            case "POWER","EXPONENT" -> {
                System.out.println("Power of a to b is: "+Math.pow(a,b));
            }

            default -> {
                System.out.println("Invalid Operation");
            }
        }
    }

    public static void displayArithmeticOperations(double a, double b, String operation)
    {
        switch (operation.toUpperCase())
        {
            case "ADDITION" -> {
                System.out.println("Addition of two numbers: "+(a+b));
            }

            case "SUBTRACTION" -> {
                System.out.println("Subtraction of two numbers: "+(a-b));
            }

            case "MULTIPLICATION" -> {
                System.out.println("Multiplication of two numbers: "+(a*b));
            }

            case "DIVISION" -> {
                System.out.println("Division of two numbers: "+(a/b));
            }

            case "MODULUS" -> {
                System.out.println("Modulus of two numbers: "+(a%b));
            }

            case "FACTORIAL" -> {

                int product=1;
                for(int d=1;d<=Math.min(a,b);d+=1)
                {
                    product*=d;
                }

                System.out.println("Factorial of a number: "+product);

            }

            case "LOGARITHM" -> {
                System.out.println("Logarithm of b to the base 10 is: "+Math.log(Math.max(a,b)));
            }

            case "POWER" -> {
                System.out.println("Power of a to b is: "+Math.pow(a,b));
            }

            default -> {
                System.out.println("Invalid Operation");
            }
        }
    }
}

