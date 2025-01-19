package SeleniumFundamentals;

public class Locator_XPATH_AXES {
    public static void main(String[] args) {

        //Syntax of using text() and any attribute together:
        // //tagName[@attribute='value' and text()='value']
        // //span[normalize-space(text())='Boston Celtics' and @class='text-body']

        //Syntax of using descendant in Xpath:
        // //tagName[@attribute='value']/descendant::anotherTagName
        // //header[@id='nav-header']/descendant::a

        //Syntax of using descendant and text() in Xpath:
        // //tagName[@attribute='value']/descendant::anotherTagName[text()='value']
        // //header[@id='nav-header']/descendant::a[text()='Cap']
        // //table[@id='table_active']/descendant::a[normalize-space(text())='Jaylen Brown']

        //Syntax of using parent in Xpath:
        // //tagName[@attribute='value']/parent::anotherTagName
        ////table[@id='table_active']/descendant::a[normalize-space(text())='Jrue Holiday']/parent::td

        //Syntax of using following-sibling in xpath:
        // //tagName[@attribute='value']/following-sibling::anotherTagName
        // //table[@id='table_active']/descendant::a[normalize-space(text())='Jrue Holiday']/parent::td/following-sibling::td[6]/span

        //Syntax of using child in xpath:
        // //tagName[@attribute='value']/anotherHTMLTagName
        // //select[@name='team']/option[text()='MIA Heat']

        //Syntax of using preceding-sibling in xpath:
        // //tagName[@attribute='value']/preceding-sibling::anotherTagName
        // //td[text()='PG']/preceding-sibling::td/child::a
        // //td[text()='PG']/preceding-sibling::td/a

        //Syntax of using position() in xpath:
        // //tagName[@attribute='value'][position()=1]
        // //tbody/tr[position() mod 2!=0] --> Odd Rows
        // //tbody/tr[position() mod 2=0] --> Odd Rows

        //(//tbody/tr[position() mod 2!=0]) --> Grouping the xpath as a whole

        //((//tbody/tr[position() mod 2!=0])[position()<=2]) --> Grouping the xpath as a whole and getting the first two odd rows

        //Syntax of using last() in xpath:
        // //tagName[@attribute='value'][last()]
        // //tbody/tr[last()] --> Last Row


    }
}
