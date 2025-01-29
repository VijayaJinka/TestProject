package SeleniumFundamentals.LocatorFundamentals;

import framework.BrowserUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CSSSelectors {

    public static void main(String[] args) {
        //CSS --> Cascading Style Sheets

        //These kind of selectors are using when we are from dev background

        //Myth: CSS Selector is faster than Xpath

        //During the IE Days, it was not supporting XPATH and if it would support also,
        //it would be very slow to process, that is why they say CSS Selectors are much faster and quicker to find

        //In the current era of web browsers, both xpath and css selectors are equally fast

        //Syntax of finding the element using tagName, attribute:
        // tagName[attribute='value']
        // input[name='first_name']
        // input[placeholder='Last Name']

        //Syntax of finding the element on the basis of classname:
        // .<className>
        // .control-label

        //Syntax of finding the element on the basis of id:
        // #<id>
        // #inlineRadioMale
        // #inlineRadioFemale

        //CSS Selectors will not work on the basis of text() function

        //CSS Selectors does not allow backward traversing like ancestor, parent, preceding-sibling

        //Syntax of finding an immediate sibling element:
        // tagName[attribute='value'] + anotherTagName[attribute='value']
        // #inlineRadioFemale + label
        // .input-group-addon + input[name='first_name']
        // option + option
        // option[value='february'] + option

        //Syntax of finding all the sibling elements:
        // tagName[attribute='value'] ~ anotherTagName[attribute='value']
        // option[value='february'] ~ option

        //Syntax of finding the direct child element:
        // tagName[attribute='value'] > anotherTagName[attribute='value']
        // #exampleFormControlSelect2 > option

        //Syntax of finding the first child element:
        // tagName[attribute='value'] > :first-child

        //Syntax of finding the last child element:
        // tagName[attribute='value'] > :last-child

        //Syntax of finding the nth child element:
        // tagName[attribute='value'] > :nth-child(n)
        // #exampleFormControlSelect2 > :nth-child(n) --> All the options under the select tag

        //Syntax of using contains in CSS:
        // tagName[attribute*='value']
        // select[class*='selectpicker']

        //Syntax of using ends with in CSS:
        // tagName[attribute$='value']
        // span[class$='addon'] + input[data-bv-field$='last_name']
        // input[name$='last_name']

        //Syntax of using starts with in CSS:
        // tagName[attribute^='value']
        // input[name^='first']

        //Syntax of using not in CSS:
        // tagName:not([attribute='value'])
        // input:not([class='form-control'])

        //Syntax of using multiple attributes in CSS:
        // tagName[attribute1='value1'][attribute2='value2']
        // input[name='inlineRadioOptions'][value='Male']

        //Syntax of writing multiple CSS Selectors in a single line:
        // tagName[attribute='value'], anotherTagName[attribute='value']
        // input[name='fname'],input[name='lname'],input[name='email']

        //Syntax of finding an element using CSS Selector:
        //driver.findElement(By.cssSelector(value));

        WebDriver driver= BrowserUtil.getDriver("chrome");

        driver.get("https://codenboxautomationlab.com/registration-form/");

        List<WebElement> data=driver.findElements(By.cssSelector("input[name='fname'],input[name='lname'],input[name='email']"));

        data.stream().forEach(e->e.sendKeys("Test_One"));
    }
}

