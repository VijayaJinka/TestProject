package switchstatements;

public class TernaryOperators {
    public static void main(String[] args) {

        //Ternary Operator:
        //Short hand form of if else condition
        //We cannot use any System.out.println concept in ternary operator

        int a=40;

        if(a%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }

        //Syntax :
        //(condition)?(true block):(false block)
        //If the condition is true, then the true block will be executed
        //If the condition is false, then the false block will be executed

        String result=(a%2==0)?"Even Number":"Odd Number";

        System.out.println(result);

        //Ternary Operator is used in a situation where we have only one condition to validate

        a=40;
        int b=50;

        System.out.println((a>b)?"a is greater than b" : "a is less than b");

        b=100;
        int c=200;

        //Nested Ternary Operator
        int d=((b-c)<(c-b)) ? ((a>b) ? a : b) : b-c;
        System.out.println(d);

        //Use Cases of Ternary Operator:
        //1. Shortens the lines of code for single if else statement
        //2. Used in the return statement of a method
        //3. Used in the initialization of variables
        //4. Used in the lambda expressions

        a=40;
        b=30;

        System.out.println((a>b) ? sumOfNumbers(a,b) : productOfNumbers(a,b));

        //We cannot use any void methods during the ternary operator executions
//        (a>b)? display():productOfNumbers(40,20);
    }

    public static void display()
    {
        System.out.println("Hello World");
    }

    public static int sumOfNumbers(int a, int b)
    {
        return a*b;
    }

    public static int productOfNumbers(int a, int b)
    {
        return a+b;
    }


}

