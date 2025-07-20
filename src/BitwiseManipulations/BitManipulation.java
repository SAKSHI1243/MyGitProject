package BitwiseManipulations;
public class BitManipulation {
    public static boolean checkSetOrNot(int n, int i){
        return  (n&(1<<i))!=0;
    }
    public static int setBit(int n ,int i){
        return n|(1<<i);
    }
    public static int clearBit(int n, int i){
        return n&~(1<<i);
    }
    public static int toggleBit(int n, int i){
        return n^(1<<i);
    }
    public static void main(String[] args) {
         System.out.println(checkSetOrNot(5,0));
         System.out.println(setBit(5,1));
         System.out.println(clearBit(5,0));
         System.out.println(toggleBit(5,1));
    }
}