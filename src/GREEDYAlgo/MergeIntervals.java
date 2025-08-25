package GREEDYAlgo;
import java.util.*;
public class MergeIntervals {
    public static int[][] merge(int[][]intervals){
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> ans= new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if(ans.isEmpty()||intervals[i][0]>ans.get(ans.size()-1)[1])  ans.add(new int[]{intervals[i][0],intervals[i][1]});
            else ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],intervals[i][1]);
        }
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {
        int [][]interval={{1,3},{2,6},{8,10}};
        int [][]ans=merge(interval);
        for (int[] i:ans) System.out.print(i[0]+","+i[1]+"  " );
    }
}