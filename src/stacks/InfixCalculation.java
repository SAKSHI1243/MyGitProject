package stacks;
import java.util.*;
public class InfixCalculation {
    public static void main(String[] args) {
        String s = "9-(5+3)*4/6";
        Stack<Integer>val=new Stack<>();
        Stack<Character>op=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57) val.push(ascii-48);
            else if(op.isEmpty()||op.peek()=='('||ch=='(') op.push(ch);
            else if(ch==')'){
                while (op.peek()!='('){
                    int v2=val.pop(),v1=val.pop();
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                }
                op.pop();
            }
            else{
                if(ch=='+'||ch=='-'){
                    int v2=val.pop(),v1=val.pop();
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                    op.push(ch);
                }
                else if(ch=='*'||ch=='/'){
                    if(op.peek()=='*'||op.peek()=='/') {
                        int v2=val.pop(),v1=val.pop();
                        if(op.peek()=='*') val.push(v1*v2);
                        if(op.peek()=='/') val.push(v1/v2);
                        op.pop();
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while (val.size()>1){
            int v2=val.pop(),v1=val.pop();
            if(op.peek()=='+') val.push(v1+v2);
            if(op.peek()=='-') val.push(v1-v2);
            if(op.peek()=='*') val.push(v1*v2);
            if(op.peek()=='/') val.push(v1/v2);
            op.pop();
        }
        System.out.print(val.peek());
}
}