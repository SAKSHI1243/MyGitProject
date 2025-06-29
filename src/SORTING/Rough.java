package SORTING;
import java.util.*;
public class Rough {
    public static void radixSort(int []ar){
        int max= ar[0];
        for (int i = 1; i <ar.length ; i++) {
            if (ar[i]>max) max=ar[i];
        }
        for (int place=1; max/place>0 ; place*=10) countSort(ar,place);
    }
    public static void countSort(int []ar, int place){
        int []ans= new int [ar.length];
        int []count= new int[10];
        for (int i=0;i<ar.length;i++){
            int digit= (ar[i]/place)%10;
            count[digit]++;
        }
        for (int i = 1; i < 10; i++) count[i]+=count[i-1];
        for (int i = ar.length-1; i >=0 ; i--) {
            int digit=(ar[i]/place)%10;
            ans[count[digit]-1]=ar[i];
            count[digit]--;
        }
        for (int i = 0; i < ar.length; i++) ar[i]= ans[i];
    }
    public static void main(String[] args) {
        int []ar={545,91,921,782,16};
        radixSort(ar);
        System.out.print(Arrays.toString(ar));
    }
}