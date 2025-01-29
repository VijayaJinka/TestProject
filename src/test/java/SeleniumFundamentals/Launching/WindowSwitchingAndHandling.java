package SeleniumFundamentals.Launching;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitchingAndHandling {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        driver=new ChromeDriver();

        driver.manage().window().maximize(); //Maximizing the browser window
        String amazonHandle=launchApplication("https://www.amazon.com");
        createNewTab("https://www.google.com");
        String flipKartHandle = createNewTab("https://www.flipkart.com");
        String instaHandle = createNewTab("https://www.instagram.com");
        createNewWindow("https://www.facebook.com");
        createNewWindow("https://www.snapchat.com");

        Thread.sleep(5000);
        driver.switchTo().window(flipKartHandle);
        Thread.sleep(3000);
        driver.switchTo().window(instaHandle);
    }

    public static String createNewTab(String url)
    {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(url);

        return driver.getWindowHandle();
    }

    public static String createNewWindow(String url)
    {
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(url);

        return driver.getWindowHandle();
    }

    public static String launchApplication(String url)
    {
        driver.get(url);
        return driver.getWindowHandle();
    }
}