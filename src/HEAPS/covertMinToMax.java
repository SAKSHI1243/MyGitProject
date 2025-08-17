package HEAPS;
public class covertMinToMax {
    public static void swap(int[] ar, int a, int b){
        int temp=ar[a];
        ar[a]=ar[b];
        ar[b]=temp;
    }
    public static void heapify(int []n,int index){
            int left=2*index+1,right=2*index+2,largest=index;
            if(left<n.length && n[left]>n[largest]) largest=left;
            if(right<n.length && n[right]>n[largest]) largest=right;
            if(largest!=index){
                swap(n,largest,index);
                heapify(n,largest);
            }
    }
    public static void convert(int []n){
        for (int i=n.length/2-1;i>=0;i--) heapify(n,i);
    }
    public static void main(String[] args) {
        int []n={10,20,30,21,23};
        convert(n);
        for (int i :n) System.out.print(i+" ");
    }
}