package BitwiseManipulations;
import java.util.*;
public class primeFactorizationSeive {
    public static int[]buildSPF(int num){
        int []spf= new int[num+1];
        for (int i=1;i<=num;i++) spf[i]=i;
        for (int i=2;i*i<=num;i++){
            if(spf[i]==i){
                for (int j=i*i;j<=num;j+=i){
                    if(spf[j]==j) spf[j]=i;
                }
            }
        }
        return spf;
    }
    public static List<Integer> findFactor(int num,int[]spf){
        List<Integer>factor=new ArrayList<>();
        while(num!=1){
            factor.add(spf[num]);
            num/=spf[num];
        }
        return factor;
    }
    public static List<List<Integer>> Factorization(int []nums){
        List<List<Integer>>res= new ArrayList<>();
        int max=0;
        for (int num: nums) {
            if(num>max) max=num;
        }
        int []spf=buildSPF(max);
        for (int num:nums) res.add(findFactor(num,spf));
        return res;
    }
    public static void main(String[] args) {
        int []nums={22,64,12,8,9,5};
        List<List<Integer>> res=Factorization(nums);
        for(List<Integer> ans:res) System.out.print(ans);
    }
}