package SeleniumFundamentals;

public class Locator_Xpath {
    public static void main(String[] args) {

        //Xpath --> Not an attribute
        //It is used to find the address of the element on the web page instead of relying on the attributes of the elements all the time
        //It is a language to find the elements on the web page
        //Powerful Locator in Selenium and same thing can be used in Appium,Playwright, Cypress etc as well

        //Types of Xpath:
        //1. Relative Xpath:  Instead of providing the complete path of the element, we can provide the path of the element from the root/reference element
        //2. Absolute Xpath: /html/body/header/div/nav/a[2] (Provided the complete path of the element)

        // // -- In Relative Xpath, it is used to find the element anywhere on the web page

        //Syntax of writing a xpath for a single attribute: (Attribute can be id, name, class, title, href, src etc...)
        // //tagname[@attribute='value']
        // //a[@title='Live Cricket Score']
        // //a[@title='Cricket Scorecard Archives']

        //Syntax of writing a xpath for multiple attributes:
        // //tagname[@attribute1='value' and @attribute2='value']
        // //a[@href='/cricket-schedule/series/all' and @class='text-white']
        // //input[@ng-model='FirstName' and @placeholder='First Name']

        // //input[@ng-model='FirstName' or @ng-model='firstname' and @placeholder='First Name']

        //Syntax of writing a xpath for contains:
        // //tagName[contains(@attribute,'value')]
        // //select[contains(@ng-init,'Skill')]
        // //select[contains(@class,'ng-valid')]

        //Syntax of writing a xpath for starts-with:
        // //tagName[starts-with(@attribute,'value')]
        // //a[starts-with(@href,'/cricket-scorecard-archives')]
        // //span[starts-with(@class,'text-black')]

        //Syntax of writing a xpath for ends-with() : Not available in Xpath 1.0 and all the browser engines support Xpath 1.0

        //Syntax of writing a xpath for text(): (Most important xpath)

        //text() is method or function in xpath which is used to find the element on the basis of the text of the element
        // //tagName[text()='value']
        // //h1[text()='Random Paragraph Generator']
        // //a[text()='Word']

        //Syntax of using contains() and text() together:
        // //tagName[contains(text(),'value')]
        // //span[contains(text(),'building in continuous use')]

        //Syntax of using normalize-space() and text() together:
        //normalize-space() is used to remove the leading and trailing spaces of the text
        // //tagName[normalize-space(text())='value']
        // //a[normalize-space(text())='schedule']
    }

}
