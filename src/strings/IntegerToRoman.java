package strings;
import java.util.*;
public class IntegerToRoman {
    public static String convert(int n){
        StringBuilder sb= new StringBuilder();
        LinkedHashMap< Integer,String> mp = new LinkedHashMap<>();
        mp.put(1000,"M");
        mp.put(900,"CM");
        mp.put(500,"D");
        mp.put(400,"CD");
        mp.put(100,"C");
        mp.put(90,"XC");
        mp.put(50,"L");
        mp.put(40,"XL");
        mp.put(10,"X");
        mp.put(9,"IX");
        mp.put(5,"V");
        mp.put(4,"IV");
        mp.put(1,"I");
        for (Map.Entry<Integer,String> entry:mp.entrySet()) {
            while (n>=entry.getKey()){
                sb.append(entry.getValue());
                n-= entry.getKey();
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(convert(3796));
    }
}