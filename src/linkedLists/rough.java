package linkedLists;
import java.util.*;
public class rough {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedList{
        Scanner sc= new Scanner(System.in);
        Node head= null;
        Node tail= null;
        int size(){
            int c=0;
            Node temp =head;
            while(temp!=null){
                temp=temp.next;
                c++;
            }
            return c;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        void insertAtEnd(int data){
            Node temp=head;
            Node newnode= new Node(data);
            if(head== null) head=tail=newnode;
            else{
                while(temp.next!=null) temp=temp.next;
                tail.next=newnode;
                tail=newnode;
            }
        }
        void insertAtBeginning(int data){
            Node newnode= new Node(data);
            if(head== null) head= newnode;
            else{
                newnode.next=head;
                head=newnode;
            }
        }
        void insertAtPosition(int data, int pos){
            Node newnode = new Node(data);
            Node temp=head;
            if(pos<1 || pos > size()+ 1){
                System.out.println("invalid position input.");
                return;
            }
            else if(pos==1) insertAtBeginning(data);
            else if(pos==size()) insertAtEnd(data);
            else{
                int i=1;
                while(i<pos-1){
                    temp=temp.next;
                    i++;
                }
                newnode.next=temp.next;
                temp.next=newnode;
            }
        }
        int getAt(int pos){
            Node temp=head;
            if(pos<1 || pos>size()) return -1;
            else{
                int i=1;
                while(i<pos){
                    temp=temp.next;
                    i++;
                }
            return temp.data;
            }
        }
        void deleteAtPos(int pos){
            Node temp=head;
            if(pos<1 || pos> size()) System.out.println("invalid input");
            else if (pos==1) head=null;
            else if(pos==size()){
                while(temp.next!=null) temp=temp.next;
                tail=temp;
                temp=null;
            }
            else{
                int i=1;
                while(i<pos-1) {
                    temp=temp.next;
                    i++;
                }
                temp.next=temp.next.next;
            }
        }

    }
    public static void main(String[] args) {
    linkedList ll= new linkedList();
        Node a= new Node(2);
        Node b= new Node(4);
        Node c= new Node(5);
        Node d= new Node(1);
        Node e= new Node(8);


    //ll.display();
    //System.out.println();
    //System.out.println(ll.size());
    //System.out.println(ll.getAt(3));
    }
}
