package Recursion;
public class WordSearch {
    public static boolean search(char [][] board,int i, int j, String word,int k){
        if(k==word.length()) return true;
        if(i<0||j<0||i>=board.length||j>=board[0].length) return false;
        if(board[i][j]==word.charAt(k)) {
            char temp=board[i][j];
            board[i][j]='#';
            boolean found= search(board,i-1,j,word,k+1)|| search(board,i+1,j,word,k+1)|| search(board,i,j-1,word,k+1)|| search(board,i,j+1,word,k+1);
            board[i][j]=temp;
            return found;
        }
         return false;
    }
    public static boolean exist(char [][]board,String word){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (word.charAt(0)==board[i][j]){
                    if(search(board,i,j,word,0)) return true;
                }
            }

        }
        return false;
    }
    public static void main(String[] args) {
       char [][]board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
       String word = "ABCCED";
       System.out.print(exist(board,word));
    }
}