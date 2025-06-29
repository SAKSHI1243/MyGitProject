package BinarySearch;
public class PeakElement2D {
    public static int peakElement(int [][]ar){
        int top=-1, bottom=-1, left=-1, right=-1;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                 top= (i>0)?ar[i-1][j]:Integer.MIN_VALUE;
                 bottom=(i<ar.length-1)?ar[i+1][j]:Integer.MIN_VALUE;
                 left=(j>0) ?ar[i][j-1]:Integer.MIN_VALUE;
                 right=(j<ar.length-1)?ar[i][j+1]:Integer.MIN_VALUE;
                if(ar[i][j]>top && ar[i][j]>bottom && ar[i][j]>left && ar[i][j]>right) return ar[i][j];
            }
        }
        return -1;
    }
    public static int findPeakElementBS(int [][]ar){
        int low=0, high=ar[0].length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int maxRow=0;
            for (int i = 0; i < ar.length; i++) {
                if(ar[i][mid]>ar[maxRow][mid]) maxRow=i;
            }
            int curr=ar[maxRow][mid];
            int left=(mid>0)?ar[maxRow][mid-1]:Integer.MIN_VALUE;
            int right=(mid<ar[0].length-1)?ar[maxRow][mid+1]:Integer.MIN_VALUE;
            if(curr>left && curr> right) return curr;
            else if(curr<left) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [][]ar={{1,4},{3,2}};
        System.out.println(peakElement(ar));
        System.out.println(findPeakElementBS(ar));
    }
}