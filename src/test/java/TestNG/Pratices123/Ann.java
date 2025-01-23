package TestNG.Pratices123;

import org.testng.annotations.*;

public class Ann {

    @BeforeSuite
    public void setupreports() {
        System.out.println("reports");
    }

    @AfterSuite
    public void generationofreports() {
        System.out.println("generatereports");
    }

    @BeforeClass
    public void launcingbrowser() {
        System.out.println("launchbroswer");
    }

    @AfterClass
    public void closingbrowser() {
        System.out.println("closebrowser");
    }

    @BeforeMethod
    public void login() {
        System.out.println("login");
    }

    @AfterMethod
    public void logout() {
        System.out.println("logout");
    }

    @Test(groups = {"Regression"})
    public void forms() {
        System.out.println("forms");
    }

    @Test
    public void certificate() {
        System.out.println("certificate");
    }

}