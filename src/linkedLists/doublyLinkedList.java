package linkedLists;
import java.util.*;
public class doublyLinkedList {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static class doublyLL{
        Node head=null;
        public void createNode(int val){
            Node newnode= new Node(val);
            if(head==null) {
                newnode.prev=null;
                head= newnode;
            }
            else{
                Node temp=head;
                while(temp.next!=null) temp=temp.next;
                temp.next=newnode;
                newnode.prev=temp;
            }
            newnode.next=null;
        }
        public void insertAtHead(int val){
            Node newnode= new Node(val);
            if(head==null){
                newnode.prev=null;
                head=newnode;
            }
            else{
                newnode.next=head;
                head=newnode;
                newnode.prev=null;
            }
        }
        public void insetAtEnd(int val){
            Node newnode= new Node(val);
            if(head==null){
                newnode.prev=null;
                head=newnode;
            }
            else{
                Node temp=head;
                while(temp.next!=null) temp=temp.next;
                temp.next=newnode;
                newnode.prev=temp;
                newnode.next=null;
            }
        }
        public void insertAtPosition(int val, int pos){
            Node newnode= new Node(val);
            int i=1;
            Node temp=head;
            while(i<pos-1) {
                temp=temp.next;
                i++;
            }
            newnode.next=temp.next;
            newnode.next.prev=newnode;
            temp.next=newnode;
            newnode.prev=temp;
        }
        public void deleteAtEnd(){
            if(head==null) System.out.println("empty list!");
            else if(head.next==null) head=null;
            Node temp=head;
            while(temp.next!=null) temp=temp.next;
            temp.prev.next=null;
        }
        public void deleteAtBeg(){
            if(head==null) System.out.println("empty list!");
            head=head.next;
            head.prev=null;
        }
        public void deleteAtPos(int pos){
            int i=1;
            Node temp=head;
            while(i<pos-1){
                temp=temp.next;
                i++;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;
        }
        public boolean isPalindrome(){
            Node temp=head;
            Node h=head;
            while(temp.next!=null) temp=temp.next;
            Node t=temp;
            while(h!=t){
                if(h.val!=t.val) return false;
                h=h.next;
                t=t.prev;
            }
            return true;
        }
        /*public void criticalPoints(){
            Node temp=head;
            int idx=1;
            int first=-1;
            int last=-1;
            int minDis=0;
            while(temp.next!=null){
                if((temp.prev.val>temp.val && temp.next.val>temp.val) ||(temp.prev.val<temp.val && temp.next.val<temp.val)){
                    if(first==-1|| first==last)
                }
            }
        }*/
        public void twoSum(int target){
            Node temp1=head;
            while(temp1!=null) {
                Node temp2=temp1.next;
                while (temp2 != null) {
                    if ((temp1.val + temp2.val) == target) System.out.println("[" + temp1.val + "," + temp2.val + "]");
                    temp2 = temp2.next;
                }
                temp1=temp1.next;
            }
        }
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void displayReverse(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void displayRandom(Node random){
        Node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        display(a);
        displayReverse(e);
        displayRandom(c);
        doublyLL dll=new doublyLL();
        System.out.println("enter elements:");
        for(int i=0;i<6;i++){
            int val=sc.nextInt();
            dll.createNode(val);
        }
        if(dll.isPalindrome()) System.out.println("is Palindrome");
        else System.out.println("is not palindrome");
        dll.twoSum(5);
        dll.insertAtHead(1);
        dll.display();
        dll.insetAtEnd(2);
        dll.display();
        dll.insertAtPosition(0,3);
        dll.display();
        dll.deleteAtBeg();
        dll.deleteAtEnd();
        dll.display();
        dll.deleteAtPos(3);
        dll.display();

    }
}
