package stacks;
import java.util.*;
public class PrefixToPostfix {
    public static void main(String[] args) {
        String s="-9/*+5346";
        Stack<String> val= new Stack<>();
        for (int i = s.length()-1; i>=0; i--) {
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57) val.push(""+ch);
            else{
                String v1=val.pop(),v2=val.pop();
                val.push(v1+v2+ch);
            }
        }
        System.out.print(val.peek());
    }
}