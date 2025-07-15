package Recursion;
import java.util.*;
public class CaseChange {
    public static void solve(String str,ArrayList<Character>curr, ArrayList<ArrayList<Character>> res, int i){
        if(str.length()==i){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(str.charAt(i));
        solve(str,curr,res,i+1);
        curr.remove(curr.size()-1);
        curr.add(Character.toUpperCase(str.charAt(i)));
        solve(str, curr, res, i+1);
        curr.remove(curr.size()-1);
    }
    public static ArrayList<ArrayList<Character>> findCase(String str){
        ArrayList<ArrayList<Character>> res=new ArrayList<>();
        ArrayList<Character> curr= new ArrayList<>();
        solve(str,curr,res,0);
        return res;
    }
    public static void main(String[] args) {
        String str="ab";
        ArrayList<ArrayList<Character>> res=findCase(str);
        for (ArrayList<Character> seq:res) System.out.print(seq);
    }
}