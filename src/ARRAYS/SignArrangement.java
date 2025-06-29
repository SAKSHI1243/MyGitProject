package ARRAYS;

import java.util.ArrayList;

public class SignArrangement {
    public static int[]rearrange(int []nums){
        int n= nums.length;
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]<0) neg.add(nums[i]);
            else pos.add(nums[i]);
        }
        for(int i=0;i<n/2;i++){
            nums[2*i]= pos.get(i);
            nums[(2*i)+1]=neg.get(i);
        }
    return nums;
    }
    public static void main(String[] args) {
    int []ar={2,4,5,-1,-3,-4};
    int[] res= rearrange(ar);
    for(int i=0;i<ar.length;i++) System.out.print(ar[i]+" ");
    }
}