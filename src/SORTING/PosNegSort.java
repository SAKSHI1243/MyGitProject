package SORTING;
public class PosNegSort {
    public static void sort(int []ar){
     int l=0, r=ar.length-1 ;
     while (l<r){
         while (ar[l]<0) l++;
         while (ar[r]>0) r--;
         if(ar[l]>0 && ar[r]<0){
             int temp=ar[l];
             ar[l]=ar[r];
             ar[r]= temp;
             l++; r--;
         }
     }
    }
    public static void main(String[] args) {
        int []ar={19,-20,7,-4,-13,11,-5,3};
        sort(ar);
        for (int i = 0; i < ar.length; i++) System.out.print(ar[i]+" ");
    }
}