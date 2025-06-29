package BinarySearch;
public class LowerBound {
    public static int lowerBound(int []ar, int x){
        for (int i = 0; i <ar.length; i++) {
            if(ar[i]>=x) return i;
        }
        return ar.length;
    }

    public static int lowerBoundBS(int []ar, int x){
        int low=0, high=ar.length-1, ans=ar.length;
        while (low<=high){
         int mid=(low+high)/2;
         if (ar[mid]>=x) {
             ans= mid;
             high=mid-1;
         }
         else low=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int []ar={1,2,2,3};
        System.out.println(lowerBound(ar,2));
        System.out.println(lowerBoundBS(ar,24));
    }
}