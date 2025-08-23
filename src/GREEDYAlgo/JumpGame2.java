package GREEDYAlgo;
public class JumpGame2 {
    public static int findMin(int []nums){
        int cnt=0, max=0,end=0;
        for (int i = 0; i < nums.length-1; i++) {
            max= Math.max(max,i+nums[i]);
            if(i==end) {
                cnt++;
                end=max;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int []nums={2,3,1,1,4};
        System.out.println(findMin(nums));
    }
}