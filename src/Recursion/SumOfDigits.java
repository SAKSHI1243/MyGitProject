package Recursion;
public class SumOfDigits {
    public static int sum(int n){
        int s=0;
        if(n==0) return s;
        return (s+(n%10))+sum(n/10);
    }
    public static void main(String[] args) {
        System.out.println(sum(987637));
    }
}