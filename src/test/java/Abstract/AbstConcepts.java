package Abstract;

public abstract class AbstConcepts {
    //Abstract Class:
//1. We will have the methods but not the logic of it
//2. We cannot create an object of the class but we can use this class as part of the inheritnace
//3. It is a mix of concrete and abstract methods
//4. Abstractions varies from 0% to 100%
//5. Abstract keyword is used to recognize the abstract class and abstract methods
//6. Since abstract classes can be accessed by inheritance, we can implment or write the logic in the particular sub classes



        //The moment we declare our default constructor as private, we cannot create an object for the class
        //Neither we can use this class as part of inheritance
//    private AbstractClasses()
//    {
//        System.out.println("This is a private constructor");
//    }

        //We cannot have abstract constructors
//    abstract AbstractClasses()
//    {
//
//    }

        //Abstract variables are not allowed
        //abstract int o=10;

        //Inside an abstract class, there is no mandatory for us to put abstract methods

        //If a method is abstract and we are trying to write the logic for the abstract method, then it will throw an error
        abstract void display();
        abstract int sum(int a, int b);

        private void display1()
        {
            System.out.println("This is a concrete method");
        }


    }

