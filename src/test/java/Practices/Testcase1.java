package Practices;

import java.util.*;


public class Testcase1 {
public static void main(String[] args) {
    List<Integer> l1= new ArrayList<Integer>();//create alist
    l1.add(215);
    l1.add(345);
    l1.add(10);
    l1.add(null);
    l1.add(20);
    System.out.println(l1);

    System.out.println(l1.size());
    System.out.println(l1.isEmpty());//false
    System.out.println(l1.contains(100));
    System.out.println(l1.contains("hello"));//object is parent of all the classes
    l1.add(3,890);
    System.out.println(l1);

    try {
        System.out.println(l1.get(10));
    }

    catch (IndexOutOfBoundsException r10)
    {
        System.out.println("Index is not present in the list");
    }

    l1.addFirst(21);
    System.out.println(l1);
    l1.addLast(98);
    System.out.println(l1);
    l1.remove(4);
    System.out.println(l1);
    l1.removeFirst();
    System.out.println(l1);
    System.out.println(l1.get(3));

    List<Integer>l2=l1.subList(1,4);
    System.out.println(l2);
    System.out.println(l1.reversed());
    l1.set(3,70);
    System.out.println(l1);

    List<Integer>l4= new ArrayList<Integer>();
    l4.add(10);
    l4.add(20);
    l4.add(30);
    l4.add(40);
   // l4.addAll(l1);
    l1.addAll(l4);
    System.out.println(l1);
    System.out.println(l1.equals(l4));
    //l4.replaceAll(s->0);
    //System.out.println(l4);

    Collections.sort(l4);//ascending
    Collections.shuffle(l4);
    System.out.println(l4);
    Collections.swap(l4,1,2);
    System.out.println(l4);

    }
}
