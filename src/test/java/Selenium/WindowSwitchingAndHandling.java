package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitchingAndHandling {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        driver=new ChromeDriver();

        driver.manage().window().maximize(); //Maximizing the browser window
        String amazonHandle=launchApplication("https://www.amazon.com");
//        driver.get("https://www.amazon.com");
//        String amazonHandle=driver.getWindowHandle(); //To Store the unique reference of the current window

        //Selenium 4 has introduced a new method called as newWindow() which helps us in opening a new tab
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://www.google.com");
        createNewTab("https://www.google.com");

//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://www.flipkart.com");
        String flipKartHandle=createNewTab("https://www.flipkart.com");
//        String flipKartHandle=driver.getWindowHandle(); //To Store the unique reference of the current window

//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://www.instagram.com");
        String instaHandle=createNewTab("https://www.instagram.com");

        //Creating a new window
        //Selenium 4 has introduced a new method called as newWindow() which helps us in opening a new window
//        driver.switchTo().newWindow(WindowType.WINDOW);
//        driver.get("https://www.facebook.com");

        createNewWindow("https://www.facebook.com");

//        driver.switchTo().newWindow(WindowType.WINDOW);
//        driver.get("https://www.snapchat.com");

        createNewWindow("https://www.snapchat.com");

        Thread.sleep(5000);

        //Switch to flipkart tab using the handle
        driver.switchTo().window(flipKartHandle);

        Thread.sleep(3000);

        //Switching back to the amazon tab using the handle
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
