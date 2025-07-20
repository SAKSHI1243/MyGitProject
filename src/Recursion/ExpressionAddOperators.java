package Recursion;
import java.util.*;
public class ExpressionAddOperators {
    public static void solve(String num,int target,String path,int index,long eval,long lastOperation, List<String> result){
        if(num.length()==index) {
            if(eval==target) result.add(new String(path));
            return;
        }
        for (int i = index+1; i <=num.length(); i++) {
            String sub= num.substring(index,i);
            if(sub.charAt(0)=='0' && sub.length()>1) break;
            long curr=Long.parseLong(sub);
            if(index==0) solve(num, target, sub, i, curr, curr, result);
            else{
                solve(num, target, path+"+"+sub, i, eval+curr, curr, result);
                solve(num, target, path+"-"+sub, i, eval-curr, -curr, result);
                solve(num, target, path+"*"+sub, i, eval-lastOperation+lastOperation*curr, lastOperation*curr, result);
            }
        }
    }
    public static List<String> addOperators(String num, int target){
        List<String> res= new ArrayList<>();
        solve(num, target,"",0,0,0,res);
        Collections.sort(res);
        return res;
    }
    public static void main(String[] args) {
        System.out.println(addOperators("123",6));
    }
}