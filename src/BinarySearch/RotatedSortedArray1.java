package BinarySearch;
public class RotatedSortedArray1 {
    public static int findPosition(int []ar, int x){
    int low=0,high=ar.length-1;
    while (low<=high){
        int mid=(low+high)/2;
        if(ar[mid]==x) return mid;
        if(ar[low]<=ar[mid]){
            if(ar[low]<=x && x<=ar[mid]) high=mid-1;
            else low=mid+1;
        }
        else{
            if(ar[mid]<=x && x<=ar[high]) low=mid+1;
            else high=mid-1;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int []ar={7,1};
        System.out.println(findPosition(ar,1));
    }
}