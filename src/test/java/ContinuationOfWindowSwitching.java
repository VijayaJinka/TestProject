
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContinuationOfWindowSwitching {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        driver=new ChromeDriver();

        launchApplication("https://www.amazon.com");

        createNewTab("https://www.google.com");

        createNewTab("https://www.flipkart.com");

        createNewTab("https://www.instagram.com");

        createNewWindow("https://www.facebook.com");

        createNewWindow("https://www.snapchat.com");

        createNewWindow("https://www.twitter.com");

        createNewWindow("https://www.linkedin.com");

//        //Returns the set of all the unique reference numbers or unique identifiers for all the windows and tabs launched
//        Set<String> windows=driver.getWindowHandles();
//
//        //Using the for each loop to switch to each and every window/tab that is launched
//        for(String s:windows)
//        {
//            driver.switchTo().window(s);
//            Thread.sleep(2000);
//
//            //Prints the title of the application launched
//            System.out.println(driver.getTitle());
//
//            //Prints the URL of the application launched
//            System.out.println(driver.getCurrentUrl());
//
//            if(driver.getCurrentUrl().contains("instagram"))
//            {
//                Thread.sleep(4000);
//                driver.close(); //Closes the current window/tab
//            }
//
//        }

//        switchToNewWindow();

//        closeWindow("facebook");

        //Convert the set of window handles into a list

        //Using streams we are converting a set into a list
        //driver.getWindowHandles().stream().collect(Collectors.toList());

        //Without Streams how do we convert a set into a list:
//        List<String> listOfWindowHandles=new ArrayList<String>(driver.getWindowHandles());

        //Use Case: Switch to a particular tab or window when the name is not known but we know that in which position it is present
//        List<String> listOfWindowHandles=driver.getWindowHandles().stream().collect(Collectors.toList());

//        driver.switchTo().window(listOfWindowHandles.get(2));
        switchToParticularWindow(2);

        //Use Case: Switch to a particular tab or window on the basis of the title or URL without switching to each and every window

        //Closes the entire browser session
//        driver.quit();
    }

    public static void switchToParticularWindow(String windowRefID)
    {
        driver.switchTo().window(windowRefID);
    }

    public static void switchToParticularWindow(int windowIndex)
    {
        List<String> listOfWindowHandles=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(listOfWindowHandles.get(windowIndex));
    }

    public static void switchToParticularWindowAndCloseThatTabOrWindow(int windowIndex)
    {
        List<String> listOfWindowHandles=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(listOfWindowHandles.get(windowIndex)).close();
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
        driver.manage().window().maximize(); //Maximizing the browser window
        driver.get(url);
        return driver.getWindowHandle();
    }

    @SneakyThrows
    public static void switchToNewWindow() throws InterruptedException {
        Set<String> handles=driver.getWindowHandles();

        for(String s:handles)
        {
            driver.switchTo().window(s);
            Thread.sleep(2000);

            System.out.println(driver.getTitle());

            System.out.println(driver.getCurrentUrl());
        }
    }

    @SneakyThrows
    public static void closeWindow(String urlOrTitle) throws InterruptedException {
        Set<String> handles=driver.getWindowHandles();

        for(String s:handles)
        {
            driver.switchTo().window(s);
            Thread.sleep(2000);

            if(driver.getCurrentUrl().contains(urlOrTitle) || driver.getTitle().contains(urlOrTitle))
            {
                Thread.sleep(7000);
                driver.close();
            }
        }
    }
}
