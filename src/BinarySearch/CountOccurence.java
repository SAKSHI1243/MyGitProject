package BinarySearch;
public class CountOccurence {
    public static int first(int []ar, int x){
        int l=0, h= ar.length-1,f=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(ar[mid]==x){
                f=mid;
                h=mid-1;
            }
            else if(ar[mid]<x) l=mid+1;
            else h=mid-1;
        }
        return f;
    }
    public static int last(int []ar, int x){
        int l=0, h=ar.length-1, c=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(ar[mid]==x) {
                c=mid;
                l=mid+1;
            }
            else if(ar[mid]<x) l=mid+1;
            else h= mid-1;
        }
        return c;
    }
    public static int[] findPos(int []ar, int x){
        int f=first(ar,x);
        int l=last(ar,x);
        if(f==-1) return new int[] {-1,-1};
        return new int[] {f,l};
    }
    public static int count(int []ar, int x){
        int []ans=findPos(ar,x);
        if(ans[0]==-1) return 0;
        return (ans[1]-ans[0]+1);
    }
    public static void main(String[] args) {
        int []ar={1,2,3,3,3,4};
        System.out.println(count(ar,3));
    }
}