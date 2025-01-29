package TestNG.AnnotationsConcepts;


    import framework.BrowserUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

    public class SampleParameterization {

        @Parameters({"browser","URL"})
        @Test(description = "Handling Data from the XML File")
        public void sampleTestOne(@Optional("chrome") String browser, @Optional("https://www.cricbuzz.com") String url) throws Exception
        {
            System.out.println("Browser Name: "+browser);
            System.out.println("URL: "+url);

            WebDriver driver= BrowserUtil.getDriver(browser);
            driver.get(url);
        }
    }

