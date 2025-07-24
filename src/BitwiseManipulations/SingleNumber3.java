package BitwiseManipulations;
import java.util.*;
public class SingleNumber3 {
    public static int[] findUnique(int []nums){
        int xor=0,a=0,b=0;
        for (int num:nums) xor^=num;
        int diff=xor&-xor;
        for (int num:nums){
            if((diff&num)!=0) a^=num;
            else b^=num;
        }
        return new int[]{a,b};
    }
    public static void main(String[] args) {
        int []nums={2,3,5,2};
        int[]x=findUnique(nums);
        Arrays.sort(x);
        for (int num:x) System.out.print(num+" ");
    }
}