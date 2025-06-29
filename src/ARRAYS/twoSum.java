package ARRAYS;
public class twoSum {
    public  static int[]twosum(int[]digits, int target){
        for(int i=0;i< digits.length-1;i++){
            for(int j=i+1;j< digits.length;j++){
                if(digits[i]+digits[j]==target) return new int []{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
    int []ar={1,2,4,5};
     int []x=   twosum(ar,6);
    for(int i=0;i<x.length;i++) System.out.print(i+" ");
    }
}
