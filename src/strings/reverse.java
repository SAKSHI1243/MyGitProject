//reverse each word of a string
package strings;
public class reverse {
    public static void main(String[] args) {
        String s= new String(" i am a coder");
        StringBuilder sb= new StringBuilder(" ");
        String ans= new String(" ");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' ') sb.append(ch);
            else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
                sb= new StringBuilder(" ");
            }
        }
        sb.append(" ");
        sb.reverse();
        ans+=sb;
        System.out.println(ans);
    }
}
