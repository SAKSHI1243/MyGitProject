package BinarySearch;
public class MinimumDaysMBouquet {
    public static boolean possible(int []bloomday, int day, int m, int k){
        int c=0, noOfBoq=0;
        for (int i = 0; i <bloomday.length ; i++) {
            if(bloomday[i]<=day) c++;
            else{
                noOfBoq+=(c/k);
                c=0;
            }
        }
        noOfBoq+=(c/k);
        if (noOfBoq>=m) return true;
        else return false;
    }
    public static int roseGardenBS(int []bloomday, int m, int k){
        if(m*k>bloomday.length)return -1;
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for (int i = 0; i < bloomday.length; i++) {
            min=Math.min(min,bloomday[i]);
            max=Math.max(max,bloomday[i]);
        }
        /*brute-force
        for (int i = min; i <=max ; i++) {
            if(possible(bloomday,i,m,k)) return i;
        }
        return -1;*/
        int low=min,high=max;
        while (low<=high){
            int mid=(low+high)/2;
            if (possible(bloomday,mid,m,k)) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
    public static void main(String[] args) {
        int []bloomday={7,7,7,7,13,12,11,7};
        int ans= roseGardenBS(bloomday,2,3);
        if(ans==-1) System.out.println("no bouquets");
        else System.out.println(ans);
    }
}