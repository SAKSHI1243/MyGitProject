package Recursion;
import java.util.*;
public class NQueen {
    public static boolean isSafe(char [][]board, int r, int c){
        for(int j=0;j<board.length;j++){//rows
            if(board[r][j]=='Q') return false;
        }
        for(int i=0;i<board.length;i++){//cols
            if(board[i][c]=='Q') return false;
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
        while(i>=0 && j>=0){//SW
            if (board[i][j]=='Q') return false;
            i--;j--;
        }
        return true;
    }
    public static void nQueen(char [][]board, int row){
        if(row==board.length){
            for (int i = 0; i <board.length ; i++) {
                for (int j = 0; j < board[i].length; j++) System.out.print(board[i][j]+".");
                System.out.println();
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board,row,i)){
                board[row][i]='Q';
                nQueen(board,row+1);
                board[row][i]='.';
            }
        }
    }

    public static void main(String[] args) {
        char [][]board= new char[4][4];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) board[i][j]='.';
        }
        nQueen(board,0);
    }
}