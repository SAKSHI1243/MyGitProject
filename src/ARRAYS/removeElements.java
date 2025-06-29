package ARRAYS;
public class removeElements {
    public static  int remove(int [] ar, int val){
        int k=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]!=val){
                ar[k]=ar[i];
                k++;
            }
        }
        for(int j=0;j<k;j++) System.out.print(ar[j]+" ");
        return k;
    }
    public static void main(String[] args) {
        int[] ar={1,2,3,4,2,7};
        remove(ar, 2);
    }
}
