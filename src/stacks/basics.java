package stacks;
import java.util.*;
public class basics {
    public static void main(String[] args) {
      Stack<Integer> st= new Stack<>();
      System.out.println(st);
      System.out.println("size is: "+st.size());
      st.push(1);
      st.push(32);
      st.push(5);
      st.push(90);
      st.push(34);
      while(st.size()>1){
          st.pop();
      }
      System.out.println(st);
      /* System.out.println(st.peek());
      System.out.println(st);
      st.pop();
      System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("size is:"+st.size());*/
    }
}
