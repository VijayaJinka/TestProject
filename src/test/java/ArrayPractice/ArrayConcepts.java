package ArrayPractice;

import java.util.Arrays;

public class ArrayConcepts {
    public static void main(String[] args) {

        //Arrays: Collection of homogenous set of data

        //Array is a fixed data structure, because once we create the size of an array we cannot modify it
        //at any point of time

        //Syntax of creating an array:
        //dataType arrayName=new dataType[size of the array];

        //Here we need to mention the size of the array upfront, because it needs to know how much memory should be allocated in the heap
        //While declaring the arrayName, please follow the rules used to declare the variable

        int a1[]=new int[5];

        //[I@3feba861 --> I --> (represents an Integer Array)
        //@3feba861 --> Memory Reference of the array in the heap
        System.out.println(a1);

        //Prints the array in a readable format
        System.out.println(Arrays.toString(a1));

        //Fills the complete array with value as 20
        Arrays.fill(a1,20);

        System.out.println(Arrays.toString(a1));

        //Copying the array a1 into another array whose size is 10
        int b1[]= Arrays.copyOf(a1,10);

        System.out.println(Arrays.toString(b1));

        //Filling the array b1 from 5th index position to 10th index position with value as 30
        //Inclusive of starting index position and exclusive of end index position
        Arrays.fill(b1,5,10,30);

        System.out.println(Arrays.toString(b1));

        //Copying the values of b1 array into another array c1 from index position 5 to 10
        int c1[]= Arrays.copyOfRange(b1,5,10);

        System.out.println(Arrays.toString(c1));

        System.out.println("********************************************************************************");

        double[] d1=new double[5];

        for(int i=0;i<d1.length;i+=1)
        {
            d1[i]=4.5*i;

//            System.out.println(Arrays.toString(d1));
        }

        System.out.println(Arrays.toString(d1));

        d1[0]=10.25; //We can modify the value for a particular index position

        System.out.println(Arrays.toString(d1));

        System.out.println("Sum of two double values from the array is: "+(d1[0]+d1[1]));

        System.out.println("********************************************************************************");

        String d2="Sample Test Data";

        char[] e1=d2.toCharArray(); //Converting the whole string into an array of characters

        System.out.println(Arrays.toString(e1));

        //Print the number of words present in the string
        String[] d3=d2.split(" "); //.split() will return an array of strings
        System.out.println(d3.length); //Prints the number of words present in the string

        d3=d2.split("Test");
        System.out.println(Arrays.toString(d3));
        System.out.println(d3.length);

        //Print the length as 1
        //If we are giving a word or any special character that does not exist in the string
        //then it will not throw an error, instead the original string will be part of the array
        System.out.println(d2.split("New").length);

        d2="Sample Test Data";
        //split the string on the basis of white space and the maximum length of the array should be 2
        System.out.println(Arrays.toString(d2.split(" ",2)));

    }

}
