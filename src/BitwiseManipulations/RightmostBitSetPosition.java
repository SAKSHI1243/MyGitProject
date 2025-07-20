package BitwiseManipulations;
public class RightmostBitSetPosition {
    public static int findRightBitPos(int n){
        if(n==0) return 0;
        n=n&-n;
        int pos=0;
        while (n>0){
            n=n>>1;
            pos++;
        }
        return pos;
    }
    public static void main(String[] args) {
        System.out.println(findRightBitPos(8));
    }
}