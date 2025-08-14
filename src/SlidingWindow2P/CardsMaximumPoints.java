package SlidingWindow2P;
public class CardsMaximumPoints {
    public static int findMax(int []ar, int k){
    int start=0,total=0,max=0,ans=0;
        for (int i = 0; i < ar.length; i++) total+=ar[i];
        for (int i = 0; i < ar.length; i++) {
            ans+=ar[i];
            if(i-start+1>ar.length-k){
                ans-=ar[start];
                start++;
            }
            if(i-start+1==ar.length-k) max=Math.max(max,total-ans);
        }
        return max;
    }
    public static void main(String[] args) {
        int[]ar={100,40,17,9,73,75};
        System.out.println(findMax (ar,3));
    }
}