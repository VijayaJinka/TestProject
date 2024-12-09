package november27th2024;

public class ConditionalStatement {
    public static void main(String[] args) {
        //Conditional Statement:
        //RUnning the code based on the condition
        int a=10;

        // == (Value present on the left hand side is same as value present on the right hand side)

        //if takes true or false values only

        //Syntax of if Condition:
        //if(condition to be checked)
        // Block of code to be executed

        if(a==10) //If(true)
            System.out.println("Value of a is 10");

        a=15;

        if(a==10)
            System.out.println("Value of a is 10");
        //Syntax of if-else:
        //if(condition to be checked)
        //block of code
        //else
        //block of code

        a=15;

        if(a==10)
            System.out.println("Value of a is 10");
        else
            System.out.println("Value of a is not 10");

        a=40-20*300-(32-20-34);

        // % --> Remainder of a number

        if(a%2==0)
            System.out.println(STR."\{a} is divisible by 2");
        else
            System.out.println(STR."\{a} is not divisble by 2");
//-5938+356-239*321
        //-5938+356-76719
        //-5582-76719
        //-82301
        //Self Assignment --> Updated value can be stored in the same variable
        a=a+356-239*321;
        if(a%3==0)
            System.out.println(STR."\{a} is divisble by 3");
        else
            System.out.println(STR."\{a} is not divisble by 3");
        int b=40;
        int c=30;

        // && --> AND Condition (Both the conditions should be true else it returns false)
        if(b%3==0 && c%5==0)
            System.out.println(STR."\{b} is divisble by 3 and \{c} is divisble by 5");
        else
            System.out.println(STR."\{b} is not divisble by 3 and \{c} is not divisble by 5");

        //Short Hand Assignment
        b+=20; //b=b+20
        c-=10; //c=c-10;

        // || ---> OR Condition (Any one of the condition should be true else it returns false)
        if(b%3==0 || c%5==0)
            System.out.println(STR."\{b} is divisble by 3 or \{c} is divisble by 5");
        else
            System.out.println(STR."\{b} is not divisble by 3 neither \{c} is not divisble by 5");

        //Syntax of if-elseif-else:

        //if(condition)
        //block of code
        //else if(condition)
        //block of code
        //else
        //block of code

        //We can have multiple else if between a if and a else
        if(b%4==0 && c%6==0)
            System.out.println(STR."\{b} is divisible by 4 and \{c} is divisible by 6");
        else if(b%5==0 || b%7==0)
            System.out.println(STR."\{b} is either divisible by 5 or 7");
        else
            System.out.println(STR."\{b} or \{b} is divisible by any of the above numbers");

        String s4="New Condition Check";

        char c5=s4.charAt(10);

        System.out.println((int)c5); //Prints the ASCII Value of the character

        if(c5%4==0)
        {
            System.out.println(STR."\{c5} is divisble by 4");
        }

        else if(s4.substring(10,13).equalsIgnoreCase(" "))
            System.out.println("No Sub String Fetched");

        else if(s4.length()==30)
            System.out.println("Length of the string is 30");

        else
            System.out.println("None of the above conditions are satisfied");


        double d2=4.21;
        double d5=4.152;

        char c2='O';

        if((d2-d5) == c2%2)
            System.out.println(STR."\{d2} and \{d5} are equal");

        else if(d2%d5==c2)
            System.out.println(STR."\{d2} and \{d5} are equal to \{c2}");

        else
            System.out.println(STR."\{d2} and \{d5} are not equal to \{c2}");

        double d3=4.21;
        int d4=1221;

        double d10=d4-d3*204-3;

        if(d10%2==0)
            System.out.println(STR."\{d10} is divisible by 2");
        else if(d10%3==0)
            System.out.println(STR."\{d10} is divisible by 3");
        else if(d10%5==0)
            System.out.println(STR."\{d10} is divisible by 5");
        else
            System.out.println(STR."\{d10} is not divisible by 2,3,5");

    }
}
