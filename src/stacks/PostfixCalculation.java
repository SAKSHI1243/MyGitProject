package stacks;
import java.util.*;
public class PostfixCalculation {
    public static void main(String[] args) {
        String s="953+4*6/-";
        Stack<Integer>st= new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57) st.push(ascii-48);
            else{
                int v2=st.pop(), v1=st.pop();
                if(ch=='+') st.push(v1+v2);
                if(ch=='-') st.push(v1-v2);
                if(ch=='*') st.push(v1*v2);
                if(ch=='/') st.push(v1/v2);
            }
        }
        System.out.print(st.peek());
    }
}