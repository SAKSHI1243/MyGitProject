package ARRAYS;
import java.util.*;
public class FourSum {
    public static List<List<Integer>> fourSum(int []ar, int target){// brute-force approach
        HashSet<List<Integer>> set= new HashSet<>();
        for(int i=0;i<ar.length-3;i++){
            for(int j=0;j<ar.length-2;j++){
                for(int k=j+1;k<ar.length-1;k++){
                    for(int l=k+1;l<ar.length;l++){
                        long sum= ar[i]+ar[j]+ar[k]+ar[l];
                        if((int)sum==target){
                            List<Integer> temp= Arrays.asList(ar[i], ar[j],ar[k], ar[l]);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans= new ArrayList<>(set);
        return ans;
    }
    public static List<List<Integer>> quad(int []ar, int target){// better approach
        HashSet<List<Integer>> set= new HashSet<>();
        for(int i=0;i<ar.length-2;i++){
            for (int j=i+1;j<ar.length-1;j++){
                HashSet<Integer> hashset= new HashSet<>();
                for (int k = j+1; k < ar.length; k++) {
                    int fourth= target-(ar[i]+ar[j]+ar[k]);
                    if(hashset.contains(fourth)){
                        List<Integer> temp= Arrays.asList(ar[i], ar[j], ar[k], fourth);
                        temp.sort(null);
                        set.add(temp);
                    }
                    hashset.add(ar[k]);
                }
            }
        }
        List<List<Integer>> ans= new ArrayList<>(set);
        return ans;
    }
    public static List<List<Integer>> quadSum(int []ar, int target){
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(ar);
        for(int i=0;i<ar.length-1;i++){
            if(i>0&& ar[i-1]==ar[i]) continue;
            for(int j=i+1;j<ar.length;j++){
                if (j>i+1 && ar[j-1]==ar[j]) continue;
                int k=j+1;
                int l=ar.length-1;
                while (k<l){
                    int sum=ar[i]+ar[j]+ar[k]+ar[l];
                    if(sum<target) k++;
                    else if(sum>target) l--;
                    else{
                        List<Integer> temp=Arrays.asList(ar[i], ar[j],ar[k],ar[l]);
                        ans.add(temp);
                        k++;l--;
                        while(k<l && ar[k]==ar[k-1]) k++;
                        while (k<l && ar[l]==ar[l+1]) l--;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []ar={4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        List<List<Integer>> ans = fourSum(ar,6);
        for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i)+" ");
        System.out.println();
        List<List<Integer>> ans1= quad(ar,7);
        for (int i = 0; i < ans1.size(); i++) System.out.print(ans1.get(i)+" ");
        System.out.println();
        List<List<Integer>> ans2=quadSum(ar,8);
        for (int i = 0; i < ans2.size(); i++) System.out.print(ans2.get(i)+" ");
        System.out.println();
    }
}