package Backtacking;
import  java.util.*;
public class mazePath {
    private static int maze(int sr, int sc, int er, int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc== ec) return 1;
        int downWays=maze(sr+1, sc, er, ec);
        int rightWays= maze(sr, sc+1, er, ec);
        int totalWays= downWays+ rightWays;
        return totalWays;
    }
    public static void main(String[] args) {
    int rows=4, cols=6;
    int count=maze(1,1,rows,cols);
    System.out.println(count);
    }
}
