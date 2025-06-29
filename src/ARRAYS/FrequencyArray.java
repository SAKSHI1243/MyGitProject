package ARRAYS;
public class FrequencyArray {
    public static void countFreq(int []ar) {
        boolean[] isVisited= new boolean[ar.length];
        int maxEle=0, minEle=0;
        int maxFreq=0, minFreq=ar.length;
        for (int i = 0; i < ar.length; i++) {
            if(isVisited[i]==true) continue;
            int count=0;
            for(int j=i;j<ar.length;j++){
                if(ar[i]==ar[j]){
                    isVisited[i]=true;
                    count++;
                }
            }
            System.out.println(ar[i]+"->"+count);
            if (count>maxFreq){
                maxEle=ar[i];
                maxFreq=count;
            }
            if(count<minFreq){
                minEle=ar[i];
                minFreq=count;
            }
        }
        System.out.println("Maximum Frequency element="+maxEle+"->"+maxFreq);
        System.out.println("Minimum Frequency element="+minEle+"->"+minFreq);
    }
    public static void main(String[] args) {
        int []ar= {10,5, 10, 15, 10,5};
        countFreq(ar);
    }
}