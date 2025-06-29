package queue;
import java.util.*;
public class circularQueueArray {
    public static class queueCA{
        int f=-1,r=-1,size=0;
        int[]ar=new int[5];
        public void add(int n) throws Exception{
            if(size==ar.length) throw new Exception("queue is full!");
            else if(size==0){
                f=r=0;
                ar[0]=n;
            }
            else if(r<ar.length-1) ar[++r]=n;
            else if(r==ar.length-1){
                r=0;
                ar[0]=n;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0) throw new Exception("queue is empty!");
            else{
                int val=ar[f];
                if(f==ar.length-1) f=0;
                else f++;
                size--;
                return val;
            }

        }
        public int peek() throws Exception{
            if(size==0) throw new Exception("queue is empty!");
            else return ar[f];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
            if(size==0) {
                System.out.println("Queue is empty!");
                return ;
            }
            else if(f<=r){
                for(int i=f;i<=r;i++) System.out.print(ar[i]+" ");
            }
            else{//r<f
                for(int i=f;i<ar.length;i++) System.out.print(ar[i]+" ");
                for(int i=0;i<=r;i++) System.out.print(ar[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
    queueCA qc= new queueCA();
    qc.display();
    qc.add(1);
    qc.add(2);
    qc.add(3);
    qc.display();
    qc.remove();
    qc.display();
    }
}
