package SeleniumFundamentals.FramesPopups;

import framework.BrowserUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFrames {

    public static void main(String[] args) {

        BrowserUtil.killExistingBrowsers();

        WebDriver driver= BrowserUtil.getDriver("Chrome");

        driver.get("https://the-internet.herokuapp.com/nested_frames");

        //Syntax of switching to a frame using name or id:
        //driver.switchTo().frame(nameOrID);

        //If we pass the wrong frame name or id, then we will get NoSuchFrameException
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");

        String leftFrame=driver.findElement(By.xpath("//body[normalize-space(text())='LEFT']")).getText();

        System.out.println(leftFrame);

        //Switches back to the parent frame that is frame-top in this case
        driver.switchTo().parentFrame();

        driver.switchTo().frame("frame-middle");

        String middleFrame=driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();

        System.out.println(middleFrame);

        driver.switchTo().parentFrame();

        driver.switchTo().frame("frame-right");

        String rightFrame=driver.findElement(By.xpath("//body[normalize-space(text())='RIGHT']")).getText();

        System.out.println(rightFrame);

        //Switches out of all the frames
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame-bottom");

        String bottomFrame=driver.findElement(By.xpath("//body[normalize-space(text())='BOTTOM']")).getText();

        System.out.println(bottomFrame);
    }

}