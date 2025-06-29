package strings;
import java.util.*;
public class toggleCase {
    public static void main(String[] args) {
    Scanner sc=  new Scanner(System.in);
    StringBuilder s= new StringBuilder(sc.nextLine());
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        int ascii=(int) ch;
        if(ascii<=97){
            ascii+=32;
            char c=(char)ascii;
            s.setCharAt(i,c);
        }
        else{
            ascii-=32;
            char c=(char)ascii;
            s.setCharAt(i,c);
        }
    }
    System.out.println(s);
    }
}
