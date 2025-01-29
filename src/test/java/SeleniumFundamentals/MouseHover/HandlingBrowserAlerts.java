package SeleniumFundamentals.MouseHover;

import framework.BrowserUtil;
import framework.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class HandlingBrowserAlerts {

        static WebDriver driver;
        public static void main(String[] args) throws InterruptedException {

            BrowserUtil.killExistingBrowsers();

            driver= BrowserUtil.getDriver("firefox");

            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            driver.manage().window().maximize();

            SeleniumUtils seleniumUtils = new SeleniumUtils(driver);

            By btn_ClickForJSAlert=By.xpath("//button[text()='Click for JS Alert']");

            seleniumUtils.clickOnElement(btn_ClickForJSAlert);

            Thread.sleep(3000);

            //Switch to a Browser alert:
//        driver.switchTo().alert()

//        Alert alert=driver.switchTo().alert();
//
//        //Prints the text that is present in the alert
//        System.out.println(alert.getText());
//
//        //Accept the alert:
//        alert.accept();

            System.out.println(getTextFromAlert());

            acceptAlert();

            System.out.println("***************************************************************************************************");

            By btn_Confirm=By.xpath("//button[text()='Click for JS Confirm']");
            seleniumUtils.clickOnElement(btn_Confirm);

            Thread.sleep(4000);

//        System.out.println(alert.getText());
//
//        //Dismiss the alert (click on Cancel)
//        alert.dismiss();

            System.out.println(getTextFromAlert());

            dismissAlert();

            System.out.println("***************************************************************************************************");

            By btn_Prompt=By.xpath("//button[text()='Click for JS Prompt']");

            seleniumUtils.clickOnElement(btn_Prompt);

            Thread.sleep(4000);

//        System.out.println(alert.getText());
//
//        //Enter some text in the alert:
//        alert.sendKeys("Hello World");
//
//        Thread.sleep(2000);
//        alert.accept();

            System.out.println(getTextFromAlert());

            sendKeysToAlert("Hello World");

            Thread.sleep(2000);

            acceptAlert();
        }

        public static void acceptAlert()
        {
            driver.switchTo().alert().accept();
        }

        public static void dismissAlert()
        {
            driver.switchTo().alert().dismiss();
        }

        public static void sendKeysToAlert(String text)
        {
            driver.switchTo().alert().sendKeys(text);
        }

        public static String getTextFromAlert()
        {
            return driver.switchTo().alert().getText();
        }
    }

