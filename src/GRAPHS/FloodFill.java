package GRAPHS;
public class FloodFill {
    public static int[][] floodFill(int sr, int sc, int[][]img, int newColor){
        int oldColor=img[sr][sc];
        if (oldColor==newColor) return img;
        dfs(img,sr,sc,oldColor,newColor);
        return img;
    }
    public static void dfs(int [][]img, int sr, int sc, int oldColor, int newColor){
        if(sr<0||sc<0||sr>= img.length||sc>= img[0].length) return;
        if (img[sr][sc]!=oldColor) return;
        img[sr][sc]=newColor;
        dfs(img,sr+1,sc,oldColor,newColor);
        dfs(img,sr,sc+1,oldColor,newColor);
        dfs(img,sr-1,sc,oldColor,newColor);
        dfs(img,sr,sc-1,oldColor,newColor);
    }
    public static void main(String[] args) {
        int [][]img={{1,1,1},{1,1,0},{1,0,1}};
        int [][]result=floodFill(1,1,img,2);
        for (int []r:result){
            for (int pixel:r) System.out.print(pixel+" ");
            System.out.println();
        }
    }
}