package GREEDYAlgo;
import java.util.*;
public class NonOverlappingIntervals {
    public static int findNonOverlapping(int [][]intervals){
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int cnt=0, lastEnd=Integer.MIN_VALUE;
        for (int[] i:intervals){
            if(i[0]>=lastEnd){
                cnt++;
                lastEnd=i[1];
            }
        }
        return intervals.length-cnt;
    }
    public static void main(String[] args) {
        int [][]intervals={{1,2},{2,3},{3,4},{1,3}};
        System.out.println(findNonOverlapping(intervals));
    }
}