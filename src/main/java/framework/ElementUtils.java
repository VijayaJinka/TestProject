package framework;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    //Purpose of this class is to find the web elements
    public class ElementUtils {

        WebDriver driver;
        public ElementUtils(WebDriver driver)
        {
            this.driver=driver;
        }

        public WebElement findElement(String locatorName, String locatorValue)
        {
            return switch (locatorName.toUpperCase())
            {
                case "ID" -> driver.findElement(By.id(locatorValue));
                case "NAME" -> driver.findElement(By.name(locatorValue));
                case "LINKTEXT" -> driver.findElement(By.linkText(locatorValue));
                case "PARTIALLINKTEXT" -> driver.findElement(By.partialLinkText(locatorValue));
                case "TAGNAME" -> driver.findElement(By.tagName(locatorValue));
                default -> throw new RuntimeException("Invalid Locator Name, Please check the locator name that you have passed");
            };
        }

        public WebElement findElement(By locatorType)
        {
            return driver.findElement(locatorType);
        }

        public By findElement_By(String locatorName, String locatorValue)
        {
            return switch (locatorName.toUpperCase())
            {
                case "ID" -> By.id(locatorValue);
                case "NAME" -> By.name(locatorValue);
                case "LINKTEXT" -> By.linkText(locatorValue);
                case "PARTIALLINKTEXT" -> By.partialLinkText(locatorValue);
                case "TAGNAME" -> By.tagName(locatorValue);
                default -> throw new RuntimeException("Invalid Locator Name, Please check the locator name that you have passed");
            };
        }
    }

