package BitwiseManipulations;
public class CountSetBits {
    public static int count(int n){
        int c=0;
        while (n!=0){
            n=n&(n-1);
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(count(7));
    }
}