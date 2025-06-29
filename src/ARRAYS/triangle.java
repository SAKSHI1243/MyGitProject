package ARRAYS;
public class triangle {
    public  static String triangleType(int[] nums) {
        int n= nums.length;
        if(n!=3) return "not a triangle";
        if(nums[0]+nums[1]>nums[2] && nums[0]+nums[2]>nums[1] && nums[1]+nums[2]>nums[0]) {
            if(nums[0]==nums[1] && nums[0]==nums[2]) return "equilateral triangle";
            else if((nums[0]==nums[1] && nums[0]!=nums[2])|| (nums[1]==nums[2] && nums[0]!=nums[1])|| (nums[0]==nums[2] && nums[0]!=nums[1])) return "iscoceles triangle";
            else if(nums[0]!= nums[1]&& nums[0]!=nums[2] && nums[1]!=nums[2]) return "scalane triangle";
        }
        return "not a triangle";
    }
    public static void main(String[] args) {
    int []nums={1,1,2};
    String str= triangleType(nums);
    System.out.println(str);
    }
}
