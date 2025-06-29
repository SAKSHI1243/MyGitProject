package strings;
public class MaximumNestingParenthesis {
    public static int maxDepth(String s){
        int cnt=0,x=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(') {
                cnt++;
                if(x<cnt) x=cnt;
            } else if (s.charAt(i)==')') cnt--;
        }
        return x;
    }
    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }
}
