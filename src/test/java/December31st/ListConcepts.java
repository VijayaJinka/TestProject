package December31st;


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class ListConcepts {

        public static void main(String[] args) {

            //Collection is a framework that is used to modify, add, update or delete the records easily
            //Collection is an interface

            //Collections also works with the concept of Generics
            //Works predominantly for dynamic set of data

            //List is a child interface of Collection

            //List:
            //1. It is an interface
            //2. It allows duplicate values
            //3. It allows null values
            //4. It preserves the insertion order (FIFO), we can access the values based on the index
            //5. It is implemented in the classes --> ArrayList, LinkedList, Vector, Stack

            //Syntax of creating a list:
            List<Integer> l1=new ArrayList<Integer>();

            l1.add(215); //Adding the values to the list
            l1.add(42);
            l1.add(21556);
            l1.add(215);
            l1.add(null);
            l1.add(12325);

            //Printing the values of the list
            System.out.println(l1);

            //Size of the list
            System.out.println(l1.size());

            //Checking if the given list is empty or not
            //Returns true if the above condition is satisfied else it returns false
            System.out.println(l1.isEmpty());

            //Checking if the list contains the given value or not
            //Returns true if the above condition is satisfied else it returns false
            System.out.println(l1.contains(10024)); //false
            System.out.println(l1.contains(215)); //true

            //Object is the parent class of all the classes in Java
            System.out.println(l1.contains("Hello")); //false

            //Adding the value to the list at the 5th index position
            //Remaining elements in the list will be shifted to the right by 1 position
            l1.add(5,49821);

            System.out.println(l1);

            //Adding the value to the list at the start
            l1.addFirst(2155566); //JDK 21 onwards

            //Adding the value to the list at the end
            l1.addLast(215216); //JDK 21 onwards

            System.out.println(l1);

            //Removing the value from the list

            //Removes the values from the list based on the index
            l1.remove(6);

            System.out.println(l1);

            //Removes the values from the list based on the provided value
            l1.remove(null);

            System.out.println(l1);

            //Removes the values from the list at the start
            l1.removeFirst(); //JDK 21 onwards
            System.out.println(l1);

            //Removes the values from the list at the end
            l1.removeLast(); //JDK 21 onwards
            System.out.println(l1);

            //Prints the value at the given index
            //5th index value
            //Below line throws IndexOutOfBoundsException if the index is not present in the list

            try {
                System.out.println(l1.get(5));
            }

            catch (IndexOutOfBoundsException r5)
            {
                System.out.println("Index is not present in the list");
            }

            System.out.println(l1.get(2));
            System.out.println(l1.get(1));

            //Creating a sublist from the list
            //Includes the start index and excludes the end index
            List<Integer> l2=l1.subList(1,4); //JDK 21 onwards

            System.out.println(l2);
            System.out.println(l1);

            //Prints the list in the reverse order
            System.out.println(l1.reversed()); //JDK 21 onwards

            //Replacing the value at the given index
            //Replaces the value at the 3rd index with 490
            l1.set(3,490);

            System.out.println(l1);

            //Clears all the values from the list
//        l1.clear();

            System.out.println(l1);

            System.out.println(l1.isEmpty()); //true

            List<Integer> l4=new ArrayList<Integer>();

            l4.add(4125215);
            l4.add(214);
            l4.add(21255);
            l4.add(9540);
            l4.add(212);

            //Adding all the values from the list l4 to the list l1
            //Union of the two lists
            l1.addAll(l4);

            System.out.println(l1);

            //.equals function will check if the two lists are equal or not in terms of values
            //Both the lists are equal as l1 is empty and l1 contains all the values of l4
            System.out.println(l1.equals(l4)); //true

            //Retains the common values between the two lists and stores it in l1
            //Intersection of the two lists
            l1.retainAll(l4);

            System.out.println(l1);

            //Removes all the values of l4 stored in l1 and stores the remaining values in l1
            //Difference of the two lists
            l1.removeAll(l4);

            System.out.println(l1);

            //Converting the list to an array
            Object[] arr=l4.toArray();

            System.out.println(Arrays.toString(arr));

            //Converting the list to an array with a specific type
            //Throws ArrayStoreException if the type of the array is not matching with the type of the list
            Integer[] arr1=l4.toArray(new Integer[l4.size()]);

            System.out.println(Arrays.toString(arr1));

            //Converting the list to a string
            System.out.println(l4.toString());

            //Remove the values from the list only when the condition is satisfied
            //Remove the values from the list if it is an odd number

            //Accepts the Predicate interface as the argument as we are filtering the values based on the condition
            l4.removeIf( s-> s%2!=0);

            System.out.println(l4);

            //UnaryOperator interface is used to replace all the values in the list with the given value
            //As we need to replace all the values in the list with 0, we are using UnaryOperator interface
            l4.replaceAll( s->s+40);

            System.out.println(l4);

            //Unary Operator Interface and Binary Operator Interface are the child interfaces of Function Interface
            //Which is primarily used during the modification of the values in the Collections

            //Sort the values in the list
            Collections.sort(l4); //Sorts the data in Ascending order

            System.out.println(l4);

            Collections.shuffle(l4); //Shuffles the data in the list

            System.out.println(l4);

            //Swaps the values at the given indexes
            //Swap the values that is present at 1st index with the value that is present at 2nd index
            Collections.swap(l4,1,2);

            System.out.println(l4);

            System.out.println("********************************************************************************************");
        }
    }

