package SeleniumFundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContinuationOfLocators {

    //Biggest drawback with the utilities that we have built is that there is no structure maintained
    //and we are not able to reuse the code

    //Key Things for a framwork that we need to look into it:
    //1. Generalizing the utilities --> Common methods for click, sendKeys, launchApplication etc...
    //2. Able to reuse the code at ease --- We are not doing it

    static WebDriver driver;

    public static void clickOnElement(WebElement element)
    {
        element.click();
    }

    public static void enterText(WebElement element,String text) {
        element.sendKeys(text);
    }

    public static void enterText(By by,String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static void enterText(WebElement element,Keys keys) {
        element.sendKeys(keys);
    }

    public static void enterText(By by,Keys keys) {
        driver.findElement(by).sendKeys(keys);
    }

    public static String launchApplication(String url)
    {
        if(url==null)
            throw new RuntimeException("URL cannot be null, please check the value that you have passed");

        else if(url.indexOf("http") == -1)
            throw new RuntimeException("Invalid URL, please check the URL that you have passed");

        else if(url.startsWith("http")==false)
            throw new RuntimeException("URL is not starting with https or http, please check the URL that you have passed");

        //Always remember that the URL should start with either http or https
        //else it will throw an invalid argument exception

        driver.manage().window().maximize(); //Maximizing the browser window
        driver.get(url);
        return driver.getWindowHandle();
    }

    public static void main(String[] args) {
        driver=new ChromeDriver();
        launchApplication("https://codenboxautomationlab.com/registration-form/");

        //With the knowledge of locators that we have currently, avoid alphanumeric attributes
        //as they keep on changing everytime during each and every run

        //Syntax of finding an element on the basis of name attribute:
        //driver.findElement(By.name("name"));

//        WebElement txt_FirstName=driver.findElement(By.name("fname"));
//        WebElement txt_LastName=driver.findElement(By.name("lname"));
//        WebElement txt_Email=driver.findElement(By.name("email"));

        //4th Approach: Finding the Web Elements using the By concept

        //By --> it is an abstract class in selenium which is used to find the elements on the basis of different locators
        By txt_FirstName=By.name("fname");
        By txt_LastName=By.name("lname");
        By txt_Email=By.name("email");

        enterText(txt_FirstName,"Sahil");
//        enterText(txt_LastName,"Kumar");

        enterText(txt_Email,"abc@abcde.com");

        //Keys is a library in selenium that will help us mimick the keyboard actions
//        txt_Email.sendKeys(Keys.TAB);
        enterText(txt_Email,Keys.TAB);

        //Interview Question: Find only one locator across the whole registration page, then fill the complete form with the help of that one element

        //driver.switchTo().activeElement() --> It will switch to the active element on the page
        enterText(driver.switchTo().activeElement(),"592358236");

    }
}
