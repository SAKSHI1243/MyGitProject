package Recursion;
import java.util.*;
public class LetterCombinationPhone {
    public static void solve(String str,StringBuilder curr,List<String> res, int i,String[] mp){
        if(str.length()==i){
            res.add(curr.toString());
            return;
        }
        String letter=mp[str.charAt(i)-'0'];
        for (int j=0;j<letter.length();j++) {
            char ch=letter.charAt(j);
            curr.append(ch);
            solve(str,curr,res,i+1,mp);
            curr.deleteCharAt(curr.length()-1);
        }
    }
    public static List<String> findCombination(String str){
        List<String> res=new ArrayList<>();
        if(str==null|| str.length()==0) return res;
        String []mp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(str, new StringBuilder(),res,0,mp);
        return res;
    }
    public static void main(String[] args) {
        String str="29";
        List <String> ans=findCombination(str);
        System.out.print(ans);
    }
}