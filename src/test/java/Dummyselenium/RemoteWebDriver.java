package Dummyselenium;


    public class RemoteWebDriver implements WebDriver {

        @Override
        public WebDriver get(String url) {

            System.out.println("Launching the application for the URL");
            return this;
        }

        @Override
        public WebDriver getTitle() {
            System.out.println("Title of the window is ");
            return this;
        }

        @Override
        public WebDriver pageSource() {
            System.out.println("Page Source of the browser is");
            return this;
        }

        @Override
        public WebDriver getCurrentURL() {
            System.out.println("Current URL of the applications");
            return this;
        }

        @Override
        public SearchContext findElement() {
            System.out.println("Finding the element of the class");
            return this;
        }

        @Override
        public SearchContext findElements() {
            return this;
        }
    }

