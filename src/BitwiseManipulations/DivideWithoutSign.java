package BitwiseManipulations;
public class DivideWithoutSign {
    public static int divide(int divident, int divisor) {
        if(divisor==0) return Integer.MAX_VALUE;
        if(divident<Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
       long quotient=0;
       boolean isNegative=(divident<0)^(divisor<0);
       long ldividend=Math.abs((long)divident);
       long ldivisor=Math.abs((long)divisor);
       while (ldividend>=ldivisor){
           long temp=ldivisor;
           long multiple=1;
           while((temp<<1)<=ldividend){
               temp<<=1;
               multiple<<=1;
           }
           ldividend-=temp;
           quotient+=multiple;
       }
       return isNegative?(int)-quotient:(int)quotient;
    }
    public static void main(String[] args) {
        System.out.println(divide(10,3));
        System.out.println(divide(-10,3));
    }
}