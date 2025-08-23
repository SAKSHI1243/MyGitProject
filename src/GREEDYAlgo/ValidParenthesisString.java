package GREEDYAlgo;
public class ValidParenthesisString {
    public static boolean isValid(String s){
       int min=0,max=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                min++;max++;
            }
            else if(s.charAt(i)==')'){
                if(min>0) min--;
                max--;
            }
            else{
                if(min>0) min--;
                max++;
            }
            if(max<0) return false;
        }
        return min==0?true:false;
    }
    public static void main(String[] args) {
        String s="(*)";
        System.out.println(isValid(s));
    }
}