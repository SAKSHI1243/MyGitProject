package SORTING;
public class RecursiveInsertionSort {
    public static void sort(int []ar, int i, int n){
        if(i==n) return;
        for (int j = i; j >0 ; j--) {
            if(ar[j-1]>ar[j]){
                int temp=ar[j-1];
                ar[j-1]=ar[j];
                ar[j]=temp;
            }
        }
        sort(ar,i+1,n);
    }
    public static void main(String[] args) {
        int []ar={6,3,1,9,4};
        sort(ar, 1,ar.length);
        for (int i = 0; i < ar.length; i++) System.out.print(ar[i]+" ");
    }
}