package SlidingWindow2P;
import java.util.*;
public class FruitsIntoBasket {
    public static int findTotal(int []fruits){
        HashMap<Integer,Integer>mp= new HashMap<>();
        int start=0,max=0;
        for (int i=start;i<fruits.length;i++){
           if(!mp.containsKey(fruits[i])) mp.put(fruits[i],1);
           else mp.put(fruits[i],mp.get(fruits[i])+1);
           while (mp.size() > 2) {
                       mp.put(fruits[start], mp.get(fruits[start]) - 1);
                       if (mp.get(fruits[start]) == 0) mp.remove(fruits[start]);
                       start++;
                   }
            max=Math.max(max,i-start+1);
           }
return max;
    }
    public static void main(String[] args) {
        int []fruits={1,2,3,2,2};
        System.out.println(findTotal(fruits));
    }
}