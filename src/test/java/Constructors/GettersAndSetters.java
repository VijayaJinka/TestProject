package Constructors;

public class GettersAndSetters {
    import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Encapsulation --> Binding the data with the methods
//Data Hiding --> Hiding the data from the outside world

    //Setters and getters comes under the concepts of POJO (Plain old JAVA Object)
    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    class Names
    {
        private String firstName;
        private String middleName;
        private String lastName;

//    public Names(String firstName, String middleName, String lastName)
//    {
//        this.firstName=firstName;
//        this.middleName=middleName;
//        this.lastName=lastName;
//    }

//    public void setFirstName(String fName)
//    {
//        this.fName=fName;
//    }
//
//    public String getFirstName()
//    {
//        return fName;
//    }
//
//    public void setMiddleName(String mName)
//    {
//        this.mName=mName;
//    }
//
//    public String getMiddleName()
//    {
//        return mName;
//    }
//
//    public void setLastName(String lName)
//    {
//        this.lName=lName;
//    }
//
//    public String getLastName()
//    {
//        return lName;
//    }

        public void display()
        {
            System.out.println("First Name: "+firstName);
            System.out.println("Middle Name: "+middleName);
            System.out.println("Last Name: "+lastName);
        }
    }

    public class GetterAndSetters {

        public static void main(String[] args)
        {
            //CRUD Operations --> Create Read Update Delete

            //Creating the Data
            Names n1=new Names("John", "Wick", "Doe");

            n1.display(); //Read Operation

            System.out.println("**************************************************************************");

            n1.setFirstName("Johny"); //Update Operation

            n1.display(); //Read Operation

            System.out.println(n1.getLastName());

            //Delete operation
            n1=null;

            //Throws Null Pointer Exception, if we are trying to perform any operations on the null objects
            System.out.println(n1.getFirstName());
        }
    }
}
