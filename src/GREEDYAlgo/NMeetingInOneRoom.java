package GREEDYAlgo;
import java.util.*;
public class NMeetingInOneRoom {
    public static class Meeting{
        int start, end;
        Meeting(int start, int end){
            this.start=start;
            this.end=end;
        }
    }
   public static int nMeetings(int []start, int[]end){
       int cnt=0, lastEnd=Integer.MIN_VALUE;
       Meeting []meet= new Meeting[start.length];
       for (int i = 0; i < start.length; i++) meet[i]=new Meeting(start[i],end[i]);
       for (Meeting m:meet){
           if(m.start>=lastEnd){
               cnt++;
               lastEnd=m.end;
           }
       }
       return cnt;
   }
    public static void main(String[] args) {
        int []start={1,3,0,5,8,5};
        int []end={2,4,6,7,9,9};
        System.out.println(nMeetings(start,end));
    }
}
