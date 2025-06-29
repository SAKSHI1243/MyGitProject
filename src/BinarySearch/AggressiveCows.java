package BinarySearch;
import java.util.*;
public class AggressiveCows {
    public static boolean canPlaceCows(int []ar, int dist, int cows){
        Arrays.sort(ar);
        int cnt=1, last=ar[0];
        for (int i = 1; i <ar.length ; i++) {
            if(ar[i]-last>=dist){
                cnt++;
                last=ar[i];
                if(cnt>=cows) return true;
            }
        }
         return false;
    }
    public static int findMaxDistance(int []ar, int cows){
        Arrays.sort(ar);
        for(int i=1;i<(ar[ar.length-1]-ar[0]);i++){
            if(canPlaceCows(ar,i,cows)==true) continue;
            else return i-1;
        }
        return -1;
    }
    public static int findMaxDistanceBS(int []ar, int cows){
        Arrays.sort(ar);
        int low=0, high=ar[ar.length-1]-ar[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(canPlaceCows(ar, mid, cows)==true) low=mid+1;
            else high=mid-1;
        }
        return high;
    }
    public static void main(String[] args) {
        int []ar={1,4,3,7,10,9};
        System.out.println(findMaxDistanceBS(ar,4));
    }
}
