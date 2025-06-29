package strings;
public class LongestCommonPrefix {
    public static String findCommon(String []str){
        if(str.length==0)return " ";
        String ref = str[0];
        for (int i = 0; i <ref.length() ; i++) {
            for (int j = 1; j <str.length ; j++) {
                if(i>=str[j].length()||str[j].charAt(i)!=ref.charAt(i)) return ref.substring(0,i);
            }
        }
        return ref;
    }
    public static void main(String[] args) {
        String []str={"flower", "flow", "flight"};
        System.out.println(findCommon(str));
    }
}