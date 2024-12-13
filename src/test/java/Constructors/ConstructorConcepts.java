package Constructors;

//public class ConstructorConcepts {
    //Default value for a string or any non primitive data type is null
//Default value for a double/float is 0.0
//Default value for a boolean is false
//Default value for an integer/short/byte/long is 0
//Default value for a char is empty space

//What is an constructor?
//1. Constructor is a special type of method that is used to initialize the object
//2. Constructor will have the same name as the class name
//3. Constructor does not have any return type
//4. Constructor will be called automatically when the object is created

//In the same class, we can have only one default constructor, but multiple parameterized constructors

    class Cars {

        //Variables declared at a class level are called as instance variables

        private String name;
        private double price;
        private String model;

        //Syntax of a default constructor:
        //accessModifier ClassName()
//    {
//      //Code
//    }

        public Cars()
        {
            System.out.println("Default Constructor is called");
            name="BMW";
            price=5000000;
            model="X1";
        }

        //We can overload the above constructor
        //Parameterized constructor: Constructor with parameters

        //Syntax of a parameterized constructor:
        //accessModifier ClassName(parameters if any)
//    {
//      Code
//    }


        public Cars(String name, double price, String model)
        {
            //variables declared within the method are called as local variables
            System.out.println("This is a parameterized constructor");

            //this keyword is used refer to the current instance, current variable or current method etc....
            //this keyword is used to differentiate between the instance variables and local variables
            this.name=name;
            this.price=price;
            this.model=model;
        }

        public Cars(String carName, double carPrice)
        {
            System.out.println("This is a parameterized constructor");
            name=carName;
            price=carPrice;
            model="";
        }

        public void displayCarDetails()
        {
            System.out.println("Name is: "+name);
            System.out.println("Price is: "+price);
            System.out.println("Model is: "+model);
        }
    }

    public class ConstructorConcepts {

        public static void main(String[] args) {

            //If there is no default constructor and only parameterized constructor is there, then we have to pass the arguments during object creation
            Cars c1=new Cars();

            c1.displayCarDetails();

            System.out.println("************************************************************************");

            //During the object creation only we can trigger the parameterized constructor
            Cars c2=new Cars("Benz",32953825,"Class - C");

            c2.displayCarDetails();

            System.out.println("************************************************************************");

            Cars c3=new Cars("Suzuki",82419774);

            c3.displayCarDetails();

            System.out.println("************************************************************************");
        }
    }

