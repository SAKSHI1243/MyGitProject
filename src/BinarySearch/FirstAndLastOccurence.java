package BinarySearch;
public class FirstAndLastOccurence {
    public static int []searchRange(int []ar, int x){
        int f=findFirst(ar,x);
        int s=findSecond(ar,x);
        return new int[]{f,s};
    }
    public static int findFirst(int []ar, int x){
        int low=0, high= ar.length-1,ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(ar[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public static int findSecond(int []ar, int x){
        int low=0, high= ar.length-1,ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(ar[mid]<=x){
                ans=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int []ar={5,7,7,8,8,9};
        int []ans=searchRange(ar,8);
        System.out.println(ans[0]+" "+ans[1]);
    }
}