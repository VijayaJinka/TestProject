package TestNG.Pratices123;

import framework.BrowserUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametr {
    @Parameters({"Browser","URL"})
    @Test(description = "Handling xml file")
    public void Browser(String URL, String Browser){
        System.out.println("Browsername: " +Browser);
        System.out.println("URL:" +URL);

        WebDriver driver= BrowserUtil.getDriver(Browser);
        driver.get(URL);
    }
}
