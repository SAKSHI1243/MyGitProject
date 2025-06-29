package SORTING;
public class SelectionSort {
    public static int findMinimum(int []ar,int x){
        int minIdx=x;
        for(int i=x+1;i<ar.length;i++){
            if(ar[i]<ar[minIdx]) minIdx=i;
        }
        return minIdx;
    }
    public static int[] selectionSort(int []ar){
        for (int i = 0; i < ar.length-1; i++) {
            int min=findMinimum(ar,i+1);
            if(ar[i]>ar[min]) {
                int temp=ar[i];
                ar[i]=ar[min];
                 ar[min]=temp;
            }
        }
       return ar;
    }
    public static int[]sort(int[]ar){
        for (int i = 0; i < ar.length-1; i++) {
            int minIdx= i;
            for (int j = i+1; j < ar.length; j++) {
                if (ar[minIdx]>ar[j]) minIdx=j;
            }
            int temp=ar[i];
            ar[i]=ar[minIdx];
            ar[minIdx]=temp;
        }
        return ar;
    }
    public static void main(String[] args) {
        int []ar={13,46,24,52,20,9};
        selectionSort(ar);
        for (int i = 0; i < ar.length ; i++) System.out.print(ar[i]+" ");
        System.out.println();
        sort(ar);
        for (int i = 0; i < ar.length ; i++) System.out.print(ar[i]+" ");
    }
}