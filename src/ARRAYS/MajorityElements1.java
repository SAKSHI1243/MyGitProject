package ARRAYS;
import java.util.*;
public class MajorityElements1 {
    //brute-force approach O(n^2)
    public static List<Integer> majorityElement(int []ar){
        List<Integer> ans= new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            int c=0;
            for (int j = i; j < ar.length ; j++) {
                if(ar[i]==ar[j]) c++;
                if(c> ar.length/2) ans.add(ar[i]);
            }
        }
        return ans;
    }
// optimal approach O(n log n)
    public static List<Integer> majEle(int []ar){
        List<Integer> ans= new ArrayList<>();
        HashMap<Integer,Integer> mp= new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if (mp.containsKey(ar[i])) mp.put(ar[i],mp.get(ar[i])+1);
            else mp.put(ar[i],1);
        }
        for (int i = 0; i < ar.length; i++) {
            if (mp.get(ar[i])> ar.length/2 && !ans.contains(ar[i])) ans.add(ar[i]);
        }
        return ans;
    }
    //moore's voting algorithm
    public static List<Integer> majorityEle(int []ar){
        int count=0;
        int ele=0;
        for (int i = 0; i < ar.length; i++) {
            if(count==0){
                count=1;
                ele=ar[i];
            }
            else if(ele==ar[i]) count++;
            else count--;
        }
        List<Integer> ans= new ArrayList<>();
        count=0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]==ele) count++;
        }
        if(count> ar.length/2) ans.add(ele);
        return ans;
    }
    public static void main(String[] args) {
    int []n={2,2,3,3,4,2,2};
    List<Integer>x=majorityElement(n);
    for (int a = 0; a < x.size(); a++) System.out.print(x.get(a)+" ");
    List<Integer> y= majEle(n);
        for (int i = 0; i <y.size() ; i++) System.out.print(y.get(i)+" ");
    List<Integer> a= majorityEle(n) ;
    for (int i=0;i<a.size();i++) System.out.print(a.get(i)+" ");
    }
}