package Recursion;
import java.util.*;
public class DigitIncreasingOrder {
    public static void solve(int n, int start, String str,List<String> res){
        if(n==str.length()){
            res.add(str);
            return;
        }
        for (int i = start; i <=9 ; i++) solve(n, start+1, str+i, res);
    }
    public static List<String> findIncreasing(int n){
        List<String> str=new ArrayList<>();
        solve(n,1,"",str);
        return str;
    }
    public static void main(String[] args) {
        List<String> res= findIncreasing(2);
        for (String str:res) System.out.print(str+" ");
    }
}