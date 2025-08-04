package stacks;
import java.util.*;
public class RemoveKDigits {
    public static String remove(String ar, int k){
        Stack<Character> st= new Stack<>();
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < ar.length(); i++) {
            while (!st.isEmpty() && ar.charAt(i)<st.peek() && k>0){
                st.pop();
                k--;
            }
            st.push(ar.charAt(i));
        }
        while (k-- > 0 && !st.isEmpty()) st.pop();
        while (!st.isEmpty()) sb.append(st.pop());
        sb.reverse();
        while (sb.length()>1 && sb.charAt(0)=='0') sb.deleteCharAt(0);
        return sb.length()==0?"0":sb.toString();
    }
    public static void main(String[] args) {
        String ar="1432219";
        System.out.print(remove(ar,3));
    }
}