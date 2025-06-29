package BinarySearch;
public class SearchInAMatrix2 {
    public static boolean findTarget(int [][]ar, int target){
        int row=0, col=ar[0].length-1;
        while(row<ar.length && col>=0){
            if(ar[row][col]==target) return  true;
            else if(ar[row][col]< target) row++;
            else col--;
        }
        return false;
    }
    public static void main(String[] args) {
        int [][]ar={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(findTarget(ar,9));
        System.out.println(findTarget(ar,35));
    }
}
