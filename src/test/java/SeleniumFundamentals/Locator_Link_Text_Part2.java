package SeleniumFundamentals;


    import framework.SeleniumUtils;
import org.openqa.selenium.By;
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
    }

