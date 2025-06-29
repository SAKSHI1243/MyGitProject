public class reverseLinkedList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class LinkedList{
        public void display(Node head){
            if(head==null) return;
            System.out.print(head.val+" ");
            display(head.next);
        }
        public Node reverse(Node head){
            if(head.next==null) return head;
            Node newnode= reverse(head.next);
            head.next.next=head;
            head.next=null;
            return newnode;
        }
        public Node itr_reverse(Node head){
            Node after=null;
            Node prev=null;
            Node curr=head;
            while(curr!=null){
                after=curr.next;
                curr.next=prev;
                prev=curr;
                curr=after;
            }
            return curr;
        }
        public boolean isPalindrome(Node head){
            Node slow=head;
            Node fast=head;
            if(head==null) return true;
            if(head.next==null) return true;
            while(fast.next!=null&& fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            Node temp=reverse(slow.next);
            slow.next=temp;
            Node p1=head;
            Node p2=slow.next;
            while(p2!=null){
                if(p1.val!=p2.val) return false;
                p1=p1.next;
                p2=p2.next;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        Node a= new Node(2);
        Node b= new Node(3);
        Node c= new Node(5);
        Node d= new Node(4);
        Node e= new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        ll. display(a);
        System.out.println();
        ll.itr_reverse(a);
        ll.display(e);
        System.out.println();
        ll.reverse(a);
        ll.display(e);
    }
}
