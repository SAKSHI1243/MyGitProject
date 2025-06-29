package ARRAYS;
public class CheckSortedRotated {
    public static  boolean checkSorted(int []nums){
        int idx=0,x=0;
        int []ar= new int[nums.length];
      for(int i=1;i<nums.length;i++){
          if(nums[i-1]>nums[i]) x=i;
      }
      for(int i=x;i< nums.length;i++) ar[idx++]= nums[i];
      for(int i=0;i< x;i++) ar[idx++]=nums[i];
      for(int i=0;i< nums.length;i++) nums[i]=ar[i];
        for(int i=1;i< nums.length;i++){
            if(nums[i-1]>nums[i]) return false;
        }
      return true;
    }
    public static void main(String[] args) {
    int []nums={3,4,5,1,2};
    int []ar={4,1,6};
    System.out.println(checkSorted(nums)+" ");
    System.out.println(checkSorted(ar));
    }
}
