package stacks;
import java.util.*;
public class validParenthesis {
    public static boolean isBalanced(String str){
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='('|| ch=='{'||ch=='[') st.push(ch);
            else{
                if(st.isEmpty()) return false;
                if((ch==')' && st.peek()=='(')||(ch==']' && st.peek()=='[')||(ch=='}' && st.peek()=='{')) st.pop();
                else return false;
            }
        }
        if(!st.isEmpty()) return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isBalanced("{[]}()"));
        System.out.println(isBalanced("{[]()"));
    }
}