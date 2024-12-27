package Dummyselenium;


    public class EndUser {

        public static void main(String[] args) {

            //Top Down Approach:
            //Parent Class can access the child class methods and variables
            WebDriver driver=new FirefoxDriver();

            driver.get("sample data from firefox browser");
            System.out.println(driver.getTitle());

            driver=new ChromiumDriver();

            driver.get("sample data from chromium browser");
            System.out.println(driver.getTitle());
        }
    }

