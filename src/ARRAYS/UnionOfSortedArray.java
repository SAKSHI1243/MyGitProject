package ARRAYS;
public class UnionOfSortedArray {
    public static void swap(int []nums, int i, int j){
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
    public static void sort(int []nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]>nums[j]) swap(nums,i,j);
            }
        }
    }
    public static int[]union(int []nums1, int []nums2){
        int n1=nums1.length;
        int n2= nums2.length;
        int idx=0;
        int []res=new int [n1+n2];
        for(int i=0;i<n1;i++) res[idx++]= nums1[i];
        for(int i=0;i<n2;i++) res[idx++]= nums2[i];
        sort(res);
        int [] result= new int[idx];
        int resIdx=0;
        result[resIdx++]=res[0];
        for(int i=1;i<res.length;i++){
            if(res[i-1]!=res[i]) result[resIdx++]=res[i];
        }
        int []finalRes= new int[resIdx];
        for(int i=0;i<resIdx;i++) finalRes[i]=result[i];
        return finalRes;
    }
    public static void main(String[] args) {
    int []nums1={2,3,4,5};
    int []nums2={6,1,2,7};
     int []res=union(nums1,nums2);//1 2 3 4 5 6 7
        for(int i=0;i< res.length;i++) System.out.print(res[i]+" ");
    }
}