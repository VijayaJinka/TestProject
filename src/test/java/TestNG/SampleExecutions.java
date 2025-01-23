package TestNG;


    import org.testng.annotations.Test;

public class SampleExecutions {

//    @BeforeMethod
//    public void beforeMethod(ITestContext context)
//    {
//        //ITestContext is the interface which is used to access the test context
//
//        //Collecting the list of methods from the test context
//        //ITestNGMethod --> Represents a TESTNG Method
//        ITestNGMethod[] methods=context.getAllTestMethods();
//
        ////        for(ITestNGMethod i1:methods)
        ////        {
        ////            i1.setRetryAnalyzerClass(RetryAnalyser.class);
        ////            i1.setTimeOut(5000);
        ////        }
//
//        //Enabling the retry analyzer for all the methods
//        Arrays.stream(methods).forEach(m -> {
//            m.setRetryAnalyzerClass(RetryAnalyser.class);
//            m.setTimeOut(5000);
//        });
//    }

        int count=0;
        @Test(description = "Sample Analysis One",retryAnalyzer = RetryAnalyser.class
                ,priority = 5)
        public void sampleAnalysisOne()
        {
            System.out.println("Sample Analysis One");

            count++;

            if(count<2)
                throw new RuntimeException("Sample Data");
        }

        @Test(description = "Sample Analysis Two")
        public void sampleAnalysisTwo()
        {
            System.out.println("Sample Analysis Two");
            throw new RuntimeException("Sample Data");
        }
    }

