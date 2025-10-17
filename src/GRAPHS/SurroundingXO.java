package GRAPHS;
public class SurroundingXO {
    public static char[][] fill(int n, int m, char[][]board){
        int [][]vis= new int[n][m];
        int []delRow={0,-1,0,1};
        int []delCol={1,0,-1,0};
        for (int i = 0; i < n; i++) {
            if(vis[i][0]==0 && board[i][0]=='O') dfs(i,0,vis,board,delRow,delCol);
            if(vis[i][m-1]==0 && board[i][m-1]=='O') dfs(i,m-1,vis,board,delRow,delCol);
        }
        for (int j = 0; j < m; j++) {
            if(vis[0][j]==0 && board[0][j]=='O') dfs(0,j,vis,board,delRow,delCol);
            if(vis[n-1][j]==0 && board[n-1][j]=='O') dfs(n-1,j,vis,board,delRow,delCol);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && board[i][j]=='O') board[i][j]='X';
            }
        }
        return board;
    }
    public static void dfs(int row, int col,int[][]vis, char[][]board,int []delRow, int[] delCol){
        vis[row][col]=1;
        int n=board.length, m=board[0].length;
        for(int i=0;i<4;i++){
            int r=row+delRow[i], c=col+delCol[i];
            if(r>=0 && r<n && c>=0 && c<m && board[r][c]=='O' && vis[r][c]==0) dfs(r,c,vis,board,delRow,delCol);
        }
    }
    public static void solve(char[][] board){
        char[][]ans=fill(board.length, board[0].length,board );
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) System.out.print(ans[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char[][] board= {{'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}};
        solve(board);
    }
}