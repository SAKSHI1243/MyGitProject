package ARRAYS;
public class sortZeroOneTwo {
    public static void sort(int []nums){
        for(int i=0;i<nums.length-1;i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []nums={1,0,2,1,0};
        sort(nums);
        for(int i=0;i<nums.length;i++) System.out.print(nums[i]+" ");
    }
}