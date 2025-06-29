package SORTING;
public class CountSort {
    public static void countSort(int []ar){
        int max=ar[0];
        for (int i = 1; i < ar.length; i++) {
            if(ar[i]>max) max= ar[i];
        }
        int []count=new int[max+1];
        for (int i = 0; i <count.length ; i++) count[ar[i]]++;
        for (int i = 1; i < count.length; i++) count[i]+=count[i-1];
        int []ans=new int[ar.length];
        for (int i = ar.length-1; i >=0; i--) {
            int idx=count[ar[i]]-1;
            ans[idx]=ar[i];
            count[ar[i]]--;
        }
    }
    public static void main(String[] args) {
        int []ar={4,9,7,1,3};
        countSort(ar);
        for (int i = 0; i < ar.length; i++) System.out.print(ar[i]+" ");
    }
}
