package ARRAYS;
public class MajorityElements {
    public static int majority(int []nums){
        int  max=0,c=0,x=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i;j< nums.length;j++) {
                if (nums[i] == nums[j]) c++;
            }
                if(c>max) {
                    x= nums[i];
                    max= c;
                }
                c=0;
        }
        return x;
    }
    public static void main(String[] args) {
       int []nums ={7, 0, 0, 1, 7, 7, 2, 7, 7};
        int x= majority(nums);
        System.out.print(x);
    }
}
