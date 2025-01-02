package CollectionsinJava;
import java.util.HashMap;
import java.util.Map;

public class MapConcepts {

    public static void main(String[] args) {

        //Map:
        //1. Map is an Interface in Java
        //2. It follows the concept of key-value pair
        //3. Each key value pair is called an Entry
        //4. It does not allow duplicate keys , but allows duplicate values
        //5. It allows null keys and null values
        //6. It is being implemented in HashMap, TreeMap, LinkedHashMap, HashTable
        //7. It does not maintain the insertion order

        //If our agenda is to maintain the insertion order for all the entries then we can go for LinkedHashMap
        //If our agenda is to sort the keys in ascending order then we can go for TreeMap

        //Syntax of creating a map:
        //Map<keyDataType, valueDataType> mapName=new HashMap<keyDataType, valueDataType>();

        Map<String, Integer> m4=new HashMap<String, Integer>();

        m4.put("First",1); //Adding the key - value pairs to the map
        m4.put("Second",2);
        m4.put("Third",3);
        m4.put("Fourth",4);
        m4.put("Fifth",5);
        m4.put(null,null);
        m4.put("Second",40);

        System.out.println(m4);

        //Prints the total number of entries present in the map
        System.out.println(m4.size());

        //Checks if the map is empty or not
        //Returns true if the map is empty else returns false
        System.out.println(m4.isEmpty());

        //Returns the list of keys present in the map
        System.out.println(m4.keySet());

        //Returns the list of values present in the map
        System.out.println(m4.values());

        //Prints the entries present in the map
        System.out.println(m4.entrySet());

        //Prints the value that is stored in the key "Second"
        System.out.println(m4.get("Second"));

        //Prints null as the key "Tenth" is not present in the map
        System.out.println(m4.get("Tenth"));

        System.out.println("***********");

        //Prints the value that is stored in the key "Tenth"
        //If the key is not present in the map, then it returns the default value that is passed as the second argument
        System.out.println(m4.getOrDefault("Tenth", -1));
        System.out.println(m4.getOrDefault("Ninth", -1));

        System.out.println("***********");

        //Checks if the key "Second" is present in the map
        //Returns true if the key is present else returns false
        System.out.println(m4.containsKey("Second"));
        System.out.println(m4.containsKey("4214"));

        System.out.println("***********");

        //Checks if the value 40 is present in the map
        //Returns true if the value is present else returns false
        System.out.println(m4.containsValue(40));
        System.out.println(m4.containsValue(4214));

        System.out.println("***********");

        //Replace the value for the key second with 500 as value
        m4.replace("Second",500);

        System.out.println(m4);

        //Replace the value for key 'Fifth' if the old value is 5 with new value 400
        m4.replace("Fifth",5,400);

        System.out.println(m4);

        //Removes the key value pair from the map based on the key
        m4.remove(null);

        System.out.println(m4);

        //Removes the key value pair from the map based on the key and value
        m4.remove("Third",400);

        System.out.println(m4);

        //Replace all the value in the map with an updated Value
        //Here we are using BiFunction functional interface
        m4.replaceAll((k,v)->v*10);

        System.out.println(m4);

        //Clears/Erases all the entries present in the map
        m4.clear();

        System.out.println(m4.isEmpty());

        Map<String, Integer> m5=new HashMap<String, Integer>();

        m5.put("Hundred",300);
        m5.put("Thousand",3000);
        m5.put("TenThousand",30000);

        //Combining the entries of m5 and m4 and storing it in m4
        m4.putAll(m5);

        System.out.println(m4);

        //Adds the key value pair to the map, if the key does not exist
        m5.putIfAbsent("Hundred", 400);

        System.out.println(m5);

        //For that particular if we want to modify the value using some mathematical operations
        //we can use compute
        m5.compute("Hundred", (k,v)->v*10);
        System.out.println(m5);
    }
    }

