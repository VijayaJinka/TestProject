package SeleniumFundamentals.MouseHover;


    import framework.BrowserUtil;
import framework.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    public class UploadingFiles {

        public static void main(String[] args) {

            BrowserUtil.killExistingBrowsers();

            WebDriver driver= BrowserUtil.getDriver("chrome");

            driver.manage().window().maximize();
            driver.get("https://demo.automationtesting.in/FileUpload.html");

            ElementUtils elementUtils=new ElementUtils(driver);

            WebElement txt_FileUpload=elementUtils.findElement(By.xpath("//button[@title='Upload selected files']/following-sibling::div/descendant::input"));

            //ElementNotInteractableException --> YOur Have found the right webelement but you are not able to interact with it
            txt_FileUpload.sendKeys("D:\\Trainings_Classes\\Evening7to8\\Evening9to10_November\\Sample_Logging\\Sample.txt");

            WebElement btn_Upload=elementUtils.findElement(By.xpath("//span[text()='Upload']/.."));
            btn_Upload.click();

        }
    }

