package BinarySearch;
public class Median {
    public static double findMedian(int []nums1, int []nums2){
        int n1=nums1.length, n2=nums2.length;
        if(n1>n2) return findMedian(nums2,nums1);
        int n=n1+n2;
        int left=(n1+n2+1)/2;
        int low=0, high=n1;
        while(low<=high){
            int mid1=(low+high)/2;
            int mid2=left-mid1;
            int l1=(mid1>0)?nums1[mid1-1]:Integer.MIN_VALUE;
            int l2=(mid2>0)? nums2[mid2-1]:Integer.MIN_VALUE;
            int r1=(mid1<n1)? nums1[mid1]:Integer.MAX_VALUE;
            int r2=(mid2<n2)?nums2[mid2]:Integer.MAX_VALUE;
            if(l1<=r2 && l2<=r1){
                if(n%2==1) return Math.max(l1,l2);
                else return (double)(Math.max(l1,l2)+Math.min(r1,r2))/2.0;
            } else if (l1>r2) high=mid1-1;
            else low=mid1+1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int []ar1={1,2,4,6};
        int []ar2={3,5,9};
        System.out.println(findMedian(ar1,ar2));
    }
}
