package ARRAYS;
import java.util.*;
public class MissingRepeatingNumber {
    public static void findMissingRepeating(int []ar){
        ArrayList<Integer> ans= new ArrayList<>();
        Arrays.sort(ar);
        int n=ar.length;
        for(int i=1;i<n;i++){
            if(ar[i]-ar[i-1]!=1) ans.add(ar[i]);
        }
        for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i)+" ");
    }
    public static void main(String[] args) {
        int []ar={3,1,2,5,3};// 1 2 3 3 5
        findMissingRepeating(ar);
    }
}
