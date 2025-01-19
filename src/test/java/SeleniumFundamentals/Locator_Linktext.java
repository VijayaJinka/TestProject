package SeleniumFundamentals;
import com.google.common.io.Files;
import framework.SeleniumUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
public class Locator_Linktext {
    static WebDriver driver;

    public static void main(String[] args) throws IOException {
        //<a href="https://www.linkedin.com/in/sarifuli" target="_blank" rel="noopener">
        // LinkedIn Profile</a>

        //LinkText: Whenever the text is surrounded by <a> </a> tags, we can use the linkText locator

        driver=new ChromeDriver();

        SeleniumUtils seleniumUtils=new SeleniumUtils(driver);

        seleniumUtils.launchApplication("https://www.cricbuzz.com");

        //Syntax of finding an element on the basis of link text:
        //driver.findElement(By.linkText("text of the link"));

        WebElement lnk_LiveScores=driver.findElement(By.linkText("Live Scores"));

        //Checks if the element is displayed on the page or not
        //Returns true if the element is displayed on the page else returns false
//        if(lnk_LiveScores.isDisplayed())
//        {
//            System.out.println("Navigated to Cricbuzz Site Successfully");
//        }
//
//        else
//            System.out.println("Not Navigate to Cricbuzz Site Page");

        checkIfElementIsDisplayed(lnk_LiveScores,"Live Scores");

        seleniumUtils.clickOnElement(lnk_LiveScores);

        By lnk_LiveScore=By.linkText("Live Score");
        seleniumUtils.clickOnElement(lnk_LiveScore);

        By lnk_Squads=By.linkText("Squads");
        seleniumUtils.clickOnElement(lnk_Squads);

        By lnk_PointsTable=By.linkText("Points Table");
        seleniumUtils.clickOnElement(lnk_PointsTable);

        seleniumUtils.switchToNewWindow();

        //Capture a Screenshot:
        //TakesScreenshot --> Captures the Screenshot
        //((TakesScreenshot)driver) --> Captures the Screenshot of the browser
        //((TakesScreenshot)driver).getScreenshotAs() --> Captures the Screenshot of the browser and determine how do we want to save the screenshot

        //Capturing the screenshot of the browser and storing it in the form of a file (Stores the file in a .png format)
        //Screenshot will be captured in the temp folder of the system
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest=new File("Sample.png"); //Image will be saved in the Project Folder

        Files.copy(src,dest);

    }

    public static void checkIfElementIsDisplayed(WebElement element,String labelName)
    {
        if(element.isDisplayed())
            System.out.println(labelName+" is displayed on the page");

        else
            System.out.println(labelName+" is not displayed on the page");
    }
}

