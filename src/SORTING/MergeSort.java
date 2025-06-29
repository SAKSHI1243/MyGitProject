package SORTING;
public class MergeSort {
    public static void merge(int []ar, int l,int mid, int r ){
        int n1=mid+1-l,n2=r-mid;
        int []left= new int[n1];
        int []right= new int[n2];
        for (int i = 0; i < n1; i++) left[i]=ar[l+i];
        for (int i = 0; i < n2; i++) right[i]=ar[mid+1+i];
        int i=0, j=0,k=l;
        while (i<n1&& j<n2){
            if(left[i]<=right[j]) ar[k++]=left[i++];
            else ar[k++]= right[j++];
        }
        while(i<n1) ar[k++]= left[i++];
        while (j<n2) ar[k++]= right[j++];
    }
    public static void mergeSort(int []ar, int l, int r){
        if(l>=r) return;
        int mid=(l+r)/2;
        mergeSort(ar,l,mid);
        mergeSort(ar,mid+1,r);
        merge(ar, l, mid,r);
    }
    public static void main(String[] args) {
        int []ar={4,1,8,2,5,3};
        mergeSort(ar, 0, ar.length-1);
        for (int i = 0; i < ar.length; i++) System.out.print(ar[i]+" ");
    }
}