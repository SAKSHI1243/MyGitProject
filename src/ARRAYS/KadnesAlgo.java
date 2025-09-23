package ARRAYS;
public class KadnesAlgo {
    public static int maxSubarray(int []nums){
        int  max= Integer.MIN_VALUE;
        /*for(int i=0;i<nums.length;i++){
            int s=0;
            for(int j=i;j<nums.length;j++){
                 s+=nums[j];
                max= Math.max(s,max);
            }
        }*/
        int s=0;
        int start=0, ansStart=-1, ansEnd=-1;
        for(int i=0;i< nums.length;i++){
            if(s==0) start=i;
            s+=nums[i];
            if(s>max){
                max=s;
                ansStart=start;
                ansEnd=i;
            }
            if(s<0) s=0;
        }
        for(int i=ansStart;i<=ansEnd;i++) System.out.print(nums[i]+" ");
        System.out.println();
        return max;
    }
    public static int findSum(int []ar){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < ar.length; i++) {
            sum+=ar[i];
            if (sum>max) max=sum;
            if (sum<0) sum=0;
        }
        return max;
    }
    public static void main(String[] args) {
    int []nums={-2,1,-3,4,-1,2,1,-5,4};  //{2,3,5,-2,7,-4};
    int x= maxSubarray(nums);
    System.out.print(x);
    }
}