package ARRAYS;
import java.util.*;
public class ThreeSum {
   public static List<List<Integer>> threeSum(int[] ar){// brute-force Approach
       // list<list> twice is used because in answer ir returns list under a list
       HashSet<List<Integer>> set= new HashSet<>();
       for (int i = 0; i < ar.length-2 ; i++) {
           for (int j = i+1; j < ar.length-1 ; j++) {
               for (int k = j+1; k < ar.length ; k++) {
                   if(ar[i]+ar[j]+ar[k]==0){
                      List<Integer> temp= Arrays.asList(ar[i],ar[j],ar[k]);
                      temp.sort(null);
                      set.add(temp);
                   }
               }
           }
       }
       List<List<Integer>> ans= new ArrayList<>(set);
       return ans;
   }
   public static List<List<Integer>> triplet(int []ar){//better approach
       HashSet<List<Integer>> set= new HashSet<>();
       //set automatically avoids triplets
       for (int i=0;i<ar.length-1;i++){
           HashSet<Integer> hashset= new HashSet<>();
           for (int j = i+1; j < ar.length ; j++) {
               int third=-(ar[i]+ar[j]);
               if(hashset.contains(third)) {
                   List<Integer> temp= Arrays.asList(ar[i],ar[j], third);
                   temp.sort(null);
                   set.add(temp);
               }
               hashset.add(ar[j]);
           }
       }
       List<List<Integer>> ans= new ArrayList<>(set);
       return ans;
   }
   public static List<List<Integer>> triplets(int []ar){//optimal approach
       List<List<Integer>> ans= new ArrayList<>();
       Arrays.sort(ar);
       for (int i = 0; i < ar.length ; i++) {
           if(i!=0 && ar[i-1]==ar[i]) continue;// to avoid duplicates
            int j=i+1;
            int k= ar.length-1;
            while (j<k){
                int sum= ar[i]+ar[j]+ar[k];
                if(sum>0) k--;
                else if(sum<0) j++;
                else {
                    List<Integer> temp= Arrays.asList(ar[i],ar[j],ar[k]);
                    ans.add(temp);
                    j++;k--;
                    while(j<k && ar[j-1]==ar[j]) j++;
                    while (j<k && ar[k+1]==ar[k]) k--;
                }
            }
       }
       return ans;
   }
    public static void main(String[] args) {
        int []ar={2,-2,0,3,-3,-5};
        List<List<Integer>> ans= threeSum(ar);
        for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i)+" ");
        System.out.println();
        List<List<Integer>> ans1=triplet(ar);
        for (int i=0;i<ans1.size();i++) System.out.print(ans1.get(i)+" ");
        System.out.println();
        List<List<Integer>> ans2=triplets(ar);
        for (int i = 0; i < ans2.size(); i++) System.out.print(ans2.get(i)+" ");
    }
}