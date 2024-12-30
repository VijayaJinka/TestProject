package Abstract;


    public class AccessModifiersUsingConstructors {

        public static void main(String[] args) {

            NamesClass n1=new NamesClass();

            System.out.println(n1.fName);
            System.out.println(n1.mName);
            System.out.println(n1.lName);

            //We cannot create an object for a private constructor
//        Names n2=new Names("Chris","Henry");

            NamesClass n2=new NamesClass("J","K","L");
            n2.display();
        }
    }

