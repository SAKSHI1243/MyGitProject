package BinarySearch;
public class KthElement {
    public static int findKthPos(int []nums1, int []nums2, int k){
        int n1= nums1.length, n2= nums2.length;
        if(n1>n2) return findKthPos(nums2,nums1,k);
        int low=Math.max(0,k-n2), high=Math.min(k,n1);
        while (low<=high){
            int mid1=(low+high)/2;
            int mid2=k-mid1;
            int l1=(mid1==0)?Integer.MIN_VALUE:nums1[mid1-1];
            int l2=(mid2==0)?Integer.MIN_VALUE:nums2[mid2-1];
            int r1=(mid1==n1)?Integer.MAX_VALUE:nums1[mid1];
            int r2=(mid2==n2)?Integer.MAX_VALUE:nums2[mid2];
            if(l1<=r2 && l2<=r1) return Math.max(l1,l2);
            else if(l1>r2) high= mid1-1;
            else low= mid1+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int []ar1={2,6,9};
        int []ar2={1,5,7,8};
        System.out.println(findKthPos(ar1,ar2,4));
    }
}