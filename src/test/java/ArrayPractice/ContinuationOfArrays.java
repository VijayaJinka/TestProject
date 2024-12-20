package ArrayPractice;

import java.util.Arrays;

public class ContinuationOfArrays {
    public static void main(String[] args) {

        //Passing the values directly to the array
        int ages[]={50,42,10,62,23,70,23,12};

        //Sort the data in the ascending order
        Arrays.sort(ages);

        System.out.println(Arrays.toString(ages));

        //Print the minimum value in the array
        System.out.println(ages[0]);

        //Print the maximum value in the array
        System.out.println(ages[ages.length-1]);

        int[] a1={40,50,32,2,25,23};

        Arrays.sort(a1);
        //2,23,25,32,40,50
        //40,50,32,2,24,22

        //Prints the index position of the first mismatched element between the two arrays
        //Sorting of data is not required
        System.out.println(Arrays.mismatch(ages,a1));

        int[] a2={40,50,32,2,24,22};

        System.out.println(Arrays.mismatch(a1,a2));

        //Checks if both the arrays are equal or not
        //If the arrays are equal, then it returns true else it returns false
        System.out.println(Arrays.equals(a1,a2));


        //if the arrays are equal, then it returns 0
        //If the first mismatched value in the first array is greater than first mismatched value in the second array, then it return 1
        //If the first mismatched value in the first array is lesser than first mismatched value in the second array, then it return -1
        System.out.println(Arrays.compare(a1,a2));

        String[] a3={"Durgesh","Prabhakar","Balaji"};
        String[] a4={"DurGesh","prabhakar","BAlaJi"};

        //if the arrays are equal, then it returns 0
        //If the first mismatched character is greater than first mismatched character in the second array, then it willl return a +ve value
        //If the first mismatched character is less than first mismatched character in the second array, then it willl return a -ve value
        System.out.println(Arrays.compare(a3,a4));

        //Partial Sorting of data
        //Instead of sorting the complete array, we can sort the array based on index positions
        Arrays.sort(a3,1,3);

        System.out.println(Arrays.toString(a3));

        //If the size of the array is pretty huge, then we have to use the concept
        //of .parallelSort()
    }
}



