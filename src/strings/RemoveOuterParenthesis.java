package strings;
public class RemoveOuterParenthesis {
    public static String removeOuter(String s){
        StringBuilder sb= new StringBuilder();
        int cnt=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('&& cnt==0) cnt++;
            else if(s.charAt(i)=='(' && cnt!=0){
                sb.append(s.charAt(i));
                cnt++;
            }
            else if(s.charAt(i)==')'){
                cnt--;
                if(cnt!=0) sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="(())(())((())())";
        System.out.println(removeOuter(str));
    }
}