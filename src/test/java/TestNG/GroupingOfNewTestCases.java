package TestNG;

import org.testng.annotations.Test;


    //@Ignore
    @Test(invocationCount = 2) //Run Each and Every Test Case Two Times
    public class GroupingOfNewTestCases {

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

