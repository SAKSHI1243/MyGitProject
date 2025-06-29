package ARRAYS;
import java.util.*;
public class MaximumProductSubarray {
    public static int maxProduct(int []ar){// brute-force approach
        int result=0;
        for (int i = 0; i < ar.length-1; i++) {
            for (int j = i+1; j < ar.length; j++) {
                int prod=1;
                for (int k = i; k <=j ; k++) prod*=ar[k];
                result= Math.max(result, prod);
            }
        }
        return result;
    }
    public static int maxProduct2(int []ar){//better approach
        int result=0;
        for (int i = 0; i < ar.length-1; i++) {
            int p=ar[i];
            for (int j = i+1; j <ar.length ; j++) {
                result=Math.max(result,p);
                p*=ar[j];
            }
            result=Math.max(result,p);
        }
        return result;
    }
    public static int maxProduct3(int []ar){//optimal approach
        int pref=1, suff=1;
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i <ar.length ; i++) {
            if(pref==0) pref=1;
            if(suff==0) suff=1;
            pref*=ar[i];
            suff*=ar[ar.length-1-i];
            ans=Math.max(ans, Math.max(pref, suff));
        }
        return ans;
    }
    public static void main(String[] args) {
        int []ar={1,2,3,4,5,0};
        System.out.println(maxProduct(ar));
        System.out.println(maxProduct2(ar));
        System.out.println(maxProduct3(ar));
    }
}
