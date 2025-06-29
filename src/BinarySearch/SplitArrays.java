package BinarySearch;
public class SplitArrays {
    public static int findPartition(int []ar, int sub){
        int partition=1,sum=0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]+sum>sub){
                partition++;
                sum=ar[i];
            }
            else sum+=ar[i];
        }
        return partition;
    }
    public static int minimizedLargestSuabrraySum(int []ar, int k){
        int low=Integer.MIN_VALUE,high=0;
        for (int i=0;i<ar.length;i++){
            low=Math.max(low,ar[i]);
            high+=ar[i];
        }
        for (int i = low; i <=high ; i++) {
            int cnt=findPartition(ar,i);
            if(cnt==k) return i;
        }
        return low;
    }
    public static int minimizedLargestSuabrraySumBS(int []ar, int k){
        int low=Integer.MIN_VALUE, high=0;
        for (int i = 0; i < ar.length; i++) {
            low=Math.max(low,ar[i]);
            high+=ar[i];
        }
        while (low<=high){
            int mid=(low+high)/2;
            int cnt=findPartition(ar, mid);
            if(cnt>k) low= mid+1;
            else high=mid-1;
        }
        return low;
    }
    public static void main(String[] args) {
        int []ar={1,2,3,4,5};
        System.out.println(minimizedLargestSuabrraySumBS(ar,3));
    }
}
