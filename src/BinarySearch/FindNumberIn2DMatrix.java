package BinarySearch;
public class FindNumberIn2DMatrix {
    public static boolean findTarget(int [][]ar, int target){
        int low=0, high=ar.length*ar[0].length-1;
        while (low<=high){
            int mid=(low+high)/2;
            int row=mid/ar[0].length;
            int col=mid%ar[0].length;
            if(ar[row][col]==target) return true;
            else if(ar[row][col]<target) low= mid+1;
            else high= mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int [][]ar={{1,3,5,7},
                   {10,11,16,20},
                   {23,30,34,60}};
        System.out.println(findTarget(ar,16));
        System.out.println(findTarget(ar,8));
    }
}
