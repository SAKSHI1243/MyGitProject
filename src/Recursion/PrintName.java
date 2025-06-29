package Recursion;
public class PrintName {
    public static void print(int n){
        if(n==0) return;
        System.out.println("sakshi");
        print(n-1);
    }
    public static void main(String[] args) {
print(2);
    }
}
