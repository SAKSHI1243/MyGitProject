package stacks;
import java.util.*;
public class CelebrityProblem {
    public static int findCelebrity(int [][]matrix){
       Stack<Integer> st= new Stack<>();
        for (int i = 0; i < matrix.length; i++) st.push(i);
        while (st.size()>=2){
            int a=st.pop();
            int b=st.pop();
            if(matrix[a][b]==1) st.push(b);
            else st.push(a);
        }
        if(st.size()!=1) return -1;
        int celeb=st.pop();
        for (int i = 0; i < matrix.length; i++) {
            if (celeb!=i &&(matrix[celeb][i]==1||matrix[i][celeb]==0)) return -1;
        }
        return celeb;
    }
    public static void main(String[] args) {
        int [][]matrix={{0,1,0},{0,0,0},{0,1,0}};
        System.out.print(findCelebrity(matrix));
    }
}