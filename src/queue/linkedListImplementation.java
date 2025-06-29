package queue;
import java.util.*;
public class linkedListImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class queuell{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int n){
            Node temp=new Node(n);
            if(head==null) head=tail=temp;
            else {
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int peek(){
            if(head==null){
                System.out.println("queue is empty");
                return -1;
            }
            return head.val;
        }
        public int remove(){
            if(head==null){
                System.out.println("queue is empty");
                return -1;
            }
                int x=head.val;
                head=head.next;
                size--;
                return x;
        }
        public void display(){
            Node temp=head;
                while(temp!=null) {
                    System.out.print(temp.val+" ");
                    temp=temp.next;
            }
                System.out.println();
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
    queuell q= new queuell();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.display();
    q.remove();
    q.display();
    System.out.println(q.peek());

    }
}
