package queue;
import java.util.*;
public class circularQueueLL {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class queueCLL{
        Node head=null, tail=null;
        public void add(int x){
            Node newnode= new Node(x);
            if(head==null) {
                head=newnode;
                tail=newnode;
            }
            else{
                tail.next=newnode;
                tail=newnode;
            }
            tail.next=head;
        }
        public int remove() throws Exception{
            if(head==null) throw new Exception("Queue is empty!");
            int val=head.val;
             if (head==tail) head=tail=null;
            else {
                head=head.next;
                tail.next=head;
            }
            return val;
        }
        public int peek() throws Exception{
            if(head==null) throw new Exception("queue is empty!");
            else return head.val;
        }
        public void display(){
            if(head==null) {
                System.out.println("queue is empty!");
                return;
            }
            else{
                Node temp=head;
                while(temp.next!=head){
                    System.out.print(temp.val+" ");
                    temp=temp.next;
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) throws Exception {
        queueCLL q= new queueCLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(5);
        q.display();
        q.remove();
        q.display();
    }
}
