package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
//    int[] arr={1,2,3};
//    int [][] arr1={
//            {1,2},{2,3}(

 //   };

    public static void main(String[] args) {
     ReverseArray obj= new ReverseArray();
    obj.revArray();


    }

//    public void Arraybasics(){
//        int[] inputArray={2,3,4};
//
//       int n=inputArray.length;
//
//        for (int i=0, j=n-1;i<j;i++,j--){
//
//      // for(int i=inputArray.length;i>=0;i--){
//
//            int temp=inputArray[i];
//            inputArray[i]=inputArray[j];
//            inputArray[j]=temp;
//
//
//        }
//        System.out.println("Arraybasics"+ Arrays.toString(inputArray));
//    }

    public void revArray()
    {
        int[]arr2={2,3,4};
        Collections.reverse(Arrays.asList(arr2));
        System.out.println("revArray" +Arrays.toString(arr2));
    }

}
