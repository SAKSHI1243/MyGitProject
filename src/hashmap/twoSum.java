package hashmap;
import java.util.*;
public class twoSum {
    public  int []twoSums(int []ar, int target){
        /*for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((ar[j]+ar[i])==target)  {
                    ans= new int[]{i,j};
                    return ans;
                }
            }
        }*/
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<ar.length;i++){
            int complement=  target-ar[i];
            if(mp.containsKey(complement)) return new int []{mp.get(complement),i};
            mp.put(ar[i],i);
        }
        return new int []{-1,-1};
    }
    public static void main(String[] args) {
        twoSum obj = new twoSum();
        int[] arr = {2, 7, 11, 15};
        int[] res= obj.twoSums(arr,9);
        System.out.println("Indices: " + Arrays.toString(res));
    }
}
