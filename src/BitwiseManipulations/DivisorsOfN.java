package BitwiseManipulations;
public class DivisorsOfN {
    public static int[] findDivisors(int n){
        int []ans= new int[n];
        int c=0;
        for (int i = 1; i <=n; i++) {
            if(n%i==0) ans[c++]=i;
        }
        int[] res=new int[c];
        for (int i=0;i<res.length;i++) res[i]=ans[i];
        return res;
    }
    public static void main(String[] args) {
        int []nums=findDivisors(8);
        for (int x:nums)System.out.print(x+" ");
    }
}