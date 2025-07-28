package stacks;
import java.util.*;
public class InfixToPrefix {
    public static void main(String[] args) {
        String s="9-5+3*4/6";
       Stack<String> val= new Stack<>();
       Stack<Character> op= new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57) val.push(""+ch);
            else if(op.isEmpty()||op.peek()=='('||ch=='(') op.push(ch);
            else if(ch==')'){
                while (op.peek()!='('){
                    String v2= val.pop(),v1=val.pop();
                    char c=op.pop();
                    val.push(c+v1+v2);
                }
               if(!op.isEmpty()) op.pop();
            }
            else {
                if(ch=='+'||ch=='-') {
                    String v2 = val.pop(), v1 = val.pop();
                    char c = op.pop();
                    val.push(c + v1 + v2);
                    op.push(ch);
                }
                else {
                    if(op.peek()=='*'||op.peek()=='/'){
                        String v2 = val.pop(), v1 = val.pop();
                        char c = op.pop();
                        val.push(c + v1 + v2);
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(val.size()>1){
            String v2 = val.pop(), v1 = val.pop();
            char c = op.pop();
            val.push(c+v1+v2);
        }
        System.out.print(val.peek());
    }
}