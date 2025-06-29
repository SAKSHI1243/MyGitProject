package ARRAYS;
import java.util.*;
public class leaderArray {
    public static ArrayList<Integer> leader(int []nums){
        ArrayList<Integer> a= new ArrayList<>();
        int max=nums[nums.length-1];
        a.add(max);
        for(int i= nums.length-2;i>=0;i--){
            if(nums[i]>max){
                max= nums[i];
                a.add(max);
            }
        }
        Collections.reverse(a);
        return a;
    }
    public static void main(String[] args) {
    int []nums={1,2,5,3,1,2};
    ArrayList<Integer> a= leader(nums);
    for(int i=0;i<a.size();i++) System.out.print(a.get(i)+" ");
    }
}