package Recursion;
import java.util.*;
public class GenerateParenthesis {
    public static void solve(String str, int open, int close, int n,List<String> res){
        if(str.length()==2*n){
            res.add(str);
            return;
        }
        if(open<n) solve(str+"(",open+1,close,n,res);
        if(close<open) solve(str+")",open,close+1,n,res);
    }
    public static String generateParenthesis(int n){
        List<String> res=new ArrayList<>();
        solve("",0,0,n,res);
        return res.toString();
    }
    public static void main(String[] args) {
        System.out.print(generateParenthesis(3));
    }
}