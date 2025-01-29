package SeleniumFundamentals.FramesPopups;

import framework.BrowserUtil;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;

public class AuthenticationPopUps {

    public static void main(String[] args) {

        WebDriver driver = BrowserUtil.getDriver("Chrome");

        //Register the username and password to the browser
        ((HasAuthentication)driver).register(UsernameAndPassword.of("admin","admin"));

        driver.get("https://the-internet.herokuapp.com/basic_auth");
    }
}
