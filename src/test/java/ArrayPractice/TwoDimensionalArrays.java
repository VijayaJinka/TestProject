package ArrayPractice;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        //2D Array:
        //Tabular Representation of Data

        //2D array is nothing but array of arrays

        //Syntax of creating a 2d array:
        //dataType [][] arrayName=new dataType[noOfRows][noOfColumns];

        int[][] a4=new int[2][2];

//        [[I@3feba861
        // [[I --> Two Dimensional Integer Array
        // @3feba861 --> Hashcode or the memory reference of the array in the heap
        System.out.println(a4);

        //Prints the array in a readable format
        System.out.println(Arrays.deepToString(a4));

        a4[0][0]=40; //Assigning the value 40 to the 1st row and 1st column
        a4[0][1]=20; //Assigning the value 20 to the 1st row and 2nd column

        a4[1][0]=30; //Assigning the value 30 to the 2nd row and 1st column
        a4[1][1]=10; //Assigning the value 10 to the 2nd row and 2nd column

        System.out.println(Arrays.deepToString(a4));

        System.out.println(a4[0][0]); //Prints the value 40
        System.out.println(a4[0][1]); //Prints the value 20
        System.out.println(a4[1][0]); //Prints the value 30
        System.out.println(a4[1][1]); //Prints the value 10

        //Copying this array a4 into another array where no of rows is 3 and no of columns remains the same
        int[][] a10= Arrays.copyOf(a4, 3);

        System.out.println(Arrays.deepToString(a10));

        //2D Array is nothing but array of arrays
        a10[2]=new int[a4[0].length]; //For the third row, we are creating a new array with 2 columns

        System.out.println(Arrays.deepToString(a10));

        System.out.println(a4.length); //Prints the number of rows
        System.out.println(a4[0].length); //Prints the number of columns
    }

}
