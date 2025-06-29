package BinarySearch;
public class FindMinimum {
    public static int min(int []ar){
        int low=0, high=ar.length-1, m=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if (ar[low]<=ar[high]){
                m=Math.min(m,ar[low]);
                break;
            }
            if(ar[low]<=ar[mid]) {
                m=Math.min(m,ar[low]);
                low=mid+1;
            }
            else {
                m=Math.min(m,ar[mid]);
                high= mid-1;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int []ar={5,6,7,1,2,3};
        System.out.println(min(ar));
    }
}
