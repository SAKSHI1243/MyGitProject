package GREEDYAlgo;
import java.util.*;
public class AssignCookies {
    public static int findContentChildren(int []g, int []s){
        int cnt=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]) {
                cnt++;
                i++;
            }
            j++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int []g={1,2,3};
        int []s={1,1};
        System.out.print(findContentChildren(g,s));
    }
}