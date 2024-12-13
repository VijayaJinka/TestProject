package Methods;



    public class AccessModifiers {

        public static void main(String[] args) {

            //Below line will throw an error because we are calling a private method
            //that is present in another class which cannot be accessed
//        MethodDeclarations.display();

            //Below line does not throw an error because we are calling a default method
            //from another class that is present in the same package
           //MethodDeclarations.sumOfTwoNumbers(40,1024);

        }
    }

