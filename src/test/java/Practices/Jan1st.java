package Practices;

import java.util.HashSet;
import java.util.Set;

public class Jan1st {
    //set:
    //no duplicates,allow null values, implemented in treeset ,HashSet, Linkedhashset
    //no insertionorder
    public static void main(String[] args) {
        Set<Number> q1=new HashSet<Number>();
        q1.add(10.00);
        q1.add(67889.2);
        q1.add(345.1);
        q1.add(10.00);
        q1.add(null);
        System.out.println(q1);
        System.out.println(q1.isEmpty());
        q1.remove(null);
        System.out.println(q1);
        q1.clear();
        Set<Integer>s1=new HashSet<Integer>();
        s1.add(20);
        s1.add(45);
        s1.add(60);
        s1.add(90);
        System.out.println(s1);
        q1.addAll(s1);
        System.out.println(s1);
        q1.retainAll(s1);
        System.out.println(q1);
        System.out.println(q1.equals(s1));



    }



}
