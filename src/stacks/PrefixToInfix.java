package stacks;
import java.util.*;
public class PrefixToInfix {
    public static void main(String[] args) {
        String s="-9/*+5346";
        Stack<String> st= new Stack<>();
        for (int i = s.length()-1; i>=0 ; i--) {
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii <=57) st.push(""+ch);
            else{
                String v1=st.pop(),v2=st.pop();
                st.push("("+v1+ch+v2+")");
            }
        }
        System.out.print(st.peek());
    }
}