package GREEDYAlgo;
import java.util.*;
public class SJF {
    public static int findSJF(int []jobs){
        Arrays.sort(jobs);
        float wt=0;
        int totalTime=0;
        for (int i = 0; i < jobs.length; i++) {
            wt+=totalTime;
            totalTime+=jobs[i];
        }
        return (int) (wt/jobs.length);
    }
    public static void main(String[] args) {
        int []jobs={3,1,2,4,5};
        System.out.print(findSJF(jobs));
    }
}