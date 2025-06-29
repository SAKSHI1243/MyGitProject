package SORTING;
import java.util.*;
public class RadixSort {
    public static void radixSort(int []ar){
        int max=ar[0];
        for (int i = 1; i < ar.length; i++) {
            if(ar[i]>max) max=ar[i];
        }
        for (int place=1; max/place>0 ; place*=10) countingSort(ar,place);
    }
    public static void countingSort(int []ar, int place){
        int []output= new int [ar.length];
        int []count= new int [10];
        for (int i = 0; i < ar.length; i++) {
            int digit=(ar[i]/place)%10;
            count[digit]++;
        }
        for (int i = 1; i < 10 ; i++) count[i]+=count[i-1];
        for (int i = ar.length-1; i >=0 ; i--) {
            int digit=(ar[i]/place)%10;
            output[count[digit]-1]=ar[i];
            count[digit]--;
        }
        for (int i = 0; i < ar.length; i++) ar[i]= output[i];
    }
    public static void main(String[] args) {
        int []ar={170,45,75,90,802,2};
        radixSort(ar);
        System.out.print(Arrays.toString(ar));
    }
}