package learning;
import java.util.*;

public class maps {
    public static void main(String[] args) {
        // Old Style
        Map map = new HashMap();
        // adding elements
        map.put(1, "Em");
        map.put(5, "Slim");
        map.put(2, "Shady");
        map.put(6, "Marshall");
        // traversing map
        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            // converting to map.entry
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        // New Style
        Map<Integer,String> map1=new HashMap<Integer,String>();
        map1.put(100,"Ed");
        map1.put(101,"Shreen");
        map1.put(102,"Galway");
        //Elements can traverse in any order
        for(Map.Entry m:map1.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        // comparingByKey()
        Map<Integer, String> map3 = new HashMap<Integer, String>();
        map3.put(100,"Ed");
        map3.put(101,"Shreen");
        map3.put(102,"Galway");
        // returns Set view
        map3.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
}
