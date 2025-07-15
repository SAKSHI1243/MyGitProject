package Recursion;
import java.util.*;
public class PalindromePartition {
    public static boolean isPalindrome(String str){
        int left=0,right=str.length()-1;
        while (left<right) {
            if (str.charAt(left) != str.charAt(right)) return false;
                left++;right--;
        }
        return true;
    }
    public static void solve(String str,List<String> sb,List<List<String>> res,int start){
        if(str.length()==start){
            res.add(new ArrayList<>(sb));
            return;
        }
        for (int i = start; i <str.length() ; i++) {
            String sub=str.substring(start,i+1);
            if(isPalindrome(sub)){
                sb.add(sub);
                solve(str,sb,res,i+1);
                sb.remove(sb.size()-1);
            }
        }
    }
    public static List<List<String>> findPartition(String str){
        List<List<String>> res= new ArrayList<>();
        solve(str,new ArrayList<>(),res,0);
        return  res;
    }
    public static void main(String[] args) {
        String str="aab";
        List<List<String>> res=findPartition(str);
        for (List<String> s:res) System.out.print(s+" ");
    }
}