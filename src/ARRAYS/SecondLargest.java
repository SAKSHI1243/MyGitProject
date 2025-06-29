package ARRAYS;
public class SecondLargest {
    public static int secondMax(int []nums){
        int max=nums[0], smax= nums[0];
        for(int i=1;i< nums.length;i++){
            if(max<nums[i]) max= nums[i];
        }
        for(int i=1;i<nums.length;i++){
            if(smax<nums[i] && nums[i]<max) smax= nums[i];
        }
        return smax;
    }
    public static void main(String[] args) {
        int []ar={1,2,6,8,3,4};
        int x=secondMax(ar);
        System.out.println(x);
    }
}
