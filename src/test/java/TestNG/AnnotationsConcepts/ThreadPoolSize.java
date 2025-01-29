package TestNG.AnnotationsConcepts;


import framework.BrowserUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

    public class ThreadPoolSize {

        //Run the test case for 10 times with 5 threads
        //Execute first 5 test cases in parallel
        @Test(invocationCount = 10, threadPoolSize = 5)
        public void testMethod() throws InterruptedException
        {
            WebDriver driver = BrowserUtil.getDriver("chrome");

            driver.get("https://www.google.com");

            Thread.sleep(2000);

            driver.quit();
        }
    }

