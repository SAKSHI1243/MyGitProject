package SlidingWindow2P;
public class MaxConsecutiveOnes {
    public static int findMaxConsecutive(int []nums, int k){
        int start=0, max=0,zcnt=0;
        if(nums.length==0) return 0;
        for (int i = start; i < nums.length ; i++) {
            if(nums[i]==0) zcnt++;
            while (zcnt>k){
                if(nums[start]==0) zcnt--;
                start++;
            }
            max=Math.max(max,i-start+1);
        }
        return max;
    }
    public static void main(String[] args) {
        int []nums={1,1,1,0,0,0,1,1,1,1,0,0};
        System.out.println(findMaxConsecutive(nums,2));
    }
}