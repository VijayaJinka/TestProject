package SeleniumFundamentals.FramesPopups;


    import framework.BrowserUtil;
import framework.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

    public class InterviewQuestion_MouseHover {

        public static void main(String[] args) throws InterruptedException {

            WebDriver driver= BrowserUtil.getDriver("Chrome");

            SeleniumUtils seleniumUtils=new SeleniumUtils(driver);

            seleniumUtils.launchApplication("https://www.bigbasket.com/");

            // //header/descendant::span[text()='Shop by']
            List<WebElement> headers=driver.findElements(By.tagName("header"));

            for(WebElement header:headers){

                //If we want to fetch any attribute from the DOM
                String styleData=header.getDomAttribute("style");

                //If we want to fetch any attribute from the Property Tab under Chrome Dev Tools
//                    header.getDomProperty()

                if(styleData.contains("1"))
                {
                    //Element chaining
                    header.findElement(By.xpath("./descendant::span[text()='Shop by']")).click();
                    break;
                }
            }

            seleniumUtils.performMouseHover(By.xpath("//a[text()='Bakery, Cakes & Dairy' and @role='none']"));
            Thread.sleep(2000);
            seleniumUtils.performMouseHover("XPATH","//a[text()='Dairy']");
        }
    }

