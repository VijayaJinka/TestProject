package Practices;

import java.util.*;

public class MapIt {
    public static void main(String[] args) {
//       Map<String,Integer>m2=new HashMap<String, Integer>();
//       m2.put("one",10);
//        m2.put("two",20);
//        m2.put("three",30);
//        System.out.println(m2);
//        Set<Map.Entry<String,Integer>>m4=m2.entrySet();
//        for (Map.Entry<String,Integer>entry:m4){
//            System.out.println(entry.getKey()+"_"+entry.getValue());
//        }
        List<String> m1=new ArrayList<>();
        m1.add("Apple");
        m1.add("Banana");
        m1.add("cherry");
        m1.add("Berry");
        System.out.println(m1);
        m1.stream().forEach(s -> System.out.println(s));
        m1.stream().filter(s -> s.length()>5).forEach(s -> System.out.println(s));
    }
}
