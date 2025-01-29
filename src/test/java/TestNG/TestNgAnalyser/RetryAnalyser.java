package TestNG.TestNgAnalyser;


    import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

    public class RetryAnalyser implements IRetryAnalyzer {

        final int maxCount=3;
        int count=0;

        @Override
        public boolean retry(ITestResult result)
        {
            if(count<maxCount)
            {
                count++;
                return true;
            }

            return false;
        }
    }

