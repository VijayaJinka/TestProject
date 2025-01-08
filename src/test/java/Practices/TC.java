package Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TC {
    public static void main(String[] args) {
        Integer a4[]={1,2,3,4,5};
        List<Integer>l2= Arrays.asList(a4);
        System.out.println("Iterate over loop");

        for (int i=0;i<l2.size();i++)
        {
            System.out.println(l2.get(i));
        }
        System.out.println("iterare over for each loop");

        Iterator<Integer>i1=l2.iterator();
        while(i1.hasNext())
        {
            System.out.println(i1.next());
        }


    }
}
