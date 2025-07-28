package stacks;
import java.util.*;
public class PrefixCalculation {
    public static void main(String[] args) {
        String s="-9/*+5346";
        Stack<Integer> st= new Stack<>();
        for (int i = s.length()-1; i >=0 ; i--) {
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57) st.push(ascii-48);
            else{
                int v1=st.pop(),v2=st.pop();
                if(ch=='+') st.push(v1+v2);
                if(ch=='-') st.push(v1-v2);
                if(ch=='*') st.push(v1*v2);
                if(ch=='/') st.push(v1/v2);
            }
        }
        System.out.print(st.peek());
    }
}