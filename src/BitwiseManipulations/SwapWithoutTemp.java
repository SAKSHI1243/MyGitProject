package BitwiseManipulations;
public class SwapWithoutTemp {
    public static int[] swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        return new int[]{a,b};
    }
    public static void main(String[] args) {
        int []ar=swap(5,9);
        for (int x:ar) System.out.print(x+" ");
    }
}
