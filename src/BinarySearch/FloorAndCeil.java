package BinarySearch;
public class FloorAndCeil {
    public static int  getFloor(int []ar, int x){
        int low=0, high= ar.length-1, floor=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(ar[mid]<=x){
                floor=ar[mid];
                low=mid+1;
            }
            else high= mid-1;
        }
        return floor;
    }
    public static int getCeil(int []ar, int x){
        int low=0, high=ar.length-1, ceil=0;
        while (low<=high){
            int mid=(low+high)/2;
            if(ar[mid]>=x){
                ceil=ar[mid];
                high=mid-1;
            }
            else low=mid+1;
        }
        return ceil;
    }
    public static int[] getFloorCeil(int []ar, int x){
        int f= getFloor(ar,x);
        int c=getCeil(ar,x);
        return new int []{f,c};
    }
    public static void main(String[] args) {
        int []ar={3,4,4,7,8,10};
        int []ans= getFloorCeil(ar,5);
        System.out.println(ans[0]+" "+ans[1]);
        int []ans1= getFloorCeil(ar,8);
        System.out.println(ans1[0]+" "+ans1[1]);
    }
}