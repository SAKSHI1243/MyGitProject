package strings;
import java.util.*;
public class basicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("enter a string: ");
       // String s = sc.nextLine();// user input string
        String str = "xbcx";
        str+="er";
        str+=(10+20);
        str+=1;
        str+=2;
        String gtr="xbcd";
        String ss="ADHJ";
      //  System.out.println(s.length());//gives length of string
       //   System.out.println(s.charAt(2));//gives character present at the particular index
     // System.out.println(s.indexOf('b'));//gives index of the  particular character
        System.out.println(gtr.compareTo(str));//checks who is greater in lexograpical order
        System.out.println(str.contains("cx"));
        System.out.println(gtr.endsWith("cd"));
        System.out.println(str.toUpperCase());
        System.out.println(ss.toLowerCase());
        System.out.println(str.concat(gtr));
        System.out.println(str);
        System.out.println(gtr.substring(2));
        System.out.println(str.substring(2,5));
        for(int i=0;i<gtr.length();i++){
            for(int j=i+1;j<=gtr.length();j++){
                System.out.print(gtr.substring(i,j)+" ");
            }
        }
        System.out.println();
        String x="hello";
        x=x.substring(0,2)+'y' + x.substring(3);
        System.out.println(x);
    }
}
