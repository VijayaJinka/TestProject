package Interfaces;

public class ImplementSingleMethod {

    public static void main(String[] args)
    {
        //Using Anonymous Inner Class

        //Here we are writing the actual code or the implementation in an anonymous class
        FunctionalInterfacesConcept f4=new FunctionalInterfacesConcept() {
            @Override
            public void sample() {
                System.out.println("This is a sample method created in a inner class");
            }
        };

        f4.sample();

        //Using Lambda Expressions
        //Lamda Expressions helps us in making the code more concise and readable
        //Lamda Expressions works only for functional Interfaces

        //Lamda Expressions for the methods which has no arguments and no return type
        FunctionalInterfacesConcept f5=() -> System.out.println("Method Executed Using Lamda Expressions");

        f5.sample();

        f5=() -> {
            int a=40;
            int b=50;

            System.out.println((a+b));

            System.out.println("Performing the code inside the lamda expressions having multiple lines of code");
        };

        f5.sample();

        //Lamda Expressions with methods having parameters and no return type:
        FunctionalInterfaceConceptsWithParameters f6=(a,b) -> System.out.println(a*b);
        f6.product(40,20);

        //Lamda Expressions with methods having paramters and return type:
        //Return keyword is not mandatory if it is a single line of code
        FunctionalInterfaceConceptsWithParametersAndReturnType f7=(a,b) -> a+b;
        f7.sum(50,24);

        //Return keyword in a lamda expression is used when multiple lines of code are written inside the body

        f7=(a,b) -> {
            a=a*b;
            b=a/b;

            return a+b;
        };

        System.out.println(f7.sum(4,2));
    }
}

