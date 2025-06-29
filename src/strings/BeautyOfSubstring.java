package strings;
public class BeautyOfSubstring {
    public static int findBeauty(String s){
        int total=0;
        for (int i = 0; i <s.length() ; i++) {
            int []freq=new int[26];
            for (int j = i; j <s.length() ; j++) {
                freq[s.charAt(j)-'a']++;
                int max=0, min=Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                   if(freq[k]>0){
                       max=Math.max(max,freq[k]);
                       min=Math.min(min,freq[k]);
                   }
                }
                int beauty=max-min;
                total+=beauty;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(findBeauty("abaacc"));
    }
}