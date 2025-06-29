package BinarySearch;
public class BookAllocation {
    public static int findStudents(int []ar, int pages){
        int stu=1,pageStu=0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]+pageStu>pages){
                stu++;
                pageStu=ar[i];
            }
            else pageStu+=ar[i];
        }
        return stu;
    }
    public static int findMin(int []ar, int students){
        int low=Integer.MIN_VALUE,high=0;
        for (int i = 0; i < ar.length; i++) {
            low=Math.max(low,ar[i]);
            high+=ar[i];
        }
        for (int i = low; i <=high; i++) {
            int cntStu=findStudents(ar,i);
            if(cntStu>students) return i;
        }
        return -1;
    }
    public static int findMinBS(int []ar, int students){
        int low=Integer.MIN_VALUE,high=0;
        for (int i = 0; i < ar.length; i++) {
            low=Math.max(low,ar[i]);
            high+=ar[i];
        }
        while (low<=high){
            int mid=(low+high)/2;
            int cntStu=findStudents(ar,mid);
            if(cntStu>students) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
    public static void main(String[] args) {
        int []ar={25,46,28,49,24};
        System.out.println(findMinBS(ar,4));
    }
}
