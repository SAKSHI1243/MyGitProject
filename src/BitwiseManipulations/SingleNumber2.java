package BitwiseManipulations;
public class SingleNumber2 {
    public static int findUnique(int []nums){
       int ans=0;
        for (int i = 0; i < 32; i++) {
            int cnt=0;
            for (int num:nums) cnt+=(num>>i)&1;
            if(cnt%3!=0) ans|=(1<<i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int []nums={2,5,2,2};
        System.out.println(findUnique(nums));
    }
}
