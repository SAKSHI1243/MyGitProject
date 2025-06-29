package SORTING;
public class RecursiveBubbleSort {
    // O(n^2) approach
    public static void sort(int []ar, int n){
        if(n==1) return;
        for (int i = 0; i < n-1; i++) {
            if (ar[i]>ar[i+1]){
                int temp=ar[i];
                ar[i]=ar[i+1];
                ar[i+1]=temp;
            }
        }
        sort(ar, n-1);
    }
    // optimized approach
    public static void bubble_sort(int []ar, int n){
        if(n==1) return;
        int didSwap=0;
        for (int i = 0; i < n-1; i++) {
            if(ar[i]>ar[i+1]){
                int temp=ar[i];
                ar[i]=ar[i+1];
                ar[i+1]= temp;
                didSwap=1;
            }
        }
        if (didSwap==0) return;
        bubble_sort(ar, n-1);
    }
    public static void main(String[] args) {
     int []ar={4,1,7,2,9};
     sort(ar,ar.length);
        for (int i = 0; i < ar.length; i++) System.out.print(ar[i]+" ");
        bubble_sort(ar, ar.length);
        System.out.println();
        for (int i = 0; i < ar.length; i++) System.out.print(ar[i]+" ");
    }
}