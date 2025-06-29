package ARRAYS;
public class missingNumbers {
    public static int missing(int []ar){
        int n=ar.length;
        int actualSum=0;
        int expectedSum= n*(n+1)/2;
        for(int i=0;i<n;i++) actualSum+=ar[i];
        return expectedSum-actualSum;
    }
    public static void main(String[] args) {
        int[]ar={3,0,1};
        int x= missing(ar);
        System.out.print(x);
    }

}
