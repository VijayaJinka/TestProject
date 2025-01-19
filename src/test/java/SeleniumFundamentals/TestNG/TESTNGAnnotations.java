package SeleniumFundamentals.TestNG;
import org.testng.annotations.*;

public class TESTNGAnnotations {

    //There are total 9 annotations in TESTNG:
    //1. @BeforeSuite --> before the start of any suite like smoke or regression what are the set of operations that we need to perform
    //Ex: Setup of framework, setup of reports, setup of database connection

    //2. @AfterSuite --> After the completion of test cases in the current suite, what are the set of operations that we need to perform
    //Ex: closing the database connection, Generation of reports, Sharing the reports with the team via mail or shared folders

    //3. @BeforeTest --> Discussed later
    //4. @AfterTest --> Discussed later

    //5. @BeforeClass --> Before executing the test cases in the current class, what are the set of operations that we need to perform
    //Ex: Launching the browser, Navigating to the application URL, Creation of objects related to this class

    //6. @AfterClass --> After executing the test cases in the current class, what are the set of operations that we need to perform
    //Ex: Closing the browser, Destroying the objects related to this class, Generating module wise report

    //7. @BeforeMethod --> Gets Executed before each and every test method
    //Ex: Login to the application, Setting up the test data

    //8. @AfterMethod --> Gets executed after each and every test method
    //Ex: Logout from the application, Cleaning up the test data

    //9. @Test --> This is where we write the actual test case logic
    //Ex: Clicking on a button, Entering the data in a text box, Verifying the data in the database

    //10. @BeforeGroups --> Discussed later
    //11. @AfterGroups --> Discussed later

    //Hierarchy of Execution:
    //BeforeSuite --> BeforeTest --> BeforeClass --> BeforeMethod --> Test --> AfterMethod --> AfterClass --> AfterTest --> AfterSuite

    //If there are more than one test cases in the class, then the hierarchy of execution will be as follows:
    //BeforeSuite --> BeforeTest --> BeforeClass --> BeforeMethod --> Test1 --> AfterMethod --> BeforeMethod --> Test2 --> AfterMethod --> AfterClass --> AfterTest --> AfterSuite

    @BeforeSuite
    public void beforeSuiteExecution() {
        System.out.println("Before Suite Execution");
    }

    @AfterSuite
    public void afterSuiteExecution() {
        System.out.println("After Suite Execution");
    }

    @BeforeClass
    public void beforeClassExecution() {
        System.out.println("Before class execution");
    }

    @AfterClass
    public void afterClassExecution() {
        System.out.println("After class execution");
    }

    @BeforeMethod
    public void beforeMethodExecution() {
        System.out.println("Before method execution");
    }

    @AfterMethod
    public void afterMethodExecution() {
        System.out.println("After method execution");
    }

    @Test
    public void testMethodOne() {
        System.out.println("Test Method One");
    }

    @Test
    public void testMethodTwo() {
        System.out.println("Test Method Two");
    }

}