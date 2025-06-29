package SORTING;
public class InsertionSort {
    public static void swap(int []ar, int i, int j){
        int temp =ar[i];
        ar[i]=ar[j];
        ar[j]= temp;
    }
    public static int[] insertionSort(int []ar){
        for (int i = 1; i < ar.length; i++) {
            for (int j = i; j >0 ; j--) {
                if(ar[j-1]>ar[j]) swap(ar, j-1, j);
            }
        }
        return ar;
    }
    public static void main(String[] args) {
        int []ar={7,3,9,1,4,6};
        insertionSort(ar);
        for (int i = 0; i < ar.length; i++) System.out.print(ar[i]+" ");
    }
}