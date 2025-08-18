package HEAPS;
import java.util.*;
public class HandOfStraights {
    public static boolean isNStraightHands(int []hands, int group){
        if(hands.length%group!=0) return false;
        TreeMap<Integer,Integer>mp=new TreeMap<>();
        for (int i = 0; i < hands.length; i++) {
            if(!mp.containsKey(hands[i])) mp.put(hands[i],1);
            else mp.put(hands[i],mp.get(hands[i])+1);
        }
        while(!mp.isEmpty()) {
            int smallest=mp.firstKey();
            for(int i=0;i<group;i++){
                if (!mp.containsKey(smallest + i)) return false;
                mp.put(smallest + i, mp.get(smallest + i) - 1);
                if (mp.get(smallest + i) == 0) mp.remove(smallest + i);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int []hand = {1,2,3,6,2,3,4,7,8};//1 2 2 3 3 4 6 7 8
        int groupSize = 3;
        System.out.print(isNStraightHands(hand,groupSize));
    }
}