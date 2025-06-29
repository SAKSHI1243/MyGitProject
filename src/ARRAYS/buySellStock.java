package ARRAYS;
public class buySellStock {
    public static int maxProfit(int[] prices) {
       int max=0;
        /*for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if((prices[j]-prices[i])>max) max=prices[j]-prices[i];
            }
        }*/
        int min= Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            max=Math.max(max,prices[i]-min);
        }
        return max;
    }
    public static void main(String[] args) {
    int []ar={7,1,5,3,6,4};
    int x=maxProfit(ar);
    System.out.println(x);
    }
}