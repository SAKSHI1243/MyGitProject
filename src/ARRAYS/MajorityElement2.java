package ARRAYS;
import  java.util.*;
public class MajorityElement2 {
    public static List<Integer> majority(int []nums){//brute-force approach
        List<Integer> ans= new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int c=0;
            if (ans.contains(nums[i])) continue;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) c++;
            }
                if(c>nums.length/3) ans.add(nums[i]);
        }
        return ans;
    }
    public static List<Integer> majorityEle(int []nums) {// better approach O(n log n)
        List<Integer> ans= new ArrayList<>();
        HashMap<Integer,Integer> mp= new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])) mp.put(nums[i], mp.get(nums[i])+1);
            else mp.put(nums[i],1);
        }
        for (int i = 0; i < nums.length; i++) {
            if(mp.get(nums[i])>nums.length/3 && !ans.contains(nums[i])) ans.add(nums[i]);
        }
        return ans;
    }
  public static List<Integer> majorityElement(int []nums) {// optimal approach O(N)
        List<Integer> ans= new ArrayList<>();
        int count1=0, count2=0, ele1=0, ele2=0;
      for (int i = 0; i < nums.length; i++) {
          if(count1==0 && nums[i]!=ele2){
              count1=1;
              ele1=nums[i];
          }
          else if(count2==0 & nums[i]!= ele1){
              count2=1;
              ele2=nums[i];
          }
          else if(ele1==nums[i]) count1++;
          else if(ele2==nums[i]) count2++;
          else{
              count1--;
              count2--;
          }
      }
      count1=0;
      count2=0;
      for (int i = 0; i <nums.length ; i++) {
          if(nums[i]==ele1) count1++;
          if(nums[i]==ele2) count2++;
      }
      if(count1>nums.length/3) ans.add(ele1);
      if(count2>nums.length/3) ans.add(ele2);
      return ans;
  }
    public static void main(String[] args) {
        int []nums={2,2,3,4,4,2,1};
        List<Integer> ans= majority(nums);
        for (int i=0;i<ans.size();i++) System.out.print(ans.get(i)+" ");
        System.out.println();
        List<Integer> ans1=majorityEle(nums);
        for (int i=0;i<ans1.size();i++) System.out.print(ans1.get(i)+" ");
        System.out.println();
        List<Integer> ans2= majorityElement(nums);
        for (int i=0;i<ans2.size();i++) System.out.print(ans2.get(i)+" ");
    }
}
