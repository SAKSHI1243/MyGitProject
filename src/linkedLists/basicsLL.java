package linkedLists;
public class basicsLL {
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void displayRecursively(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        displayRecursively(head.next);
    }

    public static void reverseDisplay(Node head){
        if(head==null) return;
        reverseDisplay(head.next);
        System.out.print(head.data+" ");
    }
    public static int length(Node head){
        int c=0;
        while(head!=null){
            c++;
            head=head.next;
        }
        return c;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        //System.out.println(a.next);//null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        a.next=b;//5->3
        b.next=c;//5->3->9
        c.next=d;//5->3->9->8
        d.next=e;//5->3->9->8->16
        display(a);
        System.out.println();
        displayRecursively(a);
        System.out.println();
        reverseDisplay(a);
        System.out.println();
        System.out.println(length(a));
        }
    }

