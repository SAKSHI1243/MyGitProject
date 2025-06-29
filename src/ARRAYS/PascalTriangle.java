package ARRAYS;
import java.util.*;
public class PascalTriangle{
    public static int factorial(int n){
        int f=1;
        for (int i = 1; i <=n ; i++) f*=i;
        return f;
    }
    public static int nCr(int n, int r){
        int ncr=factorial(n)/(factorial(n-r)*factorial(r));
        return ncr;
    }
    //to find the element at specific position
    public static int pascal(int r, int c){
        int x=(int)nCr(r-1,c-1);
        return x;
    }
    //to print the elements of the specific row
    public static void printRowElements(int n){
        int ans=1;
        System.out.print(ans+" ");
        for(int col=1;col<n;col++){
            ans*=(n-col);
            ans/=col;
            System.out.print(ans+" ");
        }
        System.out.println();
    }
    //to generate the elements of given row
    public static List<Integer> generateRow(int n){
        ArrayList<Integer> ansRow= new ArrayList<>();
        ansRow.add(1);
        int ans=1;
        for(int col=1;col<=n;col++){
            ans*=(n-col+1);
            ans/=col;
            ansRow.add(ans);
        }
        return ansRow;
    }
    //to generate pascal's triangle of given number of rows
    public static List<List<Integer>> pascalTriangle(int n){
        List<List<Integer>> ans= new ArrayList<>();
        for(int row=0;row<n;row++) ans.add(generateRow(row));
        return ans;
    }
    public static void main(String[] args) {
    int x=pascal(5,3);
    System.out.println(x);
    printRowElements(5);
    List<List<Integer>> ans=pascalTriangle(7);
        for (int i = 0; i < ans.size(); i++) System.out.println(ans.get(i));
    }
}