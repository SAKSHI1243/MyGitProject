package ARRAYS;
public class mergeArray {
    public  static void merge(int[] nums1, int m, int[] nums2, int n) {
        int []res= new int[m+n];
        for(int i=0;i<m;i++)    res[i]=nums1[i];
        for(int i=0;i<n;i++) res[m+i]=nums2[i];
        for(int i=1;i<res.length;i++){
            if(res[i-1]>res[i]){
              int temp=res[i-1];
              res[i-1]=res[i];
              res[i]= temp;
            }
        }
        for(int i=0;i< res.length;i++) System.out.print(res[i]+" ");
    }
public static void main(String[] args) {
    int []nums1={4,5,6,0,0,0};
    int []nums2={1,2,3};
    merge(nums1,3,nums2,3);
}
}


