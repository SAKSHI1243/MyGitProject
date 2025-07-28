package stacks;
import java.util.*;
public class PostfixToPrefix {
    public static void main(String[] args) {
        String s="953+4*6/-";
        Stack<String> val= new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57) val.push(""+ch);
            else{
                String v2=val.pop(), v1=val.pop();
                val.push(ch+v1+v2);
            }
        }
        System.out.print(val.peek());
    }
}