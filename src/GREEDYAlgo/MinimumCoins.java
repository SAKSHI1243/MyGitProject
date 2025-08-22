package GREEDYAlgo;
import java.util.*;
public class MinimumCoins {
    public static int findMin(int v){
        ArrayList<Integer> ans= new ArrayList<>();
        int c=0;
        int []coins={1,2,5,10,20,50,100,200,500,2000};
        for (int i = coins.length-1 ;i >=0 ; i--) {
            while (v>=coins[i]){
                v-=coins[i];
                c++;
                ans.add(coins[i]);
            }
        }
        System.out.println("Coins used are:");
        for (int i:ans) System.out.print(i+" ");
        System.out.println();
        return c;
    }
    public static void main(String[] args) {
        System.out.print("number of coins used="+findMin(91));
    }
}