package InterviewQuestions;

import java.util.Arrays;

public class ReverseArray1 {

    public static void main(String[] args) {

        ReverseArray1 obj= new ReverseArray1();
        obj.reverseArray();
    }

    public void reverseArray(){
        int[] arr = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr.length/2; i++ ) //i=0,0<3, 1<3;2<3,3<3,4<3
        {
            int temp= arr [i]; //create variable to store i value
            arr[i]= arr[arr.length-1-i];
            //arr[0]=arr[4-0]=a[4]=5,
            arr[arr.length-1-i]=temp;
            //System.out.println("ReverseArray" + Arrays.toString(arr));
        }
        System.out.println("ReverseArray" + Arrays.toString(arr));
    }
}
