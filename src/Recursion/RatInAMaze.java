package Recursion;
import java.util.*;
public class RatInAMaze {
    public static void solve(int grid[][], int row,int col,List<String> res,boolean[][]isVisited,String path){
        if(row<0||col<0||row>= grid.length||col>= grid.length||grid[row][col]==0||isVisited[row][col]) return;
        if(row==grid.length-1 && col==grid[0].length-1){
            res.add(path);
            return;
        }
        isVisited[row][col]=true;
        solve(grid,row-1,col,res,isVisited,path+"U");
        solve(grid, row+1, col, res, isVisited,path+"D");
        solve(grid, row, col-1, res, isVisited,path+"L");
        solve(grid, row, col+1, res, isVisited,path+"R");
        isVisited[row][col]=false;
    }
    public static List<String> findPath(int [][]grid){
        List<String>res=new ArrayList<>();
        boolean[][] isVisited=new boolean[grid.length][grid.length];
        if(grid[0][0]==1) solve(grid,0,0,res,isVisited,"");
        return res;
    }
    public static void main(String[] args) {
        int [][]grid={{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        List<String> path=findPath(grid);
        for (String str:path) System.out.println(str);
    }
}