package SeleniumFundamentals.MouseHover;

import framework.BrowserUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Mouseclicks {


        static WebDriver driver;
        public static void main(String[] args) {

            BrowserUtil.killExistingBrowsers();

            driver= BrowserUtil.getDriver("edge");

            driver.get("https://the-internet.herokuapp.com/hovers");
            driver.manage().window().maximize();

            //Find All the elements that are matching with the given locator
            //driver.findElements will store it in a List of WebElements
//        List<WebElement> images=driver.findElements(By.xpath("//div[@id='content']/descendant::img"));

            List<WebElement> images=findElements(By.xpath("//div[@id='content']/descendant::img"));

            //We have to use the actions to perform the mouse hover

            //.moveToElement is the function used to perform the mouse hover
            //.build() is used to build the action
            //.perform() is used to perform the action

            //.pause(Duration.ofSeconds(5)) is used to pause the execution for 5 seconds

            for(WebElement image:images){
//            a1.pause(Duration.ofSeconds(5))
//                    .moveToElement(image).build().perform();

                performMouseHover(image);
            }


        }

        public static void performMouseHover(WebElement element)
        {
            Actions a1=new Actions(driver);
            a1.pause(Duration.ofSeconds(5))
                    .moveToElement(element).build().perform();
        }

        public static List<WebElement> findElements(By by)
        {
            return driver.findElements(by);
        }
    }

