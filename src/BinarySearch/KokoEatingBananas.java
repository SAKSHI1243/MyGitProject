package BinarySearch;
public class KokoEatingBananas {
    public static int findMax(int []piles){
        int max=piles[0];
        for (int i = 1; i < piles.length ; i++) max=Math.max(max,piles[i]);
        return max;
    }
    public static int getTotalHrs(int []piles, int k){
        int hrs=0;
        for(int i=0;i< piles.length;i++) hrs+=(piles[i]+k-1)/k;
        return hrs;
    }
    public static int minEatingSpeed(int []piles, int hrs){
        int low=1, high=findMax(piles);
        while (low<high){
            int mid=(low+high)/2;
            int hours=getTotalHrs(piles, mid);
            if(hours>hrs) low=mid+1;
            else high=mid;
        }
        return low;
    }
    public static void main(String[] args) {
    int []piles={3,6,7,11};
   System.out.println( minEatingSpeed(piles,8));
    }
}
