package DAA;
public class lab2 {
    public static void main(String[] args) {
        int[] ar = {5, 2, 9, 1, 7, 6, 3};
        int max=ar[0];
        int min=ar[0];
        for (int i = 1; i < ar.length; i++) {
            if(ar[i]<min) min=ar[i];
            if(ar[i]>max) max=ar[i];
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}