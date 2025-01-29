package SeleniumFundamentals.FramesPopups;

import framework.BrowserUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShadowFrames
{

    public static void main(String[] args) {

        WebDriver driver= BrowserUtil.getDriver("Chrome");

        driver.get("chrome://downloads/");
        driver.manage().window().maximize();

        //Switching to Shadow DOM using JavaScriptExecutor
        WebElement txt_SearchBox=(WebElement)((JavascriptExecutor)driver).executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-toolbar').shadowRoot.querySelector('cr-toolbar').shadowRoot.querySelector('#centeredContent > #search').shadowRoot.querySelector('#content > #searchTerm > #searchInput')");
        txt_SearchBox.sendKeys("Sample.txt");
    }
}