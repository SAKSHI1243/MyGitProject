package BitwiseManipulations;
import java.util.*;
public class PrimeFactorization {
    public static List<Integer> findfactors(int num){
        List<Integer>factors= new ArrayList<>();
        while((num&1)==0){
            factors.add(2);
            num>>=1;
        }
        for (int i=3;i<=num;i++){
            if(num%i==0) factors.add(i);
        }
        return factors;
    }
    public static List<List<Integer>> factorization(int []nums){
        List<List<Integer>> res= new ArrayList<>();
        for (int num:nums) res.add(findfactors(num));
        return res;
    }
    public static void main(String[] args) {
        int[]nums={2,3,4,5,6};
        List<List<Integer>> res=factorization(nums);
        for (List<Integer> num:res) System.out.print(num);
    }
}