package linkedLists;
public class nthNodeFromEnd {
    public static Node nthNode(Node head, int pos){
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int m=size-pos+1;
        temp=head;
        int i=1;
        while(i<m){
            temp=temp.next;
            i++;
        }
        return temp;
    }
    public static Node lastNthNode(Node head, int pos){
        Node slow= head;
        Node fast= head;
        for(int i=1;i<=pos;i++) fast= fast.next;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static Node deleteNthnode(Node head,int n){
        Node fast=head;
        Node slow=head;
        for(int i=1;i<=n;i++) fast=fast.next;
        if(fast==null) {
            head = head.next;
            return head;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static Node intersection(Node head1, Node head2){
        Node temp1= head1;
        Node temp2= head2;
        int length1=0;
        int length2=0;
        while(temp1!=null){
            length1++;
            temp1=temp1.next;
        }
        while (temp2!=null){
            length2++;
            temp2=temp2.next;
        }
        if(length1>length2){
            int steps=length1-length2;
            for(int i=1;i<=steps;i++)  temp1=temp1.next;
        }
        else{
            int steps=length2-length1;
            for(int i=1;i<=steps;i++) temp2=temp2.next;
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
    public static Node midElement(Node head){
        if(head==null) return null;
        Node temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        temp=head;
        int n=size/2;
           if(n%2==0){
               for (int i=1;i<n;i++) temp=temp.next;
           }
           else{
               for(int j=1;j<=n;j++) temp=temp.next;
           }
        return temp;
    }
    public static Node midele2(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node deleteMidElement(Node head){
        Node slow= head;
        Node fast= head;
        if(head.next==null) return null;
        else if(head.next.next==null) return head;
        else {
            while (fast.next.next != null && fast.next.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = slow.next.next;
        }
        return head;
    }
   public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(23);
        Node c = new Node(7);
        Node d = new Node(29);
        Node e = new Node(42);
        Node f = new Node(8);
        Node g = new Node(28);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        // Node temp= nthNode(a,3);
        //   Node temp=lastNthNode(a,4);
        //System.out.println(temp.data);
        display(a);
        System.out.println();
        //  a=deleteNthnode(a,7);
        //display(a);
        //System.out.println();
        //a=deleteNthnode(a,3);
        //display(a);
        //System.out.println();
        Node mid = midElement(a);
        System.out.println(mid.data);
        Node m=midele2(a);
        System.out.println(m.data);
        a=deleteMidElement(a);
        display(a);
    }
}
