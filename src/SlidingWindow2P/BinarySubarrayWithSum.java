package SlidingWindow2P;
public class BinarySubarrayWithSum {
    public static int atMost(int []ar, int goal) {
        while(goal<0) return 0;
        int  count = 0,sum=0,start=0;
            for (int i = 0; i < ar.length; i++) {
                sum+=ar[i];
                while(sum>goal){
                    sum-=ar[start];
                    start++;
                }
                count+=(i-start+1);
            }
        return count;
    }
    public static int findCount(int []ar, int goal){
        return atMost(ar,goal)-atMost(ar,goal-1);
    }
    public static void main(String[] args) {
        int []ar={1,0,1,0,1};
        System.out.println(findCount(ar,2));
    }
}