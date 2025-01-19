package SeleniumFundamentals;



import framework.BrowserUtil;
import framework.ElementUtils;
import framework.Reports;
import framework.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Locator_TagName {

        static WebDriver driver=null;
        public static void main(String[] args) throws IOException {

            BrowserUtil.killExistingBrowsers();
//        driver=new EdgeDriver();

            driver= BrowserUtil.getDriver("EDGE");

            ElementUtils elementUtils=new ElementUtils(driver);
            SeleniumUtils seleniumUtils=new SeleniumUtils(driver);
            Reports reports=new Reports(driver);

            seleniumUtils.launchApplication("https://practicetestautomation.com/practice-test-login/");

            By txt_UserName=elementUtils.findElement_By("name","username");
            seleniumUtils.enterText(txt_UserName,"student");

            By txt_Password=elementUtils.findElement_By("name","password");
            seleniumUtils.enterText(txt_Password,"Password123");

            reports.captureScreenshot("Credentials.png");

            By btn_Submit=elementUtils.findElement_By("id","submit");
            seleniumUtils.clickOnElement(btn_Submit);

            //Syntax of finding an element on the basis of tag name:
            //driver.findElement(By.tagName("tag name of the element"));

            WebElement fld_LoginMsg=driver.findElement(By.tagName("h1"));

            //.getText() function is used to get the text of the element on the web page
//        System.out.println("Login Message: "+fld_LoginMsg.getText());

            System.out.println("Login Message: "+getElementText(fld_LoginMsg));
            reports.captureScreenshot("Login Successful.png");
        }

        public static String getElementText(WebElement element)
        {
            return element.getText();
        }

        public static String getElementText(By by)
        {
            return driver.findElement(by).getText();
        }
    }

