package BinarySearch;
public class Max1s {
    public static int findIndexOfMax1(int [][]ar){// brute force
        int max=0,idx=-1;
        for (int i = 0; i < ar.length; i++) {
            int c = 0;
            for (int j = 0; j < ar[i].length; j++) if (ar[i][j] == 1) c++;
            if (c > max) {
                max = c;
                idx = i;
            }
        }
        return idx;
    }

    public static int lowerBound(int []ar){
        int low=0, high=ar.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(ar[mid]>=1){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }
    public static int findMaxIndex(int [][]ar){
        int max=0, idx=-1;
        for (int i = 0; i < ar.length; i++) {
            int cnt=ar[i].length-lowerBound(ar[i]);
            if(cnt>max){
                max=cnt;
                idx=i;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int [][]ar={{1,0,1},{1,1,1},{0,0,0}};
        System.out.println(findMaxIndex(ar));
    }
}