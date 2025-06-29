package ARRAYS;
public class MoveZerosToEnd {
    public static void moveZeros(int []nums){
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) nums[idx++] =nums[i];
        }
        for(int i=idx;i< nums.length;i++) nums[idx++]= 0;
    }
    public static void main(String[] args) {
    int []ar={0,1,0,3,0,12};
    moveZeros(ar);
    for(int i=0;i<ar.length;i++) System.out.print(ar[i]+" ");
    }
}
