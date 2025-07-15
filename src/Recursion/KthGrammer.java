package Recursion;
public class KthGrammer {
    public static int findKth(int n, int k){
        if(n==1 && k==1) return 0;
        int mid=(int)Math.pow(2,n-1)/2;
        if(k<=mid) return findKth(n-1,k);
        else return 1-findKth(n-1,k-mid);
    }
    public static void main(String[] args) {
    System.out.println(findKth(5,8));
    }
}