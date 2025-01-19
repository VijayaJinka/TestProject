        package Pratice;


        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WindowType;
        import org.openqa.selenium.chrome.ChromeDriver;

        import java.util.Set;

        import static SeleniumFundamentals.WindowSwitchingAndHandling.createNewWindow;


        public class Tc1 {
            static WebDriver driver;

            //static WebDriver driver1= new FirefoxDriver();
            public static void main(String[] args) throws InterruptedException {
                driver = new ChromeDriver();
                lapplication("https://www.myntra.com");
                createtab("https://www.flipkart.com");//i'm reusing the variables-flipkarthandle
                createtab("https://x.com");
                createtab("https://facebook.com");
                createwindow("https://www.ajio.com");
                Thread.sleep(5000);
                createwindow("https://www.instagram.com");
                System.out.println(driver.getCurrentUrl());
                Thread.sleep(10000);

            }


            public static String createtab(String url) {
                driver.switchTo().newWindow(WindowType.TAB);
                driver.get(url);
                return driver.getWindowHandle();
            }

            public static String createwindow(String url) {
                driver.switchTo().newWindow(WindowType.WINDOW);
                driver.get(url);
                return driver.getWindowHandle();
            }

            public static String lapplication(String url) {
                driver.manage().window().maximize();
                driver.get(url);
                return driver.getWindowHandle();
            }

            public static void switchtowindow() throws InterruptedException {
                Set<String> windows = driver.getWindowHandles();

                for (String s : windows) {
                    driver.switchTo().window(s);
                    Thread.sleep(2000);

                    System.out.println(driver.getTitle());

                    System.out.println(driver.getCurrentUrl());
                }

            }
        }






