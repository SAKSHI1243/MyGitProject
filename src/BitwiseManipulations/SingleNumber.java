package BitwiseManipulations;
public class SingleNumber {
    public static int unique(int []nums){
        int xor=0;
        for (int i = 0; i < nums.length ; i++) xor^=nums[i];
        return xor;
    }
    public static void main(String[] args) {
        int []nums={4,1,2,1,2};
        System.out.println(unique(nums));
    }
}