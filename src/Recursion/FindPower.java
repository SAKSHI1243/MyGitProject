package Recursion;
public class FindPower {
    public static int power(int n, int p){
        int s=1;
        if(p==0) return s;
        s*=n;
        return s*power(n,p-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2,5));
    }
}