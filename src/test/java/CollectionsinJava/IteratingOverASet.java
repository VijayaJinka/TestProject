package CollectionsinJava;


import java.util.Iterator;
import java.util.Set;

public class IteratingOverASet {

        public static void main(String[] args) {

            //Creating an unmodifiable set
            //No one cannot modify or add the values to the set
            //It can accept a max of 10 values
            Set<String> data= Set.of("Selenium","Java","Python","C#","Ruby","JavaScript");

            //Iterating over the set

            Iterator<String> i3=data.iterator();

            while (i3.hasNext()) {
                System.out.println(i3.next());
            }

            //Enhanced for loop

            System.out.println("**************");

            //Reading a particular string from a set of string values
            for(String s:data) {
                System.out.println(s);
            }
        }
    }

