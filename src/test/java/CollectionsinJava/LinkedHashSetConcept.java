package CollectionsinJava;

import java.util.Set;
import java.util.LinkedHashSet;


public class LinkedHashSetConcept {


    public static void main(String[] args) {

        //LinkedHashSet:
        //1. It is a class that implements Set Interface.
        //2. It does not allow duplicate values.
        //3. It maintains the insertion order.
        //4. It allows null values.

        //Syntax of creating a LinkedHashSet:
        //We are creating a LinkedHashSet with the help of set interface
        //We are not creating a LinkedHashSet object directly
        //But using the top down approach, we are creating a LinkedHashSet object

        Set<Integer> s3=new LinkedHashSet<Integer>();

        s3.add(3912);
        s3.add(-9312);
        s3.add(3912);
        s3.add(null);
        s3.add(-812784);

        System.out.println(s3);

        System.out.println(s3.size());

        //LinkedHashSet implements the SequencedSet interface
        //Which helps in getting the first element, last element of the set
        //Maintains the insertion order

        LinkedHashSet l4=new LinkedHashSet();

        l4.add("Selenium");
        l4.add("Java");
        l4.add(-2912498);

        System.out.println(l4.getFirst()); //Comes from the SequencedSet interface
        System.out.println(l4.getFirst()); //Comes from the SequencedSet interface

        //Sequenced Set extends Sequenced Collection interface

    }
}