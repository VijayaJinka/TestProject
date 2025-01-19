import lombok.SneakyThrows;
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class SeleniumUtils {
    WebDriver driver;
    public SeleniumUtils(WebDriver driver)
    {
        this.driver=driver;
    }

    public void clickOnElement(WebElement element)
    {
        element.click();
    }

    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    public void enterText(WebElement element,String text) {
        element.sendKeys(text);
    }

    public void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public void enterText(WebElement element, Keys keys) {
        element.sendKeys(keys);
    }

    public void enterText(By by,Keys keys) {
        driver.findElement(by).sendKeys(keys);
    }

    public String launchApplication(String url)
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

    public void checkIfElementIsDisplayed(WebElement element,String labelName)
    {
        if(element.isDisplayed())
            System.out.println(labelName+" is displayed on the page");

        else
            System.out.println(labelName+" is not displayed on the page");
    }

    public void checkIfElementIsDisplayed(By by,String labelName)
    {
        if(driver.findElement(by).isDisplayed())
            System.out.println(labelName+" is displayed on the page");

        else
            System.out.println(labelName+" is not displayed on the page");
    }

    public void switchToParticularWindow(String windowRefID)
    {
        driver.switchTo().window(windowRefID);
    }

    public void switchToParticularWindow(int windowIndex)
    {
        List<String> listOfWindowHandles=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(listOfWindowHandles.get(windowIndex));
    }

    public void switchToParticularWindowAndCloseThatTabOrWindow(int windowIndex)
    {
        List<String> listOfWindowHandles=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(listOfWindowHandles.get(windowIndex)).close();
    }

    public String createNewTab(String url)
    {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(url);

        return driver.getWindowHandle();
    }

    public String createNewWindow(String url)
    {
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(url);

        return driver.getWindowHandle();
    }

    @SneakyThrows
    public void switchToNewWindow()
    {
        Set<String> handles=driver.getWindowHandles();

        for(String s:handles)
        {
            driver.switchTo().window(s);
        }
    }

    @SneakyThrows
    public void closeWindow(String urlOrTitle) throws InterruptedException {
        Set<String> handles=driver.getWindowHandles();

        for(String s:handles)
        {
            driver.switchTo().window(s);
            Thread.sleep(2000);

            if(driver.getCurrentUrl().contains(urlOrTitle) || driver.getTitle().contains(urlOrTitle))
            {
                Thread.sleep(2000);
                driver.close();
            }
        }
    }
}


