package Recursion;
public class ArrayReversal {
    public static void reverse(int []ar, int n){
        if(n==0) return;
        System.out.print(ar[n-1] +" ");
       reverse(ar,n-1);
    }
    public static void main(String[] args) {
        int []ar={1,2,3,4,5};
        reverse(ar,ar.length);
    }
}
