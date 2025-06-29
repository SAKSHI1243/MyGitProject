package SORTING;
public class DutchFlagProblem {
    public static void sort(int []ar){
        int []ans= new int[ar.length];
        int []count= new int[3];
        for(int i=0;i<ar.length;i++) count[ar[i]]++;
        for (int i = 1; i < count.length ; i++) count[i]+=count[i-1];
        for (int i = ar.length-1; i >=0 ; i--) {
            int idx= count[ar[i]]-1;
            ans[idx]=ar[i];
            count[ar[i]]--;
        }
        for (int i = 0; i < ar.length; i++) ar[i]=ans[i];
    }
    public static void sort12(int []ar){
        int low=0, mid=0, high=ar.length-1;
        while (mid<=high){
            if(ar[mid]==0){
                int temp=ar[low];
                ar[low]=ar[mid];
                ar[mid]= temp;
                low++; mid++;
            } else if (ar[mid]==1) mid++;
            else{
                int temp=ar[mid];
                ar[mid]= ar[high];
                ar[high]=ar[mid];
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int []ar={0,2,1,2,0,0};
        sort(ar);
        for (int i = 0; i < ar.length; i++) System.out.print(ar[i]+" ");
        System.out.println();
        sort12(ar);
        for (int i = 0; i < ar.length; i++) System.out.print(ar[i]+" ");
    }
}