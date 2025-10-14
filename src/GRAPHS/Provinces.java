package GRAPHS;
public class Provinces {
    public static int findNoOfProvince(int[][]isConnected){
        boolean []visited=new boolean[isConnected.length];
        int province=0;
        for(int j=0;j<isConnected.length;j++){
            if( !visited[j]) {
                province++;
                dfs(j,visited,isConnected);
            }
        }
        return province;
    }
    public static void dfs(int node, boolean[] visited, int[][]isConnected){
        visited[node]=true;
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[node][i]==1 &&!visited[i]) dfs(i,visited,isConnected);
        }
    }
    public static void main(String[] args) {
        int [][]isConnected={{1,1,0},{1,1,0},{0,0,1}};
        System.out.println("Number of provinces: "+findNoOfProvince(isConnected));
    }
}