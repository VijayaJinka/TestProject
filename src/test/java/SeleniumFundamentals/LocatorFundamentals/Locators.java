package SeleniumFundamentals.LocatorFundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        //Element represents a textbox, radio button or a checkbox etc... for selenium

        //Locators are used to (identify/find the address) of the elements on the web page

        //Different types of locators:
        //1. ID --> Fastest and the most recommended locator as it is always unique
        //2. Name
        //3. ClassName
        //4. TagName
        //5. LinkText
        //6. PartialLinkText
        //7. Xpath
        //8. CSS Selector

        //driver --> Represents the browser
        //.findElement --> Finding for that particular element in the current page or in the browser

        //Finding the element on the basis of ID:
        //Syntax: driver.findElement(By.id("id of the element"));

        driver=new ChromeDriver();

        launchApplication("https://practicetestautomation.com/practice-test-login/");

        //1st Approach: We are directly finding the element and performing the action on that element
        //Not a recommended approach because we have to write the same code again and again
        //.sendKeys() --> Entering the data into the textbox

//        driver.findElement(By.id("username")).sendKeys("admin");
//        driver.findElement(By.id("password")).sendKeys("admin");
//
//        Thread.sleep(6000);
//        //.click() --> Clicking on the button
//        driver.findElement(By.id("submit")).click();


        //2nd Approach: We are storing the element in a variable and performing the action on that element

//        WebElement txt_UserName=driver.findElement(By.id("username"));
//        txt_UserName.sendKeys("admin");
//
//        WebElement txt_Password=driver.findElement(By.id("password"));
//        txt_Password.sendKeys("admin");
//
//        Thread.sleep(6000);
//
//        WebElement btn_Login=driver.findElement(By.id("submit"));
//        btn_Login.click();
//
//        txt_UserName.sendKeys("student");
//        txt_Password.sendKeys("Password123");
//        btn_Login.click();
//
        //3rd Approach: Using the custom User Defined Methods to perform the actions

        WebElement txt_UserName=driver.findElement(By.id("username"));
        enterText(txt_UserName,"admin");

        WebElement txt_Password=driver.findElement(By.id("password"));
        enterText(txt_Password,"admin");

        Thread.sleep(6000);

        WebElement btn_Login=driver.findElement(By.id("submit"));
        clickOnElement(btn_Login);
    }


    public static void clickOnElement(WebElement element)
    {
        element.click();
    }

    public static void enterText(WebElement element, String text) {
        element.sendKeys(text);
    }

    public static String launchApplication(String url)
    {
        driver.manage().window().maximize(); //Maximizing the browser window
        driver.get(url);
        return driver.getWindowHandle();
    }
}

