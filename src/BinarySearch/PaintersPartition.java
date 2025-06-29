package BinarySearch;
public class PaintersPartition {
    public static int findNoOfPainters(int []ar, int time){
        int painter=1,totalTime=0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]+totalTime>time){
                painter++;
                totalTime=ar[i];
            }
            else totalTime+=ar[i];
        }
        return painter;
    }
    public static int findMinimumTime(int []ar, int k){
        int low=Integer.MIN_VALUE, high=0;
        for (int i = 0; i < ar.length ; i++) {
            low=Math.max(ar[i], low);
            high+=ar[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            int cnt=findNoOfPainters(ar, mid);
            if(cnt>k)low= mid+1;
            else high=mid-1;
        }
        return low;
    }
    public static void main(String[] args) {
        int []ar={10,20,30,40};
        System.out.println(findMinimumTime(ar,2));
    }
}
