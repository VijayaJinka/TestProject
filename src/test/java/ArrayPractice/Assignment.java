package ArrayPractice;

import java.util.Arrays;

public class Assignment {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = arr1;
        arr2[2] = 10;

        System.out.println(Arrays.toString(arr1));//output:[1,2,10,4]

        int[] arr = {1, 2, 3, 4};
        for (int val : arr) {
            val = val * 2; //Even though the value is 2 ,value remains unchanged ,since val is copy of arr[0]=1
            System.out.println(Arrays.toString(arr));//a[0]=1,a[1]=2,a[2]=3,a[3]=4.//output :[1,2,3,4]
        }
//        int arrq[]={1,2,3,4,5,6};
//        for (int i=0,j= arrq.length-1;i<j;i+=2,j=2){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            System.out.println(Arrays.toString(arrq));
//            //i=0,j=5,arr[0]=arr[5],AFter swap arr becomes[6,2,3,4,5,1]

        System.out.println("*******************");
        int arrv[] = {1, 2, 3, 4};
        int[] prefixsum = new int[arr.length];
        prefixsum[0] = arr[0];
        for (int k = 1; k < arr.length; k++) {
            prefixsum[k] = prefixsum[k - 1] + arr[k];
            System.out.println(Arrays.toString(prefixsum));
        }
        //The first element of prefixsum is set to the first element of arrv: prefixsum[0] = arrv[0] = 1.
        //Iteration 1 (k = 1):
        //prefixsum[1] = prefixsum[0] + arrv[1] = 1 + 2 = 3.
        //prefixsum = {1, 3, 0, 0}.
        //System.out.println(Arrays.toString(prefixsum));//2
        //Iteration 2:k=2,k=3,k=4 follow above steps

        int[] arrt = {1, 2, -1, 0, -2, 1};

        int target = 0;

        Arrays.sort(arrt);
        System.out.println(Arrays.toString(arrt));
        System.out.println("****************************");
        int[] arr12 = {4, 5, 4, 5, 3, 2, 3, 8};
        int[] arr23 = {2, 2, 3, 3, 2, 2, 3, 3};
        System.out.println(Arrays.compare(arr12, arr23));
        //not able to solve this problem.problem 6
        System.out.println("********************************");
//Rotate elements in an arrays k position to right
        int[] arrw = new int[]{1, 2, 3, 4, 5};
        //n determine the number of times an array should be rotated.
        int n = 2;

        //Displays original array
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Rotate the given array by n times toward right
        for (int i = 0; i < n; i++) {
            int j, last;
            //Stores the last element of array
            last = arr[arr.length - 1];

            for (j = arr.length - 1; j > 0; j--) {
                //Shift element of array by one
                arr[j] = arr[j - 1];
            }
            //Last element of array will be added to the start of array.
            arr[0] = last;
        }

        System.out.println();

        //Displays resulting array after rotation
        System.out.println("Array after right rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");


        }
    }

}

