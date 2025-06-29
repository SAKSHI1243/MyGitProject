package ARRAYS;
public class consecutiveOne {
    public static int findOnes(int []nums){
        int c=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
                if(c>max) max=c;
            }
            else c=0;
        }
        return max;
    }
    public static void main(String[] args) {
    int []ar={0,1,0,1,1,0,1,1,1};
    int x=findOnes(ar);
    System.out.print(x);
    }
}