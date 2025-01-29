package TestNG;

import org.testng.annotations.Test;

public class SampleTestCaseFiles {

    //In TESTNG, the methods are executed in the ascii order(ascending value) of test methods

    //If we want to change the order of execution at our own will, we can use the concept of priority
    //priority ranges from -n to n
    //By Default the priority for any test case is zero

    //enabled = false --> This will disable the test case execution and it will not be a part of the test suite
    //By Default it will be true for all the test cases

    //invocationCount = n --> This will execute the test case n times
    //By Default it will be 1

    //suiteName is a descriptive field, which is used to make a note that the particular test case comes under which suite

    //description is used to provide the purpose of the test case so that the new team members can understand the purpose of the test case

    //skipFailedInvocations = true --> This will skip the remaining runs of the test case if the test case fails in any of the runs
    //By Default it will be false

    //timeOut = 1000 means the test case execution should be completed within 1000 milliseconds
    //If it is not completed within 1000 milliseconds, then the test case will be marked as failed
    //By Default it will be 0

    //dependsOnMethods --> It is used to create a dependency between the test cases
    //Execution of the current test case is dependant on the execution of the previous test case
    //If the method used in dependsOnMethods does not exist, then we cannot execute the complete suite

    //Test Method --> Method associated with @Test annotation
    @Test(priority = 40,suiteName = "Regression",description = "Dummy Test Case",
            dependsOnMethods = "sampleTestTWo") //Indicates that this is a test case
    public void sampleTest() //Test Method
    {
        System.out.println("Sample Test Case Executed");
    }

    @Test(priority = 40,enabled = false,suiteName = "Sanity",description = "Dummy Test Case Two")
    public void sampleTestFour() //Test Method
    {
        System.out.println("Sample Test Case Four Executed");
    }

    @Test(priority = -2,invocationCount = 5,suiteName = "Smoke",description = "Dummy Test Case Three",
            skipFailedInvocations = true)
    public void sampleTestTWo()
    {
        System.out.println("Sample Test Case Two Executed");
       // throw new RuntimeException("Sample Test Case Two Failed");
    }

    //ThreadTimeoutException: Method january17th2025.SampleTestCaseFiles.sampleTestThree() didn't finish within the time-out 1000
    @Test(priority = 20,suiteName = "Regression",description = "Dummy Test Four",timeOut = 1000)
    public void sampleTestThree() throws InterruptedException
    {
        //Purposefully delaying the execution by 5 seconds
        Thread.sleep(5000);
        System.out.println("Sample Test Case Three Executed");
    }
}