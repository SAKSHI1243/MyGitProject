package ARRAYS;
public class uniqueNumber {
    public static int unique(int []nums){
        if(nums.length==1) return nums[0];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) {
                    nums[i]=Integer.MIN_VALUE;
                    nums[j]=Integer.MIN_VALUE;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=Integer.MIN_VALUE) return nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int []ar={1,1,3,2,2};
        int x= unique(ar);
        System.out.print(x);
    }
}
