package BitwiseManipulations;
import java.util.*;
public class SingleNumber3 {
    public static int[] findUnique(int []nums){
        int xor=0,a=0,b=0;
        for (int i = 0; i < nums.length; i++) xor^=nums[i];
        int diff=xor&-xor;
        for (int i = 0; i < nums.length ; i++) {
            if((nums[i]&diff)==0) a^=nums[i];
            else b^=nums[i];
        }
        return new int[]{a,b};
    }
    public static void main(String[] args) {
        int []nums={1,2,1,3,5,2};
        int[]x=findUnique(nums);
        Arrays.sort(x);
        for (int num:x) System.out.print(num+" ");
    }
}