package DAA.day7;
import java.util.*;
public class HeapSort {
    public static void heapify(int []ar,int i){
            int largest=i;
            int left=2*i+1;
            int right=2*i+2;
            if(left<ar.length && ar[left]>ar[largest]) largest=left;
            if(right<ar.length && ar[right]>ar[largest]) largest=right;

    }
    public static void heapSort(int []ar){
        for(int i=0;i< ar.length/2;i++) heapify(ar,i);
    }
    public static void main(String[] args) {
        int []ar={3,1,7,9,2};
        heapSort(ar);
    }
}
