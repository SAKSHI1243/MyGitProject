package ARRAYS;
public class searchInsertPosition {
    public static int searchPosition(int[]ar, int target){
        for (int i=0;i<ar.length;i++){
            if(ar[i]>=target) return i;
        }
        return ar.length;
    }
    public static void main(String[] args) {
        int []ar={1,3,5,6};
        System.out.println(searchPosition(ar,7));
    }
}