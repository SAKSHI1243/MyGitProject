package strings;
public class compressString {
    public static void main(String[] args) {
        String s= new String("aaabbbbccddde");
        String ans= new String(""+s.charAt(0));
        int c=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)) c++;
            else{
              if(c>1) ans+=c;
                c=1;
                ans+=s.charAt(i);
            }
        }
        if(c>1) ans+=c;
        System.out.print(ans);
    }
}
