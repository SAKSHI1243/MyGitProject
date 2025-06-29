package hashmap;
import java.util.*;
public class rough {
    public static int[] twoSums(int []ar, int target){
        int []ans={-1,-1};
        for(int i=0;i<ar.length;i++){
            int partner= target-ar[i];
            HashMap<Integer,Integer> mp= new HashMap<>();
            if(mp.containsKey(partner)) return new int[]{mp.get(partner),i};
            mp.put(ar[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        twoSum obj = new twoSum();
        int[] arr = {2, 7, 11, 15};
        int[] res= obj.twoSums(arr,9);
        System.out.println("Indices: " + Arrays.toString(res));
    }
}
