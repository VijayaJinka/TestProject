package Dummyselenium;


    public class ChromiumDriver extends RemoteWebDriver {

        @Override
        public ChromiumDriver get(String url)
        {
            System.out.println("Launching the application using the chromium binary");
            return this;
        }
    }

