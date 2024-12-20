package ArrayPractice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int a4[]={50,21,53,6,3,-30,-59,205};

        for(int i=0;i<a4.length;i=i+1)
        {
            for(int j=i+1;j<a4.length;j+=1)
            {
                if(a4[i]>a4[j])
                {
                    //Swap the data
                    int temp=a4[i];
                    a4[i]=a4[j];
                    a4[j]=temp;
                }

                System.out.println(Arrays.toString(a4));
            }
        }
    }

}
