package CollectionsinJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LamdasAndStreamsForCollections {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Dates");
        fruits.add("Elderberry");
        fruits.add("Banana");
        fruits.add("Apple");

        //.forEach() method is used to iterate over the elements of the list
        //Uses the concept of Consumer Interface to accept the elements of the list

        fruits.stream().forEach(s-> System.out.println(s));

        System.out.println("******************");

        //Filter the value whose string length is greater than 5

        //Filters works on the concept of predicate interface
        //Streams works on the concept of Lazy Evaluation
        fruits.stream().filter(s -> s.length()>5).
                forEach(s-> System.out.println(s));

//        for(int i=0;i<fruits.size();i++)
//        {
//            if(fruits.get(i).length()>5)
//                System.out.println(fruits.get(i));
//        }

        System.out.println("******************");

        fruits.stream().filter(s -> s.startsWith("A"))
                .forEach(s-> System.out.println(s));

        System.out.println("******************");

        //Map Function:
        //Acts as a transformer that transforms the input into the output that we want
        //Uses the concept of Function Interface

        //.forEach is a terminal operation
        //.filter is an intermediate operation
        //.map is an intermediate operation

        fruits.stream().filter(s-> s.length()>4)
                .map(s-> s.toUpperCase())
                .forEach(s-> System.out.println(s));

        System.out.println("******************");

        //Prints the length of each string
        fruits.stream().map(s -> s.length()).forEach(s-> System.out.println(s));

        System.out.println("******************");

        //Prints the unique elements present in the list
        //.distinct() is used to get the unique elements

        //Distinct is a intermediate operation
        //distinct returns a stream object

        //On the distinct set of values that we receive we can perform the operations like filter, map

        //.stream() is used to process the data

        fruits.stream().distinct().forEach(s-> System.out.println(s));

        fruits.stream().distinct().filter(s-> s.charAt(2)=='K')
                .map(s-> s.repeat(5)).forEach(s-> System.out.println(s));

        System.out.println("******************");

        //Print the duplicate values in the list:

        //Collections.frequency will let us know how many times a particular element is present in the list
        fruits.stream().filter( s-> Collections.frequency(fruits,s)>1)
                .forEach(s-> System.out.println(s));

        System.out.println("******************");

        //Print the elements in the reverse order

        //.sorted() is used to sort the elements in the list as per our criteria
        //.sorted() is an intermediate operation which implements the logic based on the comparable interface

        fruits.stream().sorted(Collections.reverseOrder()).forEach(s-> System.out.println(s));

        System.out.println("******************");

        //.findFirst() is used to get the first element from the list based on the criteria
        //.ifPresent() is used to print the value if the value is present

        fruits.stream().filter( i -> i.endsWith("y"))
                .findFirst()
                .ifPresent(s-> System.out.println(s));

        System.out.println("******************");

    }

}
