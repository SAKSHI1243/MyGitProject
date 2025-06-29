package ARRAYS;
public class NextPermutation {
    public static void swap(int []nums, int i,int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]= temp;
    }
    public static void reverse(int []nums, int i, int j){
        while(j>i){
            swap(nums,i,j);
            i++;j--;
        }
    }
    public static int[] permutation(int []nums){
    int i= nums.length-2;
    while(i>=0 && nums[i]>=nums[i+1]) i--;
    if(i>=0){
        int j= nums.length-1;
        while(nums[j]<=nums[i]) j--;
        swap(nums,i,j);
    }
    reverse(nums,i+1, nums.length-1);
    return nums;
    }
    public static void main(String[] args) {
    int []nums={1,3,2};
    int []x= permutation(nums);
    System.out.print("{");
    for(int i=0;i<x.length;i++) System.out.print(x[i]+" ");
    System.out.print("}");
    }
}