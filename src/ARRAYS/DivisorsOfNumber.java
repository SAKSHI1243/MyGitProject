package ARRAYS;
public class DivisorsOfNumber {
    public static int[]divisor(int n){
        int[]res=new int[n];
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) res[c++]=i;
        }
        int []result= new int[c];
        for(int i=0;i<c;i++) result[i]=res[i];
        return result;
    }
    public static void main(String[] args) {
        int []x=divisor(6);
        for(int i=0;i<x.length;i++) System.out.print(x[i]+" ");
    }
}
