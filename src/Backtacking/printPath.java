package Backtacking;
import java.util.*;
public class printPath {
    private static void print(int sr, int sc, int er, int ec, String s){
        if(sr>er|| sc>ec) return;
        if(sr==er && sc== ec){
            System.out.print(s+" ");
            return;
        }
        //go down
        print(sr+1,sc,er,ec,s+"D");
        // go right
        print(sr, sc+1, er, ec,s+"R");
    }
    public static void main(String[] args) {
        int rows=3, cols=3;
        print(1,1,rows,cols,"");
    }
}
