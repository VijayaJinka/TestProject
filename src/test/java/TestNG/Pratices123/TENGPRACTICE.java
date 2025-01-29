package TestNG.Pratices123;

import jdk.jfr.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNG.Pratices123.Listeners.class)
public class TENGPRACTICE {
    @Test(priority = 1,invocationCount = 3)
    public void login(){

        System.out.println("LAunch application");
    }

    @Test(priority = 3,dependsOnMethods = "login")
    public void Telemetrypage(){

        System.out.println("Switch to telemetry page");
    }
    @Test(priority = 4,suiteName = "smoke")
    public void Topology(){

        System.out.println("Switch to toplogy");
    }
    @Test(priority = 2, suiteName = "Regression",skipFailedInvocations = true,invocationCount = 2,timeOut = 1000)
    public void Forms() throws InterruptedException {

        System.out.println("fill the forms");
        //throw new RuntimeException("Fail the testcase");
        //Thread.sleep(5000);
    }
@Test(enabled = false,description = "Dummy Test Case")
    public void certification(){

        System.out.println("Certification completed");

    }

}
