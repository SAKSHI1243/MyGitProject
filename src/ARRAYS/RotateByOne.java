package ARRAYS;
public class RotateByOne {
    public static void rotate(int []nums){
        int temp=nums[0];
        int idx=0;
        for(int i=1;i< nums.length;i++) nums[idx++]=nums[i];
        nums[nums.length-1]=temp;
        for(int i=0;i< nums.length;i++) System.out.print(nums[i]+" ");
    }
    public static void main(String []args){
        int []ar={1,2,3,4,5};
        rotate(ar);
    }
}
