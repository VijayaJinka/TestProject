package Abstract;


    public class NamesClass {


        String fName;
        String mName;
        String lName;

        //Here we are using default access modifier
        NamesClass() {
            System.out.println("Default Constructor Executed");
            fName = "Harris";
            mName = "K";
            lName = "Kamala";
        }

        protected NamesClass(String fName, String mName, String lName1, String lName2)
        {
            this.fName = fName;
            this.mName = mName;
            this.lName = lName1+"-"+lName2;
        }

        private NamesClass(String fName, String mName) {
            this.fName = fName;
            this.mName = mName;
            this.lName = "";
        }

        public NamesClass(String fName, String mName, String lName) {
            this.fName = fName;
            this.mName = mName;
            this.lName = lName;
        }

        public void display() {
            System.out.println("First Name is: " + fName);
            System.out.println("Middle Name is: " + mName);
            System.out.println("Last Name is: " + lName);
        }
    }

