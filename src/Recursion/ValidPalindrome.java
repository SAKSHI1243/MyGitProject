package Recursion;
import java.util.*;
public class ValidPalindrome {
    public static boolean isPalindrome(int i, String str){
        if(i>=str.length()/2) return true;
        if(str.charAt(i)!=str.charAt(str.length()-1-i)) return false;
       return isPalindrome(i+1,str);
    }
    public static void main(String[] args) {
    String str= "abcba";
    System.out.println(isPalindrome(0, str));
    }
}