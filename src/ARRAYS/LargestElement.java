package ARRAYS;
public class LargestElement {
    public static int maxEle(int []nums){
        int max=nums[0];
        for(int i=1;i< nums.length;i++){
            if(max<nums[i]) max= nums[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int []ar={1,5,2,3};
        int x=maxEle(ar);
        System.out.println(x);
    }
}
