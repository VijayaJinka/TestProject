package Methods;

//public class ContinuationOfObjects {

//In the same JAVA file, we can have multiple classes, but only one public class should be there

//Name of the file should be same as the name of the public class

    //Class is nothing but an entity of methods, variables, objects, etc
//Class is a blueprint of an object
    class Students {

        //Inside a class, variables represents the attributes of the class
        //Methods represents the behavior of the class

        String name;
        int age;
        String courseName;
        static String instituteName; //The moment a variable is made static , it is not part of the object(heap), it is part of the class

        public void display()
        {
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Course Name: "+courseName);
            System.out.println("Institute Name: "+instituteName);
        }

    }

    class Numbers {

        int udigit;
        int tdigit;
        int hdigit;
    }

    public class ContinuationOfObjects {

        public static void main(String[] args) {

            //Syntax of creating an object:
            //ClassName objectName=new ClassName();

            //While defining the objectName, please follow the rules used to declare the variables

            //Here 'new' keyword is responsible for creating the objects
            //new Students() ---> Creating a xerox or photocopy of the class Students in the heap memory
            //Even during object creation, none of the static variables/methods are created in the heap memory
            Students s2=new Students();

            //With the help of s2, we can access all the variables and methods of the class Students
            s2.name="Durgesh"; //All the variable values are stored in the heap memory
            s2.age=40; //All the variable values are stored in the heap memory
            s2.courseName="Selenium"; //All the variable values are stored in the heap memory
            Students.instituteName="ABC";

            s2.display();

            System.out.println("**************************************************************************");

            Students s3=new Students();
            s3.name="Sudhakar";
            s3.age=30;
            s3.courseName="Java";
            s3.instituteName="XYZ";

            s3.display();

            System.out.println("**************************************************************************");

            s2.display();

            System.out.println("**************************************************************************");

            //Checks if both the objects are same or not
            //Returns true if the above condition is satisfied else it returns false
            System.out.println(s2==s3);

            s2=s3; //Object Reassignment

            s2.display();

            System.out.println("*****************************************************************************************");

            System.out.println(s2==s3); //true because both of them are pointing to the same object

        }
    }
