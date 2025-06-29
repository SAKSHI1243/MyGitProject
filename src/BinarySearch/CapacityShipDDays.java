package BinarySearch;
public class CapacityShipDDays {
    public static int findDays(int []weights, int cap){
        int days=1, load=0;
        for (int i = 0; i < weights.length; i++) {
            if(load+weights[i]>cap){
                days++;
                load=weights[i];
            }
            else load+=weights[i];
        }
        return days;
    }
    public static int findCapacity(int []weights, int days){
        int low=Integer.MIN_VALUE,high=0;
        for (int i = 0; i < weights.length; i++) {
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            int noOfDays= findDays(weights,mid);
            if(noOfDays<=days) high=mid-1;
            else low= mid+1;
        }
        return low;
    }
    public static void main(String[] args) {
        int []weights={1,2,3,4,5,6,7,8,9,10};
        System.out.println(findCapacity(weights,5));
    }
}
