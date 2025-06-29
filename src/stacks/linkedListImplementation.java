package stacks;
public class linkedListImplementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Stack{
        Node head=null;
        int size=0;
        void push(int data){
            Node newnode= new Node(data);
           newnode.next=head;
           head=newnode;
           size++;
        }
        int pop(){
        if(head==null){
            System.out.println("Stack is empty.");
            return -1;
        }
        int x=head.data;
        head=head.next;
        size--;
        return x;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack is empty.");
                return -1;
            }
            return head.data;
        }
        int getSize(){
            return size;
        }
        boolean isEmpty(){
            if(head==null) return true;
            else return false;
        }
        void displayRec(Node h){
            if(h==null) return;
            displayRec(h.next);
            System.out.print(h.data+" ");
        }
        void display(){
            displayRec(head);
        }
        void displayRev(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Stack st= new Stack();
        st.push(2);
        st.push(4);
        st.push(1);
        st.display();
        System.out.println();
        st.displayRev();
    }
}
