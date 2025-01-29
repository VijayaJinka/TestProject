package SeleniumFundamentals.LocatorFundamentals;


import framework.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

    public class Locator_Link_Text_Part2 {

        static WebDriver driver;
        public static void main(String[] args) {

            //We are creating the driver object all the time using the regular code
            driver=new EdgeDriver();

            SeleniumUtils seleniumUtils=new SeleniumUtils(driver);

            seleniumUtils.launchApplication("https://www.cricbuzz.com");

            By lnk_Series=By.linkText("Series");
            By lnk_CurrentMatches=By.linkText("Current Matches");
            By lnk_ScoreCard=By.linkText("Scorecard");


            seleniumUtils.clickOnElement(lnk_Series);
            seleniumUtils.clickOnElement(lnk_CurrentMatches);

            //Syntax of finding an element on the basis of partial link text:
            //Advantage with partial link text is that we need not give the complete text

            //driver.findElement(By.partialLinkText("text of the link"));

            WebElement lnk_LiveMatch=driver.findElement(By.partialLinkText("Joburg Super Kings"));
            seleniumUtils.clickOnElement(lnk_LiveMatch);

            seleniumUtils.clickOnElement(lnk_ScoreCard);

            //Matheesha Pathirana

            //5th Approach: We should have a seperate class/methods for finding the elements

            //If there are multiple values with the same locator, then the selenium will perform the action of the first occurence of the element
            By lnk_PlayerDetails=findElement_By("partiallinktext","Matheesha");
            seleniumUtils.clickOnElement(lnk_PlayerDetails);

            //Suppose if the locator that you are trying to find is not present in the web page
            //then it will throw an exception called NoSuchElementException
            By lnk_FullProfile=findElement_By("linkText","Full profile");
            seleniumUtils.clickOnElement(lnk_FullProfile);
        }

        public static WebElement findElement(String locatorName, String locatorValue)
        {
            return switch (locatorName.toUpperCase())
            {
                case "ID" -> driver.findElement(By.id(locatorValue));
                case "NAME" -> driver.findElement(By.name(locatorValue));
                case "LINKTEXT" -> driver.findElement(By.linkText(locatorValue));
                case "PARTIALLINKTEXT" -> driver.findElement(By.partialLinkText(locatorValue));
                default -> throw new RuntimeException("Invalid Locator Name, Please check the locator name that you have passed");
            };
        }

        public static By findElement_By(String locatorName, String locatorValue)
        {
            return switch (locatorName.toUpperCase())
            {
                case "ID" -> By.id(locatorValue);
                case "NAME" -> By.name(locatorValue);
                case "LINKTEXT" -> By.linkText(locatorValue);
                case "PARTIALLINKTEXT" -> By.partialLinkText(locatorValue);
                default -> throw new RuntimeException("Invalid Locator Name, Please check the locator name that you have passed");
            };
        }

        public static class ContinuationOfLocators {

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

            public static void enterText(WebElement element, Keys keys) {
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
    }

