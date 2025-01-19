package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static Pratice.Tc1.lapplication;



public class Tc2Locators {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
         driver = new ChromeDriver();

        //find element by id,name,linketext

        lApplication("https://practicetestautomation.com/practice-test-login/");


        WebElement UserName=driver.findElement(By.id("username"));
        logintext(UserName,"student");

        WebElement Password=driver.findElement(By.id("password"));
        logintext(Password,"Password123");

        Thread.sleep(6000);

        WebElement btn=driver.findElement(By.id("submit"));
        clickOnElement(btn);
    }

    public static void logintext(WebElement element, String text){
    element.sendKeys(text);
    }

    public static void clickOnElement(WebElement element)
    {
        element.click();
    }

    public static String lApplication(String url)
    {
        driver.manage().window().maximize(); //Maximizing the browser window
        driver.get(url);
        return driver.getWindowHandle();
    }
}


