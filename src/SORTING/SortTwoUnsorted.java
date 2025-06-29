package SORTING;
public class SortTwoUnsorted {
    public static void sort(int []ar){
       int x=-1, y=-1;
        for (int i = 0; i <ar.length-1 ; i++) {
            if(ar[i]>ar[i+1]){
                if(x==-1){
                    x=i;
                    y=i+1;
                }
                else y=i+1;
            }
        }
        int temp=ar[x];
        ar[x]=ar[y];
        ar[y]=temp;
    }
    public static void main(String[] args) {
        int []ar={3,8,6,7,5,9,10};
        sort(ar);
        for (int i = 0; i < ar.length; i++) System.out.print(ar[i]+" ");
    }
}