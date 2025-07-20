package BitwiseManipulations;
public class PowerOf2 {
    public static boolean checkPowerOf2(int n){
        return n>0 &&(n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(checkPowerOf2(8));
        System.out.println(checkPowerOf2(6));
    }
}