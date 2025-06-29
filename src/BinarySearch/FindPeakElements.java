package BinarySearch;
public class FindPeakElements {
    public static int findPeak(int []ar){
        if(ar.length==1) return 0;
        if(ar[0]>ar[1]) return 0;
        if(ar[ar.length-1]>ar[ar.length-2]) return ar.length-1;
        int l=1, h=ar.length-2;
        while(l<=h){
            int mid=(l+h)/2;
            if(ar[mid]>ar[mid+1] && ar[mid]>ar[mid-1]) return mid;
            if(ar[mid]>ar[mid-1]) l= mid+1;
            else h=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int []ar={1,2,3,4,6,5};
        System.out.println(findPeak(ar));
    }
}