package ARRAYS;
import java.util.*;
public class OverlappingArray {
    public static List<List<Integer>> sortOverlapping(int [][]ar){
        Arrays.sort(ar,(a,b)->a[0]-b[0]);
        List<List<Integer>> ans= new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            int start=ar[i][0];
            int end=ar[i][1];
            if(!ans.isEmpty() &&  end<=ans.get(ans.size()-1).get(1)) continue;
            for (int j = i+1; j <ar.length ; j++) {
                if (ar[j][0]<=end) end= Math.max(end,ar[j][1]);
                else break;
            }
            ans.add(Arrays.asList(start, end));
        }
        return ans;
    }
    public static List<List<Integer>> mergeOverlappingArray(int [][]ar){
        List<List<Integer>> ans= new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            if (ans.isEmpty() || ar[i][0]>ans.get(ans.size()-1).get(1)) ans.add(Arrays.asList(ar[i][0], ar[i][1]));
            else ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),ar[i][1]));
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] ar = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        List<List<Integer>> ans=mergeOverlappingArray(ar);
        for (int i=0;i<ans.size();i++) System.out.print(ans.get(i)+" ");
    }
}