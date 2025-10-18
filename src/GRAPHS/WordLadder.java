package GRAPHS;
import java.util.*;
public class WordLadder {
    static class Pair{
        String first;
        int second;
        Pair(String first, int second){
            this.first=first;
            this.second=second;
        }
    }
    public static int wordLadder(String start, String end, String[]wordList){
        Queue<Pair>q= new LinkedList<>();
        HashSet<String> set= new HashSet<>();
        for (int i = 0; i < wordList.length; i++) set.add(wordList[i]);
        if(!set.contains(end)) return 0;
        q.add(new Pair(start,1));
        while (!q.isEmpty()){
            String x=q.peek().first;
            int steps=q.peek().second;
            q.remove();
            if(x.equals(end)) return steps;
            for (int i = 0; i < x.length(); i++) {
                for (char ch='a'; ch <='z' ; ch++) {
                    if(ch==x.charAt(i)) continue;
                    char []ar=x.toCharArray();
                    ar[i]=ch;
                    String newWord=new String(ar);
                    if(set.contains(newWord)) {
                        q.add(new Pair(newWord,steps+1));
                        set.remove(newWord);
                    }
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String start="hit", end="cog";
        String []wordlist={"hot","dot","dog","lot","log","cog"};
        System.out.println(wordLadder(start,end,wordlist));
    }
}