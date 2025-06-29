package ARRAYS;
import java.util.*;
public class rough {
    public static int countReversePair(int []ar){
        int c=0;
        for (int i = 0; i < ar.length-1; i++) {
            for (int j = i+1; j < ar.length ; j++) {
                if(ar[i]>2*ar[j]) c++;
            }
        }
        return c;
    }
    public static int countReverse(int []ar, int l, int mid, int h){
        int right= mid+1,c=0;
        for (int i = l; i <=mid; i++) {
            while(right<=h && ar[i]>2*ar[right]) right++;
            c+=right-(mid+1);
        }
        return c;
    }
    public static void merge(int []ar, int l, int mid, int h){
        int left=l, right= mid+1,c=0;
        ArrayList<Integer> ans= new ArrayList<>();
        while(left<=mid && right<=h){
            if(ar[left]<=ar[right]) ans.add(ar[left++]);
            else ans.add(ar[right++]);
        }
        while(left<=mid) ans.add(ar[left++]);
        while (right<=h) ans.add(ar[right++]);
        for (int i = l; i <=h ; i++) ar[i]=ans.get(i-l);
    }
    public static int mergeSort(int []ar, int l, int h){
        int c=0;
        if(l>=h) return c;
        int mid=(l+h)/2;
        c+=mergeSort(ar, l, mid);
        c+=mergeSort(ar, mid+1,h);
        c+=countReverse(ar, l,mid,h);
        merge(ar, l, mid, h);
        return c;
    }
    public static void main(String[] args) {
        int []ar={5,4,3,2,1};
        System.out.println(countReversePair(ar));
        System.out.println(mergeSort(ar, 0 ,ar.length-1));
    }
}