package SeleniumFundamentals.FramesPopups;

import framework.BrowserUtil;
import framework.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

    public static void main(String[] args) {

        BrowserUtil.killExistingBrowsers();

        WebDriver driver= BrowserUtil.getDriver("Chrome");

        driver.get("https://the-internet.herokuapp.com/context_menu");
        driver.manage().window().maximize();

        ElementUtils elementUtils=new ElementUtils(driver);

        By btn_Context= By.id("hot-spot");

        Actions a1=new Actions(driver);

        //.contextClick is used to perform the right click
        a1.contextClick(elementUtils.findElement(btn_Context)).pause(3000).build().perform();

        driver.switchTo().alert().accept();
    }
}
