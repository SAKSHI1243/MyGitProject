//given a string s="abc", return the number of palindromic substrings in it
package strings;
import java.util.*;
public class palindrome {
    static boolean isPalindrome(String s){
        int l=0, r=s.length()-1;
        while(l<=r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="abbcbba";
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(isPalindrome(s.substring(i,j))==true){
                    c++;
                    System.out.print(s.substring(i,j)+" ");
                }
            }
        }
        System.out.println("number of paindromes= "+c);
    }
}


