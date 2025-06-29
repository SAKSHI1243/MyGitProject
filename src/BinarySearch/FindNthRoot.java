package BinarySearch;
public class FindNthRoot {
    public static long power(int base,int n){
        long res=1;
        for (int i = 1; i <=n ; i++) res*=base;
        return res;
    }
    public static int findRoot(int n, int m){
        int low=1, high=m;
        while(low<=high){
            int mid=(low+high)/2;
            int val=(int)power(mid,n);
            if(val==m) return mid;
            else if(val<m) low= mid+1;
            else high= mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(findRoot(2,16));
    }
}