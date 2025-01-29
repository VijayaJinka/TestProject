package SeleniumFundamentals.LocatorFundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Xpath {
    public static void main(String[] args) {

        //Xpath --> Not an attribute
        //It is used to find the address of the element on the web page instead of relying on the attributes of the elements all the time
        //It is a language to find the elements on the web page
        //Powerful Locator in Selenium and same thing can be used in Appium,Playwright, Cypress etc as well

        //Types of Xpath:
        //1. Relative Xpath:  Instead of providing the complete path of the element, we can provide the path of the element from the root/reference element
        //2. Absolute Xpath: /html/body/header/div/nav/a[2] (Provided the complete path of the element)

        // // -- In Relative Xpath, it is used to find the element anywhere on the web page

        //Syntax of writing a xpath for a single attribute: (Attribute can be id, name, class, title, href, src etc...)
        // //tagname[@attribute='value']
        // //a[@title='Live Cricket Score']
        // //a[@title='Cricket Scorecard Archives']

        //Syntax of writing a xpath for multiple attributes:
        // //tagname[@attribute1='value' and @attribute2='value']
        // //a[@href='/cricket-schedule/series/all' and @class='text-white']
        // //input[@ng-model='FirstName' and @placeholder='First Name']

        // //input[@ng-model='FirstName' or @ng-model='firstname' and @placeholder='First Name']

        //Syntax of writing a xpath for contains:
        // //tagName[contains(@attribute,'value')]
        // //select[contains(@ng-init,'Skill')]
        // //select[contains(@class,'ng-valid')]

        //Syntax of writing a xpath for starts-with:
        // //tagName[starts-with(@attribute,'value')]
        // //a[starts-with(@href,'/cricket-scorecard-archives')]
        // //span[starts-with(@class,'text-black')]

        //Syntax of writing a xpath for ends-with() : Not available in Xpath 1.0 and all the browser engines support Xpath 1.0

        //Syntax of writing a xpath for text(): (Most important xpath)

        //text() is method or function in xpath which is used to find the element on the basis of the text of the element
        // //tagName[text()='value']
        // //h1[text()='Random Paragraph Generator']
        // //a[text()='Word']

        //Syntax of using contains() and text() together:
        // //tagName[contains(text(),'value')]
        // //span[contains(text(),'building in continuous use')]

        //Syntax of using normalize-space() and text() together:
        //normalize-space() is used to remove the leading and trailing spaces of the text
        // //tagName[normalize-space(text())='value']
        // //a[normalize-space(text())='schedule']
    }

    public static class LocatorConcepts {
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
}
