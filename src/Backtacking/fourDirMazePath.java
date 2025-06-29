package Backtacking;

public class fourDirMazePath {
    private static void print(int sr,int sc, int er, int ec, String s ,boolean [][]isVisited){
        if(sr>er || sc>ec) return;
        if(sr<0 || sc<0) return;
        if(isVisited[sr][sc]==true) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc]=true;
        print(sr,sc+1, er, ec, s+"R",isVisited);//go right
        print(sr+1, sc, er, ec,s+"D",isVisited);// go down
        print(sr, sc-1,er,ec,s+"L",isVisited);//go left
        print(sr-1, sc, er, ec, s+"U",isVisited);// go up
    }
    public static void main(String[] args) {
        int r=3, c=3;
        boolean [][]isVisited= new boolean[r][c];
        print(0,0,r-1,c-1,"", isVisited);
    }
}
