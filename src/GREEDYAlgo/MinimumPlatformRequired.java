package GREEDYAlgo;
import java.util.*;
public class MinimumPlatformRequired {
    public static int findMinimumPlatform(int []arrival, int []departure){
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int platform=0, max=0,i=0,j=0;
        while(i<arrival.length && j<departure.length){
            if(arrival[i]<=departure[j]){
                platform++;
                i++;
            }
            else {
                platform--;
                j++;
            }
            max=Math.max(max,platform);
        }
        return max;
    }
    public static void main(String[] args) {
        int []arrival={900,945,955,1100,1500,1800};
        int[] departure={920,1200,1130,1150,1900,2000};
        System.out.println(findMinimumPlatform(arrival,departure));
    }
}