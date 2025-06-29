package linkedLists;
public class cycleLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedList{
        Node head= null;
        public boolean cycle(){
            Node fast= head;
            Node slow= head;
            if(head==null) return false;
            else if(head.next==null) return false;
            else{
            while(fast!=null) {
                slow = slow.next;
                fast = fast.next.next;
                if(fast==slow) return true;
            }
            return false;
            }
        }
    }
    public static void main(String[] args) {
        linkedList ll=new linkedList();

    }
}
