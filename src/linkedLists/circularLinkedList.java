package linkedLists;
public class circularLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedList{
        Node head=null;
        public void createNode(int data){
            Node newnode= new Node(data);
            if(head==null) {
                head = newnode;
                newnode.next = head;
            }
            else{
                Node temp=head;
                while (temp.next!=head){
                    temp=temp.next;
                }
                temp.next=newnode;
                newnode.next=head;
            }
        }
        public boolean cycle(){
            Node fast= head;
            Node slow= head;
            if(head.next==null || head==null) return false;
            else{
                while(fast!=null) {
                    if(slow==null)return false;
                    slow = slow.next;
                    if( fast.next==null) return false;
                    fast = fast.next.next;
                    if(fast==slow) return true;
                }
                return false;
            }
        }
        public void display(){
            if(head==null) return;
            Node temp=head;
          do{
                System.out.print(temp.data+" ");
                temp=temp.next;
            }while (temp!=head);
          System.out.println();
        }
    }
    public static void main(String[] args) {
        linkedList ll= new linkedList();
        ll.createNode(2);
        ll.createNode(3);
        ll.createNode(4);
        ll.createNode(1);
        ll.cycle();
        ll.display();
    }
}
