package GREEDYAlgo;
import java.util.*;
public class FractionalKnapsack {
    public static class Item{
    int val, wt;
    double ratio;
    Item(int val, int wt){
        this.val=val;
        this.wt=wt;
        this.ratio=(double)val/wt;
    }
    }
    public static double maximumValue(int []val, int []wt, int capacity){
    Item []items=new Item[val.length];
        for (int i = 0; i < val.length; i++) items[i]=new Item(val[i],wt[i]);
        Arrays.sort(items,(a,b)->Double.compare(b.ratio,a.ratio));
        double sum=0;
        for (Item item:items) {
            if(item.wt<=capacity) {
                sum += item.val;
                capacity-=item.wt;
            }
            else {
                sum+=((double)capacity/item.wt)*item.val;
                break;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int []val={60,100,120};
        int []wt={10,20,30};
        int capacity=50;
        System.out.print(maximumValue(val,wt,capacity));
    }
}