package December31st;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterationsOverList {

    public static void main(String[] args) {

        Integer a4[]={4,125,12,125,6};

        //Convert the array to a list:
        //It is an unmodifiable list --> We cannot add or remove the elements from the list
        List<Integer> l2= Arrays.asList(a4);

//        l2.add(4125); //UnsupportedOperationException: Because it is an unmodifiable list

        System.out.println("Iterate over using the for loop");
        //Iterating the list using for loop
        for(int i=0;i<l2.size();i++)
        {
            System.out.println(l2.get(i));
        }

        System.out.println("***********************************************************************************");
        System.out.println("Iterate over using the for each loop");
        //Iterating the list using for each loop --> Enhanced version of for loop

        for(Integer i:l2) //Read an individual integer from the list and store it in the variable i
        {
            System.out.println(i);
        }

        System.out.println("***********************************************************************************");
        System.out.println("Iterate over using the iterator");

        //Iterating the list using iterator
        Iterator<Integer> i1=l2.iterator(); //Returns the iterator object

        //Iterator Traverses the list in the forward direction
        //Iterator Object helps us traverse the list

        System.out.println(l2);
        while (i1.hasNext()) //Checks if the next value is present in the list or not
        {
            int val=i1.next(); //Returns the next value in the list
            if(val==125)
//                i1.remove(); //Removes the value from the list (Works with a modifiable list)
                continue; //Skips the value and moves to the next value in the list

            else {
                //After removing the value from the list, if we are trying to print the value,
                // it will throw an exception that is NoSuchElement exception
                System.out.println(val); //Prints the next value in the list
            }
        }

        System.out.println("***********************************************************************************");

        //Iterating over the list using the list iterator:

        //List Iterator helps us traverse the list in both the forward and backward directions

        System.out.println("Iterate over using the list iterator");

        //Converts the list to a list iterator
        //List Iterator is a child class of Iterator
        ListIterator<Integer> l1=l2.listIterator();

        //Prints the list in a reverse order
        while (l1.hasNext())
        {
            System.out.println(l1.next());
        }

        System.out.println("*****************************************************************");
        while(l1.hasPrevious())
        {
            System.out.println(l1.previous());
        }
    }
}