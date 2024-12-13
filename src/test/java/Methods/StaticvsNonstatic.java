package Methods;


class Cars
{
    String carName;
    String model;
    double price;
    static int noOfWheels;

    public void display()
    {
        System.out.println("Car Name: "+carName);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
        System.out.println("No of Wheels: "+noOfWheels);
    }

}

//All the static methods and variables are linked to a class
//All the non-static methods and variables are linked to an object(heap memory)
public class StaticvsNonstatic {

    //Why main is static ????
    //main is static because the JVM will call the main method without creating the object of the class
    public static void main(String[] args) {

        Cars c1=new Cars();
        c1.carName="BMW";
        c1.model="X1";
        c1.price=5000000;

        //If we want to refer to a static variable or static method in the class
        //We can refer it with the help of class name
        //ClassName.staticVariableName --> For static variables
        //ClassName.methodName() --> For static methods
        Cars.noOfWheels=4;

        c1.display();

        System.out.println("****************************************************");

        Cars c2=new Cars();
        c2.carName="Audi";
        c2.model="Q7";
        c2.price=7000000;

        c2.display();
    }
}