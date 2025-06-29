package BinarySearch;
public class SearchInsertPosition {
    public static int insertPos(int []ar, int target){
        int l=0, h=ar.length-1,ans=ar.length;
        while(l<=h){
            int mid=(l+h)/2;
            if(ar[mid]>=target) {
                ans=mid;
                h=mid-1;
            }
            else l=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int []ar={1,3,5,6};
        System.out.println(insertPos(ar,2));
    }
}