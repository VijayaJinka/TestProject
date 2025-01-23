package TestNG;

import org.testng.annotations.Test;




    public class SampleGrouping {

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

