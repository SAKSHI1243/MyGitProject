package BinarySearch;
public class BinarySearch {
    public static boolean iterativeBS(int []ar, int target){
        int start=0, end= ar.length-1;
        while (start<=end) {
            int mid = (start + end) / 2;
            if (ar[mid] == target) return true;
            else if(ar[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return false;
    }
    public static boolean recursiveBS(int []ar, int start, int end, int target){
        if (start>end) return false;
        int mid= (start+end)/2;
        if(ar[mid]==target) return true;
        else if(ar[mid]>target) return recursiveBS(ar,start,mid-1,target);
        else return recursiveBS(ar, mid+1,end,target);
    }
    public static void main(String[] args) {
        int []ar={3,6,9,10,24};
        System.out.println(iterativeBS(ar,10));
        System.out.println(recursiveBS(ar,0, ar.length,6));
    }
}