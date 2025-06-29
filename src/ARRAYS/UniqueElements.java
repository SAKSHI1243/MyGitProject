package ARRAYS;
public class UniqueElements {
    public static void main(String[] args) {
        int []ar={1,1,2,3,3,4};
        int i=0;
        if(ar.length<=0) System.out.println("empty array");
        else{
            for(int j=0;j<ar.length;j++){
                if(ar[i]!=ar[j]){
                    i++;
                    ar[i]=ar[j];
                }
            }
            for(int k=0;k<i+1;k++) System.out.print(ar[k]+" ");
        }
    }
}