package SlidingWindow2P;
public class CountNiceSubarrays {
    public static int atMost(int []ar, int k){
        int cnt=0,oddCnt=0,st=0;
        for (int i = 0; i <ar.length ; i++) {
            if(ar[i]%2!=0) oddCnt++;
            while (oddCnt>k){
                if(ar[st]%2!=0) oddCnt--;
                st++;
            }
            cnt+=(i-st+1);
        }
        return cnt;
    }
    public static int niceSubrrayCount(int []ar, int k){
        return atMost(ar,k)-atMost(ar,k-1);
    }
    public static void main(String[] args) {
        int []ar={1,1,2,1,1};
        System.out.println(niceSubrrayCount(ar,3));
    }
}