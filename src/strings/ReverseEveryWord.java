package strings;
public class ReverseEveryWord {
    public static String reverse(String s){
        StringBuilder sb= new StringBuilder();
        int end=s.length();
        for (int i = s.length()-1; i>=0 ; i--) {
            if(i==0||s.charAt(i-1)==' ') {
                sb.append(s.substring(i,end));
                sb.append(' ');
            }
            if(s.charAt(i)==' ') end=i;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverse("the sky is blue"));
    }
}