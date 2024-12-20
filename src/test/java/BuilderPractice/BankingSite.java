package BuilderPractice;

public class BankingSite {
    private String userName;
    private String password;
    private int userID;

    private BankingSite()
    {
        System.out.println("This is a default constructor");
        //Activities before launching the app
        //setup code which is only private to this class
        password="Password123";
    }

    public BankingSite(String userName)
    {
        //Only one explicit constructor can be called here
        this(); //Refer to the Default Constructor present in the class
//        this(90214821);
        this.userName=userName;
    }

    public BankingSite(int userID)
    {
        this.userID=userID;
    }

    public BankingSite login()
    {
        System.out.println("Logged into the banking app successfully");
        System.out.println("User Name is: "+userName);
        System.out.println("Password is: "+password);

        //Anonymous Object --> Object is created in the heap but there is no reference to store the object
//        return new BankingSite();

        //this keyword will help us in referring to the current object that we are working on
        return this;
    }

    public BankingSite navigateToBalancesTab()
    {
        System.out.println("Navigated through balance tab");
        return this;
    }

    public BankingSite viewCredits()
    {
        System.out.println("View the Credit Details");
        return this;
    }

    public BankingSite viewDebits()
    {
        System.out.println("View the Debit Details");
        return this;
    }

    public BankingSite viewCurrentBalanceAsOfDate()
    {
        System.out.println("View the Current Balances");
        return this;
    }

    public BankingSite generateStatements()
    {
        System.out.println("Generated the Bank Statement");
        return this;
    }

    public BankingSite logOut()
    {
        System.out.println("Logged out of the application");
        return this;
    }


}
