package BinarySearch;
public class RotateSortedArray2 {
    public static boolean ifPresent(int []ar, int x){
        int low=0, high= ar.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(ar[mid]==x) return true;
            if(ar[low]==ar[mid]&& ar[mid]==ar[high]) {
                low++;
                high--;
                continue;
            }
            if(ar[low]<=ar[mid]){
                if(ar[low]<=x && x<=ar[mid]) high= mid-1;
                else low= mid+1;
            }
            else{
                if(ar[mid]<=x && x<=ar[high]) low=mid+1;
                else high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []ar={3,4,5,5,1,1,2,3};
        System.out.println(ifPresent(ar,1));
    }
}
