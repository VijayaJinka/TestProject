package november27th2024;
//In the same JAVA file, we can have multiple classes, but only one public class should be there
//Name of the file should be same as the name of the public class
//Class is nothing but an entity of methods, variables, objects, etc
//Class is a blueprint of an object
// variable- int age, string name
//Method-behaviour of the class
//objects- classname objectname= new class name
class Students{

    //inside a class,variables represents the attributes of the class
    //Methods represnts the behaviour of the class
    //syntax of object
    //
    String name;
    int age;
    String institute;
    String Course;
}
class Numbers{
    int udigit;
    int ydigit;

}

public class ObjectCreation {

    public static void main(String[] args) {
        //Syntax of creating an object:
        //ClassName objectName=new ClassName();
        //While defining the objectName, please follow the rules used to declare the variables
        //Here 'new' keyword is responsible for creating the objects
        //new Students() ---> Creating a xerox or photocopy of the class Students in the heap memory
        Students s2=new Students();
        //With the help of s2, we can access all the variables and methods of the class Students
        s2.name="Durgesh"; //All the variable values are stored in the heap memory
        s2.age=40; //All the variable values are stored in the heap memory
        s2.Course="Selenium"; //All the variable values are stored in the heap memory

    }
}
