package ARRAYS;
public class TargetSum {
    public static int []sum(int []nums,int target){
        int []ar= new int [2];
        for(int i=0;i< nums.length-1;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ar[0]=i;
                    ar[1]=j;
                }
            }
        }
        return ar;
    }
    public static void main(String[] args) {
        int []ar={1,6,2,10,3};
        int []x=sum(ar,7);
        for (int i=0;i<x.length;i++) System.out.print(x[i]+" ");
    }
}
