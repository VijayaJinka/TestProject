package TestNG;

//import TestNG.TestListeners;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
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
}