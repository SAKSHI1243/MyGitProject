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
    public static List<Integer>getRow(int n){
        List<Integer>row=new ArrayList<>();
        for (int i = 0; i <=n; i++) {
            row.add(1);
            for (int j = i-1; j >=0 ; j--) row.set(j,row.get(j)+row.get(j-1));
        }
        return row;
    }
    //to generate pascal's triangle of given number of rows
    public static List<List<Integer>>pascalTriangle(int n){
        List<List<Integer>>triangle=new ArrayList<>();
        if(n<=0) return triangle;
        for (int i = 0; i < n; i++) {
            List<Integer>row=new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if(j==0||i==j) row.add(1);
                else row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
            }
            triangle.add(row);
        }
        return triangle;
    }
    public static void main(String[] args) {
    int x=pascal(5,3);
    System.out.println(x);
    List<Integer>row=getRow(5);
        for (int i :row) System.out.print(i+" ");
        System.out.println();
    List<List<Integer>> ans=pascalTriangle(7);
        for (int i = 0; i < ans.size(); i++) System.out.println(ans.get(i));
    }
}