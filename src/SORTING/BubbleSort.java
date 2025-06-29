package SORTING;
public class BubbleSort {
    public static int []bubbleSort(int []ar){
        for(int i=0;i<ar.length-1;i++){
            for (int j = i+1; j < ar.length ; j++) {
                if(ar[i]>ar[j]){
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]= temp;
                }
            }
        }
        return ar;
    }
    public static void main(String[] args) {
        int []ar={3,9,1,8,2};
        bubbleSort(ar);
        for (int i = 0; i < ar.length; i++) System.out.print(ar[i]+" ");
    }
}