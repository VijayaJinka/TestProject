package november27th2024;

public class DoWhile {
    public static void main(String[] args) {
        //do while loop
        //loop runs atleast once irrespective of the condition is satisfied or not

        int cd= 400;
        do {
            System.out.println("value of cd is: "+cd);
        }
        while (cd<350);

        int a= 12-532;
        do {
            System.out.println("value of a: "+a);
            a++;
            break;// to terminate the loop immediately
        }
        while(a%2==0);
        System.out.println("value of a" +a);

         int c = 50-10*3-400+20;
         do{
             System.out.println("value of c"+c);
             c=c+10;
         }
           while(c%3==0);
        System.out.println("value of c"+c);

        char b= 'K';// character takes Ascii values c= 63, d= 64
        char e= 'L';
        do {
            //here we take the ascii value of the character during any arithmetic operations
            System.out.println(b + e);
             break;
        }
        while (b%2==e%3);

        int f = 40-230-200*210-320; //-42510
        boolean g= false;
        do {
            System.out.println(f);
            if(f%5==0)
                g=true;
            else if (f%2==0||f%3==0)
                g=true;
            else
                g=false;
            f=f+1;
        }
        while(g); //while(true)loop will continue
        //while(false) loop will be stopped
    }
}
