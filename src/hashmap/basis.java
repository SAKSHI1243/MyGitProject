package hashmap;
import java.util.*;
public class basis {
    static void HashMapMethods(){
        HashMap<String,Integer> mp= new HashMap<>();
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",18);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());
        System.out.println(mp.get("Yash"));
        System.out.println(mp.get("www"));
        mp.put("Akash",25);
        System.out.println(mp.get("Akash"));
        System.out.println(mp.containsKey("Akash"));
        System.out.println(mp.remove("Akash"));
        System.out.println(mp.containsKey("Akash"));
        mp.putIfAbsent("Yashika", 30);
        mp.putIfAbsent("Yash", 30);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());
        for(String key: mp.keySet()) System.out.printf("age of %s is %d\n", key,mp.get(key));
        for(Map.Entry<String,Integer> e:mp.entrySet()) System.out.printf("age of %s is %d\n", e.getKey(), e.getValue());
    }
    public static void main(String[] args) {
    HashMapMethods();
    }
}
