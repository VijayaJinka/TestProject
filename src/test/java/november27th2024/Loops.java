package november27th2024;

public class Loops {
    public static void main(String[] args) {

        //Looping Statements:
        //Repeating the code multiple times until the condition is satisfied

        //Different Types of Loop statments:
        //1. while
        //2. do-while (Used Very Rarely)
        //3. for
        //4. for-each

        //Syntax of while loop:
        //while(condition to be checked)
        //Block of code to be executed

        int b=40;

        // != (Value present on the left hand side is not same as value present on the right hand side)
        while(b!=40){
            System.out.println(b);
        }

        //Loop runs for infinite times
      // while((b-30)%3!=0)
          // System.out.println(b);
        while(b<60) {
            System.out.println(b);
            //b+=1; //b+1, 40,41,42----59
            b = b+1;
        }

        System.out.println("************************************");
        while(b>30)
        {
            System.out.println(b);
            //b*=10;
            b = b * 10;

        }
        System.out.println("************************************");


        b=30;

        while(b>0) //b=0
        {
            System.out.println(b*2); //print value 60
            b=b/2;
        }

//Iteration 1: while( 30>0),sop(30*2)=60,b/2=30/2=15
        //Iteration2 : b=15,while(15>0),sop(15*2)=30,b=15/2=7
        //Iteration 3: b=7,while(7>0),sop(7*2)=14, b=7/2=3
        //Iteration 4: b=3,while(3>0)sop(3*2)=6,b=3/2=1
        //Iteration 5: b=1;while(1>0)sop(1*2)=2, b=1/2=0


    }
}
