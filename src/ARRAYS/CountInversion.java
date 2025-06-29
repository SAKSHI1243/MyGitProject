//What is an inversion of an array? for all i&j< size of array, if i<j then you have to find pair (A[i],A[j]) such that A[j]<A[i]
package ARRAYS;
import java.util.*;
public class CountInversion {
    public static int countInverted(int []ar){
        int c=0;
        for (int i = 0; i <ar.length-1 ; i++) {
            for (int j = i+1; j < ar.length ; j++) {
                if(ar[i]>=ar[j]) c++;
            }
        }
        return c;
    }
    public static int merge(int []ar, int l, int mid, int h){
        ArrayList<Integer> ans= new ArrayList<>();
        int left=l, right=mid+1;
        int c=0;
        while(left<=mid&&right<=h){
            if(ar[left]<=ar[right]) ans.add(ar[left++]);
            else {
                ans.add(ar[right++]);
                c+=(mid+1-left);
            }
        }
        while(left<=mid) ans.add(ar[left++] );
        while(right<=h) ans.add(ar[right++]);
        for (int i=l; i<=h; i++) ar[i]=ans.get(i-l);
        return c;
    }
    public static int mergeSort(int []ar, int l, int h){
        int c=0;
        if(l>=h) return c;
        int mid=(l+h)/2;
        c+=mergeSort(ar,l,mid);
        c+=mergeSort(ar, mid+1,h);
        c+=merge(ar,l,mid,h);
        return c;
    }
    public static void main(String[] args) {
    int []ar={5,8,3,9,1};
    System.out.println(countInverted(ar));
    System.out.println(mergeSort(ar,0,ar.length-1));
    }
}