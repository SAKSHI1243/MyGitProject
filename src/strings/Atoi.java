package strings;
public class Atoi {
    public static int findAtoi(String s){
        if(s.length()==0) return 0;
        s=s.trim();
        int i=0, res=0, sign=1;
        if(i<s.length()&&(s.charAt(i)=='+'||s.charAt(i)=='-')){
            if(s.charAt(i)=='-') sign=-1;
            i++;
        }
        while (i<s.length() &&Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            if(res>(Integer.MAX_VALUE-digit)/10) return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            res=res*10+digit;
            i++;
        }
        return res*sign;
    }
    public static void main(String[] args) {
        System.out.println(findAtoi(" -023"));
    }
}