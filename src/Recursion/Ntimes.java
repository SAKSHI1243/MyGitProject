package Recursion;
public class Ntimes {
    public static void printNTimes(int n){
        if(n==0) return;
        System.out.println("hello");
        printNTimes(n-1);
    }
    public static void main(String[] args) {
        printNTimes(4);
    }
}