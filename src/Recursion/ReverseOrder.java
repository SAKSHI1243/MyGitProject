package Recursion;
public class ReverseOrder {
    public static void reverse(int n){
        if(n==0) return;
        System.out.println(n);
        reverse(n-1);
    }
    public static void main(String[] args) {
        reverse(5);
    }
}