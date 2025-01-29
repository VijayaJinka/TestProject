package SeleniumFundamentals.Launching;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingApplications {

    public static void main(String[] args) throws InterruptedException {

        //1st Way of launching the chrome browser
        //To mention the path of the chrome driver.exe file
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//Drivers//chromedriver.exe");

        //If we do not mention the above path of the driver, it will throw an error: Illegal State Exception
        WebDriver driver=new ChromeDriver();

        //driver.get() --> Launching an application
        driver.get("https://www.google.com");

        //2nd Way:
        //Using the webdrivermanager which helps us in managing all the browser related activities

        //Downloads the firefox/gecko driver and sets the path of the driver automatically (happens at runtime)
        WebDriverManager.firefoxdriver().setup();

        driver=new FirefoxDriver();

        driver.get("https://www.google.com");


        //3rd Way:

        //Downloads the edge driver and sets the path of the driver automatically (happens at runtime)
        //And Creates the object of the EdgeDriver class
        //The browser will be closed automatically once the execution is completed

        driver=WebDriverManager.edgedriver().create();
        driver.get("https://www.google.com");

        driver.manage().window().maximize(); //Maximizing the browser window
        Thread.sleep(2000); //Pausing the execution for 2 seconds

        driver.manage().window().fullscreen();

        //Writing some 1000 lines of code


        //4th Way and the most recommended way:
        //From selenium 4.12.0 version, It has introduced a concept called as Selenium Manager, which helps us in managing all the browser related activities
        //But this approach will not work when we are running in a docker or a kubernates environment

        System.clearProperty("webdriver.chrome.driver");
        driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        Thread.sleep(10000);
    }
}