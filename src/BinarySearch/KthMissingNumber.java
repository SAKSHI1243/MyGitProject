package BinarySearch;
public class KthMissingNumber {
    public static int findMissing(int []ar, int k){
        int c=0,x=ar[ar.length-1];
        int []count= new int[x+1];
        for (int i = 0; i < ar.length; i++) count[ar[i]]++;
        for (int i = 1; i < count.length; i++) {
            if(count[i]==0){
                c++;
                if(c==k) return i;
            }
        }
        return -1;
    }
    public static int findMissingBS(int []ar, int k){
        int low=0, high=ar.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int missing=ar[mid]-(mid+1);
            if(missing<k) low=mid+1;
            else high=mid-1;
        }
        return low+k;
    }
    public static void main(String[] args) {
        int []ar={2,3,4,7,11};
        System.out.println(findMissingBS(ar,5));
    }
}