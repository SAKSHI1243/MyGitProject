package stacks;
import java.util.*;
public class insertInStack {
    public static void displayRec(Stack<Integer> s){
        if(s.isEmpty()) return;
        int top=s.pop();
        System.out.print(top+" ");
        displayRec(s);
        s.push(top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(1);
        st.push(3);
        st.push(6);
        st.push(8);
        //System.out.println(st);
        displayRec(st);
       // System.out.println(st);
       /* int idx=3;
        int x=7;
        Stack<Integer> temp= new Stack<>();
        while(st.size()>idx) temp.push(st.pop());
        st.push(x);
        while(temp.size()>0) st.push(temp.pop());
        System.out.println(st);*/
    }
}
