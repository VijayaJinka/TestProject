package november27th2024;

import java.awt.datatransfer.StringSelection;

public class Test {
    public static void main(String[] args) {
        //int a=15,b=6,c=3,d=10;

       // System.out.println(   (((a+b)*(c-d))+(b*c)-(a%d)+(b/c)));

      /*  int a=3;
        int b=9;
        //int c=2;
        System.out.println(a*(b/a)+b % a);
        int m=21;
        int n= 9;
        int o=4;
        int p=6;
        System.out.println(((m+n)*(o%p))-((n*p)/m+(o+p)));
        int x=9;
        int y=2;
        System.out.println(x*(y+1)-y);*/

String str= " Counting characters in a string";
        System.out.println("character at index 10:" +str.charAt(10));
        String str1= "HelloWorld";
                String str2= str.substring(5);
                String str3="World";
        System.out.println(str2==str3);
        System.out.println(str2.equals(str3));
        String str33= "concatenate";
        str33=str33.substring(3,8).concat(str33.substring(1,4));
        System.out.println(str33);

        String str18= "hellojava";
        int index = str18.indexOf("java")-1;
        System.out.println(str18.substring(index));
        String strr="immutable";
        strr=strr.substring(5).concat(strr.substring(0,5)).replace('i','l');
        System.out.println(strr);
        String q= "Hello";
        String w= "World! Welcome to Java";
        String combined = q+w;
            System.out.println(combined.charAt(13));
            String we= "Hello\tWorld";
            System.out.println(we.charAt(2));

    }
}
