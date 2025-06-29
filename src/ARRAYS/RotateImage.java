package ARRAYS;
public class RotateImage {
    public static void reverse(int [][]matrix, int x, int i, int j){
        while(j>i){
            int temp=matrix[x][i];
            matrix[x][i++]= matrix[x][j];
            matrix[x][j--]= temp;
        }
    }
    public static void rotate(int [][]matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=i;j< matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) reverse(matrix,i,0,matrix.length-1);
    }
    public static void main(String[] args) {
     int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
     rotate(matrix);
     for(int i=0;i< matrix.length;i++){
         for(int j=0;j<matrix[0].length;j++) System.out.print(matrix[i][j]+" ");
         System.out.println();
     }
    }
}