package ARRAYS;
import java.util.*;
public class SubarraysWithXorK {
    public static int xorSubarray(int []ar, int k){// brute-force approach
        int c=0,xor=0;
        for (int i = 0; i <ar.length ; i++) {
            for (int j = i; j <ar.length ; j++) {
                for (int l = i; l <=j ; l++)  xor^=ar[l];
                if(xor==k) c++;
            }
        }
        return c;
    }
    public static int xorArray(int []ar, int k){// better approach
        int c=0;
        for (int i = 0; i <ar.length ; i++) {
            int xor=0;
            for (int j = i; j <ar.length ; j++) {
                xor^=ar[j];
                if(xor==k) c++;
            }
        }
        return c;
    }
    public static int xor(int []ar, int k){//optimal approach
        int xr=0,c=0;
        HashMap<Integer,Integer> mp= new HashMap<>();
        mp.put(xr,1);
        for (int i = 0; i <ar.length ; i++) {
             xr^=ar[i];
             int x=xr^k;
             if(mp.containsKey(x)) c+=mp.get(x);
             if(mp.containsKey(xr)) mp.put(xr,mp.get(xr)+1);
             else mp.put(xr,1);
        }
        return c;
    }
    public static void main(String[] args) {
        int []ar={4,2,2,6,4};
        System.out.println(xorSubarray(ar,6));
        System.out.println(xorArray(ar,6));
        System.out.println(xor(ar,6));
    }
}