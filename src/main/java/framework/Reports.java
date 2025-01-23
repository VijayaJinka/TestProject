package framework;


    import com.google.common.io.Files;
import lombok.SneakyThrows;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
    import java.io.IOException;

public class Reports {

        WebDriver driver;
        public Reports(WebDriver driver)
        {
            this.driver=driver;
        }

        @SneakyThrows
        public void captureScreenshot(String filePath) throws IOException {
            File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            File dest=new File(filePath); //Image will be saved in the Project Folder

            Files.copy(src,dest);
        }
    }

