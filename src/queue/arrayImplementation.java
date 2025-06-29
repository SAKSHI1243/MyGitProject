package queue;
import java.util.*;
public class arrayImplementation {
    public static class queueA{
        int []ar= new int[5];
        int f=-1, r=-1;
        int size=0;
        public void add(int n){
            if(r==ar.length-1) {
                System.out.print("queue is full");
                return;
            }
            if(f==-1) {
                f=r=0;
               ar[0]=n;
            }
            else ar[++r]=n;
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.print("queue is empty.");
                return -1;
            }
            f++;
            size--;
            return ar[f-1];
        }
        public int peek(){
            if(size==0){
                System.out.print("queue is empty.");
                return -1;
            }
            return ar[f];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
            if(size==0) System.out.print("queue is empty.");
            else{
                for(int i=f;i<=r;i++) System.out.print(ar[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueA q= new queueA();
        q.display();
        System.out.println();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(14);
        q.add(15);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
        }
    }
