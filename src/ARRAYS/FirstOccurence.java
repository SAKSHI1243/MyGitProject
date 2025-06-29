package ARRAYS;
public class FirstOccurence {
    public static int linearSearch(int []ar, int target){
        for(int i=0;i<ar.length;i++){
            if(ar[i]==target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
    int []ar={2,3,4,5,3};
    int x=linearSearch(ar,3);
    System.out.print(x);
    }
}
