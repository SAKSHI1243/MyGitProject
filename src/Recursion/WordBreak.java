package Recursion;
import java.util.*;
public class WordBreak {
    public static boolean solve(String s, int k,HashSet<String> set,Boolean[] memo){
        if(k==s.length())return true;
        if(memo[k]!=null) return memo[k];
        for (int i = k+1; i <=s.length(); i++) {
            String sub=s.substring(k,i);
            if(set.contains(sub)){
                if(solve(s,i,set,memo)) return memo[k]=true;
            }
        }
        return memo[k]=false;
    }
    public static boolean wordBreak(String s,List<String>wordDict){
        HashSet<String> set= new HashSet<>(wordDict);
        Boolean []memo= new Boolean[s.length()];
         return solve(s,0,set,memo);
    }
    public static void main(String[] args) {
        String s="pieapplepie";
        List<String> wordDict=new ArrayList<>();
        wordDict.add("apply");
        wordDict.add("pie");
        System.out.println(wordBreak(s,wordDict));
    }
}