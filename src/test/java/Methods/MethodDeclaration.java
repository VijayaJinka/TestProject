package Methods;

public class MethodDeclaration {
    //What is a Method??
    //Method is a block of code that performs a specific task

    //Only static methods and variables can be called inside another static method
    //Both static and non static methods and variables can be called inside another non static method
    public static void main(String[] args) {
        display();

        //sumOfTwoNumbers(40,30) --> Returns an integer --> we can print it by enclosing the method with sysout
        System.out.println(sumOfTwoNumbers(40,30));

        System.out.println(sumOfTwoNumbers(40.0,30));

        System.out.println(sumOfTwoNumbers(40,30,20));

        System.out.println(sumOfTwoNumbers(40.0,30.0));

        System.out.println(sumOfTwoNumbers(40,30.0));

        for(int i=0;i<5;i++)
        {
            display();
        }
    }

    private static void display()
    {
        System.out.println("Displayed from private method");
    }

    //In the same class, we cannot have two methods with the same name and same set of arguments

    //But we can have two methods having same name but different set of arguments
    //Above concept is called as method overloading

    //Different set of arguments:
    //1. Different number of paramters
    //2. Order of parameters
    //3. Different Data Types for the parameters

    //**** different return type is not considered as a part of method overloading
    //**** different access modifier is not considered as a part of method overloading

    //Why Method Overloading??
    //1. Code Reusability
    //2. Code Readability
    //3. Easy to remember the method names

    //Method Overloading comes under the PolyMorphism concept in OOPS

    static int sumOfTwoNumbers(int a, int b)
    {
        int c=a+b;

        //return keyword is used to send the desired output from the given method
        return c;
    }

    static double sumOfTwoNumbers(double a, int b)
    {
        return a+b;
    }

    static double sumOfTwoNumbers(int a, double b)
    {
        return a+b;
    }

    static double sumOfTwoNumbers(double a, double b)
    {
        return a+b;
    }

    static int sumOfTwoNumbers(int a, int b, int c)
    {
        int d=a+b+c;

        //return keyword is used to send the desired output from the given method
        return d;
    }

    //Syntax of creating a method :
    //accessModifier returnType methodName(parameters if any)

    //accessModifier --> Defines the scope/visibility of the method
    //1. public --> Method is accessible anywhere within the project
    //2. private --> Method is accessible anywhere within the class
    //3. protected ---> Method is accessible anywhere within the package and outside of the package via inheritance
    //4. default ---> Method is accessible anywhere within the package

    //returnType --> Output that we are expecting from the method
    //it can be integer, string, double, boolean, float etc..... along with void

    //void means nothing but just simply execute the lines of code present in the method

    //methodName can be any name of your choice but please follow the rules used to declare the variables






}
