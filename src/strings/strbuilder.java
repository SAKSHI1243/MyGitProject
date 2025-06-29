package strings;
import java.util.*;
public class strbuilder {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("hello ");
        str.append("world");
        str.setCharAt(10,'z');
        str.append(12 +" ");
        str.append(true);
        str.insert(2,'y');
        System.out.println(str);
        str.deleteCharAt(2);
        System.out.println(str);
        str.reverse();
        System.out.println(str);
    }
}
