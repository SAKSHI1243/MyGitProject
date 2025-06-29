package BinarySearch;
public class UpperBound {
    public static int linearSearch(int []ar, int x){
        for (int i = ar.length-1; i>=0; i--) {
            if(ar[i]<=x) return i;
        }
        return ar.length;
    }
    public static int binarySearch(int []ar, int x){
        int low=0, high=ar.length-1, ans=ar.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(ar[mid]<=x) {
                ans=mid;
                low=mid+1;
            }
            else high= mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int []ar={1,2,2,3};
        System.out.println(linearSearch(ar,2));
        System.out.println(binarySearch(ar,2));
    }
}