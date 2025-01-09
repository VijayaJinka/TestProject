package SeleniumFundamentals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

}
