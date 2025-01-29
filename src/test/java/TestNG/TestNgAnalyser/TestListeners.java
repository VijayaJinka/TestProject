package TestNG.TestNgAnalyser;


    import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

    //Listeners is something that listens to the test execution and performs some actions based on the test execution
    public class TestListeners implements ITestListener {
        @Override
        public void onTestSuccess(ITestResult result) {
            System.out.println("Test Case Passed and Details are: "+result.getName());
        }

        @Override
        public void onTestFailure(ITestResult result) {
            System.out.println("Test Case Failed and Details are: "+result.getName());
        }

        @Override
        public void onTestSkipped(ITestResult result) {
            System.out.println("Test Case Skipped and Details are: "+result.getName());
        }

        @Override
        public void onTestFailedWithTimeout(ITestResult result) {
            System.out.println("Test Case Failed with Timeout and Details are: "+result.getName());
        }

        @Override
        public void onStart(ITestContext context) {
            System.out.println("Test Execution Started and Details are: "+context.getName());
        }

        @Override
        public void onFinish(ITestContext context) {
            System.out.println("Test Execution Finished and Details are: "+context.getName());
        }
    }

