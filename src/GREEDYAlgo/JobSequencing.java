package GREEDYAlgo;
import java.util.*;
public class JobSequencing {
    public static class Job{
        int id, deadline,profit;
        Job(int id, int deadline, int profit){
            this.id=id;
            this.deadline=deadline;
            this.profit=profit;
        }
    }
public static int[]findMinDeadlineMaxProfit(Job []jobs){
    Arrays.sort(jobs,(a,b)->(b.profit-a.profit));
    int max=0;
    for (int i=0;i<jobs.length;i++){
        if(jobs[i].deadline>max) max=jobs[i].deadline;
    }
    int[]res=new int[max+1];
    for (int i = 1; i <=max; i++) res[i]=-1;
    int cnt=0, maxProfit=0;
    for (int i = 0; i < jobs.length; i++) {
        for (int j = jobs[i].deadline; j >0 ; j--) {
            if(res[j]==-1){
                res[j]=i;
                cnt++;
                maxProfit+=jobs[i].profit;
                break;
            }
        }
    }
    int[]ans=new int[2];
    ans[0]=cnt;
    ans[1]=maxProfit;
    return ans;
}
    public static void main(String[] args) {
       Job []arr=new Job[4];
        arr[0] = new Job(1, 4, 20);
        arr[1] = new Job(2, 1, 10);
        arr[2] = new Job(3, 2, 40);
        arr[3] = new Job(4, 2, 30);
        int []ans=findMinDeadlineMaxProfit(arr);
         System.out.print(ans[0]+" "+ans[1]);
    }
}