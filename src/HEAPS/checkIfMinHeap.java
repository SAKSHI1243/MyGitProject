package HEAPS;
public class checkIfMinHeap {
    public static boolean checkHeap(int []n){
        if(n.length==0) return false;
        for (int i = 0; i < n.length; i++) {
            int left=2*i+1,right=2*i+2;
            if(left<n.length && n[left]<n[i]) return false;
            if(right<n.length && n[right]<n[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int []n1={10,20,30,21,23};
        int []n2={10,20,30,25,15};
        System.out.println(checkHeap(n1));
        System.out.println(checkHeap(n2));
    }
}