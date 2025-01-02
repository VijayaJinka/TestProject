package CollectionsinJava;

import java.util.HashSet;
import java.util.Set;

public class SetConcepts {
    public static void main(String[] args) {

        //We cannot use any sort of primitive data types in the collections
        //As per the generics concept, we can only use the objects in the collections
        //Generics is used to prevent the class cast exceptions or type mismatch exceptions

        //That is the reason we are using the wrapper classes of the primitive data types

        //int -> Integer
        //float -> Float
        //double -> Double
        //char -> Character
        //boolean -> Boolean
        //byte -> Byte
        //short -> Short

        //Set:
        //It is an interface
        //It does not allow duplicate Values
        //It allows null values
        //It is being implemented in TreeSet, hashset, LinkedHashSet
        //It does not maintain the insertion order

        //Syntax of creating a set:
        Set<Number> s4=new HashSet<Number>();

        s4.add(-4291.0);
        s4.add(4291.0);
        s4.add(4291.0);
        s4.add(null);
        s4.add(-84215.4125);

        System.out.println(s4);

        System.out.println(s4.size());

        System.out.println(s4.isEmpty());

        s4.remove(null); //Removes the null value from the set

        System.out.println(s4);

        //Returns true if the value is present in the set
        //else returns false
        System.out.println(s4.contains(4291.0));

        //Removes all the values from the set
        s4.clear();

        Set<Integer> s5=new HashSet<Integer>();

        s5.add(-4095);
        s5.add(40945);
        s5.add(40945);
        s5.add(null);
        s5.add(-84215);

        System.out.println(s5);

        //Union Operation
        //It will add all the values from the set s5 to the set s4
        //In this case , the set s4 data type is Number and the set s5 data type is Integer
        //In this case, addAll method will work because the Integer is a child class of Number
        s4.addAll(s5);

        System.out.println(s4);

        //Intersection Operation
        //It will retain all the common values from the set s4 and s5 and stores in s4
        s4.retainAll(s5);

        System.out.println(s4);

        //Returns true if the values are equal
        //else returns false
        System.out.println(s4.equals(s5));

        //Difference Operation
        //It will remove all the common values from the set s5 that is present in the set s4
        s4.removeAll(s5);
        System.out.println(s4);
    }
}
