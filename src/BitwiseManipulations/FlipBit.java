package BitwiseManipulations;
public class FlipBit {
    public static int minBitFlip(int start, int goal){
        int xor=start^goal;
        int c=0;
        while (xor>0){
            xor=xor&(xor-1);
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(minBitFlip(4,7));
    }
}