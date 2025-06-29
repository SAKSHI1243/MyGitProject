package BinarySearch;
public class SingleElement {
    public static int single(int []ar){
        if(ar.length==1) return ar[0];
        if(ar[0]!=ar[1]) return ar[0];
        if(ar[ar.length-1] !=ar[ar.length-2]) return ar[ar.length-1];
        int low=0, high=ar.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(ar[mid]!=ar[mid-1] && ar[mid]!=ar[mid+1]) return ar[mid];
            else if(mid%2==0 && (ar[mid]==ar[mid+1])|| mid%2==1 &&(ar[mid]==ar[mid-1])) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int []ar={1,1,2,3,3,4,4};
        System.out.println(single(ar));
    }
}