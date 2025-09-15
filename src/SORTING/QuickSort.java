package SORTING;
public class QuickSort {
    public static int partition(int []ar, int start, int end){
        int c=0;
        int pivot=ar[start];
        for (int i = start; i <=end; i++) {
            if (ar[i]<pivot) c++;
        }
        int pi=c+start;
        int temp=ar[start];
        ar[start]=ar[pi];
        ar[pi]=temp;
        int i=start, j=end;
        while (i<pi && j>pi){
            if(ar[i]<ar[pi]) i++;
            if(ar[j]>ar[pi]) j--;
            if(i<pi && j>pi){
                int x=ar[i];
                ar[i]=ar[j];
                ar[j]=x;
                i++;
                j--;
            }
        }
        return pi;
    }
    public static void quickSort(int []ar, int start, int end){
        if (start>=end) return;
        int pi=partition(ar, start, end);
        quickSort(ar,start,pi-1);
        quickSort(ar,pi+1,end);
    }
    public static void main(String[] args) {
        int []ar={5,8,2,6,9,1};
        quickSort(ar,0,ar.length-1);
        for (int i = 0; i < ar.length ; i++) System.out.print(ar[i]+" ");
    }
}