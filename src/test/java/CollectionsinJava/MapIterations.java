package CollectionsinJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIterations {
    public static void main(String[] args) {

        Map<String, Integer> m2=new HashMap<String, Integer>();

        m2.put("A", 1);
        m2.put("B", 2);
        m2.put("C", 3);
        m2.put("D", 4);
        m2.put("E", 5);
        m2.put("F", 6);

        //Iterator concept will not work out for map objects

        //Convert the map into a set of entries:
        Set<Map.Entry<String,Integer>> s4=m2.entrySet();

        for(Map.Entry<String,Integer> entry:s4)
        {
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }

    }

}
