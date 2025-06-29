package BinarySearch;
public class MinimiseMaximumDistance {
    public static int findNoOfStationsReq(int []ar, double dist){
        int cnt=0;
        for (int i=1;i<ar.length;i++){
            int noInBetween= (int) ((ar[i]-ar[i-1])/dist);
            if((ar[i]-ar[i-1])==noInBetween*dist) noInBetween--;
            cnt+=noInBetween;
        }
        return cnt;
    }
    public static double findMin(int []ar, int k){
        double low=0, high=0;
        for (int i=0;i<ar.length-1;i++) high=Math.max(high,(double) ar[i+1]-ar[i]);
        while (high-low>1e-6){
            double mid=(low+high)/2.0;
            int cnt=findNoOfStationsReq(ar, mid);
            if(cnt>k) low=mid;
            else high=mid;
        }return  high;
    }
    public static void main(String[] args) {
        int []ar={1,2,3,4,5,6,7,8,9,10};
        System.out.println(findMin(ar,10));
    }
}