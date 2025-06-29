package BinarySearch;
import java.util.*;
public class MedianOfMatrix {
    public static int findMedian(int [][]ar){// brute-force
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) list.add(ar[i][j]);
        }
        Collections.sort(list);
        return list.get((ar.length*ar[0].length)/2);
    }
    public static int findUpperBound(int []ar, int x){
        int low=0, high=ar.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if (ar[mid]<=x) low=mid+1;
            else high= mid-1;
        }
        return low;
    }
    public static int countSmall(int [][]ar, int x){
        int c=0;
        for (int i = 0; i <ar.length ; i++) c+=findUpperBound(ar[i],x);
        return c;
    }
public static int findMedianBS(int [][]ar){
        int low=Integer.MAX_VALUE, high=Integer.MIN_VALUE;
    for (int i = 0; i < ar.length; i++) {
        low=Math.min(low,ar[i][0]);
        high=Math.max(high,ar[i][ar[i].length-1]);
    }
    int req=(ar.length*ar[0].length)/2;
    while (low<=high){
        int mid=(low+high)/2;
        int c=countSmall(ar, mid);
        if(c<=req) low=mid+1;
        else high=mid-1;
    }
    return low;
}
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4, 5},{8, 9, 11, 12, 13},{21, 23, 25, 27, 29}};
        System.out.println(findMedianBS(matrix));
    }
}