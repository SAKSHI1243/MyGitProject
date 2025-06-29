package BinarySearch;
public class FindSquareRoot {
    public static int squareRoot(int n){
        int low=1, high=n,ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid<=n) {
                ans=mid;
                low=mid+1;
            }
             else high= mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(squareRoot(26));
    }
}