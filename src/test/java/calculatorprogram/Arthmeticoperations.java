package calculatorprogram;

public class Arthmeticoperations {

    public void add(int a, int b)   //instance variable
    {
        System.out.println("The sum of two numbers" +(a+b));
    }
    public void subtraction(int a, int b)
    {
        System.out.println("subtraction of two numbers" +(a-b));
    }
    public void multiplication(int a, int b)
    {
        System.out.println("multiplication of two numbers" +(a*b));

    }
    public void division(int a, int b)
    {
        System.out.println("division of two numbers" +(a%b));
    }
    public void factorial(int n)
    {
        int fact=1;
        if(n==0 || n==1) {
            System.out.println("The factioral of " + n + " is +:1");
        } else if (n<0) {
            System.out.println("there is no factorial for negative number");

        }
    }
    public void power(int a, int b)
    {
        System.out.println(STR."power of a and b\{Math.pow(a, b)}");
    }

    public void logarithm(int n)
    {
        System.out.println("logarthim" +Math.log10(n));
    }
    public void squareroot(int a)
    {
        System.out.println("squareroot"+ Math.sqrt(a));
    }
    public static void main(String[] args) {
        Arthmeticoperations ao= new Arthmeticoperations(); //local variable
        ao.add(30,20);
        ao.subtraction(100,20);
        ao.multiplication(30,20);
        ao.division(70, 20);
        ao.factorial(4);
        ao.squareroot(64);
        ao.logarithm(50);
        ao.power(4,2);
    }
}
