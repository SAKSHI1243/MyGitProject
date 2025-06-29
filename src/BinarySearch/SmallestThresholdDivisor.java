package BinarySearch;
public class SmallestThresholdDivisor {
    public static int findMin(int []ar, int threshold){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) max=Math.max(max,ar[i]);
        for (int i = 1; i <=max ; i++) {
            int s=0;
            for(int j=0;j<ar.length;j++) s+=Math.ceil((double) ar[j]/(double)i);
            if(s<=threshold) return i;
        }
        return -1;
    }
    public static int findMinBS(int []ar, int threshold){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<ar.length;i++) max= Math.max(max,ar[i]);
        int low=1, high=max;
        while(low<=high){
            int mid=(low+high)/2;
            int s=0;
            for (int i = 0; i < ar.length; i++) s+=Math.ceil((double)ar[i]/mid);
            if(s<=threshold) high= mid-1;
            else low=mid+1;
        }
        return low;
    }
    public static void main(String[] args) {
        int []ar={1,2,3,4,5};
        int ans=findMinBS(ar,8);
        if(ans==-1) System.out.println("value not present in array");
        else System.out.println("minimum divisor="+ans);
    }
}
