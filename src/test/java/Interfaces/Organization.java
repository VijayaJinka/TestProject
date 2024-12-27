package Interfaces;

import BuilderPractice.BankingSite;

public class Organization {

        private String Fulltime;
        private String parttime;
        private int contract;

        public void calculatesalary()
        {
            System.out.println("This is a default constructor");
            //Activities before launching the app
            //setup code which is only private to this class
            password="Password123";
        }

        public void getbenfits(String userName)
        {
            //Only one explicit constructor can be called here
            this(); //Refer to the Default Constructor present in the class
//        this(90214821);
            this.userName=userName;
        }


        }

    }
