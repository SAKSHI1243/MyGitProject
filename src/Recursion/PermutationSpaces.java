package Recursion;
import java.util.*;
public class PermutationSpaces {
    public static void solve(String str,List<Character> curr,List<List<Character>> result, int i){
        if(str.length()==i){
            result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(' ');
        curr.add(str.charAt(i));
        solve(str,curr,result,i+1);
        curr.remove(curr.size()-1);
        curr.remove(curr.size()-1);
        curr.add(str.charAt(i));
        solve(str,curr,result,i+1);
        curr.remove(curr.size()-1);
    }
    public static List<List<Character>>findCombination(String str){
        List<List<Character>> result=new ArrayList<>();
        List<Character> curr=new ArrayList<>();
        curr.add(str.charAt(0));
        solve(str,curr,result,1);
        return result;
    }
    public static void main(String[] args) {
        String str="ABC";
            List<List<Character>> res=findCombination(str);
            for (List<Character>seq:res) System.out.print(seq);
    }
}