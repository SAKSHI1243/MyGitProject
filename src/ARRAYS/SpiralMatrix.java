package ARRAYS;
import java.util.*;
public class SpiralMatrix {
    public static ArrayList<Integer> spiral(int [][]matrix){
        ArrayList<Integer> ans= new ArrayList<>();
        int m= matrix.length;
        int n=matrix[0].length;
        int left=0, top=0, right=n-1, bottom=m-1;
        while (left<=right && top<=bottom){
            for (int i = left; i <=right; i++) ans.add(matrix[top][i]);
            top++;
            for (int i = top; i <=bottom; i++) ans.add(matrix[i][right]);
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) ans.add(matrix[bottom][i]);
                bottom--;
            }
            if(left<=right){
                for (int i = bottom; i >=top ; i--) ans.add(matrix[i][left]);
                left++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> ans= spiral(matrix);
        for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i)+" ");
    }
}