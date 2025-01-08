package Practices;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIreating {
    public static void main(String[] args) {
        Set<String> st= Set.of("Java","python","Selenium");
        Iterator<String> i3= st.iterator();
        while (i3.hasNext()){
            System.out.println(i3.next());
        }
for (String s:st){
    System.out.println(s);
}

    }
}
