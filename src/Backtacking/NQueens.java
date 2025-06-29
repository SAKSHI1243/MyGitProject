package Backtacking;
public class NQueens {
    private static boolean isSafe(char[][] board, int rows , int col){
    for(int j=0; j< board.length;j++ ){// check col
        if(board[rows][j]=='Q') return false;
    }
    for(int i=0;i< board.length;i++){// check row
        if(board[i][col]=='Q') return false;
    }
    // check north-east
        int i=rows, j=col;
       while (i>=0 && j< board.length){
           if(board[i][j]=='Q')return false;
           i--; j++;
       }
       // check south-east
        i=rows;j=col;
       while(i< board.length && j< board.length) {
           if(board[i][j]=='Q') return false;
           i++; j++;
       }
       //check south-west
        i=rows;j=col;
        while (i< board.length && j>=0){
            if (board[i][j]=='Q') return false;
            i++; j--;
        }
        //check north-west
        i=rows;j=col;
        while(i>=0 && j>=0){
            if (board[i][j]=='Q') return false;
            i--; j--;
        }
    return true;
    }
    public static void nqueen(char[][] board, int rows){
        if(rows== board.length){
            for(int i=0;i< board.length;i++){
                for(int j=0;j< board.length;j++) System.out.print(board[i][j]+" ");
                System.out.println();
            }
            System.out.println();
            return;
        }
        for (int j=0;j< board.length;j++){
       if(isSafe(board, rows, j)) {
           board[rows][j] = 'Q';
           nqueen(board, rows + 1);
           board[rows][j] = 'X';
       }
    }
    }
    public static void main(String[] args) {
        int n=4;
        char [][] board= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) board[i][j]='X';
        }
        nqueen(board,0);
    }
}