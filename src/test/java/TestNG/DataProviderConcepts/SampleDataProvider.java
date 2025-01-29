package TestNG.DataProviderConcepts;

//import TestNG.TestNgAnalyser.TestListeners;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//@Listeners is used to specify what kind of classes are listening to the test execution
//@Listeners(TestListeners.class)
public class SampleDataProvider {

    public int add(int a, int b)
    {
        return a+b;
    }

    //Data Provider --> Provides different types of test data to the test cases

    @DataProvider(name = "getSumOfData")
    public Integer[][] getNumbers()
    {
        Integer [][] numbers= {
                {10,20,30},
                {30,40,70},
                {50,60,110},
                {70,80,150},
                {90,100,190},
                {110,120,230},
                {130,140,250},
                {150,160,210},
                {170,180,150},
                {190,200,290}
        };

        return numbers;
    }

    @Test(dataProvider = "getSumOfData")
    public void validateSumOfNumbers(int a, int b, int expectedSum)
    {
        int c=add(a,b);

        //In an ideal world, it is always recommended to use one assert statement in a test case

        //Assert Library --> It is mainly used to validate the actual result with the expected result
        //It is mainly used during the build verification testing and validate the business rules
        Assert.assertEquals(c,expectedSum);
//        if(c==expectedSum)
//        {
//            System.out.println("Test Case Passed");
//        }
//        else
//        {
//            System.out.println("Test Case Failed");
//        }

//        int c=add(40,50);
//
//        if (c==90)
//        {
//            System.out.println("Test Case Passed");
//        }
//        else
//        {
//            System.out.println("Test Case Failed");
//        }
//
//        c=add(400,50);
//
//        if (c==450)
//        {
//            System.out.println("Test Case Passed");
//        }
//        else
//        {
//            System.out.println("Test Case Failed");
//        }
    }

    public static class SampleGrouping {

        //groups = {"smoke","regression"} - Test case belongs to both smoke and regression group
        //groups = {"smoke"} - Test case belongs to smoke group
        //groups = {"regression"} - Test case belongs to regression group

        @Test(description = "Sample Test Case One",priority = -40,suiteName = "regression",groups = {"regression"})
        public void sampleTestCase()
        {
            System.out.println("Sample Test case One");
        }

        @Test(description = "Sample Test Case Two",priority = -30,suiteName = "regression",groups = {"regression"})
        public void sampleTestCaseTwo()
        {
            System.out.println("Sample Test case Two");
        }

        @Test(description = "Sample Test Case Three",priority = -20,suiteName = "smoke",groups = {"smoke"})
        public void sampleTestCaseThree()
        {
            System.out.println("Sample Test case Three");
        }

        @Test(description = "Sample Test Case Four",priority = -10,suiteName = "smoke",groups = {"smoke"})
        public void sampleTestCaseFour()
        {
            System.out.println("Sample Test case Four");
        }
    }

    //@Ignore
    @Test(invocationCount = 2) //Run Each and Every Test Case Two Times
    public static class GroupingOfNewTestCases {

        @Test(groups = {"smoke"})
        public void newTestCaseOne()
        {
            System.out.println("New Test Case One");
        }

        @Test(groups = {"regression"})
        public void newTestCaseTwo()
        {
            System.out.println("New Test Case Two");
        }

        @Test(groups = {"sanity"})
        public void newTestCaseThree()
        {
            System.out.println("New Test Case Three");
        }

        @Test(groups = {"smoke"})
        public void newTestCaseFour()
        {
            System.out.println("New Test Case Four");
        }

        @Test(groups = {"regression"})
        public void newTestCaseFive()
        {
            System.out.println("New Test Case Five");
        }

        //    @Ignore //This test case will be ignored from the execution
        @Test(groups = {"sanity"})
        public void newTestCaseSix()
        {
            System.out.println("New Test Case Six");
        }
    }
}