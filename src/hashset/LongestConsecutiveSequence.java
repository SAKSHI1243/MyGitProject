package hashset;
import  java.util.*;
public class LongestConsecutiveSequence {
    public int longestConsecutive(int []ar){
        HashSet<Integer> st= new HashSet<>();
        for(int i:ar) st.add(i);
        int maxStreak=0;
        for(int i:st) {
            if(!st.contains(i-1)){
                int currNum=i;
                int currSteak=1;
                while(st.contains(currNum+1)){
                    currSteak++;
                    currNum++;
                }
                maxStreak=Math.max(maxStreak,currSteak);
            }
        }
        return maxStreak;
    }
    public static void main(String[] args) {
        LongestConsecutiveSequence obj= new LongestConsecutiveSequence();
        int []ar={0,3,7,2,5,8,4,6,0,1};
        System.out.println(obj.longestConsecutive(ar));
    }
}
