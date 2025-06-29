package ARRAYS;
import java.util.*;
public class ReversePairs {
    public static int reversePairs(int []ar){
        int c=0;
        for (int i = 0; i < ar.length-1; i++) {
            for (int j = i+1; j <ar.length ; j++) {
                if(ar[i]>2*ar[j]) c++;
            }
        }
        return c;
    }
    public static int mergeSort(int []ar, int l, int h){
        int c=0;
        if(l>=h) return c;
        int mid=(l+h)/2;
        c+=mergeSort(ar,l,mid);
        c+=mergeSort(ar, mid+1,h);
        c+=countPair(ar, l, mid, h);
        merge(ar,l,mid,h);
        return c;
    }
    public static int merge(int []ar, int l,int mid, int h){
        ArrayList<Integer> ans= new ArrayList<>();
        int left=l, right=mid+1, c=0;
        while(left<=mid && right<=h){
            if(ar[left]<=ar[right]) ans.add(ar[left++]);
            else {
                ans.add(ar[right++]);
                c+=mid+1-left;
            }
        }
        while(left<=mid) ans.add(ar[left++]);
        while(right<=h) ans.add(ar[right++]);
        for (int i = l; i <=h ; i++)    ans.get(i-l);
        return c;
    }
    public static int countPair(int []ar, int l, int mid, int h){
        int right=mid+1, c=0;
        for (int i = l; i <=mid; i++) {
            while(right<=h && ar[i]>2*ar[right]) right++;
            c+=right-mid+1;
        }
        return c;
    }
    public static void main(String[] args) {
        int []ar={4,1,2,3,1};
        System.out.println(reversePairs(ar));
        System.out.println(mergeSort(ar,0,ar.length-1));
    }
}
