package ARRAYS;
public class removeDuplicates {
    public static int removeDup(int []nums){
        if(nums.length==0) return 0;
        int idx=1;
        for(int i=1;i< nums.length;i++){
            if(nums[i-1]!=nums[i]) nums[idx++]=nums[i];
        }
        for(int i=0;i<idx;i++) System.out.print(nums[i]+" ");
        return idx;
    }
    public static void main(String[] args) {
    int []ar={0,0,1,1,1,2,2,3,3,4};
    int x=removeDup(ar);
    System.out.println();
    System.out.println("length of an array is: "+x);
    }
}
