package Practices;

import java.util.LinkedHashSet;
import java.util.Set;

public class Link {
    public static void main(String[] args) {
        Set<Integer>s3=new LinkedHashSet<Integer>(); //no duplicates,preserves order,allow null values
        s3.add(3912);
        s3.add(7890);
        s3.add(345);
        s3.add(23445);
        System.out.println(s3);

        
    }
}
