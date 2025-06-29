package BinarySearch;
public class RotationNumber {
    public static int findRotation(int []ar){
        int low=0, high= ar.length-1, min=Integer.MAX_VALUE, idx=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(ar[low]<=ar[high]) {
                if(min>ar[low]) {
                    idx=low;
                    min=ar[low];
                }
            }
            if(ar[low]<=ar[mid]){
                if(ar[low]<min){
                    idx=low;
                    min=ar[low];
                }
                low=mid+1;
            }
            else{
                if(ar[mid]<min){
                    idx= mid;
                    min=ar[mid];
                }
                high= mid-1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int []ar={4,5,6,7,0,1,2};
        System.out.println(findRotation(ar));
    }
}
