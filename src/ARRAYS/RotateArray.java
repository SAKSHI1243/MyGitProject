package ARRAYS;
public class RotateArray {
    public static void reverse(int []ar, int i, int j){
        while(i<j){
            int temp=ar[i];
            ar[i++]=ar[j];
            ar[j--]=temp;
        }
    }
    public static void rotate(int[]nums,int k){
        int n= nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        for(int i=0;i<n;i++) System.out.print(nums[i]+" ");
    }
    public static void main(String[] args) {
        int []ar={1,2,3,4,5,6,7};
        int k=10;
        rotate(ar,k);
    }
}
