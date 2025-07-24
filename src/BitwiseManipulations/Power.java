package BitwiseManipulations;
public class Power {
    public static double power(double x,int n){
        if(n==Integer.MIN_VALUE){
            return 1.0/(x*power(x,-(n+1)));
        }
        int m=n;
         n=Math.abs(n);
        double ans=1;
        while (n>0){
            if(n%2!=0) {
                ans*=x;
                n-=1;
            }
            else {
                x*=x;
                n/=2;
            }
        }
        if(m<0) ans=1/ans;
        return ans;
    }
    public static void main(String[] args) {
        System.out.print(power(2.34,-4));
    }
}