package Dummyselenium;


    public class FirefoxDriver extends RemoteWebDriver{

        public FirefoxDriver get(String url)
        {
            System.out.println("Launching the application from the firefox browser");
            return this;
        }
    }

