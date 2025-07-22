package BitwiseManipulations;
public class RangeXOR {
    public static int findRange(int l, int r){
        int res=0;
        for (int i = l; i <=r ; i++) res^=i;
        return res;
    }
    public static void main(String[] args) {
        System.out.println(findRange(1,3));
    }
}