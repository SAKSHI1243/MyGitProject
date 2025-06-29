package Backtacking;
public class ratInADeadMaze {
    private static void printPath(int sr, int sc, int er, int ec, String s,int [][]maze) {
        if(sr>er || sc>ec || sr<0|| sc<0) return;
        if(maze[sr][sc]==0 || maze[sr][sc]==-1) return;
        if(sr==er&& sc== ec) {
            System.out.println(s);
            return;
        }
        maze[sr][sc]=-1;
        printPath(sr, sc+1, er, ec,s+"R",maze);//right
        printPath(sr+1, sc, er, ec, s+"D",maze);//down
        printPath(sr,sc-1, er, ec, s+"L",maze);//left
        printPath(sr-1, sc, er, ec,s+"U",maze);//up
        maze[sr][sc]=1;
    }
    public static void main(String[] args) {
            int r=3, c=4;
            int [][]maze={{1,0,1,1},{1,1,1,1},{1,1,0,1}};
            printPath(0,0,r-1,c-1,"",maze);
    }
}