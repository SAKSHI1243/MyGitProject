package stacks;
import java.util.*;
public class validParenthesis {
    public static boolean isBalanced(String str){
        Stack<Character> st= new Stack<>();
        int n= str.length();
        for(int i=0;i<n;i++){
            char ch= str.charAt(i);
            if(ch=='('|| ch=='['|| ch=='{') st.push(ch);
            else{
                if(st.size()==0) return false;
                if(st.peek()=='(' && ch==')') st.pop();
                else if(st.peek()=='{' && ch=='}') st.pop();
                else if(st.peek()=='[' && ch==']') st.pop();
            }
        }
        if(st.size()>0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String str= sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
