package Recursion;
import java.util.*;
public class NQueen {
    public static boolean isSafe(char[][] board,int r, int c){
        for (int j = 0; j < board[0].length; j++) {//rows
            if(board[r][j]=='Q')return false;
        }
        for (int i = 0; i < board.length; i++) {//cols
            if(board[i][c]=='Q')return false;
        }
        int i=r,j=c;
        while(i>=0 && j< board.length){//NE
            if (board[i][j]=='Q') return false;
            i--;j++;
        }
        i=r;j=c;
        while(i< board.length && j< board.length){//SE
            if (board[i][j]=='Q') return false;
            i++;j++;
        }
        i=r;j=c;
        while(i< board.length && j>=0){//SW
            if (board[i][j]=='Q') return false;
            i++;j--;
        }
        i=r;j=c;
        while(i>=0 && j>=0){//NW
            if (board[i][j]=='Q') return false;
            i--;j--;
        }
        return true;
    }
    public static void solve(char [][]board, int row,List<List<String>> res){
        if(row== board.length){
            List<String> curr= new ArrayList<>();
            for (int i = 0; i < board.length ; i++) curr.add(new String(board[i]));
            res.add(curr);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if(isSafe(board,row,i)){
                board[row][i]='Q';
                solve(board,row+1,res);
                board[row][i]='.';
            }
        }
    }
    public static List<List<String>> nQueens(int n){
        List<List<String>> res= new ArrayList<>();
        char [][]board=new char[n][n];
        for (int i=0;i<n;i++){
            for (int j = 0; j < n; j++) board[i][j]='.';
        }
        solve(board,0,res);
        return res;
    }
    public static void main(String[] args) {
        System.out.println(nQueens(4));
    }
}