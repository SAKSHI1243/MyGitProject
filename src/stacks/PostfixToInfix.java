package stacks;
import java.util.*;
public class PostfixToInfix {
    public static void main(String[] args) {
        String s="953+4*6/-";
        Stack<String> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch= s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57) st.push(""+ch);
            else{
                String v2=st.pop(), v1=st.pop();
                st.push("("+v1+ch+v2+")");
            }
        }
        System.out.print(st.peek());
    }
}