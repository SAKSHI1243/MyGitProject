package Recursion;
import java.util.*;
public class NQueenOptimized {
    public static List<List<String>> nQueen(int n){
        List<List<String>> res= new ArrayList<>();
        char [][]board= new char[4][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) board[i][j]='.';
        }
        boolean[] cols= new boolean[n];
        boolean[] diag1= new boolean[2*n-1];
        boolean[] diag2= new boolean[2*n-1];
        solve(board,0,cols,diag1,diag2,res);
        return res;
    }
    public static void solve(char[][] board,int row, boolean[] cols, boolean[] diag1, boolean[] diag2,List<List<String>> res){
        if(row== board.length){
            List<String> curr= new ArrayList<>();
            for (int i=0;i< board.length;i++) curr.add(new String(board[i]));
            res.add(curr);
            return;
        }
        for (int col=0;col< board[0].length;col++){
            int d1=row-col+ board.length-1;
            int d2=row+col;
            if(cols[col]||diag1[d1]||diag2[d2]) continue;
            board[row][col]='Q';
            cols[col]=diag1[d1]=diag2[d2]=true;
            solve(board,row+1,cols,diag1,diag2,res);
            board[row][col]='.';
            cols[col]=diag1[d1]=diag2[d2]=false;
        }
    }
    public static void main(String[] args) {
        System.out.println(nQueen(4));
    }
}