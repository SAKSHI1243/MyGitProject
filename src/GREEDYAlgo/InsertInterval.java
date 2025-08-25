package GREEDYAlgo;
import java.util.*;
public class InsertInterval {
    public static int[][] insert(int [][]intervals, int []newInterval){
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>ans=new ArrayList<>();
        boolean inserted=false;
            for (int []i :intervals) {
            if(i[1]<newInterval[0]) ans.add(i);
            else if(i[0]>newInterval[1]) {
                if(!inserted){
                    ans.add(newInterval);
                    inserted=true;
                }
                ans.add(i);
            }
            else{
                newInterval[0]=Math.min(i[0],newInterval[0]);
                newInterval[1]=Math.max(i[1],newInterval[1]);
            }
        }
            if(inserted==false)  ans.add(newInterval);
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {
        int[][]intervals={};
        int []newInterval={2,5};
        int [][]ans=insert(intervals,newInterval);
        for (int[]i:ans) System.out.print(i[0]+","+i[1]+" ");
    }
}