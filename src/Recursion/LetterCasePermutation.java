package Recursion;
import java.util.*;
public class LetterCasePermutation {
    public static void solve(String str, List<Character> curr,List<String> res, int i){
        if(str.length()==i){
            res.add(curr.toString());
            return;
        }
        char ch=str.charAt(i);
        if(Character.isDigit(ch)){
            curr.add(ch);
            solve(str,curr, res,i+1);
            curr.remove(curr.size()-1);
        }
        else{
            curr.add(Character.toLowerCase(ch));
            solve(str,curr, res,i+1);
            curr.remove(curr.size()-1);
            curr.add(Character.toUpperCase(ch));
            solve(str,curr, res,i+1);
            curr.remove(curr.size()-1);
        }
    }
    public static List<String> letterToCase(String str){
        ArrayList<String> res=new ArrayList<>();
        solve(str,new ArrayList<>(), res,0);
        return res;
    }
    public static void main(String[] args) {
        String str="a1b2";
        List<String> res=letterToCase(str);
        for ( String seq:res) System.out.print(seq);
    }
}
