package SeleniumFundamentals.Launching;

import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WebLogicDriver {
    public static void main(String[] args) {

        //1st Way : Creating a object of ChromeDriver class using The search context interface
        //This is not a right way to create a object of ChromeDriver class because we cannot launch the applications using the search context interface
//        SearchContext searchContext=new ChromeDriver();
//
//        searchContext.findElement(null); //findElement is nothing but We are searching for a button or a text box or a radio button etc..
//        searchContext.findElements(null);

        //2nd Way: Creating an Object of the ChromeDriver Class
        //Recommended when we are working only with the Chrome Browser
//        ChromeDriver chromeDriver = new ChromeDriver();
//
//        chromeDriver.get("https://www.google.com");
//        chromeDriver.findElement(null);

        //3rd Way: Using the Chromium Class, we will creating the Chrome Driver Object
        //Recommended when we are working with the Chrome Browser or Edge Browser
        //If we want to work with Firefox or Safari this approach is not recommended
//        ChromiumDriver driver=new ChromeDriver();

//        driver.get("https://www.google.com");
//        driver.manage().window().maximize();
//
//        driver.findElement(null);
//        driver.findElements(null);

        //4th Way: Using the RemoteDriverClass, we can create an Object of Chrome Driver
        //Highly Recommended when we are working with multiple browsers
//        RemoteWebDriver remoteWebDriver = new ChromeDriver();

//        remoteWebDriver.get("https://www.google.com");
//        remoteWebDriver.manage().window().maximize();
//
//        remoteWebDriver.getCapabilities();
//        remoteWebDriver.findElement(null);
//        remoteWebDriver.findElements(null);

        //5th Way: Creating an Object of the WebDriver Interface using the anonymous class which is highly not recommended
//        SearchContext s2=new WebDriver() {
//            @Override
//            public void get(String url) {
//
//            }
//
//            @Override
//            public @Nullable String getCurrentUrl() {
//                return "";
//            }
//
//            @Override
//            public @Nullable String getTitle() {
//                return "";
//            }
//
//            @Override
//            public List<WebElement> findElements(By by) {
//                return List.of();
//            }
//
//            @Override
//            public WebElement findElement(By by) {
//                return null;
//            }
//
//            @Override
//            public @Nullable String getPageSource() {
//                return "";
//            }
//
//            @Override
//            public void close() {
//
//            }
//
//            @Override
//            public void quit() {
//
//            }
//
//            @Override
//            public Set<String> getWindowHandles() {
//                return Set.of();
//            }
//
//            @Override
//            public String getWindowHandle() {
//                return "";
//            }
//
//            @Override
//            public TargetLocator switchTo() {
//                return null;
//            }
//
//            @Override
//            public Navigation navigate() {
//                return null;
//            }
//
//            @Override
//            public Options manage() {
//                return null;
//            }
//        };
//
//        s2.findElement(null);
//        s2.findElements(null);

        //6th Way: Using the webdriver interface to create an object of the ChromeDriver class
        //Recommended when we are working with multiple browsers
        WebDriver driver = new ChromeDriver();

        //7th Way: Using the WebDriver Interface, we can create an object of RemoteWebDriver

        //Not a recommended way because, we need to pass the capabalities of the browser all the time like the browser details and all
        //If we want to work with multiple browsers at ease, it is not recommended or not a good approach

        //Capabilities are nothing but the features of the browser:
        //1. Either if we are running the selenium GRID (URL Of the GRID) in local or cloud
        //2. Or if we are running the browser in the headless mode
//        WebDriver driver1 = new RemoteWebDriver(null);

    }

    public static class ContinuationOfWindowSwitching {
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
}
