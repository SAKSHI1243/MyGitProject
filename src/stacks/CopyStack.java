package stacks;
import java.util.*;
public class CopyStack {
    public static void pushAtBottom(Stack<Integer> s, int x){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,x);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()) return;
        int top=s.pop();
        reverse(s);
        pushAtBottom(s,top);
    }
    public static void removeFromBottom(Stack<Integer> s, int idx){
    Stack<Integer> temp= new Stack<>();
    for(int i=0;i<s.size();i++) {
        if (i == idx) s.pop();
        else temp.push(s.pop());
    }
        while(!temp.isEmpty()) s.push(temp.pop());
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack<Integer> st= new Stack<>();
        int n;
        System.out.println("enter the no. of elements :");
        n=sc.nextInt();
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        System.out.println("reverse order:");
        Stack<Integer> st2= new Stack<>();
        while(st.size()>0) st2.push(st.pop());
        System.out.println(st2);
        Stack<Integer> st3= new Stack<>();
        System.out.println("copied stack:");
        while(st2.size()>0){
            int e=st2.pop();
            st3.push(e);
            st.push(e);
        }
        System.out.println(st3);
        int x=9;
        pushAtBottom(st,x);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
        int z=2;
        removeFromBottom(st,z);
        System.out.println(st);
    }
}
