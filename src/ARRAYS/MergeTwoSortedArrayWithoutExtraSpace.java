package ARRAYS;
import java.util.*;
public class MergeTwoSortedArrayWithoutExtraSpace {
    public static void merge(int []ar1,int []ar2){//brute-force
        int []ar3= new int[ar1.length+ ar2.length];
        int l=0,r=0,i=0;
        while(l<ar1.length && r<ar2.length) {
            if(ar1[l]<=ar2[r]) ar3[i++]=ar1[l++];
            else ar3[i++]=ar2[r++];
        }
        while(l<ar1.length) ar3[i++]=ar1[l++];
        while(r<ar2.length)  ar3[i++]=ar2[r++];
        for (int j = 0; j < ar3.length; j++) {
            if(j< ar1.length) ar1[j]=ar3[j];
            else ar2[j- ar1.length]=ar3[j];
        }
    }
    public static void mergeArrays(int []ar1, int []ar2){//optimal
    int l=ar1.length-1, r=0;
    while(l>=0 && r<ar2.length){
        if(ar1[l]>=ar2[r]) {
            int temp=ar1[l];
            ar1[l--]=ar2[r];
            ar2[r++]=temp;
        }
        else break;
    }
        Arrays.sort(ar1);
        Arrays.sort(ar2);
    }
    public static void main(String[] args) {
    int []ar1={1,4,8,10};
    int []ar2={2,3,9};
    merge(ar1,ar2);
        for (int i = 0; i < ar1.length; i++) System.out.print(ar1[i]+" ");
        System.out.println();
        for (int i=0;i<ar2.length;i++) System.out.print(ar2[i]+" ");
        System.out.println();
        mergeArrays(ar1,ar2);
        for (int i = 0; i < ar1.length; i++) System.out.print(ar1[i]+" ");
        System.out.println();
        for (int i=0;i<ar2.length;i++) System.out.print(ar2[i]+" ");
    }
}