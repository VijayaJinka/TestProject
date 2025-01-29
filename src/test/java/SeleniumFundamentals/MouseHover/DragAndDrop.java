package SeleniumFundamentals.MouseHover;

import framework.BrowserUtil;
import framework.ElementUtils;
import framework.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {

        BrowserUtil.killExistingBrowsers();

        WebDriver driver= BrowserUtil.getDriver("chrome");

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();

        ElementUtils elementUtils=new ElementUtils(driver);

        By fld_Source=By.id("column-a");
        By fld_Target=By.id("column-b");

        Actions a1=new Actions(driver);
        a1.pause(3000).dragAndDrop(elementUtils.findElement(fld_Target),elementUtils.findElement(fld_Source)).build().perform();

        driver.get("https://demo.automationtesting.in/Static.html");

        List<WebElement> img_Drag=elementUtils.findElements(By.xpath("//div[@id='dragarea']/descendant::img"));

        WebElement fld_DropArea=elementUtils.findElement(By.xpath("//div[@id='droparea']"));

        for(WebElement img:img_Drag)
        {
            Thread.sleep(3000);
//            ((JavascriptExecutor)driver) --> Executing the JS Code onto the browsers

            //Scroll Down the page by 100 pixels
            ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,100)");

            new SeleniumUtils(driver).performDragAndDrop(img,fld_DropArea);
        }

        //Scrolls the page up by 300 pixels
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-300)");
    }
}