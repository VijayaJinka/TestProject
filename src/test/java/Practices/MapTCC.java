package Practices;

import java.util.HashMap;
import java.util.Map;

public class MapTCC {

    public static void main(String[] args) {
        Map<String,Integer>m4=new HashMap<String, Integer>();
        m4.put("First",10);
        m4.put("Second",20);

        m4.put("Third",30);

        m4.put("Four",40);
        m4.put("null",null);

        m4.put("Second",50);
        System.out.println(m4);
        System.out.println(m4.size());
        System.out.println(m4.isEmpty());
        System.out.println(m4.keySet());
        System.out.println(m4.values());
        System.out.println(m4.entrySet());
        System.out.println(m4.get("Second"));
        System.out.println(m4.get("six"));
        System.out.println(m4.getOrDefault("six",-1));
        System.out.println(m4.containsKey("Second"));
        m4.remove("null");
        m4.remove("First",10);
        System.out.println(m4);
        m4.clear();
        System.out.println(m4);
        Map<String,Integer>m2=new HashMap<String, Integer>();
        m2.put("Ten", 10);
        m2.put("Hundreds",100);
        m2.put("Thousands",1000);
        System.out.println(m2);
        m4.putAll(m2);
        System.out.println(m4);
        System.out.println(m2.equals(m4));
        m4.putIfAbsent("Hundreds", 900);
        System.out.println(m4);
         m4.compute("Hundreds", (String k, Integer v)->v*10);
        System.out.println(m4);







    }
}
