package DAA.day4;
public class lab1 {
    static int max;
    static int min;
    public static void findMaxMin(int []ar, int i, int j){
    if(i==j){
      if(ar[i]>max)  max=ar[i];
      if(ar[i]<min) min=ar[i];
      return;
    }
    if(i==j-1){
        if(ar[i]>ar[j]){
            if(ar[i]>max) max=ar[i];
            if(ar[j]<min) min=ar[j];
        }
        else{
            if(ar[j]>max) max=ar[j];
            if(ar[i]<min) min=ar[i];
        }
        return;
    }
    int mid=(i+j)/2;
    findMaxMin(ar,i,mid);
    findMaxMin(ar,mid+1,j);
    }
    public static void main(String[] args) {
        int []ar={5,2,9,1,7,6,3};
        max=ar[0];
        min=ar[0];
        findMaxMin(ar,0,ar.length-1);
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}